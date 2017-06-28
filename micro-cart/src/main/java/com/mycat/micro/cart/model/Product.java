package com.mycat.micro.cart.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Desc:
 *
 * @date: 27/06/2017
 * @author: gaozhiwen
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 2370587975481499997L;
    private Integer id;
    private String name;
    private BigDecimal price;
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
