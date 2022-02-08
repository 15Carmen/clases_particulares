package catalogoAstronómico;

public class Catalogo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        //TIPOS tipoAstro=TIPOS;
        Astro estrella=new Astro();
        Astro estrella2=new Astro();
        Astro cometa=new Astro("HALLEY",Astro.TIPOS.NEBULOSA,-1.50,6.10);
        Astro cometa2=new Astro("Desconocido",Astro.TIPOS.GALAXIA,-1.50,6.10);

        //obtener el numero de instancias de mi Objeto Astro
        System.out.println(Astro.getNumInstance());


        System.out.println(estrella.toString());

        System.out.println(cometa.toString());


        String message="";
        if(cometa.equals(estrella)){
            message=" Es igual al Astro "+estrella.getNombre();
        }else{
            message=" No es igual al Astro "+estrella.getNombre();
        }
        System.out.println("El astro "+cometa.getNombre()+message);
        message="";
        if(estrella.equals(estrella2)){
            message=" Es igual al Astro "+estrella.getNombre();
        }else{
            message=" No es igual al Astro "+estrella.getNombre();
        }
        System.out.println("El astro "+estrella.getNombre()+message);

        System.out.println("La magnitud Absoluta de mi astro "+estrella.getNombre()+" es: " +estrella.magnitudAbsoluta());


        //Astro.numInstance=10;

        Astro estrella3=new Astro();
        System.out.println(Astro.getNumInstance());


    }

}
