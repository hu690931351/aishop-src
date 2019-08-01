package cn.itsource.aishop.service.impl;

import cn.itsource.aishop.domain.Product;
import cn.itsource.aishop.mapper.ProductMapper;
import cn.itsource.aishop.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author ice
 * @since 2019-07-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
