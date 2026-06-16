package org.kamran.mappers;

import org.kamran.data.UserEntity;
import org.kamran.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper implements EntityMapper<UserEntity, User> {
        @Override
    public User map(UserEntity entity) {
        return new User(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }

        @Override
    public UserEntity reverseMap(User entity) {
        return new UserEntity(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }
}