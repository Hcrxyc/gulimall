package com.zc.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zc.gulimall.product.entity.BrandEntity;
import com.zc.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity be=new BrandEntity();
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().select());
        list.forEach((item)->{
            System.out.println(item.getBrandId());
        });

        System.out.println("成功");
    }

}
