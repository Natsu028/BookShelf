package com.lifeistich.android.bookshelf;
import io.realm.RealmObject;

/**
 * Created by kodakanatsumi on 2018/07/20.
 */

public class Memo extends RealmObject{

    public String bookname;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
