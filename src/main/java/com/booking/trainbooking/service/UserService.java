package com.booking.trainbooking.service;

import com.booking.trainbooking.entity.User;
import com.booking.trainbooking.model.UserRequestDTO;

public interface UserService {

    User create(UserRequestDTO userRequestDTO);

    User update(UserRequestDTO userRequestDTO);

    User get(UserRequestDTO userRequestDTO);

    User delete(UserRequestDTO userRequestDTO);


}
