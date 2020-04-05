package com.goinhn.portrait.mapper.analysis;

import com.goinhn.portrait.model.entity.analysis.JudicialRiskAnalysis;
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
public interface JudicialRiskAnalysisMapper {

    /**
     * 根据公司名称返回分析数据
     *
     * @param judicialRiskAnalysis 司法风险分析
     * @return
     */
    @Select("select * from tab_judicial_risk_analysis where entname = #{entName}")
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
    JudicialRiskAnalysis selectAllByEntName(@NotNull JudicialRiskAnalysis judicialRiskAnalysis);


    /**
     * 保存司法风险分析
     *
     * @param judicialRiskAnalysis 司法风险分析
     * @return
     */
    @Insert("insert into " +
            "tab_judicial_risk_analysis(eid, entname, law_sum, defendant, enforce_amount, is_justice_credit) " +
            "values(#{eid}, #{entName}, #{lawSum}, #{defendant}, #{enforceAmount}, #{isJusticeCredit})")
    int saveJudicialRiskAnalysis(@NotNull JudicialRiskAnalysis judicialRiskAnalysis);

}
