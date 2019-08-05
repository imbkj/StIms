package com.zz.service.sys;

import java.util.List;

import com.zz.po.sys.SysAssetsExpand;

public interface SysAssetsService {
    
	//查询所有资产
    List<SysAssetsExpand> selectAll(SysAssetsExpand record) throws Exception;
    
    //添加资产，同时在未租房或项目添加一条跟进
    int insertList(List<SysAssetsExpand> recordList) throws Exception;
    
    int updateById(SysAssetsExpand record) throws Exception;
    
    int moveById(SysAssetsExpand record) throws Exception;
    
    int repairMoveById(SysAssetsExpand record) throws Exception;
    
    int followById(SysAssetsExpand record);
    //添加资产
    int insertAssets(SysAssetsExpand sysAssetsExpand) throws Exception;
    
}
