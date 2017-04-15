/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author henry hace tarea
 */
public class Empleado {
    private String ci;
    private String nombreCompleto;
    private String direccion;
    private int telefono;
    
    public Empleado(String ci, String nombre, String dir, int telf){
        this.ci=ci;
        nombreCompleto=nombre;
        direccion=dir;
        telefono=telf;
    }
    protected void setCi(String ci){
        this.ci=ci;
    }
    protected void setNombre(String nom){
        nombreCompleto=nom;
    }
    protected void setDireccion(String dir){
        direccion=dir;
    }
    protected void setTelefono(int telf){
        telefono=telf;
    }
    protected String getNombreComp(){
        return nombreCompleto;
    }
    protected String getDireccion(){
        return direccion;
    }
    protected int getTelefono(){
        return telefono;
    }
    protected String getCi(){
        return ci;
    }
}
