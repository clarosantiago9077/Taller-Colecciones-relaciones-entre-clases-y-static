package parqueadero.modelo;

public class Puesto {

    private int numero;
    private String placa; // null si el puesto está libre

    // Sin public: solo el paquete parqueadero.modelo puede crear puestos
    Puesto(int numero) {
        this.numero = numero;
        this.placa = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean estaLibre() {
        return placa == null;
    }

    public void ocupar(String placa) {
        this.placa = placa;
    }

    public void liberar() {
        this.placa = null;
    }
}

