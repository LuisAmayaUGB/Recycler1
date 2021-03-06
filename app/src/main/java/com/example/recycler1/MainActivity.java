package com.example.recycler1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView reyclerViewUser;
    private RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        reyclerViewUser = (RecyclerView) findViewById(R.id.recycler);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        reyclerViewUser.setHasFixedSize(true);

        // use a linear layout manager
        reyclerViewUser.setLayoutManager(new LinearLayoutManager(this));

        // specify an adapter with the list to show
        mAdapter = new UserAdapter(getData());
        reyclerViewUser.setAdapter(mAdapter);

    }

    // create fake data for this example
    public List<UserModel> getData() {

        List<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel("Ana"));
        userModels.add(new UserModel("Luis"));
        userModels.add(new UserModel("Cecilia"));
        userModels.add(new UserModel("Diego"));
        userModels.add(new UserModel("Carlos"));
        userModels.add(new UserModel("Juan"));

        for(int i = 1; i < 10; i++) {
            userModels.add(new UserModel("Name " + i));
        }

        return userModels;
    }



}