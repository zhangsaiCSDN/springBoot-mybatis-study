package com.zs.modle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zs
 * @create 2020-09-24 9:42
 */
@Data
//@ApiModel(value = "用户属性")
public class User implements Serializable {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "用户名称")
    private String uname;

    @ApiModelProperty(value = "密码")
    private String pwd;

    private int age;
    private Date birthday;
    private BigDecimal money;
}
