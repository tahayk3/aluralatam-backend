public class Principal {
    public static void main(String[] args) {

        //crear objeto y llenar datos
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Lalaland";
        miPelicula.fechaDeLanzamiento = 2019;
        miPelicula.duracionEnMinutos = 220;
        miPelicula.incluirEnPlan = true;

        //mostrar datos
        miPelicula.mostrarFichaTecnnica();

        //asignar calificaciones
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        //lectura de datos
        System.out.println(miPelicula.sumaDeLasCalificaciones);
        System.out.println(miPelicula.totaEvaluaciones);
        System.out.println(miPelicula.calcularMedia());


    }
}
