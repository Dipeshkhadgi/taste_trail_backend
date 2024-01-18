//package com.online.test_trail.service;
//
//import com.online.test_trail.entity.UserEntity;
//import com.online.test_trail.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<UserEntity> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public Optional<UserEntity> getUserById(Integer id) {
//        return userRepository.findById(id);
//    }
//
//    public UserEntity createUser(UserEntity user) {
//        return userRepository.save(user);
//    }
//
//    public UserEntity updateUser(Integer id, UserEntity user) {
//        user.setId(id);
//        return userRepository.save(user);
//    }
//
//    public void deleteUser(Integer id) {
//        userRepository.deleteById(id);
//    }
//}

package com.online.test_trail.service;

import com.online.test_trail.dto.UserDto;
import com.online.test_trail.entity.UserEntity;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<UserEntity> findAll();

    Optional<UserEntity> findById(Integer id);

    void deleteById(Integer id);

    void save(UserDto userDto);
}