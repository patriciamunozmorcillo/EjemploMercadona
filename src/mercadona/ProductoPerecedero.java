/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author usuario
 */
public class ProductoPerecedero extends Producto {
    private String fecha_caducidad;
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.fecha_caducidad); 
    }
    

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
    
    
}
