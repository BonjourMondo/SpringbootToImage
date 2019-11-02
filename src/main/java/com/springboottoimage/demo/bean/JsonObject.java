package com.springboottoimage.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: leesanghyuk
 * Date: 2019-10-31 20:08
 * Description:
 */
@Data
public class JsonObject implements Serializable {
    private static final long serialVersionUID = 496517741315200035L;

    private String name;
    private Integer age;
}
