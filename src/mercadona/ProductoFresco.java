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
public class ProductoFresco extends ProductoPerecedero {

    private String temperatura;

    public void mostrar() {
        super.mostrar();
        System.out.println(this.temperatura);
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

}
