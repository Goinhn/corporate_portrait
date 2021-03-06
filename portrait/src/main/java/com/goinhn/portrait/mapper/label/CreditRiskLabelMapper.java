package com.goinhn.portrait.mapper.label;

import com.goinhn.portrait.model.entity.label.CreditRiskLabel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

/**
 * @author goinhn
 */
@Repository
public interface CreditRiskLabelMapper {

    /**
     * 根据公司名返回信用风险标签序号数据
     *
     * @param creditRiskLabel 信用风险标签
     * @return
     */
    @Select("select * from tab_credit_risk_label where entname = #{entName}")
    @Results(
            id = "creditRiskLabelMap",
            value = {
                    @Result(id = true, column = "eid", property = "eid"),
                    @Result(column = "entname", property = "entName"),
                    @Result(column = "label", property = "label")
            }
    )
    CreditRiskLabel selectAllByEntName(@NotNull CreditRiskLabel creditRiskLabel);


    /**
     * 保存信用风险标签
     *
     * @param creditRiskLabel 信用风险标签
     * @return
     */
    @Insert("insert into " +
            "tab_credit_risk_label(eid, entname, label) " +
            "values(#{eid}, #{entName}, #{label})")
    int saveCreditRiskLabel(@NotNull CreditRiskLabel creditRiskLabel);

}
