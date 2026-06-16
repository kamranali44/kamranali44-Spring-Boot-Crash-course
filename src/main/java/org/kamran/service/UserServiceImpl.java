package org.kamran.service;

import org.kamran.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<String, User> users = new HashMap<>();

    TimeService timeService;

    public UserServiceImpl(TimeService timeService) {
        this.timeService = timeService;

        users.put("John", new User("John","Doe",123));
        users.put("Jane", new User("Jane","Doe",456));
    }

    @Override
    public void addUser(User user) {
        user.setCreationTime(timeService.getCurrentTime("London"));
        users.put(user.getFirstName(), user);
    }

    @Override
    public User getUser(String firstName) {
        return users.get(firstName);
    }

    @Override
    public void deleteUser(String firstName) {
        users.remove(firstName);
    }
}
