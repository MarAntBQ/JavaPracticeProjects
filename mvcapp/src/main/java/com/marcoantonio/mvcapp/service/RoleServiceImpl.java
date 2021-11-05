package com.marcoantonio.mvcapp.service;

import com.marcoantonio.mvcapp.dto.RoleDto;
import com.marcoantonio.mvcapp.model.Role;
import com.marcoantonio.mvcapp.repository.IRoleJpaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class RoleServiceImpl implements IRoleService {
    
    @Autowired
    private IRoleJpaRepository roleRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RoleDto create(RoleDto role) {
        Role roleEntity = modelMapper.map(role, Role.class);
        roleRepo.save(roleEntity);
        return modelMapper.map(roleEntity, RoleDto.class);
    }
}
