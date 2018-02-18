package com.sei.achmadtaufikrizki_1202150071_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Beer",1500,R.drawable.beer,"Beer mantap special brewed"));
        isi.add(new model("Tea Herbal",2500,R.drawable.tea,"Tea Herbal special brewed"));
        isi.add(new model("MilkTea",1000,R.drawable.milktea,"Milktea special brewed"));
        isi.add(new model("Mixed Juice",1000,R.drawable.mixedjuice,"Mixed juice special brewed"));
        isi.add(new model("Kopi,",1000,R.drawable.kopi,"Kopi mantap special brewed"));
        return  isi;
    }
}
