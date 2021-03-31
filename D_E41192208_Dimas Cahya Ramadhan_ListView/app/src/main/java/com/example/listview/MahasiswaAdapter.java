package com.example.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa>dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.txNama.setText(dataList.get(position).getNama());
        holder.txNohp.setText(dataList.get(position).getNohp());
        holder.txNpm.setText(dataList.get(position).getNpm());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNohp, txNpm;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txNohp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
            txNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
        }
    }
}
