package parqueadero.modelo;

import java.util.ArrayList;

public class Parqueadero {

    
    private static int ingresosTotales = 0;

    private String nombre;
    private ArrayList<Puesto> puestos;

    public Parqueadero(String nombre, int cantidad) {
        this.nombre = nombre;
        this.puestos = new ArrayList<>();
        
        for (int i = 1; i <= cantidad; i++) {
            puestos.add(new Puesto(i));
        }
    }

   
    private Puesto buscarPorPlaca(String placa) {
        for (Puesto p : puestos) {
            if (!p.estaLibre() && p.getPlaca().equals(placa)) {
                return p;
            }
        }
        return null;
    }

    
    private Puesto buscarLibre() {
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                return p;
            }
        }
        return null;
    }

    public void ingresar(String placa) {
        if (buscarPorPlaca(placa) != null) {
            System.out.println(placa + " ya está adentro");
            return;
        }
        Puesto libre = buscarLibre();
        if (libre == null) {
            System.out.println(placa + ": parqueadero lleno");
            return;
        }
        libre.ocupar(placa);
        ingresosTotales++;
        System.out.println(placa + " en puesto " + libre.getNumero());
    }

    public boolean salir(String placa) {
        Puesto p = buscarPorPlaca(placa);
        if (p == null) {
            return false;
        }
        p.liberar();
        return true;
    }

    public int puestosLibres() {
        int libres = 0;
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                libres++;
            }
        }
        return libres;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getIngresosTotales() {
        return ingresosTotales;
    }
}

