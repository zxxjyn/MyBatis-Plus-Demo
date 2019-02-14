package com.amaduse.demo.Moudle;

import com.amaduse.demo.DemoApplicationTests;
import com.amaduse.demo.entity.Person;
import com.amaduse.demo.service.PersonService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

public class PersonTest extends DemoApplicationTests {
    @Autowired
    private PersonService service;

    @Test
    public void test(){
        Person entity = new Person();
        //new EntityWrapper<Person>(entity) 用来模糊查询使用，自动将输入的查询条件输入到entity中
        // 通过EnityWrapper封装，使用selectList进行条件查询，用到反射
        List<Person> dataList = service.selectList(new EntityWrapper<Person>(entity));
        System.out.println("PERSON TESTING");
    }

}
