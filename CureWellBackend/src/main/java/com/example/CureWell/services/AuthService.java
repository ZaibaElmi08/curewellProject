package com.example.CureWell.services;

import com.example.CureWell.entity.Role;
import com.example.CureWell.payload.LoginDto;
import com.example.CureWell.payload.RegisterDto;

import java.util.List;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    String createRole(String name);
    String deleteRole(String name);
    List<Role> getAllRoles();
    String getRoleByName(String name);

}