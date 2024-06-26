package com.yu.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yu.yapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author YUUU
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-05-01 02:02:29
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
//select interfaceInfoId, sum(totalNum) as totalNum from user_interface_info group by interfaceInfoId order by totalNum desc limit 3;
    List<UserInterfaceInfo>listTopInvokeInterfaceInfo(int limit);
}




