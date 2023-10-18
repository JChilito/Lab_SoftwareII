package com.mycompany.is2laboratorio6;

public class DecoradorBase implements IPaquete{
    //private double precioAdicional;
    private IPaquete paquete;
    private double prueba;

    public DecoradorBase(IPaquete paquete) {
        //this.precioAdicional = precioAdicional;
        this.paquete = paquete;
    }


    protected IPaquete getPaquete() {
        return paquete;
    }
    
    protected void setPaquete(IPaquete paquete){
        this.paquete = paquete;
    }
    
    @Override
    public void verInformacion() {
        System.out.println("Informacion base");
    }
    
    @Override 
    public double getPrecio(){
        return this.prueba;
    }
    
    public void visitar(){
        System.out.println("Visitar");
    }
}
