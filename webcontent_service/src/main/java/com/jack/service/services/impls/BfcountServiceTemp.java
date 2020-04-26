package com.jack.service.services.impls;

import com.jack.dao.mapper.BfcountMapper;
import com.jack.model.beans.Bfcount;
import com.jack.service.services.BfcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/26 19:23
 * @Version 1.0
 */
@Transactional
@Service
public class BfcountServiceTemp implements BfcountService{

    @Autowired
    private BfcountMapper bfcountMapper;
    public List<Bfcount> selectAll() {
        List<Bfcount> lists=bfcountMapper.selectAll();
        return lists;
    }
}
