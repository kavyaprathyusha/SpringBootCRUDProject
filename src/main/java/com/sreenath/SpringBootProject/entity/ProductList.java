package com.sreenath.SpringBootProject.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTLIST")
public class ProductList {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long itemID;

    @Column(name="ITEM_NAME")
    private String itemName;

    @Column(name="ITEM_COST")
    private Integer itemCost;
    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemCost() {
        return itemCost;
    }

    public void setItemCost(Integer itemCost) {
        this.itemCost = itemCost;
    }

}
