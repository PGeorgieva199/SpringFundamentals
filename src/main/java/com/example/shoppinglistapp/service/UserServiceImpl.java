package com.example.shoppinglistapp.service;

import com.example.shoppinglistapp.model.entity.User;
import com.example.shoppinglistapp.model.service.UserServiceModel;
import com.example.shoppinglistapp.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel){
        User user = modelMapper.map(userServiceModel, User.class);
        this.userRepository.save(user);
    }
}
