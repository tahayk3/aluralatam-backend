import com.tahayk3.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        //crear objeto y llenar datos
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Lalaland");
        miPelicula.setFechaDeLanzamiento(2019);
        miPelicula.setDuracionEnMinutos(220);
        miPelicula.setIncluirEnPlan(true);

        //asignar calificaciones
        miPelicula.evalua(7.8);
        miPelicula.evalua(9);

        //procesar y mostrar datos
        miPelicula.mostrarFichaTecnnica();
        System.out.println(miPelicula.getTotaEvaluaciones());
        System.out.println(miPelicula.calcularMedia());
    }
}
