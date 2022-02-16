package clases;

public class catalogoAstronomico {

    private final int MAX_ASTROS = 119;
    private int numAstros;
    private Astro catalogo[];
    private int numEstrellasSimpleVista;

    public catalogoAstronomico() {
        catalogo=new Astro[MAX_ASTROS];
        numAstros=0;
        numEstrellasSimpleVista=0;
    }

    public int getNumAstros() {
        return numAstros;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }

    private int posicionDe(Astro a){

        for(int pos=0;pos<numAstros;pos++){
            Astro obj=catalogo[pos];
            if(obj.equals(a)){
                //Astro existe
                return pos;
            }
        }
        return -1;
    }

    private boolean esEstrellaSimpleVista(int i){
        //pregunto si el parámetro i esta en una posición valida del arreglo.
        //numero de Elementos que tiene
        if((i>=0) && (i<=numAstros)){
            Astro obj=catalogo[i];
            if(obj.getTipo()==0){
                return true;
            }
            else{
                return false;
            }
            /*switch(obj.getTipo()){
                case 0://ESTRELLA
                    return true;
                default:
                    return false;
            } */
        }
        return false;
    }

    //Astro astro1=new Astro();

    //CatalogoAstronomico miCatalogo=new CatalogoAstronomico();
    //miCatalogo.añade(astro1);


    public boolean añade (Astro a){
        int pos=posicionDe(a);
        if(pos>=0){
            //Astro ya existe
        }else{
            //Astro no Existe se procede a añadirlo al arreglo
            // Si el contador de elementos de mi arreglo
            // es menor o igual al limite de elementos de mi arreglo
            if(numAstros<=MAX_ASTROS){
                catalogo[numAstros]=a;
                //ESTRELLA
                if(a.getTipo()==0) numEstrellasSimpleVista++;
                //actualiza el numero de elementos que tiene mi arreglo
                numAstros++;
                return true;
            }
        }
        return false;
    }

    public Astro primeroMasBrillanteQue(Astro a){

        Astro obj=null;

        for(int pos=0;pos<numAstros;pos++){
            Astro obj2=catalogo[pos];
            //obj2.getnombre()==nombre
            if(obj2.magnitudAbsoluta()> obj.magnitudAbsoluta()){
                obj=obj2;
                break;
            }
        }
        return obj;
    }
    public Astro[] filtraEstrellasSimpleVista(){

        Astro estrellas[]=new Astro[numEstrellasSimpleVista];

        int contador=0;
        for(int pos=0;pos<numAstros;pos++){

            if(esEstrellaSimpleVista(pos)){
                estrellas[contador]=catalogo[pos];
                contador++;
            }
        }

        return estrellas;
    }
    public Astro brillaMas(){

        Astro obj=null;
        double mayor=0;
        for(int pos=0;pos<numAstros;pos++){
            //este objeto es todo los elementos de mi arreglo
            Astro obj2=catalogo[pos];
            if(pos==0){//primer elemento
                obj=obj2;//el objeto que cumple mi condicion
                mayor=obj2.magnitudAbsoluta();
            }else{
                if(mayor<obj2.magnitudAbsoluta()){
                    obj=obj2;//el objeto que cumple mi condicion
                    mayor=obj.magnitudAbsoluta();
                }
            }
        }
        return obj;
    }

    public Astro brillaMasSin(){

        Astro obj=null;
        double mayor=0;
        for(int pos=0;pos<numAstros;pos++){
            //este objeto es todo los elementos de mi arreglo
            Astro obj2=catalogo[pos];
            if(pos==0){//primer elemento
                obj=obj2;//el objeto que cumple mi condicion
                mayor=obj2.consultor();
            }else{
                if(mayor<obj2.consultor()){
                    obj=obj2;//el objeto que cumple mi condicion
                    mayor=obj.consultor();
                }
            }
        }
        return obj;
    }
    public void visualizaCatalogo(){
        /*
        boolean flag=false;
        for(int pos=0;pos<numAstros;pos++){
            flag=true;
            System.out.println(catalogo[pos].toString());
        }
        if(flag!=true)System.out.println("Mi Catalogo esta Vacio!!");
        */
        if(numAstros>0){
            for(int pos=0;pos<numAstros;pos++){
                System.out.println(catalogo[pos].toString());
            }
        }else{
            System.out.println("Mi Catalogo esta Vacio!!");
        }

    }


}

