package com.i053114.tallertres;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable originalDrawable  = getResources().getDrawable(R.drawable.rostro);
        Bitmap originaBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        RoundedBitmapDrawable roundedDrawable= RoundedBitmapDrawableFactory.create(getResources(), originaBitmap);

        roundedDrawable .setCornerRadius(originaBitmap.getHeight());
        ImageView iv_1 = (ImageView) findViewById(R.id.iv_1);
        iv_1.setImageDrawable(roundedDrawable);



        FloatingActionButton btn_one = (FloatingActionButton) findViewById(R.id.fab_1);
        registerForContextMenu(btn_one);
    }


    public boolean  onCreateOptionsMenu ( Menu menu_a){
        getMenuInflater().inflate(R.menu.menu1,menu_a);
        return true;

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis opciones");
        inflater.inflate(R.menu.menu1, menu);
    }



}
