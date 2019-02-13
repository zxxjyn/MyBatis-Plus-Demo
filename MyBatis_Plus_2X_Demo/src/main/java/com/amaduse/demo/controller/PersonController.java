package com.amaduse.demo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.http.MediaType;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.lang.StringUtils;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import com.amaduse.demo.entity.Person;
import com.amaduse.demo.service.PersonService;

import java.util.Arrays;
import java.util.List;
import java.lang.String;


import org.springframework.stereotype.Controller;

/**
 * <p>
 * 测试用户表 前端控制器
 * </p>
 *
 * @author xin.zheng
 * @since 2019-02-13
 */
@Api(tags = "测试用户表")//tags value 取得是注解
@Controller
@RequestMapping("/person")
//暂时swagger显示数据有错误提示，后续解决。
public class PersonController {

//    @Autowired
//    private PersonService service;
//
//    @ApiOperation(value="测试用户表 查询",notes="", produces = MediaType.APPLICATION_JSON_VALUE)
//    @RequestMapping(value = "/query/list", method = {RequestMethod.GET, RequestMethod.POST})
//    public String query( Person entity ) {
//        List<Person> dataList = service.selectList(new EntityWrapper<Person>(entity));
//        dataList.stream().forEach(System.out::println);
//        return JSONUtils.toJSONString(dataList);
//    }
//
//    @ApiOperation(value="测试用户表 分页查询",notes="", produces = MediaType.APPLICATION_JSON_VALUE)
//    @RequestMapping(value = "/query/page", method = {RequestMethod.GET, RequestMethod.POST})
//    public String queryPage( @ApiParam(value = "页数",required = false) @RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
//                                                    @ApiParam(value = "页码",required = false) @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
//                                                    Person entity ) {
//        Page<Person> dataPage = service.selectPage(new Page<Person>(pageNo, pageSize), new EntityWrapper(entity));
//        System.out.println(dataPage.toString());
//        return JSONUtils.toJSONString(dataPage);
//    }
//
//    @ApiOperation(value = "删除(多个用“,” 隔开))", notes = "")
//    @DeleteMapping(value = "/{id}")
//    public String delete(@PathVariable String id) {
//        if(StringUtils.isNotBlank(id)){
//            System.out.println(id);
//            service.deleteBatchIds(Arrays.asList(id.split("," )));
//        }
//        return "true";
//    }
//
//    @ApiOperation(value = "批量保存或者修改", notes = "")
//    @PostMapping(value = "/batch/insertOrUpdate")
//    public String insertOrUpdateBatch(@RequestBody List<Person> entities) {
//        entities.stream().forEach(System.out::println);
//        service.insertOrUpdateBatch(entities);
//        return "true";
//    }


}

