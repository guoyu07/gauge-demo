package com.thoughtworks.jigsaw;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAllAssignable();
    List<Employee> findBySkill(String skill);
}
