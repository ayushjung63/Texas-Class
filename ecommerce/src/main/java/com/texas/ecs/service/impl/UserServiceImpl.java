package com.texas.ecs.service.impl;

import com.texas.ecs.dto.UserDto;
import com.texas.ecs.model.User;
import com.texas.ecs.repo.UserRepo;
import com.texas.ecs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Integer save(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setContact(userDto.getContact());
        user.setRole(userDto.getRole());
        User savedUser = userRepo.save(user);
        return savedUser.getId();
    }

    @Override
    public UserDto getById(Integer id) {
//        User user = userRepo.findById(id).orElseThrow(
//                ()-> new RuntimeException("User Not Found");
//        );

        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User Not Found");
        } else {
            User user = userOptional.get();
            UserDto userDto = new UserDto(
                    user.getId(), user.getEmail(), user.getContact(), user.getName(), user.getAddress(), user.getRole()
            );
            return userDto;
        }

    }

    @Override
    public List<UserDto> getAll() {
        List<User> userList = userRepo.findAll();
        List<UserDto> userDtoList = userList.stream()
                .map(user -> {
                    UserDto userDto = new UserDto(
                            user.getId(), user.getEmail(), user.getContact(), user.getName(), user.getAddress(), user.getRole()
                    );
                    return userDto;
                }).collect(Collectors.toList());
        return userDtoList;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public User getUser(Integer id) {
        return null;
    }
}
