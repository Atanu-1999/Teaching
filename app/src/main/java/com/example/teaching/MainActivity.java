package com.example.teaching;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.teaching.activity.BookingHistory;
import com.example.teaching.fragment.Calender;
import com.example.teaching.fragment.Home;
import com.example.teaching.fragment.Profile;
import com.example.teaching.fragment.TeacherDashboard;
import com.example.teaching.fragment.YourCart;
import com.google.android.material.navigation.NavigationView;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation nav_view;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ImageView menu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* nav = findViewById(R.id.navigation_drawer);
        menu = findViewById(R.id.menu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        toggle.setDrawerIndicatorEnabled(false);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Ed:
                        break;
                    case R.id.time:
                        break;
                    case R.id.live:
                        break;
                    case R.id.doubt:
                        break;
                    case R.id.notice:
                        break;
                    case R.id.sm:
                        break;
                    case R.id.download:
                        break;

                    case R.id.courses:
                        break;
                    case R.id.activity:
                        break;

                    case R.id.Refer:
                        break;

                    case R.id.help:
                        break;

                    case R.id.about:
                        break;

                    case R.id.policy:
                        break;

                    case R.id.use:
                        break;
                }

                return true;

            }
        });*/
        nav_view = findViewById(R.id.nav_view);
        nav_view.add(new MeowBottomNavigation.Model(1, R.drawable.home_24));
//        nav_view.add(new MeowBottomNavigation.Model(2, R.drawable.dashboard_24));
        nav_view.add(new MeowBottomNavigation.Model(2, R.drawable.date_24));
        nav_view.add(new MeowBottomNavigation.Model(3, R.drawable.cart_24));
        nav_view.add(new MeowBottomNavigation.Model(4, R.drawable.ic_baseline_person_24));


        nav_view.show(1,true);
        replace(new Home());
        nav_view.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                switch (model.getId()){
                    case 1:
                        replace(new Home());
                        break;
                    case 2:
                        replace(new Calender());
                        break;
                    case 3:
                        replace(new YourCart());
                        break;
                    case 4:
                        replace(new Profile());
                        break;
                }
                return null;
            }
        });
    }

    private void replace(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, fragment)
                .commit();
    }
}