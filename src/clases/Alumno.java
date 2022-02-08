package clases;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String grupo;

    private HORARIO horario;
    private TALLAS talla;

    public enum TALLAS{

        /**
         *
         */
        EXTRAGRANDE("XL");
        private String talla;

        private TALLAS(String talla){
            this.talla=talla;
        }
    }
    public enum HORARIO
    {
        MAÑANAS("9-13",1), TARDES("15-19",2);


        private String horario;
        private int posicion;

        private HORARIO (String nombreClub, int puestoLiga){
            this.horario = nombreClub;
            this.posicion = puestoLiga;
        }

        public String getHorario() {
            return horario;
        }

        public int getPosicion() {
            return posicion;
        }

    }
    //constructor clase
    public Alumno(String nombre, String apellidos) throws Exception {
        if(nombre==null || apellidos==null)
            throw new Exception ("Argumentos no válidos");
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public Alumno(String nombre) throws Exception {
        if(nombre==null)
            throw new Exception ("Argumentos no válidos");
        this.nombre = nombre;
        this.apellidos = "POR DEFAULT";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TALLAS getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Mi nombre es "+this.nombre+" y mi apellido es "+this.apellidos;
    }




}