package clases;

import java.util.Scanner;

public class TestCatalogoAstronomico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();

    }

    public static catalogoAstronomico miCatalogo;
    public static Scanner teclado;

    public static void menu(){

        miCatalogo=new catalogoAstronomico();

        teclado=new Scanner(System.in);

        String opc;

        do{
            System.out.println("1.-Introducir Astros");
            System.out.println("2.-Visualizar Catalogo");
            System.out.println("3.-Visualizar Estrellas Visibles");
            System.out.println("4.-Muestra Astro mas Brillante");
            System.out.println("5.-Astro que mas brilla");
            System.out.println("Presione FIN para Salir");
            opc=teclado.nextLine();

            //opc=opc.toUpperCase();

            switch(opc){
                case "1":
                    introduce_datos();
                    break;
                case "2":
                    visualiza_catalogo();
                    break;
                case "3":
                    visualiza_estrellas();
                    break;
                case "4":
                    muestra_astro_brillante();
                    break;
                case "5":
                    muestra_mas_brillante();
                    break;
            }

        }while(!opc.equals("FIN"));
        //teclado.nextLine();
    }

    private static void introduce_datos() {

        try{
            System.out.println("Ingrese nombre de Astro");
            String nombre=teclado.next();
            System.out.println("Ingrese tipo de Astro");
            int tipo=teclado.nextInt();
            teclado.nextLine();//Limpiamos buffer de entrada
        /*double brillo=teclado.nextDouble();
        System.out.println("pasa el double");
        teclado.nextDouble();//Limpiamos buffer de entrada
        double distancia=teclado.nextDouble();
        teclado.nextDouble();//Limpiamos buffer de entrada
        */
            System.out.println("Ingrese brillo de Astro");
            String valor=teclado.nextLine();

            double brillo=Double.parseDouble(valor);
            System.out.println("Ingrese distancia de Astro");
            valor=teclado.nextLine();
            double distancia=Double.parseDouble(valor);

        /*
        Astro astro1 = new Astro(nombre,tipo,brillo,distancia);

        miCatalogo.añade(astro1);*/

            miCatalogo.añade(new Astro(nombre,tipo,brillo,distancia));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void visualiza_catalogo() {
        //System.out.println("Funcion 2 Visualiza Catalogo");
        miCatalogo.visualizaCatalogo();

    }

    private static void visualiza_estrellas() {

        Astro misEstrellas[]=new Astro[miCatalogo.getNumEstrellasSimpleVista()];

        misEstrellas= miCatalogo.filtraEstrellasSimpleVista();

        for(int pos=0;pos<misEstrellas.length;pos++){
            System.out.println(misEstrellas[pos].toString());
        }


    }

    private static void muestra_astro_brillante() {
        System.out.println("FUNCION muestra_astro_brillante");
        Astro obj;
        obj=miCatalogo.brillaMasSin();
        if(obj!=null){
            System.out.println(obj.toString());
        }else{
            System.out.println("El Catalogo esta Vacio");
        }
    }

    //mi catalogo buscas un astro con un nombre

    private static void muestra_mas_brillante() {

        System.out.println("FUNCION muestra_mas_brillante");

        Astro miAstro=new Astro();

        Astro obj=miCatalogo.primeroMasBrillanteQue(miAstro);

        if(obj!=null){
            System.out.println(obj.toString());
        }else{
            System.out.println("El Catalogo esta Vacio / No hay ninguno que brillante mas");

        }

    }

}