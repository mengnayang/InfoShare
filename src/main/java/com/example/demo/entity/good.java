package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "good")
public class good {
    @Id
    private String good_id;
    private String good_name;
    private String good_item;
    private String birth_data;
    private Integer during;
    private Double price;

    public good() {

    }

    public good(String good_id, String good_name, String good_item, String birth_data, Integer during, Double price) {
        this.good_id = good_id;
        this.good_name = good_name;
        this.good_item = good_item;
        this.birth_data = birth_data;
        this.during = during;
        this.price = price;
    }

    @Override
    public String toString() {
        return "good{" +
                "good_id='" + good_id + '\'' +
                ", good_name='" + good_name + '\'' +
                ", good_item='" + good_item + '\'' +
                ", birth_data=" + birth_data +
                ", during=" + during +
                ", price=" + price +
                '}';
    }

    public String getGood_id() {
        return good_id;
    }

    public void setGood_id(String good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public String getGood_item() {
        return good_item;
    }

    public void setGood_item(String good_item) {
        this.good_item = good_item;
    }

    public String getBirth_data() {
        return birth_data;
    }

    public void setBirth_data(String birth_data) {
        this.birth_data = birth_data;
    }


//    public Date getBirth_data() {
//        return birth_data;
//    }
//
//    public void setBirth_data(Date birth_data) {
//        this.birth_data = birth_data;
//    }

    public Integer getDuring() {
        return during;
    }

    public void setDuring(Integer during) {
        this.during = during;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
