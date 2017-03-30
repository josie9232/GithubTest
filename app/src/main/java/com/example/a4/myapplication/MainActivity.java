package com.example.a4.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 呼叫父類別 onCreate() 方法
        super.onCreate(savedInstanceState); // super = 導入。
        setContentView(R.layout.activity_main); // 載入 layout 檔案，當作此頁畫面，就是指定該元件使用畫面的配置資源。
    }

    public boolean onCreateOptionsMenu(Menu menu){ // 建立 menu，設定變數menu 為Menu型態
        getMenuInflater().inflate(R.menu.main,menu); // Inflater為抓取版面。尋找到主目錄(R) >menu >main，將版面設定給新 menu
        return true; // 無意
    }

    public boolean onOptionsItemSelected(MenuItem item) { // 建立"被件選到的物件"要執行甚麼的class (宣告變數 item 為MenuItem的類型
        int itemThatWasClickedId = item.getItemId(); // 讓變數 item執行 MenuItem下的getItemId來抓取Id，然後丟進變數"itemThatWasClickedId"裡
        if (itemThatWasClickedId == R.id.action_menu) { // 如果 (新變數 itemThatWasClickedId = 按鈕的 id)就
            Intent x = new Intent(); // 運用意向方法
            x.setClass(MainActivity.this,MainActivity2.class); // 從 MainActivity 導向 MainActivity2
            startActivity(x); //啟動意向方法
        }
        return super.onOptionsItemSelected(item); // 無意
    }
}
