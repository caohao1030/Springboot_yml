package com.springboot.day01;

import com.springboot.day01.pojo.Dog;
import com.springboot.day01.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day01ApplicationTests {
    @Autowired
    Dog dog;
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
    }

}
