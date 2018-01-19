
package hoja1algoritmosprogramaradio;

/**
 *
 * @author DIego Sevilla 17238
 * @author Alejandro Tejada 17584
 */
public class Radio implements douglas {
    
    private boolean emisora;//emisora en que se encuentra
    private boolean onoff;//una variable para encendido u apagado
    private float num;
    private final float [] favoritos= new float[12];
    
    
    public Radio(){
        emisora = true; //AM
        onoff = true;    //Encendido
    }
    /**
     * Este método es para encender o apagar el radio
     * @return un booleano para ver si la radio se prende o se apago
     */
    
    public boolean onOff(){
        if (onoff == false){
            onoff = true;
        }else{
            onoff = false;
        }
        return onoff;
    }
    
    /**
     * Este método es para cambiar entre AM y FM
     * @return un booleano con el tipo de estacion actuall true=FM false=AM
     */
   
    public boolean Switch(){
        if (emisora == false){
            emisora = true;
        }else{
            emisora = false;
        }
        return emisora;
    }
    /**
     * Este método pasa a la siguiente estacion
     * @param a la estacion actual
     * @return la estacion siguiente
     */
   
    public float siguiente(float a){
        if (emisora==false) {
            this.num=(a+10);
        }
        else if(emisora==true){
            this.num=(float) (a+0.2);
        }
        return num;
    }
    /**
     * Este método es para la estacion anterior. 
     * @param a la estacion acual
     * @return la estacion anterior a colocar
     */
  
    public float anterior(float a){
         if (emisora==false) {
            this.num=(a-10);
        }
        else if(emisora==true){
            this.num=(float) (a-0.2);
        }
        return num;
    }
    /**
     * Este método es para guardar una estacion como favorito
     * @param e el numero de estacion
     * @param b el numero de boton para el favorito
     */
   
    public void guardar(float e,int b){
        favoritos[b-1] = e;
    }
    /**
     * En este método se selecciona un favorito entre los guardados y se retorn
     * @param b el boton que queremos seleccionar como favorito
     * @return un float con la estacion del favorito seleccionada
     */
    
    public float SeleccionarFav(int b){
        float estacionRetorno=0;
        int it;
        for(int i=0;i<favoritos.length;i++){
            estacionRetorno = favoritos[i];
            if(i==b){
                return estacionRetorno;
            }
        }
        return estacionRetorno;
    }
   
}
