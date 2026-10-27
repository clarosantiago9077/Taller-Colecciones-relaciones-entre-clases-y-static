package musica.app;

import musica.modelo.Cancion;
import musica.modelo.Playlist;


public class RetoForEach {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);

        Playlist viaje = new Playlist("Viaje");
        viaje.agregar(c1);
        viaje.agregar(c2);
        viaje.agregar(c3);

       
        System.out.println(viaje.eliminarArtistaForEach("Nevado"));
    }
}