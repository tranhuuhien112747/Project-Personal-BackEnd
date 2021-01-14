package project.shops.service;

import project.shops.model.User;

public interface UserService {
    User findByUsername(String name);
}
