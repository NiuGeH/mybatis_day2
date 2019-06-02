package com.ngh.po;

public class Orders {
    private Integer id;
    private String number;
    private Integer user_id;
    private String createtime;
    private String note;
    private orderdetail orderdetail;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", user_id=" + user_id +
                ", createtime='" + createtime + '\'' +
                ", note='" + note + '\'' +
                ", orderdetail=" + orderdetail +
                '}';
    }

    public com.ngh.po.orderdetail getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(com.ngh.po.orderdetail orderdetail) {
        this.orderdetail = orderdetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
