package apps.cursos.com.mascotasrvyav;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public  ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        miActionBar.setTitle(R.string.my_activitymain_label);

        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // irMascotasFavoritasActivity();


            }
        });


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas) ;

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        inicializarListaMascotas();
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Mascota 1", 5 , R.drawable.dog1 ));
        mascotas.add(new Mascota("Mascota 2", 3 , R.drawable.dog2 ));
        mascotas.add(new Mascota("Mascota 3", 2 , R.drawable.dog3 ));
        mascotas.add(new Mascota("Mascota 4", 3 , R.drawable.dog4 ));
        mascotas.add(new Mascota("Mascota 5", 2 , R.drawable.dog5 ));
    }

    public void irMascotasFavoritasActivity(){
        Intent intent = new Intent(this,MascotasFavoritasActivity.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_favoritos) {
            irMascotasFavoritasActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
