package com.example.student_ajax_token.service.userService;

import com.example.student_ajax_token.model.User;
import com.example.student_ajax_token.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
