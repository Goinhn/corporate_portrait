package com.goinhn.portrait.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author goinhn
 */
@Data
public class JudicialRisk implements Serializable {

    /**
     * eid：序号
     */
    private Long eid;

    /**
     * entName：公司名
     */
    private String entName;

    /**
     * lawSum: 司法次数
     */
    private Double lawSum;

    /**
     * defendant: 被诉方
     */
    private Double defendant;

    /**
     * enforceAmount: 执行标的
     */
    private Double enforceAmount;

    /**
     * isJusticeCredit: 失信黑名单
     */
    private Double isJusticeCredit;

}
