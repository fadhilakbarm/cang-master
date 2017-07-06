package com.example.dickyeka.cangs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.TabHost;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //Detail
    private List<DetailMenu> detailMenuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DetailMenuAdapter mAdapter;

    //Menu
    /*ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new DetailMenuAdapter(detailMenuList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDetailMenuData();



        //Menu
        /*expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);*/



        //Galeri
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });


        //Tab Host
        TabHost mTabHost = (TabHost) findViewById(R.id.tabHost);
        mTabHost.setup();

        TabHost.TabSpec mSpec = mTabHost.newTabSpec("Detail");
        mSpec.setContent(R.id.first_Tab);
        mSpec.setIndicator("Detail");
        mTabHost.addTab(mSpec);

        mSpec = mTabHost.newTabSpec("Menu");
        mSpec.setContent(R.id.second_Tab);
        mSpec.setIndicator("Menu");
        mTabHost.addTab(mSpec);

        mSpec = mTabHost.newTabSpec("Galeri");
        mSpec.setContent(R.id.third_Tab);
        mSpec.setIndicator("Galeri");
        mTabHost.addTab(mSpec);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void prepareDetailMenuData() {
        DetailMenu detailMenu = new DetailMenu("Ayam Goreng Nelongso", "Ayam goreng original", "IDR   5000", R.drawable.image_2);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Ayam Bakar Rica-Rica", "Ayam bakar bumbu rica-rica", "IDR   8000", R.drawable.image_1);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Ayam Geprek", "Ayam goreng tepung geprek", "IDR   7000", R.drawable.image_3);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Ayam Plecing", "Ayam suwir bumbu pedas", "IDR 15000", R.drawable.image_8);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Ayam Crispy", "Ayam goreng tepung", "IDR 10000", R.drawable.image_5);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Ikan Bakar", "Ikan Gurami/Nila/Kerapu bakar", "IDR 12000", R.drawable.image_4);
        detailMenuList.add(detailMenu);

        detailMenu = new DetailMenu("Tahu Tempe", "Tahu tempe penyet", "IDR   6000", R.drawable.image_6);
        detailMenuList.add(detailMenu);

        mAdapter.notifyDataSetChanged();
    }

    /*private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Makanan");
        listDataHeader.add("Minuman");
        listDataHeader.add("Snack");

        // Adding child data
        List<String> makanan = new ArrayList<String>();
        makanan.add("Ayam Goreng Nelongso");
        makanan.add("Ayam Bakar Rica-rica");
        makanan.add("Ayam Goreng Tepung Pedas");
        makanan.add("Ayam Geprek");
        makanan.add("Ayam Crispy");
        makanan.add("Bebek Goreng");
        makanan.add("Ikan Bakar");
        makanan.add("Tahu Tempe");

        List<String> minuman = new ArrayList<String>();
        minuman.add("Es Teh");
        minuman.add("Teh Hangat");
        minuman.add("Es Jeruk");
        minuman.add("Jeruk Hangat");
        minuman.add("Es Campur");
        minuman.add("Jus Buah");

        List<String> snack = new ArrayList<String>();
        snack.add("Kentang Goreng");
        snack.add("Tahu Crispy");
        snack.add("Cah Kangkung");
        snack.add("Jamur Crispy");
        snack.add("Sate Usus");

        listDataChild.put(listDataHeader.get(0), makanan); // Header, Child data
        listDataChild.put(listDataHeader.get(1), minuman);
        listDataChild.put(listDataHeader.get(2), snack);
    }*/
}