package com.cn.springbootandes;

import com.cn.springbootandes.dao.ParmsDao;
import com.cn.springbootandes.pojo.Parms;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.List;


@SpringBootTest
class SpringbootandesApplicationTests {

    @Autowired
    private ParmsDao parmsDao;
//    @Autowired
//    ElasticsearchTemplate elasticsearchTemplate;

    @Test
    void contextLoads() {
    }

    //添加
    @Test
    public  void test1(){
        Parms parms =new Parms("3","哈哈哈","1");
        parmsDao.index(parms);
    }

    //精确查询
    @Test
    public  void test2(){
        List<Parms> list =  parmsDao.findParmsByParmName("张大炮");
        for(Parms parms:list){
            System.out.println("---------------------");
            System.out.println(parms);

        }
    }

    //相等查询
    @Test
    public  void test3(){
        List<Parms> list =  parmsDao.findParmsByIsMustEquals("1");
        for(Parms parms:list){
            System.out.println("---------------------");
            System.out.println(parms);

        }
    }

    //模糊查询
    @Test
    public  void test4(){
        List<Parms> list =  parmsDao.findParmsByParmNameContains("张");
        for(Parms parms:list){
            System.out.println("---------------------");
            System.out.println(parms);

        }
    }
}
