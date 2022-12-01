/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espol.tallerpatronesdiseno;

/**
 *
 * @author Dereck Santander
 */
public class TallerPatronesDiseno {

    public static void main(String[] args) {
        Compra_Facade cf= new Compra_Facade();
        cf.comprarEnLinea(new Producto_Especifico(),true);
    }
}
