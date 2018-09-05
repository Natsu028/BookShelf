package com.lifeistich.android.bookshelf;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by kodakanatsumi on 2018/07/20.
 */

public class MemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Realmの初期化
        Realm.init(getApplicationContext());
    }
}
