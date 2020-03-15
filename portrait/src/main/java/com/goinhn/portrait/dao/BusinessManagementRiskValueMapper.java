package com.goinhn.portrait.dao;

import com.goinhn.portrait.model.BusinessManagementRiskValue;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author goinhn
 */
@Repository
public interface BusinessManagementRiskValueMapper {

    /**
     * 根据公司名称返回分析数据
     *
     * @param businessManagementRiskValue 企业经营风险
     * @return
     */
    @Select("select * from tab_business_management_risk_value where entname = #{entName}")
    @Results(
            id = "businessManagementRiskValueMap",
            value = {
                    @Result(id = true, column = "eid", property = "eid"),
                    @Result(column = "entname", property = "entName"),
                    @Result(column = "priclasecam", property = "priclasecam"),
                    @Result(column = "encode_guaranperiod", property = "encodeGuaranperiod"),
                    @Result(column = "encode_gatype", property = "encodeGatype"),
                    @Result(column = "is_rage", property = "isRage"),
                    @Result(column = "sub_pefperfromto", property = "subPefperfromto"),
                    @Result(column = "unpaidsocialins", property = "unpaidsocialins"),
                    @Result(column = "is_bra", property = "isBra"),
                    @Result(column = "is_brap", property = "isBrap"),
                    @Result(column = "pledgenum", property = "pledgeNum"),
                    @Result(column = "taxunpaidnum", property = "taxunpaidNum"),
                    @Result(column = "is_except", property = "isExcept")
            }
    )
    BusinessManagementRiskValue selectAllByEntName(BusinessManagementRiskValue businessManagementRiskValue);
}
