package com.marcoantonio.mvcapp.service;

import com.marcoantonio.mvcapp.dto.RoleDto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RoleConstraintsValidationExceptionTest {
    @Autowired
    private RoleServiceImpl roleService;

    @Test
    public void constraintsValidationExceptionTest() {
        try {
            roleService.create(new RoleDto(null));
        } catch (Exception e) {
            System.out.println("");
        }
        try {
            roleService.create(new RoleDto(""));
        } catch (Exception e) {
            System.out.println("");
        }
        try {
            roleService.create(new RoleDto("1234567890123456"));
        } catch (Exception e) {
            System.out.println("");
        }
    }
    
}
