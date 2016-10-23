package com.example.oleg.conspects;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Oleg on 15.10.2016.
 */

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ListView drawerListView;
    private String [] str;
    private ArrayAdapter<String> drawerListArrayAdapter;
    private android.support.v7.widget.Toolbar toolbar;
    private android.support.design.widget.NavigationView navigationView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        str = new String[2];
        str[0] = getString(R.string.alg);
        str[1] = getString(R.string.geo);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (android.support.design.widget.NavigationView)findViewById(R.id.navigation_view);

        View navHeaderLayout = navigationView.getHeaderView(R.layout.nav_drawer_header);
       // TextView navHeaderText = (TextView) navHeaderLayout.findViewById(R.id.nav_header_text);
        //drawerListView = (ListView)findViewById(R.id.drawer_list);
        //drawerListArrayAdapter = new ArrayAdapter<String>(this, R.layout.drawer_list_item, R.id.drawer_list_item, str);
        //drawerListView.setAdapter(drawerListArrayAdapter);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
