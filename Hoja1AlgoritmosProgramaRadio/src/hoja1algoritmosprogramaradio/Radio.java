
package hoja1algoritmosprogramaradio;

/**
 *
 * @author DIego Sevilla 17238
 * @author Alejandro Tejada 17584
 */
public class Radio implements iradio {
    
    private boolean emisora;//emisora en que se encuentra
    private boolean onoff;//una variable para encendido u apagado
    private float numAM,numFM;
    private final float [] favoritos= new float[12];
    
    
    public Radio(){
        emisora = true; //FM
        onoff = true;    //Encendido
        numAM=(float) 530.0;
        numFM=(float) 87.7;
    }
    /**
     * Este método es para encender o apagar el radio
     */
    
    @Override
    public void onOff(){
        if (onoff == false){
            onoff = true;
        }else{
            onoff = false;
        }
        
    }
    
    /**
     * Este método es para cambiar entre AM y FM
     * @return un booleano con el tipo de estacion actuall true=FM false=AM
     */
   
    @Override
    public float Switch(){
        if (emisora == false){
            emisora = true;
            return numFM;
        }else{
            emisora = false;
            return numAM;
        }
       
    }
    /**
     * Este método pasa a la siguiente estacion
     * @param a la estacion actual
     * @return la estacion siguiente
     */
   
    @Override
    public float siguiente(float a){
        if (emisora==false) {
            if (this.numAM >= 1610 || a >=1610){
                numAM = 530;
                return 530;
            } else {
                numAM = numAM +10;
                return a+10;
            }
        }
        else if(emisora==true){
          if (this.numFM >= 107.9 || a >=107.9){
                numFM = (float) 87.9;
                return (float) 87.9;
            } else {
                numFM = (float) (numFM +0.2);
                return (float) (a + 0.2 );
            }
        }
        else{
            float b=0;
            return b;
        }
    }
    /**
     * Este método es para la estacion anterior. 
     * @param a la estacion acual
     * @return la estacion anterior a colocar
     */
  
    public float anterior(float a){
         if (emisora==false) {
            
            
                numAM = numAM -10;
                return a -10;
            }
        
        else if(emisora==true){
             
                numFM = (float) (numFM -0.2);
                return (float) (a -0.2 );
            
        }
        else{
            float b=0;
            return b;
        }
        
    }
    /**
     * Este método es para guardar una estacion como favorito
     * @param e el numero de estacion
     * @param b el numero de boton para el favorito
     */
   
    @Override
    public void guardar(float e,int b){
        favoritos[b-1] = e;
    }
    /**
     * En este método se selecciona un favorito entre los guardados y se retorn
     * @param b el boton que queremos seleccionar como favorito
     * @return un float con la estacion del favorito seleccionada
     */
    
    @Override
    public float seleccionarFav(int b){
        float estacionRetorno=0;
        int it;
        for(int i=0;i<favoritos.length;i++){
            estacionRetorno = favoritos[i];
            if(i==b-1){
                return estacionRetorno;
            }
        }
        return estacionRetorno;
    }
   
}
