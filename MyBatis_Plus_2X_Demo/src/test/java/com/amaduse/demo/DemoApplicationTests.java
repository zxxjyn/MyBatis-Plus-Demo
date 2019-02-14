package com.amaduse.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "application.yml",classes = MybatisPlusProjectTestApplication.class)//踩坑点①
//@WebAppConfiguration
//@AutoConfigureMockMvc
public class DemoApplicationTests {

//    @Autowired
//    private PersonService service;
    @Before
    public void init(){
        System.out.println("TEST STARTING");
    }

//    @Test
//    public void test(){
//        Person entity = new Person();
//        List<Person> dataList = service.selectList(new EntityWrapper<Person>(entity));
//        System.out.println("TESTING");
//    }

    @After
    public void end(){
        System.out.println("TEST ENDING");

    }
}

