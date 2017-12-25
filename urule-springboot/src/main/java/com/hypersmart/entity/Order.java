package com.hypersmart.entity;

import com.bstek.urule.model.Label;

/**
 * User: kevin.jiang
 * QQ: 861383731
 * Date: 2017/12/20
 * Time: 11:56
 */
public class Order {

    @Label("订单名称")
    private String name;
    @Label("订单价格")
    private float price;
    @Label("订单数量")
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}