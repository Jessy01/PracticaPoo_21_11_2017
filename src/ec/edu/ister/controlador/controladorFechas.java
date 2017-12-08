/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author LAB7-PC5-USER
 */
public class controladorFechas {
    
    public static synchronized int diferenciaFechas(Date fechaInicial, Date fechaFinal){
        DateFormat df= DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString=df.format(fechaInicial);
        long msInicial=fechaFinal.getTime();
        long msFinal=fechaFinal.getTime();
        long diferencia=msFinal-msInicial;
        double dias =Math.floor(diferencia/(1000*60*60*24));
        try {
            fechaInicial=df.parse(fechaInicioString);
        } catch (Exception e) {
        }
        
        String fechaFinalString=df.format(fechaFinal);
        
        try {
            fechaFinal=df.parse(fechaInicioString);
        } catch (Exception e) {
        }
        return (int) dias;
    }
    
}
