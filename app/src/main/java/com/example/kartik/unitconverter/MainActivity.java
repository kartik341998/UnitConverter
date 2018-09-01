package com.example.kartik.unitconverter;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Length length;
    Area area;
    Weigth weigth;
    Home home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager manager=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction=manager.beginTransaction();
        home=new Home();
        transaction.replace(R.id.frame,home);
        transaction.commit();

        bottomNavigationView=findViewById(R.id.bottomnavview);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                long id=item.getItemId();




                if(id==R.id.area)
                {
                    android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    area=new Area();
                    fragmentTransaction.replace(R.id.frame,area);
                    fragmentTransaction.commit();

                    }
                else if (id==R.id.weigth)
                {
                    android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    weigth=new Weigth();
                    fragmentTransaction.replace(R.id.frame,weigth);
                    fragmentTransaction.commit();

                }
                else if(id==R.id.length)
                {
                    android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    length=new Length();
                    fragmentTransaction.replace(R.id.frame,length);
                    fragmentTransaction.commit();
                    }


                return true;
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        long id=item.getItemId();

        if (id==R.id.home)
        {
            android.support.v4.app.FragmentManager manager=getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction transaction=manager.beginTransaction();
            home=new Home();
            transaction.replace(R.id.frame,home);
            transaction.commit();

        }
        return true;
    }
}
