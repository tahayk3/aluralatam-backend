public class Pelicula {

    //propiedades
    String nombre;
    int fechaDeLanzamiento;
    int  duracionEnMinutos;
    boolean incluirEnPlan;
    double sumaDeLasCalificaciones;
    int totaEvaluaciones;


    //Metodos
    void mostrarFichaTecnnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre );
        System.out.println("La fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("La duracion de lanzamiento es: "+ duracionEnMinutos);
        System.out.println("Incluido en plan: "+ incluirEnPlan);
    }

    void evalua(double calificacion){
        sumaDeLasCalificaciones = sumaDeLasCalificaciones + calificacion;
        totaEvaluaciones++;
    }

    double calcularMedia(){
        return sumaDeLasCalificaciones / totaEvaluaciones;
    }
}
