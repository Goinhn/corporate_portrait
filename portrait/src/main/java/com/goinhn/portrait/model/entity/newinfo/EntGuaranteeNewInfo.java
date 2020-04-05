package com.goinhn.portrait.model.entity.newinfo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * 企业年报对外担保
 *
 * @author goinhn
 */
@Data
@Builder
public class EntGuaranteeNewInfo {

    /**
     * 序号
     */
    private Long eid;

    /**
     * 企业名称
     */
    private String entName;

    /**
     * 主债权种类
     */
    private String priclaseckind;

    /**
     * 履行债务的期限自
     */
    private Date pefperFrom;

    /**
     * 是否公示此担保信息1是2否
     */
    private Integer iftopub;

    /**
     * 主债权数额
     */
    private Float priclasecam;

    /**
     * 履行债务的期限至
     */
    private Date pefperto;

    /**
     * 保证的期间1期限2未约定
     */
    private Integer guaranperiod;

    /**
     * 保证的方式1一般保证2连带保证3未约定
     */
    private Integer gaType;

    /**
     * 保证担保的范围
     */
    private String rage;

}
