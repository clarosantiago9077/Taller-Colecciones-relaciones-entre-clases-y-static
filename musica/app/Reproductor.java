package musica.app;

import musica.modelo.Cancion;
import musica.modelo.Playlist;

public class Reproductor {

    public static void main(String[] args) {
        // ----- Etapa 2 -----
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);

        Playlist fav = new Playlist("Favoritas");
        fav.agregar(c1);
        fav.agregar(c2);
        fav.agregar(c3);
        System.out.println(fav.agregar(c1)); 
        fav.mostrar();
        System.out.println(fav.duracionTotal());

        // ----- Etapa 3 -----
        Playlist viaje = new Playlist("Viaje");
        viaje.agregar(c1);
        viaje.agregar(c2);
        System.out.println(fav.eliminarArtista("Nevado"));
        fav.mostrar();
        viaje.mostrar();
        System.out.println(fav.buscar("bajo el guadual").getArtista());
        System.out.println(fav.buscar("Lluvia en Manizales"));

        // ----- Etapa 4 -----
        Cancion c4 = new Cancion("Río Chinchiná", "Nevado", 230);
        System.out.println(viaje.agregar(c3)); // true: queda con 3
        System.out.println(viaje.agregar(c4)); // false: está llena
        System.out.println(Cancion.getTotalCanciones());
        System.out.println(Playlist.MAX_CANCIONES);
    }
}