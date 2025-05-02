import com.tahayk3.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("La familia del futuro");
        miPelicula.setFechaDeLanzamiento(2007);
        miPelicula.setDuracionEnMinutos(95);
        miPelicula.setDirector("pablo cuarom");
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());
    }
}
