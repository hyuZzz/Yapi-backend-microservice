package com.yu.yapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.yapicommon.model.entity.UserInterfaceInfo;

/**
* @author YUUU
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-05-01 02:02:29
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
