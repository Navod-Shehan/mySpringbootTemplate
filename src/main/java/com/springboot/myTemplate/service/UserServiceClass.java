//package com.springboot.myTemplate.service;
//
//import com.springboot.myTemplate.entity.UserEntity;
//import com.springboot.myTemplate.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//
//public class UserServiceClass implements UserService{
//    private UserRepository userRepository;
//    @Autowired
//    public UserServiceClass(UserRepository theUserRepository) {
//        this.userRepository = theUserRepository;
//    }
//
//    @Override
//    public List<UserEntity> findAll(){
//        return userRepository.findAll();
//    }
//    @Override
//    public UserEntity findById(int theId){
//        Optional<UserEntity> result = userRepository.findById(theId);
//        UserEntity theUserEntity = null;
//        if(result.isPresent()){
//            theUserEntity = result.get();
//        }
//        return theUserEntity;
//    }
//
//    @Override
//    public UserEntity save(UserEntity theUserEntity){
//        return userRepository.save(theUserEntity);
//    }
//
//    @Override
//    public void deleteById(int theId){
//        userRepository.deleteById(theId);
//    }
//}
