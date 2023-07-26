package com.tyh.controller;

import com.tyh.entity.student;
import com.tyh.repository.StudentRepository;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Value("${server.port}")
    private  String port;
@Autowired
    private StudentRepository studentRepository;
//接口调用方法，如果接口有两个实现类岂不是异常，所以只能有一个实现类，并且spring帮我们封装了
    //在那个注解下面的类会被实例化，然后放到这里，只能一个哦
@GetMapping("/findAll")
public Collection<student> findAll(){
      return studentRepository.findAll();
    }
    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")  Long id){//这个注解是把url中的参数映射过来
    studentRepository.deleteById(id);
    }
    @GetMapping("/fingById/{id}")
    public student findById(@PathVariable("id") Long id){
    return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody student student){
    studentRepository.save(student);
    }

    @GetMapping("/index")
   public String index(){
    return "端口号为"+port;
    }
}
