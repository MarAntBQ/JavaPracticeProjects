package com.marcoantonio.mvcapp.service;

import javax.validation.Valid;

import com.marcoantonio.mvcapp.dto.RoleDto;

public interface IRoleService {
    public RoleDto create (@Valid RoleDto role);
    
}
