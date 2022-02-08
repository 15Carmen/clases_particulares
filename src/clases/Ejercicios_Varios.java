package clases;

import clases.Alumno;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Ejercicios_Varios {

    /**
     * @param args the command line arguments
     */
    static int MAX_ALUMNOS=119;
    static int numAlumnos=0;
    static Alumno alumnos[] = new Alumno[MAX_ALUMNOS];

    public static void addAlumnos(Alumno miAlumno){
        alumnos[numAlumnos]=miAlumno;
        numAlumnos++;

    }
    public static void removeAlumnos(int pos){
        if(pos<0 ||pos>alumnos.length)return;
        alumnos[pos]=null;
        numAlumnos--;

    }

    public static void viewAlumnos(){
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i]!=null){
                Alumno al=alumnos[i];
                System.out.println(al.getNombre()+al.getApellidos());
                System.out.println(alumnos[i].getNombre()+alumnos[i].getApellidos());
            }
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int numeros[]={5,6,2,10,1};

        System.out.println(numeros.length);
        int i;
        for(i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        System.out.println(i);
        */
        //inicializar arreglos de Objetos


        try {
            Alumno luis=new Alumno("Luis","luzuriaga");
            System.out.println(luis.getTalla().EXTRAGRANDE);
            Alumno luis2=new Alumno("Luis2","luzuriaga2");
            Alumno luis3=new Alumno("Luis3","luzuriaga3");

            TestAstro test=new TestAstro();
            test.addAlumnos(luis);
            addAlumnos(luis2);
            addAlumnos(luis3);

            int pos;

            for(pos=0;pos<alumnos.length;pos++){
                try{
                    Alumno al=alumnos[pos];
                    System.out.println(al.toString());
                }catch(Exception e){

                }
            }

            for(Alumno mialumno:alumnos){
                System.out.println(mialumno.toString());
            }
            //System.out.println(luis.toString());
        } catch (Exception ex) {
            System.out.println("error "+ex.getMessage());
        }


        /*
        int userChoice;
        do{
            userChoice = menu();
            switch(userChoice){
                case 1:

                    break;

                default:

                    break;
            }
        }while(userChoice!=4);
*/



    }

    public static int Aleatorio(int min,int max){
        int num_ale;
        num_ale=(int)(Math.random()*(max-min+1)+min);
        return num_ale;
    }

    public static String menu() {

        String selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from these choices");
        System.out.println("-----------------------------");
        System.out.println("1 - Enter an original number");
        System.out.println("2 - Encrypt a number");
        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");
        boolean flag=false;
        do{
            selection = input.next();
            switch(selection.toLowerCase()){
                case "1":
                case "2":
                case "3":
                case "4":
                case "fin":
                    flag=true;
                    break;
                default:
                    flag=false;
                    break;
            }
        }while(flag==false);
        return selection;
    }

}

