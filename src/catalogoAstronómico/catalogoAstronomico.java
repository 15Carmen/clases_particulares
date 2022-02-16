package catalogoAstronómico;

public class catalogoAstronomico {
//ATRIBUTOS

    //límite de mi arreglo
    private int MAX_ASTROS=119;
    //indice de mi arreglo
    private int numAstros;

    private Astro catalogo [];
    //cuenta el numero de estrellas que tiene mi arreglo
    private int numEstrellasSimpleVista;

    //constructor por defecto

    public catalogoAstronomico(){
        catalogo=new Astro[MAX_ASTROS];
        //estos son contadores
        numAstros=0;
        numEstrellasSimpleVista=0;
    }

    //getter y setter
    public int getMAX_ASTROS() {
        return MAX_ASTROS;
    }

    public void setMAX_ASTROS(int MAX_ASTROS) {
        this.MAX_ASTROS = MAX_ASTROS;
    }

    public int getNumAstros() {
        return numAstros;
    }

    public void setNumAstros(int numAstros) {
        this.numAstros = numAstros;
    }

    public Astro[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Astro[] catalogo) {
        this.catalogo = catalogo;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }

    public void setNumEstrellasSimpleVista(int numEstrellasSimpleVista) {
        this.numEstrellasSimpleVista = numEstrellasSimpleVista;
    }

    //metodo posicionDe

    //private int posicionDe (Object a){
    private int posicionDe (Astro a){

        for (int pos=0;pos<numAstros;pos++){
            //capturas la instacina, el elemento de mi arreglo
            Astro obj=catalogo[pos];

            /*
            if (a instanceof Astro) {

                //hacer un casting
                Astro other=(Astro) a;

                if (obj.equals(a)){
                    //Astro existe
                    return pos;
                }
            }
            */
            if (obj.equals(a)){
                //Astro existe
                return pos;
            }
        }
        return -1;
    }

    //metodo esEstrellaSimpleVista


    private boolean esEStrellaSimpleVista (int i){
        //pregunto si el parametro i esta en una posicion valida del arreglo
        //numero de elementos que tiene
        if ((i>=0)&&(i<=numAstros)){

            Astro obj=catalogo[i];

            /*
            switch (obj.getTipo()){
                case 0:
                    return true;

                default:
                    return true;
            }
            */

        }
        return true;
    }


    //metodo añade

    public boolean añade (Astro a){

        //MAX_ASTROS=119 limite
        //numAstros

        if (numAstros<MAX_ASTROS){
            //añade
            //no existe el astro que le envio en mi arreglo,
            //por lo que procedo a guardarlo en el
            if (posicionDe(a)==-1){
                //con esto se guarda el elemento que le paso como parametro
                catalogo[numAstros]=a;
                //actualiza el indice de mi arreglo
                numAstros++;
                /*if (a.getTipo()==0){
                    //me cuenta el tipo de estrellas que tiene mi arreglo
                    numEstrellasSimpleVista++;
                }
                */
                return true;
            }
        }
        return false;
    }



    //metodo primeroMAsBrillanteQue
     public Astro primeroMasBrillanteQue(Astro a){

        Astro obj=null;

        for (int pos=0;pos<numAstros;pos++){
            Astro obj2=catalogo[pos];
            //obj2.getNombre()==nombre
            //if (obj2.magnitudAbsoluta())
        }
        return obj;
     }

     public Astro[] filtrarEstrellaSimpleVista(){

        Astro estrellas[]=new Astro[numEstrellasSimpleVista-1];

        int contador=0;
        for (int pos=0;pos<numAstros;pos++){
            if (esEStrellaSimpleVista(pos)){
                estrellas[contador]=catalogo[pos];
                contador++;
            }
        }
        return estrellas;
     }

}

