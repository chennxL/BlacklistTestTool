package com.blacklist.service;

import com.blacklist.dto.BlacklistStatusDTO;

/**
 * 黑名单Service接口
 */
public interface BlacklistService {

    /**
     * 创建黑名单
     * @param size 黑名单规模
     */
    void createBlacklist(Long size);

    /**
     * 获取黑名单状态
     * @return 状态信息
     */
    BlacklistStatusDTO getStatus();

    /**
     * 获取黑名单数量
     * @return 黑名单总数
     */
    Long getCount();  // 🔥 新增方法
}
