package com.ranzan.animaldetailsrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClicked {
    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(animalAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void buildData() {
        Animal dog = new Animal("Dog", "Mammal", "Bow Bow", R.drawable.dog);
        Animal elephant = new Animal("Elephant", "Mammal", "Trumpeting ", R.drawable.elephant);
        Animal lion = new Animal("Lion", "Mammal", "Roar", R.drawable.lion);
        Animal tiger = new Animal("Tiger", "Mammal", "Growl", R.drawable.tiger);
        Animal zebra = new Animal("Zebra", "Mammal", "Braying", R.drawable.zebra);
        for (int i = 0; i < 30; i++) {
            animalList.add(dog);
            animalList.add(elephant);
            animalList.add(lion);
            animalList.add(tiger);
            animalList.add(zebra);
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(Animal animal, int position) {
        new AlertDialog.Builder(this).setMessage(animal.getName()).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}