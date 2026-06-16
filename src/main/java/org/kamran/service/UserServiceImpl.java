package org.kamran.service;

import org.kamran.data.UserEntity;
import org.kamran.data.UserRepository;
import org.kamran.mappers.EntityMapper;
import org.kamran.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

//    Map<String, User> users = new HashMap<>();

    TimeService timeService;
    UserRepository userRepository;
    EntityMapper<UserEntity, User>  entityMapper;

    public UserServiceImpl(TimeService timeService, UserRepository userRepository, EntityMapper<UserEntity, User>  entityMapper) {
        this.timeService = timeService;
        this.userRepository = userRepository;
        this.entityMapper = entityMapper;

//        users.put("John", new User("John","Doe",123));
//        users.put("Jane", new User("Jane","Doe",456));
    }

    @Override
    public void addUser(User user) {
        user.setCreationTime(timeService.getCurrentTime("London"));
        userRepository.save(
                entityMapper.reverseMap(user)
        );
//        users.put(user.getFirstName(), user);
    }

    @Override
    public User getUser(String firstName) {
        return entityMapper.map(
                userRepository.findByFirstName(firstName)
        );
//        return users.get(firstName);
    }

    @Transactional
    @Override
    public void deleteUser(String firstName) {
        userRepository.deleteByFirstName(firstName);
//        users.remove(firstName);
    }
}
