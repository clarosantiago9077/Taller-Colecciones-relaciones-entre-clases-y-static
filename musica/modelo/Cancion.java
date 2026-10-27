package musica.modelo;

public class Cancion {

    
    private static int totalCanciones = 0;

    private String titulo;
    private String artista;
    private int duracion; 

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        totalCanciones++; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

   
    public static int getTotalCanciones() {
        return totalCanciones;
    }
}

