//IntelliJ IDEA
//springbootrest
//PersonRepository
//2020/2/10
// Author:御承扬
//E-mail:2923616405@qq.com


package com.pyc.springbootrest.dao;

import com.pyc.springbootrest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;;
import org.springframework.data.rest.core.annotation.RestResource;


public interface PersonRepository extends JpaRepository<Person,Long> {
    @RestResource(path = "nameStartsWith", rel = "nameStartsWith")
    Person findByNameStartsWith(@Param("name") String name);
}
