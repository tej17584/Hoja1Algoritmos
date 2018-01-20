package hoja1algoritmosprogramaradio;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import hoja1algoritmosprogramaradio.iradio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Morales
 * @author Guillermo Sandoval
 */

public class RadioGuillermo implements iradio{

    private float FavoritasAM[] = new float[12];
    private float FavoritasFM[] = new float[12];
    private float EstacionAMactual;
    private float EstacionFMactual;
    //True es AM y False es FM
    private boolean AM_FM;
    
    
    /**
     *Método constructor de Radio
     */
    public RadioGuillermo(){
        /*
            El constructor de radio, nos muestra la AM actual que tiene el valor
            mas bajo posible al igual que la FM actual
            Dado que una cambia de 10 en 10 y la otra de 0.2 en 0.2 era 
            mas sencillo que a cada boton le correspondiera su propio cambio de
            acuerdo a la frecuencia
        */
        this.EstacionAMactual = 530;
        this.EstacionFMactual = (float) 87.9;
        this.AM_FM = false;
        for (int x =0;x<12;x++){
            FavoritasAM[x]=(530+(10*x));
            FavoritasFM[x] = (float) (87.9 + (x*0.2));
        }
    };
    
    @Override
    public void onOff() {
       //Método vacio
    }

    @Override
    public float Switch() {
        //Si la radio esta en FM devuelve la última estacion AM y viceversa
        //Basicamente cambio de frecuencias que retorna la ultima estacion en
        //La que se encontraba la radio
        if (!this.AM_FM){
            this.AM_FM = !this.AM_FM;
            return this.EstacionAMactual;
        } else {
            this.AM_FM = !this.AM_FM;
            return this.EstacionFMactual;
        }
    }

    @Override
    public float siguiente(float estacion) {
        /*
            El metodo para ir "subiendo" respecto a las estaciones de radio
        */
        if (this.AM_FM){
            //Si la radio es AM
            if (this.EstacionAMactual >= 1610 || estacion >=1610){
                EstacionAMactual = 530;
                return 530;
            } else {
                EstacionAMactual = EstacionAMactual +10;
                return estacion+10;
            }
        } else {
          //Si la radio es FM
            if (this.EstacionFMactual >= 107.9 || estacion >=107.9){
                EstacionFMactual = (float) 87.9;
                return (float) 87.9;
            } else {
                EstacionFMactual = (float) (EstacionFMactual +0.2);
                return (float) (estacion + 0.2 );
            }
        }
    }

    @Override
    public float anterior(float estacion) {
        /*
            El metodo que nos regresa hacia atras en las estaciones de radio
        */
        if (this.AM_FM){
            //Si la radio es AM
            if (this.EstacionAMactual < 531 || estacion <531){
                EstacionAMactual = 1610;
                return 1610;
            } else {
                EstacionAMactual = EstacionAMactual -10;
                return estacion -10;
            }
        } else {
          //Si la radio es FM
            if (this.EstacionFMactual < 87.91 || estacion <87.91){
                EstacionFMactual = (float) 107.9;
                return (float) 107.9;
            } else {
                EstacionFMactual = (float) (EstacionFMactual -0.2);
                return (float) (estacion -0.2 );
            }
        }
    }

    @Override
    public void guardar(float estacion, int boton) {
        /*
            Este boton nos permite guardar la estacion de acuerdo al boton presionado
            suponiendo que se presiona el numero 1, en la lista el primer elemento
            lleva el 0, asi que se le resta uno para cuadrar las posiciones
            a sus respectivos valores.
        */
        if (this.AM_FM){
            this.FavoritasAM[boton-1] = estacion;
        } else {
            this.FavoritasFM[boton-1] = estacion;
        }
    }

    @Override
    public float seleccionarFav(int boton) {
        /*
            Seleccionar nos muestra la estacion correspondiente a cada valor
            guardado ya sea AM o FM se pueden guardar hasta 12 estacionesm de cada
            una de las frecuencias
        */
       if (this.AM_FM){
            return this.FavoritasAM[boton-1];
        } else {
            return this.FavoritasFM[boton-1];
        } 
    }
    
}
