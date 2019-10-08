package com.example.cumpledenicolas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton fred, gogo, honey, wasabi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        honey = findViewById(R.id.botonhoney);
        wasabi = findViewById(R.id.botonwasabi);
        fred = findViewById(R.id.botonfred);
        gogo = findViewById(R.id.botongogo);

        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentHiro fragmentHiro = new FragmentHiro();

                pegarFragment(fragmentHiro);

            }
        });

        wasabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentWasabiPlaylist fragmentWasabiPlaylist = new FragmentWasabiPlaylist();

                pegarFragment(fragmentWasabiPlaylist);
            }
        });

        fred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentFred fragmentFred = new FragmentFred();

                pegarFragment(fragmentFred);
            }
        });

        gogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentGogo fragmentGogo = new FragmentGogo();

                pegarFragment(fragmentGogo);
            }
        });

    }

    private void pegarFragment(Fragment unFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.contenedorDeFragments, unFragment, null);

        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}
