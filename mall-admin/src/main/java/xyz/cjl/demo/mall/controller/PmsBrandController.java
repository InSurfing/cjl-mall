package xyz.cjl.demo.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.cjl.demo.mall.common.api.CommonResult;
import xyz.cjl.demo.mall.common.api.ResultCode;
import xyz.cjl.demo.mall.dto.PmsBrandParam;
import xyz.cjl.demo.mall.model.PmsBrand;
import xyz.cjl.demo.mall.service.PmsBrandService;

import java.util.List;

@Controller
public class PmsBrandController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    private PmsBrandService pmsBrandService;

    @RequestMapping(path = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody PmsBrandParam pmsBrandParam) {
        int cnt = pmsBrandService.createBrand(pmsBrandParam);
        CommonResult<ResultCode> result = null;
        if (cnt == 1) {
            result = CommonResult.success(ResultCode.SUCCESS);
        } else {
            result = CommonResult.failed();
        }
        return result;
    }

}
