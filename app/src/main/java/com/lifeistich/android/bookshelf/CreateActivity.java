package com.lifeistich.android.bookshelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmObject;

public class CreateActivity extends AppCompatActivity {

    public Realm realm;

    public EditText titleEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        realm = Realm.getDefaultInstance();

        titleEditText = (EditText) findViewById(R.id.titleEditText);
    }

    public void save(final String title){

        realm.executeTransaction(new Realm.Transaction(){
            @Override
            public  void execute(Realm bgRealm){
                Memo memo = realm.createObject(Memo.class);
                memo.bookname = title;
            }
        });
    }

    // EditTextに入力されたデータを元にMemoを作る
    public void create(View view){
        //タイトルを取得する
        String title = titleEditText.getText().toString();

        //check(title);

        save(title);

        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        realm.close();
    }

    public void check(String title){

        //Memoクラスのインスタンス作成
        Memo memo = new Memo();

        //それぞれの要素を代入する
        memo.bookname = title;

        //ログに出してみる
        Log.d("Memo",memo.bookname);
    }
}
