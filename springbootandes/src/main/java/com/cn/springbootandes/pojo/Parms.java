package com.cn.springbootandes.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "rxx",type = "parms")
public class Parms {

    @Id
    private String id ;

    @Field(type = FieldType.Keyword)
    private String parmName;

    @Field(type = FieldType.Keyword)
    private String isMust;


    //Es数据转成对象时必要的
    public Parms(){

    }

    public Parms(String id, String parmName, String isMust) {
        this.id=id;
        this.parmName=parmName;
        this.isMust=isMust;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParmName() {
        return parmName;
    }

    public void setParmName(String parmName) {
        this.parmName = parmName;
    }

    public String getIsMust() {
        return isMust;
    }

    public void setIsMust(String isMust) {
        this.isMust = isMust;
    }


}
