package com.vaibhav.lakshya.miet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondYearActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView listView;
    private TextView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);
        setupUIViews();
        initToolbar();
        setupListView();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondYearActivity.this,MainActivity.class));
            }
        });

    }

    private void setupUIViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lvMain);
        backspace=(TextView)findViewById(R.id.backspace);
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Second Year");

    }

    private void setupListView() {
        String[] title = getResources().getStringArray(R.array.second);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, title);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(SecondYearActivity.this,DS.class));
                        break;
                    case 1:
                        startActivity(new Intent(SecondYearActivity.this,DLD.class));
                        break;
                    case 2:
                        startActivity(new Intent(SecondYearActivity.this,Maths3.class));
                        break;
                    case 3:
                        startActivity(new Intent(SecondYearActivity.this,COA.class));
                        break;
                    case 4:
                        startActivity(new Intent(SecondYearActivity.this,HumanValues.class));
                        break;
                    case 5:
                        startActivity(new Intent(SecondYearActivity.this,OS.class));
                        break;
                    case 6:
                        startActivity(new Intent(SecondYearActivity.this,DiscreteMaths.class));
                        break;
                    case 7:
                        startActivity(new Intent(SecondYearActivity.this,Laser.class));
                        break;
                    case 8:
                        startActivity(new Intent(SecondYearActivity.this,SoftwareEngg.class));
                        break;
                    case 9:
                        startActivity(new Intent(SecondYearActivity.this,IntroToMicroP.class));
                        break;
                    case 10:
                        startActivity(new Intent(SecondYearActivity.this,Automata.class));
                        break;
                    case 11:
                        startActivity(new Intent(SecondYearActivity.this,EVS.class));
                        break;

                }
            }
        });


    }

    public class SimpleAdapter extends BaseAdapter {


        private Context mContext;
        private LayoutInflater layoutInflater;
        private TextView title;
        private String[] titleArray;
        private ImageView imageView;

        public SimpleAdapter(Context context, String[] title) {
            mContext = context;
            titleArray = title;
            layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return titleArray.length;
        }

        @Override
        public Object getItem(int position) {
            return titleArray[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.first_year, null);

            }
            title = (TextView) convertView.findViewById(R.id.tvMain);
            imageView = (ImageView) convertView.findViewById(R.id.ivMain);
            title.setText(titleArray[position]);

                imageView.setImageResource(R.drawable.book);

            return convertView;

        }

    }
}
