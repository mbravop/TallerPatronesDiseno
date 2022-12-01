/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatronesdiseno;

/**
 *
 * @author Dereck Santander
 */
public class Producto_Especifico implements Producto{
    private String nombre= "Producto Especifico";
    private int stock=10;
    
    public boolean tieneStock(){
        boolean retorno=false;
        if(stock>0){
        retorno=true;
        }
        return retorno;
        
    }
    
    public String getNombre(){
        return nombre;
    }
}
