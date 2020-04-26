package com.jack.dao.mapper;

import com.jack.model.beans.Bfcount;
import com.jack.model.beans.BfcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BfcountMapper {
    int countByExample(BfcountExample example);

    int deleteByExample(BfcountExample example);

    int insert(Bfcount record);

    int insertSelective(Bfcount record);

    List<Bfcount> selectByExample(BfcountExample example);
    List<Bfcount> selectAll();

    int updateByExampleSelective(@Param("record") Bfcount record, @Param("example") BfcountExample example);

    int updateByExample(@Param("record") Bfcount record, @Param("example") BfcountExample example);
}