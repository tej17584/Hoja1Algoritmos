
package hoja1algoritmosprogramaradio;

/**
 *
 * @author SDiego
 */
public class Radio implements douglas {
    
    private boolean emisora;
    private boolean onoff;
    private float numeracion;
    
    public Radio(){
        
    }
    /**
     * 
     * @param e
     * @return 
     */
    public boolean onOff(boolean e){
        if (onoff == true){
            onoff = false;
        }else{
            onoff = true;
        }
        return onoff;
    }
    
    /**
     * 
     * @param e
     * @return 
     */
    public boolean Switch(boolean e){
        if (emisora == true){
            emisora = false;
        }else{
            emisora = true;
        }
        return emisora;
    }
    /**
     * 
     * @param a
     * @return 
     */
    public float siguiente(float a){
        return numeracion;
    }
    /**
     * 
     * @param a
     * @return 
     */
    public float anterior(float a){
        return numeracion;
    }
    /**
     * 
     * @param e
     * @param b 
     */
    public void guardar(float e,int b){
        
    }
    /**
     * 
     * @param b 
     */
    public void SeleccionarFav(int b){
    
    }
    
    
    
    
}
