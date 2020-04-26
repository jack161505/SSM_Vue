package com.jack.service.services;

import com.jack.model.beans.Bfcount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 李善玺
 * @Date: 2020/4/26 19:22
 * @Version 1.0
 */
@Service
public interface BfcountService {
    List<Bfcount> selectAll();
}
