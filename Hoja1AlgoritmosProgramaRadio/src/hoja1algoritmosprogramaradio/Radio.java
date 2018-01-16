
package hoja1algoritmosprogramaradio;

/**
 *
 * @author SDiego
 */
public class Radio implements douglas {
    
    private boolean emisora;
    private boolean onoff;
    private float numeracion;
    private final int [] favoritos= new int[12];
    
    
    public Radio(){
        
    }
    /**
     * 
     * @param e
     * @return 
     */
    @Override
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
    @Override
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
    @Override
    public float siguiente(float a){
        return numeracion;
    }
    /**
     * 
     * @param a
     * @return 
     */
    @Override
    public float anterior(float a){
        return numeracion;
    }
    /**
     * 
     * @param e
     * @param b 
     */
    @Override
    public void guardar(float e,int b){
        
    }
    /**
     * 
     * @param b 
     */
    @Override
    public void SeleccionarFav(int b){
    
    }
    
    
    
    
}
