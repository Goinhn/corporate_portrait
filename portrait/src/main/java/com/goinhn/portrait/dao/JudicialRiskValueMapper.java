package com.goinhn.portrait.dao;

import com.goinhn.portrait.model.JudicialRiskValue;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author goinhn
 */
@Repository
public interface JudicialRiskValueMapper {

    /**
     * 根据公司名称返回分析数据
     *
     * @param judicialRiskValue 司法风险
     * @return
     */
    @Select("select * from tab_judicial_risk_value where entname = #{entName}")
    @Results(
            id = "judicialRiskValueMap",
            value = {
                    @Result(id = true, column = "eid", property = "eid"),
                    @Result(column = "entname", property = "entName"),
                    @Result(column = "law_sum", property = "lawSum"),
                    @Result(column = "defendant", property = "defendant"),
                    @Result(column = "enforce_amount", property = "enforceAmount"),
                    @Result(column = "is_justice_credit", property = "isJusticeCredit")
            }
    )
    JudicialRiskValue selectAllByEntName(JudicialRiskValue judicialRiskValue);
}
