package xyz.cjl.demo.mall.dto;

import lombok.Data;

@Data
public class PmsBrandParam {
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private String logo;
    private String bigPic;
    private String brandStory;
}
