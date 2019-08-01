package cn.itsource.aishop.service.impl;

import cn.itsource.aishop.domain.ProductType;
import cn.itsource.aishop.mapper.ProductTypeMapper;
import cn.itsource.aishop.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author ice
 * @since 2019-07-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

    @Override
    public List<ProductType> loadTypeTree() {
        //查询所有数据
        List<ProductType> productTypes = baseMapper.selectList(null);
        //装一级菜单和所拥有的的子菜单
        ArrayList<ProductType> list = new ArrayList<>();
        //装所有的ProductType
        Map<Long, ProductType> map = new HashMap<>();
        for (ProductType type : productTypes) {
            map.put(type.getId(),type);
        }
        for (ProductType productType : productTypes) {
            if (productType.getPid()==0){
                //判断是否为1级菜单
                list.add(productType);
            }else {
                //查询出父级菜单
                ProductType parent = map.get(productType.getPid());
                //放入父级菜单中
                parent.getChildren().add(productType);
            }
        }
        return list;
    }
}
