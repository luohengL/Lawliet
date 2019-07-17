package com.luoh.lawliet.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: luoh
 * @Date: 2019/10/9 22:45
 * @Description:
 */
@Api(tags = {"测试用接口"})
@ResponseBody
@RestController
@RequestMapping("/heart/")
public class heartController {
    @Autowired
    private final static Logger logger = LoggerFactory.getLogger(heartController.class);







    @ApiOperation(value = "部署测试接口")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public int heart() {
        logger.info("testHeart..............");
        return 1;
    }


}
