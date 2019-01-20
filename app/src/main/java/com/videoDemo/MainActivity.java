package com.videoDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.videoDemo.adapter.VideoAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    void initView() {
        rv_video = findViewById(R.id.rv_video);

        rv_video.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<String> data = new ArrayList<>();
        data.add("ball.mp4");
        data.add("cat.mp4");
        data.add("crying.mp4");
        data.add("emoji.mp4");
        data.add("rabbit.mp4");

        VideoAdapter videoAdapter = new VideoAdapter(data, this);
        rv_video.setAdapter(videoAdapter);

    }
}
