package com.booking.trainbooking.service.impl;

import com.booking.trainbooking.entity.User;
import com.booking.trainbooking.model.UserRequestDTO;
import com.booking.trainbooking.repository.UserRepository;
import com.booking.trainbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(UserRequestDTO userRequestDTO) {
        User user = new User();
        user = putDataInEntity(user, userRequestDTO);
        userRepository.save(user);
        return null;

    }

    private User putDataInEntity(User user, UserRequestDTO userRequestDTO) {
        


        return user;
    }

    @Override
    public User update(UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public User get(UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public User delete(UserRequestDTO userRequestDTO) {
        return null;
    }
}
