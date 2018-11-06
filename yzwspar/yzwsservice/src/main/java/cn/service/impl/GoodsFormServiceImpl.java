package cn.service.impl;

import cn.dao.GoodsFormDao;
import cn.pojo.GoodsForm;
import cn.service.GoodsFormService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("GoodsFormService")
public class GoodsFormServiceImpl implements GoodsFormService {
    @Autowired
    private GoodsFormDao gsfd;

    public GoodsFormDao getGsfd() {
        return gsfd;
    }

    public void setGsfd(GoodsFormDao gsfd) {
        this.gsfd = gsfd;
    }

    /**
     * 根据商品名模糊查询商品信息
     * @param gname
     * @return
     */
    /*@Transactional
    @Override
    public List<GoodsForm> selfuzzy(String gname) {
        return gsfd.selfuzzy(gname);
    }*/

    /**
     * 根据商品类型查询商品信息
     * @param tid
     * @return
     */
    /*@Transactional
    @Override
    public List<GoodsForm> selinfo(Integer tid) {
        return gsfd.selinfo(tid);
    }*/

    /**
     * 根据商品类型查询商品信息并分页显示商品信息
     * @param index 起始页数
     * @param pagesize 每页显示条数
     * @return
     */
    @Transactional
    @Override
    public String getPageByIndexInfo(Integer index, Integer pagesize) {
        PageHelper.startPage(index,pagesize);
        List<GoodsForm> paginginfo = gsfd.selinfo(null);
        PageInfo<GoodsForm> pages = new PageInfo<GoodsForm>(paginginfo);
        return JSON.toJSONString(pages);
    }

    /**
     * 根据商品名模糊查询商品信息并分页显示
     * @param index
     * @param pagesize
     * @return
     */
    @Transactional
    @Override
    public String getPageByIndexFuzzy(Integer index, Integer pagesize) {
        PageHelper.startPage(index,pagesize);
        List<GoodsForm> pagingfuzzy = gsfd.selfuzzy(null);
        PageInfo<GoodsForm> page = new PageInfo<GoodsForm>(pagingfuzzy);
        return JSON.toJSONString(page);
    }

    @Transactional
    @Override
    public String getPageByIndexGoods(Integer index, Integer pagesize) {
        PageHelper.startPage(index,pagesize);
        List<GoodsForm> paginggoods = gsfd.selgoodsinfo(null);
        PageInfo<GoodsForm> paging = new PageInfo<GoodsForm>(paginggoods);
        return JSON.toJSONString(paging);
    }


}
