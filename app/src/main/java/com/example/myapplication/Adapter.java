package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private ArrayList<MessagesData> mMessagesData;
    public Adapter(ArrayList<MessagesData> arrayList){
        mMessagesData = arrayList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        MessagesData data = mMessagesData.get(position);
        holder.heading.setText(data.getHeading());
        holder.messages.setText(data.getMessages());

    }

    @Override
    public int getItemCount() {
        return mMessagesData.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView heading,messages;
        public Holder(View itemView) {
            super(itemView);
            heading = itemView.findViewById(R.id.heading);
            messages = itemView.findViewById(R.id.messageBody);
        }
    }
}
