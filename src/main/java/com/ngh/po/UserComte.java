package com.ngh.po;

import java.util.List;

public class UserComte extends User {
    private List<Integer> idArray;

    public void setIdArray(List<Integer> idArray) {
        this.idArray = idArray;
    }

    public List<Integer> getIdArray() {
        return idArray;
    }
}
