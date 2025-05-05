import com.tahayk3.screenmatch.calculos.CalculadoraDeTiempo;
import com.tahayk3.screenmatch.calculos.FiltroRecomendacion;
import com.tahayk3.screenmatch.modelos.Pelicula;
import com.tahayk3.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //creando e insertando datos de pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("La familia del futuro");
        miPelicula.setFechaDeLanzamiento(2007);
        miPelicula.setDuracionEnMinutos(95);
        miPelicula.setDirector("pablo cuarom");
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        //mostrar datos de pelicula
        miPelicula.muestraFichaTecnica();
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());

        //creando e insertando datos de serie
        Serie theLastOfUs = new Serie();
        theLastOfUs.setNombre("The last of us");
        theLastOfUs.setFechaDeLanzamiento(2022);
        theLastOfUs.setTemporadas(2);
        theLastOfUs.setMinutosPorEpisodio(55);
        theLastOfUs.setEpisodiosPorTemporada(10);

        //mostrar datos de serie
        theLastOfUs.muestraFichaTecnica();
        System.out.println(theLastOfUs.getDuracionEnMinutos());


        //calculadora pelicula y serie
        System.out.println("----------------");
        CalculadoraDeTiempo calculadora  = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(theLastOfUs);
        System.out.println("Tiempo necesario para ver contenido: "+ calculadora.getTiempoTotal());

        //filtros de clasificacion
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra();
























































    }
}
