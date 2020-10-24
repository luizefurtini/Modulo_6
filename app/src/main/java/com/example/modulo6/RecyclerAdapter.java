package com.example.modulo6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<RocketModel> rocketModels;

    public RecyclerAdapter(ArrayList<RocketModel> rocketModels) {
        this.rocketModels = rocketModels;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,
        false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RocketModel rocketModel = rocketModels.get(position);

        holder.rocketName.setText("Rocket: " + rocketModel.getRocketName());

        holder.launchDate.setText("Launch Date: " + rocketModel.getLaunchDate());

        if (rocketModel.isLaunchSuccess()) {
            holder.launchSuccess.setText("Launch Succeeded");
        } else {
            holder.launchSuccess.setText("Launch Failed");
        }
        holder.payload.setText(rocketModel.getPayload());
    }

    @Override
    public int getItemCount() {
        return rocketModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rocketName)
        TextView rocketName;

        @BindView(R.id.launchDate)
        TextView launchDate;

        @BindView(R.id.launchSuccess)
        TextView launchSuccess;

        @BindView(R.id.payload)
        TextView payload;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            ButterKnife.bind(this, itemView);
        }
    }


}
