package com.cn.springbootandes.dao;

import com.cn.springbootandes.pojo.Parms;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ParmsDao extends ElasticsearchRepository<Parms,String> {

    public List<Parms> findParmsByParmName(String parmName);

    public List<Parms> findParmsByParmNameContains(String parmName);

    public List<Parms> findParmsByIsMustEquals(String must);
}
