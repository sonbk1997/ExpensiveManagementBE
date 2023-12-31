package com.management.expenses.services;

import com.management.expenses.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUser();
    Page<User> findByPage(int pageNumber);
    Optional<User> findById(Long id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
}
