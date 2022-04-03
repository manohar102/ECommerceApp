package com.ecommerce.dto.mapper;

import com.ecommerce.dto.UserDto;
import com.ecommerce.model.User;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserDto userToUserDto(User user);
	User userDtoToUser(UserDto user);
	List<UserDto>  userToUserDto(Collection<User> users);
}