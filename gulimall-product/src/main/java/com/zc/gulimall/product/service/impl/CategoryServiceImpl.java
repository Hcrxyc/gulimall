package com.zc.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.common.utils.PageUtils;
import com.zc.common.utils.Query;
import com.zc.gulimall.product.dao.CategoryDao;
import com.zc.gulimall.product.entity.CategoryEntity;
import com.zc.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.要查出所有分类
        List<CategoryEntity> entities=baseMapper.selectList(null);
        //2.组装成父子的树形结构
        //找到所有的一级分类
        List<CategoryEntity> level1Menus=entities.stream().filter(categoryEntity->  categoryEntity.getParentCid()==0
                ).map(menu->{
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                }).sorted((menu,menu2)->{
                    return (menu.getSort() == null ? 0 :menu.getSort()) - (menu2.getSort() == null ? 0 :menu2.getSort());
                }).collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> ids) {
        //TODO 检查当前删除的菜单,是否被别的地方引用

        //逻辑删除
        baseMapper.deleteBatchIds(ids);
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> children=all.stream().filter(categoryEntity->{
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            //找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu,menu2)->{
            //菜单的排序
            return (menu.getSort() == null ? 0 :menu.getSort()) - (menu2.getSort() == null ? 0 :menu2.getSort());
        }).collect(Collectors.toList());
        return children;

    }


}