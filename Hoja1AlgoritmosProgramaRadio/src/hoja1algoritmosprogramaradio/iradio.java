
package hoja1algoritmosprogramaradio;

/**
 *
 * @author DIego Sevilla 17238
 * @author Alejandro Tejada 17584
 */
public interface iradio {
    /**
     * Este método es para encender o apagar la radio
     */
    void onOff();
    /**
     * Este método es para cambiar entre emisora true=FM y false=AM
     * @return un booleano con la estacion actual
     */
    float Switch();
    /**
     * Este método es para ir siguiente estacion 
     * @param a la estacion actual
     * @return la estacion siguiente dependiendo del tipo de emisora
     */
    float siguiente(float a);
    /**
     * Este método es para el anterior de estacion
     * @param a la estacion actual
     * @return la estacion siguiente
     */
    float anterior(float a);
    /**
     * Est método es para guardar emisoras favoritas
     * @param e la emisora a guardar
     * @param b el botón del favorito
     */
    void guardar(float e,int b);
    /**
     * Este método es para seleccionar un favorito
     * @param b el botón del favorito a escuchar
     * @return la estacion del favorito seleccionado
     */
    float seleccionarFav(int b);
    
    
}
