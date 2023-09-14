package com.yq.sellPros.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * (ProductTypes)实体类
 *
 * @author ywb
 * @since 2023-06-29 19:23:21
 */
@Data
public class ProductTypesEntity implements Serializable {
    private static final long serialVersionUID = 976786672700778371L;
    
    private Integer typeId;
    
    private String typeName;
    
    private String typeDesc;
    
    private Integer delMark;

}

