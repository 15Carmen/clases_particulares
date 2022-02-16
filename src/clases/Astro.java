package clases;

import java.util.Objects;

public class Astro {

    //<editor-fold desc="Atributos">
    private String nombre;

    private int tipo;

    private Double brillo;

    private Double distancia;

    //</editor-fold>
    //<editor-fold desc="Constructor General ">
    public Astro(String nombre, int tipo, Double brillo, Double distancia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.brillo = brillo;
        this.distancia = distancia;
    }

    //</editor-fold>
    //<editor-fold desc="Constructor por Defecto ">
    public Astro() {
        this.nombre = "Sirius";
        this.tipo = 0;
        this.brillo = -1.42;
        this.distancia = 8.7;
    }

    //</editor-fold>
    //<editor-fold desc="Metodos Getters y Setters">
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double consultor() {
        return brillo;
    }

    public void modificador(Double brillo) {
        this.brillo = brillo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    //</editor-fold>
    //<editor-fold desc="Metodos REdefinidos">
    @Override
    public String toString() {
        String _tipo = "";
        switch (tipo) {
            case 1:
                _tipo = "ESTRELLA";
                break;
            case 2:
                _tipo = "NEBULOSA";
                break;
            default:
                _tipo = "GALAXIA";
        }
        return "==============================================="+ System.lineSeparator() +
                "nombre: " + nombre + " tipo: " + _tipo + " (" + brillo + "," + distancia + ")"+System.lineSeparator()+
                "===============================================" + System.lineSeparator();
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Astro other = (Astro) obj;

        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.brillo, other.brillo)) {
            return false;
        }
        /*
        if(Objects.equals(this.distancia, other.distancia)){
            return false;
        }
        return true;*/
        return Objects.equals(this.distancia, other.distancia);

    }

    //</editor-fold>
    //<editor-fold desc="Metodos">
    public double magnitudAbsoluta() {

        double magnitud;
        magnitud = brillo + 5 * Math.log(distancia);
        return magnitud;

    }

    public int masBrillante(Astro obj) {

        if (this.magnitudAbsoluta() == obj.magnitudAbsoluta()) {
            return 0;
        }
        if  (this.magnitudAbsoluta()> obj.magnitudAbsoluta()){
            return 1;
        } else{
            return -1;
        }
    }

    public String visibleCon(){
        if (this.brillo<5) {
            return "A simple vista";
        }
        if (this.brillo>=5 && this.brillo<7) {
            return "Con Prosmaticos";
        }
        if (this.brillo>=7 && this.brillo<=25) {
            return "Con Telescopico";
        }
        return "Con Prismaticos";
    }
    //</editor-fold>
}