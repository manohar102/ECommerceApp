package com.ecommerce.service;

import com.ecommerce.dto.UserDto;
import com.ecommerce.model.User;

import java.util.List;

public interface UserService {

    UserDto createUser(User user) throws Exception;

    boolean userAlreadyExist(String email);

    boolean userAlreadyExist(int id);

    UserDto getUserById(int id) throws Exception;

    UserDto updateUser(int id, User user) throws Exception;

    void deleteUser(int id) throws Exception;

    List<UserDto> getAllUsers();

}
