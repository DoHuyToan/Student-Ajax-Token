package com.example.student_ajax_token.service.role;


import com.example.student_ajax_token.model.Role;
import com.example.student_ajax_token.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}