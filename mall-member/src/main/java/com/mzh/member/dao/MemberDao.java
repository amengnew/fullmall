package com.mzh.member.dao;

import com.mzh.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ZhihaoMeng
 * @email 717333759@qq.com
 * @date 2024-05-20 10:26:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
