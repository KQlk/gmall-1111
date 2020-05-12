package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 限时购表
 * </p>
 *
 * @author ghost
 * @since 2020-05-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sms_flash_promotion")
@ApiModel(value="FlashPromotion对象", description="限时购表")
public class FlashPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("title")
    private String title;

    @ApiModelProperty(value = "开始日期")
    @TableField("start_date")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    @TableField("end_date")
    private Date endDate;

    @ApiModelProperty(value = "上下线状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "秒杀时间段名称")
    @TableField("create_time")
    private Date createTime;


}