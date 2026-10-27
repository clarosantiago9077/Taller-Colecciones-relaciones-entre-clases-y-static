package musica.app;

import java.util.ArrayList;
import musica.modelo.Cancion;
import musica.modelo.Playlist;


public class PreubaRetos {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);

        Playlist fav = new Playlist("Favoritas");
        fav.agregar(c1);
        fav.agregar(c2);
        fav.agregar(c3);

        
        System.out.println("--- Reto 2 ---");
        System.out.println(fav.cancionMasLarga().getTitulo());
        Playlist vacia = new Playlist("Vacía");
        System.out.println(vacia.cancionMasLarga()); // null

        
        System.out.println("--- Reto 3 ---");
        ArrayList<Cancion> copia = fav.getCanciones();
        copia.clear();
        System.out.println("Tamaño de la copia: " + copia.size());
        fav.mostrar(); // sigue con sus 3 canciones

        
        System.out.println("--- Reto 5 ---");
        ArrayList<Cancion> lista = new ArrayList<>();
        Cancion x = new Cancion("A", "Uno", 100);
        lista.add(x);
        lista.add(x);
        lista.add(new Cancion("A", "Uno", 100));
        System.out.println(lista.size());
        System.out.println(lista.get(0) == lista.get(1));
        System.out.println(lista.get(0) == lista.get(2));
        lista.remove(x);
        System.out.println(lista.size());
        System.out.println(lista.contains(x));
    }
}
