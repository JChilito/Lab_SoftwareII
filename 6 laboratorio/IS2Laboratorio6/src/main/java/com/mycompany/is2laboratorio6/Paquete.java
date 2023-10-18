package com.mycompany.is2laboratorio6;

public class Paquete implements IPaquete{

    private double precio;
    private int cantDias;
    private String info;

    public Paquete(double precio, int cantDias, String info) {
        this.precio = precio;
        this.cantDias = cantDias;
        this.info = info;
    }
    
    public Paquete(){
        
    }
    
    
    @Override
    public void verInformacion() {
        System.out.println("===========Informacion del paquete basico===========");
        System.out.println("Precio por persona: $7000");
        System.out.println("Duracion: 5 Dias");
        System.out.println("- Tiquetes aéreos"
                + "- Hotel en habitacion estandar"
                + "- Alimentacion"
                + "- Vuelta a las isla"
                + "- Recepcion con lei hawaiano y camiseta de millonarios.");
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
