package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.rv_mahasiswa);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Cahya Ramadhan", "E41192208", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Rayhan Pangestu", "E41192209", "1234567891"));
        mahasiswaArrayList.add(new Mahasiswa("Yerico Advent", "E41192210", "1234567892"));
        mahasiswaArrayList.add(new Mahasiswa("Nuril Firdausy", "E41192211", "1234567893"));
        mahasiswaArrayList.add(new Mahasiswa("Annaufal", "E41192212", "1234567894"));
        mahasiswaArrayList.add(new Mahasiswa("Khaniffan", "E41192213", "1234567895"));
        mahasiswaArrayList.add(new Mahasiswa("Nurul Akhmad", "E41192214", "1234567896"));
        mahasiswaArrayList.add(new Mahasiswa("Anjas Sutomo", "E41192215", "1234567897"));
        mahasiswaArrayList.add(new Mahasiswa("Fian Risky", "E41192216", "1234567898"));
        mahasiswaArrayList.add(new Mahasiswa("Mohammad Saifuddin", "E41192217", "1234567899"));
        mahasiswaArrayList.add(new Mahasiswa("Yoga Prakasha", "E41192218", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Benny Moza", "E41192219", "1234567990"));
    }
}