package cn.service.impl;

import cn.dao.TypeFormDao;
import cn.pojo.TypeForm;
import cn.service.LimitService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("lms")
public class LimitServiceImpl implements LimitService {

    @Autowired
    private TypeFormDao tfd;

    public TypeFormDao getTfd() {
        return tfd;
    }

    public void setTfd(TypeFormDao tfd) {
        this.tfd = tfd;
    }

    /**
     * 分页
     * @param index 起始页数
     * @param pagesize 每页显示条数
     * @return
     */
    @Transactional
    @Override
    public String getPageByIndex(Integer index, Integer pagesize) {
        PageHelper.startPage(index,pagesize);
        List<TypeForm> typeForms = tfd.getAllType(null);
        PageInfo<TypeForm> PageInfo = new PageInfo<TypeForm>(typeForms);
        return JSON.toJSONString(PageInfo);
    }
}
