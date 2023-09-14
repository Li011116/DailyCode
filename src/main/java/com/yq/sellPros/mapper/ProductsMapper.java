package com.yq.sellPros.mapper;

import com.yq.sellPros.domain.ProductsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Products)表数据库访问层
 *
 * @author ywb
 * @since 2023-06-29 19:23:21
 */
public interface ProductsMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    ProductsEntity queryById(Integer proId);

    /**
     * 查询指定行数据
     *
     * @param products 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProductsEntity> queryAllByLimit(@Param("products") ProductsEntity products, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param products 查询条件
     * @return 总行数
     */
    long count(ProductsEntity products);

    /**
     * 新增数据
     *
     * @param products 实例对象
     * @return 影响行数
     */
    int insert(ProductsEntity products);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductsEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductsEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductsEntity> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductsEntity> entities);

    /**
     * 修改数据
     *
     * @param products 实例对象
     * @return 影响行数
     */
    int update(ProductsEntity products);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 影响行数
     */
    int deleteById(Integer proId);

}

