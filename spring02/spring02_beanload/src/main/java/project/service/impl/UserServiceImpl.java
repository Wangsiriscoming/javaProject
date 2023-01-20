package project.service.impl;

import org.springframework.stereotype.Service;
import project.domain.User;
import project.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user project.service...");
    }
}
