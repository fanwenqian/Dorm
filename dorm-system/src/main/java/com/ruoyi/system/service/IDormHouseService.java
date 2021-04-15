package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DormHouse;

/**
 * 宿舍Service接口
 * 
 * @author zhumf
 * @date 2021-04-14
 */
public interface IDormHouseService 
{
    /**
     * 查询宿舍
     * 
     * @param id 宿舍ID
     * @return 宿舍
     */
    public DormHouse selectDormHouseById(Long id);

    /**
     * 查询宿舍列表
     * 
     * @param dormHouse 宿舍
     * @return 宿舍集合
     */
    public List<DormHouse> selectDormHouseList(DormHouse dormHouse);

    /**
     * 新增宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    public int insertDormHouse(DormHouse dormHouse);

    /**
     * 修改宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    public int updateDormHouse(DormHouse dormHouse);

    /**
     * 批量删除宿舍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormHouseByIds(String ids);

    /**
     * 删除宿舍信息
     * 
     * @param id 宿舍ID
     * @return 结果
     */
    public int deleteDormHouseById(Long id);
}
