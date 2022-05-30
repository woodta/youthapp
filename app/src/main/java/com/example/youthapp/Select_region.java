package com.example.youthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Select_region extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);

        list=(ListView)findViewById(R.id.list);

        List<String> data=new ArrayList<>();//배열안에다 string형태로 list뷰에 넣는다는 뜻
        //리스트뷰랑 리스트를 연결하는 adapter생성
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        //simple_list_item_1을 기본으로 주어지는 listview디자인
        list.setAdapter(adapter);
        //데이터를 listview에 추가
        data.add("지역전체");
        data.add("서울");
        data.add("경기");
        data.add("인천");
        data.add("강원");
        data.add("울산");
        data.add("대구");
        data.add("광주");
        data.add("충북");
        data.add("충남");
        data.add("대전");
        data.add("부산");
        data.add("제주");
        data.add("세종");
        data.add("전북");
        data.add("전남");
        data.add("경북");
        data.add("경남");


        adapter.notifyDataSetChanged();//이 상태로 저장을 하겠다는 뜻
    }
}