package com.smartmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.smartmall.common.exception.ListValue;
import com.smartmall.common.valid.AddGroup;
import com.smartmall.common.valid.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 *
 * @author jiale
 * @email jiale@gmail.com
 * @date 2020-11-11 21:18:45
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @NotNull(message = "修改必须指定id", groups = AddGroup.class)
    @Null(message = "新增无需id", groups = AddGroup.class)
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(groups = {UpdateGroup.class, AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(groups = AddGroup.class)
    @URL(groups = {UpdateGroup.class, AddGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @ListValue(vals = {0, 1}, groups = {UpdateGroup.class, AddGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(groups = AddGroup.class)
    @Pattern(regexp = "^[a-zA-Z]$", message = "必须是字母", groups = {UpdateGroup.class, AddGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = AddGroup.class)
    @Min(value = 0, message = "必须大于零", groups = {UpdateGroup.class, AddGroup.class})
    private Integer sort;

}
