package com.pc.collabtest.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.pc.collabtest.dto.UserDto;
import com.pc.collabtest.model.User;

@Mapper
public interface UserMapper {

	
	UserDto UserToUserDto(User user);
	User UserDtoToUser(UserDto userDto);
	
	List<UserDto> UserListToUserDtoList(List<User> users);
	List<User>   UserDtoListToUserList(List<User> users);
}
