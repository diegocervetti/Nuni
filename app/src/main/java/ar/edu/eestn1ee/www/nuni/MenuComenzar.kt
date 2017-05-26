package ar.edu.eestn1ee.www.nuni

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ar.edu.eestn1ee.www.nuni.R.id.btnKotlin
import org.jetbrains.anko.intentFor

/**
 * Clase Kotlin para la actividad
 * de entrada a la App
 * 2 botones:
 * Kotlin --> App full kotlin
 * Java --> misma App pero el còdigo en Java
 */
class MenuComenzar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_comenzar)

        //Crear intent con extras
        //TODO que es el singleTop?????
        //startActivity(intentFor<Kotlin>("id" to 5).singleTop())
        //Pasar a otra Activity directamente sin extra
        //startActivity(intentFor<Kotlin>())

        //Boton para Actividad Kotlin
        //TODO porque no toma el listener? Necesita otra extencion o libreria????
        btnKotlin.setOnClickListener { startActivity(intentFor<Kotlin>()) }

        //Boton para Actividad Java
        //TODO y Java?????
        Button botonJava = (Button) findViewbyid(R.id.btnJava);

    }
}
