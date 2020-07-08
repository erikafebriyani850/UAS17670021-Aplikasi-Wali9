package com.erika.uas17670021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvWali9;
    private ArrayList<wali9> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvWali9 = findViewById(R.id.rv_wali9);
        rvWali9.setHasFixedSize(true);

        list.addAll(wali9data.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWali9.setLayoutManager(new LinearLayoutManager(this));
        ListWali9Adapter listWali9Adapter = new ListWali9Adapter(list);
        rvWali9.setAdapter(listWali9Adapter);

        listWali9Adapter.setOnItemClickCallback(new ListWali9Adapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(wali9 data) {
                showSelectedWali9(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvWali9.setLayoutManager(new GridLayoutManager(this, 2));
        GridWali9Adapter gridWali9Adapter = new GridWali9Adapter(list);
        rvWali9.setAdapter(gridWali9Adapter);

        GridWali9Adapter.setOnItemClickCallback(new ListWali9Adapter.OnItemClickCallback() {

            public void onItemClicked(wali9 data) {
                showSelectedWali9(data);
            }
        });
    }

    private void showSelectedWali9(wali9 data) {
    }

    private void showRecyclerCardView(){
        rvWali9.setLayoutManager(new LinearLayoutManager(this));
        CardViewWali9Adapter cardViewWali9Adapterr = new CardViewWali9Adapter(list);
        rvWali9.setAdapter(cardViewWali9Adapterr);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }

        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(wali9 wali9) {
        Toast.makeText(this, "Kamu memilih " + wali9.getName(), Toast.LENGTH_SHORT).show();
    }
}
