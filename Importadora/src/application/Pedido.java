/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;

public class Pedido {
    int idProducto;
    int cantidadProducto;
    Date fechaPeticion;
    Date fechaPrevista;
    Estados estado;
    //Producto producto;
    Cliente cliente;

    private static class Cliente {

        public Cliente() {
        }
    }
}

