//package GoldenRabbit.Buzz.service;
//
//import GoldenRabbit.Buzz.DTO.userDTO.AddUserRequest;
//import GoldenRabbit.Buzz.domain.User;
//import GoldenRabbit.Buzz.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Locale;
//
//@RequiredArgsConstructor
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public Long addUser(AddUserRequest dto){
//        return userRepository.save(User.builder()
//                .email(dto.getEmail())
//                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
//                .build()).getId();
//    }
//}
