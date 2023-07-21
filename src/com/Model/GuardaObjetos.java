package com.Model;

public class GuardaObjetos {

    int count = 0;

    Object object[] = new Object[10];

    public void saveObject(Object obj) {
        object[count] = obj;
        count++;
    }

    public Object getObject(int index) {
        return object[index];
    }
}
