/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Mercadona {

    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static void rellenarDatos() {

        Empleado e;
        Producto p;
        ProductoPerecedero pp;
        ProductoFresco pf;
        Bebida b;
        BebidaAlcoholica ba;

        for (int i = 0; i < 10; i++) {
            e = new Empleado();
            e.setNombre("Pepe " + i);
            e.setEdad(18 + i);
            empleados.add(e);

            p = new Producto();
            p.setCodigo("1000" + i);
            p.setPeso(i+7);
            productos.add(p);

            pp = new ProductoPerecedero();
            pp.setCodigo("10001" + i);
            pp.setFecha_caducidad("03/05/2017");
            pp.setPeso(i+2);
            productos.add(pp);

            pf = new ProductoFresco();
            pf.setCodigo("10002" + i);
            pf.setFecha_caducidad("03/012/2016");
            pf.setTemperatura("5ºC");
            pf.setPeso(i+5);
            productos.add(pf);

            b = new Bebida();
            b.setCodigo("10003" + i);
            b.setFecha_caducidad("08/10/2017");
            b.setAzucar("1" + i + "%");
            b.setPeso(i+4);
            productos.add(b);

            ba = new BebidaAlcoholica();
            ba.setCodigo("10004" + i);
            ba.setFecha_caducidad("20/12/2019");
            ba.setAzucar("1" + i + "%");
            ba.setGraduacion(i + 1);
            ba.setPeso(i+1);
            productos.add(ba);
        }
    }

    public static void mostrarTodosLosProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getCodigo());
        }
    }
    
     public static void mostrarTodosLosProductos_versionSobrecarga() {
        for (Producto producto : productos) {
            producto.mostrar();
            System.out.println();
        }
    }

    public static void mostrarAzucarTodasLasBebidas() {
        Bebida azucar;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) {
                azucar = (Bebida) productos.get(i);
                System.out.println("Azucar contenida" + azucar.getAzucar());
            }
        }
    }

    public static void mostrarAzucarTodasLasBebidas_version2() {
        for (Producto p : productos) {
            if (p instanceof Bebida) {
                System.out.println(((Bebida) p).getAzucar());
            }
        }
    }

    public static void mostrarAzucarBebidasNoAlcoholicas() {
        for (Producto p : productos) {
            if (p instanceof Bebida) {
                if (!(p instanceof BebidaAlcoholica)) {
                    System.out.println(((Bebida) p).getAzucar());
                }
            }

        }
    }

    public static void mostrarTodasLasBebidas() {
        Bebida bebidaMostrada;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) {
                bebidaMostrada = (Bebida) productos.get(i);
                System.out.println("Producto " + bebidaMostrada.getCodigo());
            }
        }
    }

    public static void mediaGraduaciónBebidas() {
        double media = 0;
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof BebidaAlcoholica) {
                suma = suma + (((BebidaAlcoholica)productos.get(i)).getGraduacion());
                contador = contador + 1;

            }
            media = suma / contador;
        }
        System.out.println("La media es " + media);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosLosProductos();
        mostrarTodosLosProductos_versionSobrecarga();
        mostrarAzucarTodasLasBebidas();
        mostrarAzucarTodasLasBebidas_version2();
        mostrarTodasLasBebidas();
        mediaGraduaciónBebidas();
    }

}
