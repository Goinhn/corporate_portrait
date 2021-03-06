package com.goinhn.portrait.mapper.label;

import com.goinhn.portrait.model.entity.label.BusinessManagementAbilityLabel;
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
public interface BusinessManagementAbilityLabelMapper {

    /**
     * 根据公司名返回企业经营能力标签序号数据
     *
     * @param businessManagementAbilityLabel 企业经营能力标签
     * @return
     */
    @Select("select * from tab_business_management_ability_label where entname = #{entName}")
    @Results(
            id = "businessManagementAbilityLabelMap",
            value = {
                    @Result(id = true, column = "eid", property = "eid"),
                    @Result(column = "entname", property = "entName"),
                    @Result(column = "label", property = "label")
            }
    )
    BusinessManagementAbilityLabel selectAllByEntName(@NotNull BusinessManagementAbilityLabel businessManagementAbilityLabel);


    /**
     * 保存企业经营能力标签
     *
     * @param businessManagementAbilityLabel 企业经营能力标签
     * @return
     */
    @Insert("insert into " +
            "tab_business_management_ability_label(eid, entname, label) " +
            "values(#{eid}, #{entName}, #{label})")
    int saveBusinessManagementAbilityLabel(@NotNull BusinessManagementAbilityLabel businessManagementAbilityLabel);

}
