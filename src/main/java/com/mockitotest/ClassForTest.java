package com.mockitotest;

public class ClassForTest {

    private final MyDataBase myDataBase;

    public ClassForTest(MyDataBase myDataBase) {
        this.myDataBase = myDataBase;
    }

    public boolean query(String query) {
        return this.myDataBase.query(query);
    }
}
