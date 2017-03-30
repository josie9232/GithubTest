package com.example.a4.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){ // 呼叫父類別 onCreate() 方法
        super.onCreate(savedInstanceState); // super = 導入。
        setContentView(R.layout.activity_main2); // 載入 layout 檔案，當作此頁畫面。指定該元件使用畫面的配置資源。
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){ // 建立目錄
        getMenuInflater().inflate(R.menu.main2,menu); // Inflater為抓取版面。
        return true; // 無意
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // 建立"被件選到的物件"要執行甚麼的class (宣告變數 item 為MenuItem的類型
        int itemThatWasClickedId = item.getItemId(); // 讓變數 item執行 MenuItem下的getItemId來抓取Id，然後丟進變數"itemThatWasClickedId"裡
        if (itemThatWasClickedId == R.id.action_menu){ // 如果 (新變數 itemThatWasClickedId = 按鈕的 id)就
            Intent x = new Intent(); // 運用意向方法
            x.setClass(MainActivity2.this,MainActivity.class); // 從 MainActivity2 導向 MainActivity
            startActivity(x); //啟動意向方法
        }
        return super.onOptionsItemSelected(item);
    }
}
