package com.luvris2.recyclerviewadaptertestapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    List<String> testList;

    public Adapter(Context context, ArrayList<String> testList) {
        this.context = context;
        this.testList = testList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_row, parent, false);
        return new Adapter.ViewHolder(view);
    }

    // 메모리에 있는 데이터를 화면에 표시하는 메소드
    // 7. 파라미터의 RecyclerView.ViewHolder, 현재 클래스 이름으로 변경 -> Adapter.ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String strData = testList.get(position);
        holder.txt.setText(strData);
    }

    @Override
    public int getItemCount() {
        return testList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.textView);
        }
    }
}
