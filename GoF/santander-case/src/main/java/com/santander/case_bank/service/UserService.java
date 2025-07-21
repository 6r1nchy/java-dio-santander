package com.santander.case_bank.service;

import com.santander.case_bank.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}
