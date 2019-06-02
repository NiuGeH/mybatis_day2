package com.ngh.po;

public class orderdetail {
    private Integer id;
    private Integer orders_id;
    private Integer items_id;
    private Integer items_num;
    private Orders orders;
    private items items;

    @Override
    public String toString() {
        return "orderdetail{" +
                "id=" + id +
                ", orders_id=" + orders_id +
                ", items_id=" + items_id +
                ", items_num=" + items_num +
                ", orders=" + orders +
                ", items=" + items +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(Integer items_id) {
        this.items_id = items_id;
    }

    public Integer getItems_num() {
        return items_num;
    }

    public void setItems_num(Integer items_num) {
        this.items_num = items_num;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public com.ngh.po.items getItems() {
        return items;
    }

    public void setItems(com.ngh.po.items items) {
        this.items = items;
    }
}
