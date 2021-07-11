package com.ranzan.animaldetailsrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView type;
    private TextView sound;
    private ImageView image;
    private ConstraintLayout layout;
    private OnItemClicked onItemClicked;


    public AnimalViewHolder(@NonNull View itemView, OnItemClicked onitemClicked) {
        super(itemView);
        this.onItemClicked=onitemClicked;
        init(itemView);
    }

    private void init(View itemView) {
        name = itemView.findViewById(R.id.tvName);
        type = itemView.findViewById(R.id.tvType);
        sound = itemView.findViewById(R.id.tvSound);
        image = itemView.findViewById(R.id.ivImage);
        layout = itemView.findViewById(R.id.layout);
    }

    protected void setData(Animal animal) {
        name.setText(animal.getName());
        type.setText(animal.getType());
        sound.setText(animal.getSound());
        image.setImageResource(animal.getImageId());
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClicked.onItemClicked(animal, getAdapterPosition());
            }
        });
    }

}
