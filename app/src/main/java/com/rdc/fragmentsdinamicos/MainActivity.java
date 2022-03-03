package com.rdc.fragmentsdinamicos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.rdc.fragmentsdinamicos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Referencias a los fragments (clases java)
    FragmentRojo fragmentRojo;
    FragmentAzul fragmentAzul;
    FragmentVerde fragmentVerde;

    //Creamos el ViewBinding
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Instanciamos los fragments
        fragmentRojo = new FragmentRojo();
        fragmentAzul = new FragmentAzul();
        fragmentVerde = new FragmentVerde();

        //Por defecto, quiero que el primero que aparezca sea el fragmento rojo
        //.add(donde quiero que se añada el fragment, el fragment que quiero añadir)
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, fragmentRojo).commit();

        binding.btnred.setOnClickListener(view1 -> {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //reemplazamos el fragment puesto por defecto por este
            //reempleza en el contenedor de los fragment, este fragmento
            transaction.replace(R.id.contenedorFragment, fragmentRojo);
            transaction.commit();

        });

        binding.btnblue.setOnClickListener(view1 -> {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //reemplazamos el fragment puesto por defecto por este
            //reempleza en el contenedor de los fragment, este fragmento
            transaction.replace(R.id.contenedorFragment, fragmentAzul);
            transaction.commit();

        });

        binding.btngreen.setOnClickListener(view1 -> {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //reemplazamos el fragment puesto por defecto por este
            //reempleza en el contenedor de los fragment, este fragmento
            transaction.replace(R.id.contenedorFragment, fragmentVerde);
            transaction.commit();

        });
    }
}