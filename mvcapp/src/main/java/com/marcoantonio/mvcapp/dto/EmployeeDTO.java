package com.marcoantonio.mvcapp.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EmployeeDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private String employeeid;
    private String lastName;
    private RoleDto role;
    private List<ProjectDTO> projects;
}
