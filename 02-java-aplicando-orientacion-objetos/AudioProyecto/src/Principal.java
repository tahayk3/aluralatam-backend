import com.tahayk3.audioproyecto.modelos.Cancion;
import com.tahayk3.audioproyecto.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Runaway");
        miCancion.setCantante("Aurora");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Uriel");
        miPodcast.setTitulo("Relatos de la noche");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproducir();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDuracionReproducciones());
        System.out.println("Total de me gusta: "+ miCancion.getMeGusta());

    }
}
