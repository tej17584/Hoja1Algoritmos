
package hoja1algoritmosprogramaradio;

/**
 *
 * @author SDiego
 */
public class Radio implements douglas {
    
    private boolean emisora;//emisora
    private boolean onoff;//una variable
    private float numeracion;
    private final int [] favoritos= new int[12];
    
    
    public Radio(){
        
    }
    /**
     * Este método es para encender o apagar el radio
     * @param e un booleano con true o false de la radio
     * @return un booleano para ver si la radio se prende o se apago
     */
    @Override
    public boolean onOff(boolean e){
        if (e == true){
            onoff = true;
        }else{
            onoff = false;
        }
        return onoff;
    }
    
    /**
     * Este método es para cambiar entre AM y FM
     * @param e un booleano para la estacion: AM= true ; FM=False
     * @return un booleano con el tipo de estacion actuall
     */
    @Override
    public boolean Switch(boolean e){
        if (e == true){
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
    @Override
    public float siguiente(float a){
        return numeracion;
    }
    /**
     * Este método es para la estacion anterior. 
     * @param a la estacion acual
     * @return la estacion anterior a colocar
     */
    @Override
    public float anterior(float a){
        return numeracion;
    }
    /**
     * Este método es para guardar una estacion como favorito
     * @param e el numero de estacion
     * @param b el numero de boton para el favorito
     */
    @Override
    public void guardar(float e,int b){
        
    }
    /**
     * En este método se selecciona un favorito entre los guardados y se retorn
     * @param b el boton que queremos seleccionar como favorito
     */
    @Override
    public float SeleccionarFav(int b){
        float estacionRetorno=0;
        
        return estacionRetorno;
    }
    
    
    
    
}
