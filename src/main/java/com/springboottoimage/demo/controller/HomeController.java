package com.springboottoimage.demo.controller;

import com.springboottoimage.demo.bean.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leesanghyuk
 * Date: 2019-10-31 20:06
 * Description:
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @RequestMapping()
    public JsonObject home(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.setAge(11);
        jsonObject.setName("leesanghyuk");
        return jsonObject;
    }
}
