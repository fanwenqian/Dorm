package com.ruoyi.system.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.DormStudent;

/**
 * 学生Mapper接口
 * 
 * @author zhumf
 * @date 2021-05-11
 */
public interface DormStudentMapper 
{
    /**
     * 查询学生
     * 
     * @param id 学生ID
     * @return 学生
     */
    public DormStudent selectDormStudentById(Long id);

    /**
     * 查询学生列表
     * 
     * @param dormStudent 学生
     * @return 学生集合
     */
    public List<DormStudent> selectDormStudentList(DormStudent dormStudent);

    /**
     * 新增学生
     * 
     * @param dormStudent 学生
     * @return 结果
     */
    public int insertDormStudent(DormStudent dormStudent);

    /**
     * 修改学生
     * 
     * @param dormStudent 学生
     * @return 结果
     */
    public int updateDormStudent(DormStudent dormStudent);

    /**
     * 删除学生
     * 
     * @param id 学生ID
     * @return 结果
     */
    public int deleteDormStudentById(Long id);

    /**
     * 批量删除学生
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormStudentByIds(String[] ids);

    List<Map<String, Object>> findStudentMap();
}
