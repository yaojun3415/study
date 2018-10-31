package com.yaojun.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:YaoJun
 * Date:2018/10/31
 * Time:11:44
 */
@RestController
@RequestMapping(value="/test")
public class TestController {

    @ApiOperation(value="获取测试信息", notes="获取测试信息")
    @ApiImplicitParam(name = "id", value = "测试ID", required = true)
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public String getUser(@PathVariable String  id) {
        return "******"+id;
    }

    @ApiOperation(value="获取测试结果", notes="获取测试结果")
    @RequestMapping(value="", method=RequestMethod.GET)
    public String getTest() {
        return "ok";
    }
}
