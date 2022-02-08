package catalogoAstronómico;

public class Astro {
    private String nombre;
    private final String tipo;
    private static int numInstance=0;
    private double brillo;
    private double distancia;

    //enum para hacer los tipos de astros
    public static enum TIPOS{
        ESTRELLA("ESTRELLA",0),NEBULOSA("NEBULOSA",1),GALAXIA("GALAXIA",2);
        private String descripcion;
        private int posicion;

        private TIPOS(String descripcion, int posicion){
            this.descripcion = descripcion;
            this.posicion = posicion;
        }

        public String getDescripcion() {
            return descripcion;
        }
        public int getPosicion() {
            return posicion;
        }
    }


    //Constructor por defecto
    public Astro() {
        this.nombre = "SIRIUS";
        this.tipo = TIPOS.ESTRELLA.descripcion;
        this.brillo = -1.42;
        this.distancia = 8.7;
        numInstance++;
    }
    //Constructor
    public Astro(String nombre, TIPOS tipo, double brillo, double distancia) {
        this.nombre = nombre;
        this.tipo = tipo.descripcion;
        this.brillo = brillo;
        this.distancia = distancia;
        numInstance++;
    }

    //getter y setter

    public static int getNumInstance() {
        return numInstance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    //metodo consultor del atributo brillo
    public double consultor() {
        //public double getBrillo() {
        return brillo;
    }

    //metodo modificador del atributo brillo
    public void modificador(double brillo) {
        //public void setBrillo(double brillo) {
        this.brillo = brillo;
    }

   //metodo toString que sobrescribe el de Object
    @Override
    public String toString() {
        //String valor=String.format("%.2f",distancia);
        return "Nombre: "+ this.nombre + " tipo " + tipo + " (" + String.format ("%.2f",brillo) +
                "," + String.format ("%.2f",distancia) + ")";
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double magnitudAbsoluta(){
        double magnitud;
        double log;
        log=Math.log10(distancia);
        magnitud=brillo+5*log;
        return magnitud;
    }

    //metodo masBrillante
    public void masBrillante(){
       if ((int) magnitudAbsoluta()==1){

           System.out.println("El astro actual es más brillante que el astro dado");

       }else if ((int) magnitudAbsoluta()==0){

           System.out.println("Ambos astros tienen la misma magnitud absoluta");

       }else if ((int) magnitudAbsoluta()==-1){

           System.out.println("El astro dado es más brillante que el astro actual");

       }
    }

    public void visibleCon(){
        if (brillo<5){
            System.out.println("El astro se ve a simple vista");
        }else if (brillo>=5 && brillo<7){
            System.out.println("El astro se ve con prismáticos");
        }else if (brillo>=7 && brillo<=25){
            System.out.println("El astro es visible con telescopio");
        }else if (brillo>25){
            System.out.println("El astro se puede ver con grandes telescopios");
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (this !=obj) {
            return false;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        //se hace un CAST
        final Astro other = (Astro) obj;

        if((this.nombre.equals(other.nombre))&&
                (this.brillo==other.brillo)&&
                (this.distancia==other.distancia) &&
                (this.tipo==other.tipo)){
            return true;
        }else{
            return false;


        }


    }
/*
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
        if (Double.doubleToLongBits(this.brillo) != Double.doubleToLongBits(other.brillo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.distancia) != Double.doubleToLongBits(other.distancia)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

*/
}