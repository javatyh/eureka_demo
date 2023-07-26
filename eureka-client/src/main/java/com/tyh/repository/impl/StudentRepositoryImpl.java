package com.tyh.repository.impl;

import com.tyh.entity.student;
import com.tyh.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map studentMap;
    static {
        studentMap=new HashMap<Long,student>();
        studentMap.put(1L,new student(1L,"邱喷鸡1",20));
        studentMap.put(2L,new student(2L,"邱喷鸡2",21));
        studentMap.put(3L,new student(3L,"邱喷鸡3",22));
        studentMap.put(4L,new student(4L,"邱喷鸡4",23));
        studentMap.put(5L,new student(5L,"邱喷鸡5",24));
    }
    @Override
    public Collection<student> findAll() {
        return studentMap.values();
    }

    @Override
    public student findById(long id) {
        return (student) studentMap.get(id);
    }

    @Override
    public void deleteById(long id) {
   studentMap.remove(id);
    }

    @Override
    public void save(student student) {
        studentMap.put((Long)student.getId(),student);
    }
}
