package xyz.cjl.demo.mall.service;

import xyz.cjl.demo.mall.dto.PmsBrandParam;
import xyz.cjl.demo.mall.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandParam brand);

    int updateBrand(Long id, PmsBrandParam brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
