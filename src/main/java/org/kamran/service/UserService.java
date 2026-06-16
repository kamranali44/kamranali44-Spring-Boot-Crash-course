package org.kamran.service;

import org.kamran.model.User;

public interface UserService {
    void addUser(User user);
    User getUser(String firstName);
    void deleteUser(String firstName);
}
