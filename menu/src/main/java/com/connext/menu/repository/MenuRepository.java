package com.connext.menu.repository;

import com.connext.menu.entity.Menu;

import java.util.List;

/**
 * @author Jason.Wu1.
 * @date 2020/2/13.
 * @time 13:42.
 */
public interface MenuRepository {
    /**
     * 查询所有菜单
     * @return
     */
    public List<Menu> findAll(int index,int limit);

    /**
     * 计数，返回总记录数
     * @return
     */
    public int count();

    /**
     * 通过商品id查询
     * @param id
     * @return
     */
    public Menu findById(long id);

    /**
     * 保存菜单
     * @param menu
     */
    public void save(Menu menu);

    /**
     * 更新菜单
     * @param menu
     */
    public void update(Menu menu);

    /**
     * 通过id删除商品
     * @param id
     */
    public void deleteById(long id);
}
