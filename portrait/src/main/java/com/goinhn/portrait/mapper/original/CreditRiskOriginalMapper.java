package com.goinhn.portrait.mapper.original;

import com.goinhn.portrait.model.entity.original.CreditRiskOriginal;
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
public interface CreditRiskOriginalMapper {

    /**
     * 根据公司名称返回分析数据
     *
     * @param creditRiskOriginal 信用风险分析
     * @return
     */
    @Select("select * from tab_credit_risk_original where entname = #{entName}")
    @Results(
            id = "creditRiskValueMap",
            value = {
                    @Result(id = true, column = "eid", property = "eid"),
                    @Result(column = "entname", property = "entName"),
                    @Result(column = "is_punish", property = "isPunish"),
                    @Result(column = "is_kcont", property = "isKcont"),
                    @Result(column = "credit_grade", property = "creditGrade"),
                    @Result(column = "is_justice_creditaic", property = "isJusticeCreditaic")
            }
    )
    CreditRiskOriginal selectAllByEntName(@NotNull CreditRiskOriginal creditRiskOriginal);


    /**
     * 保存信用风险分析
     *
     * @param creditRiskOriginal 信用风险分析
     * @return
     */
    @Insert("insert into " +
            "tab_credit_risk_original(eid, entname, is_punish, is_kcont, credit_grade, is_justice_creditaic) " +
            "values(#{eid}, #{entName}, #{isPunish}, #{isKcont}, #{creditGrade}, #{isJusticeCreditaic})")
    int saveCreditRiskOriginal(@NotNull CreditRiskOriginal creditRiskOriginal);

}
