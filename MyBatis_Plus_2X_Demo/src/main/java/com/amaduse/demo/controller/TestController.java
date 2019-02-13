package com.amaduse.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试接口")
@RestController
public class TestController {
    @ApiOperation(value = "测试方法", notes = "测试方法")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
