package com.yq.sellPros.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * (Products)实体类
 *
 * @author ywb
 * @since 2023-06-29 19:23:21
 */
@Data
public class ProductsEntity implements Serializable {
    private static final long serialVersionUID = -73062612365561287L;
    
    private Integer proId;
    
    private ProductTypesEntity productTypes;
    
    private String proName;
    
    private String proDesc;
    
    private Double proPrice;
    
    private Integer delMark;

}

