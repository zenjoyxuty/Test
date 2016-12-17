package com.example.acier.imagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by 郑振楠
 * QQ728121881
 */
public class MainActivity extends AppCompatActivity {
    private ImageView ima;
    private ImageView ima1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ima = (ImageView) findViewById(R.id.ima);
        ima1 = (ImageView) findViewById(R.id.ima1);
        ima.setAlpha(0.45f);
        //gggggggg
        Glide.with(this).load("https://i.ytimg.com/vi/LxXX2I50Woc/mqdefault.jpg").asBitmap()
                .transform(new FastBlur(this, 40))
                .into(ima);

        Glide.with(this).load("http://i0.hdslb.com/bfs/archive/fb793cb05478c891265da630e4f07cb7922b8ac1.jpg").asBitmap()
                .into(ima1);
        System.out.("hhh");
    }
}
