package com.pyc.springbootrest;

import com.pyc.springbootrest.dao.PersonRepository;
import com.pyc.springbootrest.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@SpringBootApplication
public class SpringbootrestApplication {

    @RequestMapping("/")
    String index(){
        return "Hello Trying";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrestApplication.class, args);
    }

}
