package com.tyh.repository;
import com.tyh.entity.student;

import java.util.Collection;
import java.util.Collections;

public interface StudentRepository {
public Collection<student> findAll();
public  student findById(long id);
public void deleteById(long id);
public void save(student student);

}
