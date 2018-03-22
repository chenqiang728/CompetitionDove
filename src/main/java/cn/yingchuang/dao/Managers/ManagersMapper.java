package cn.yingchuang.dao.Managers;

import cn.yingchuang.entity.Managers;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface ManagersMapper {

    //添加一条
    public int addManagers(Managers managers);

    //查询一条for管理权限
    public Managers queryManagersById(Integer id);

    //登录
    public Managers loginManagers(Managers managers);

    //修改
    public int updateManagersById(Managers managers);

    //查所有
    public List<Managers> queryAll();
}
