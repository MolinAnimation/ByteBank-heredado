package com.Model;

public class GuardaObjetos {

    int count;
    Object[] ref;

    public GuardaObjetos() {
        this.ref = new Object[10];
        this.count = 0;
    }

    public void saveObject(Object obj) {
        ref[count] = obj;
        count++;
    }

    public Object getObject(int index) {
        return ref[index];
    }

    public int getObjectQuantity() {
        return this.count;
    }
}
