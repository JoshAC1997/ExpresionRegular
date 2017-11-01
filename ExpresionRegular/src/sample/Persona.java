package sample;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    public String nombre;
    public String apellido;
    int edad;


    private static Persona[] personas = new Persona[]{

            new Persona("David", "Martinez", 20),
            new Persona("David", "Delcid", 22),
            new Persona("Juan", "Veliz", 20),
            new Persona("Josue", "Cordova", 21),
            new Persona("Yarince", "Padilla", 25),
            new Persona("Tulio", "Garcia", 20),
            new Persona("Orlando", "Calix", 23),
    };


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }
    public static void  buscarPorNombre (String nombre) {

         int b=0;


        for (int i = 0; i < personas.length; i++) {

            String pat = "(?i)";
            Pattern p = Pattern.compile("(?i)" + nombre);
            Matcher mat = p.matcher(personas[i].nombre);
            if (mat.find()) {
                System.out.println(personas[i].nombre + " " + personas[i].apellido + " " + personas[i].edad );
                 b=1;

            }


        }

        if (b==0){
            System.out.println("No se encontraron los valores");
        }
    }
}

