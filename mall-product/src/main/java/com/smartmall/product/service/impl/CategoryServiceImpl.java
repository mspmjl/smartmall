package com.smartmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smartmall.product.dao.CategoryDao;
import com.smartmall.product.entity.CategoryEntity;
import com.smartmall.product.service.CategoryService;
import com.smartmall.common.utils.PageUtils;
import com.smartmall.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // baseMapper 就是 CategoryDao
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> level1 = categoryEntities.stream().filter(c -> c.getParentCid() == 0)
                .map(c -> {
                    c.setChildren(getChildren(c, categoryEntities));
                    return c;
                })
                .sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .collect(Collectors.toList());
        return level1;
    }

    @Override
    public void removeMenusByIds(List<Long> longs) {
        baseMapper.deleteBatchIds(longs);
    }

    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream().filter(c -> c.getParentCid().equals(parent.getCatId()))
                .map(c -> {
                    c.setChildren(getChildren(c, all));
                    return c;
                })
                .sorted(Comparator.comparingInt(c -> (c.getSort() == null ? 0 : c.getSort())))
                .collect(Collectors.toList());
        return collect;
    }
}