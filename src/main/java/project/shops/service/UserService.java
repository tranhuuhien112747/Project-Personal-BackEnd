package project.shops.service;

import project.shops.model.User;

public interface UserService {
    User findByUsername(String name);

    void create(User user);

    void deleteById(Long id);

    User findById(Long id);
}
