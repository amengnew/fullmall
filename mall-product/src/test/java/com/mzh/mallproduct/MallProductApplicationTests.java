package com.mzh.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mzh.product.entity.BrandEntity;
import com.mzh.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static java.util.Collections.list;

@SpringBootTest
class MallProductApplicationTests {

	@Resource
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setName("huawei");
		brandEntity.setDescript("NB");
		List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		brandEntityList.forEach((item) -> System.out.println(item));
		System.out.println("save success");
	}

}
