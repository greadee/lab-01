package com.example.PetShop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 5.
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");
        Fish fish = new Fish("Ladybird");
        Snake snake  = new Snake("Solid");
        Rock rock = new Rock("Rocky");

        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);
        petList.add(fish);
        petList.add(snake);
        petList.add(rock);

        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);

        // Pet sounds
        for (Pet p : petList) {
            System.out.println(p.getName() + " : " + p.speak());
        }

        for (Pettable p : pettablePets) {
            p.pet();
        }
    }
}
