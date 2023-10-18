package com.mycompany.is2laboratorio6;

public class PaquetePearlHarbor extends DecoradorBase{

    public PaquetePearlHarbor(IPaquete paquete) {
        super(paquete);
    }
    
    

    @Override
    public void visitar() {
        System.out.println("Lugares a visitar: "
                + "- Museo Pearl Harbor"
                + "- Placio Iolani"
                + "- Museo Bishop"
                + "- USS Arizona Memorial");
    }
    
    @Override
    public void verInformacion(){
        System.out.println("===========Informacion del paquete basico + Pear Harbor===========");
        System.out.println("Precio por persona: $7653");
        System.out.println("Duracion: 7 Dias");
        System.out.println("- Tiquetes aéreos"
                + "- Hotel en habitacion estandar"
                + "- Alimentacion"
                + "- Vuelta a las isla"
                + "- Recepcion con lei hawaiano y camiseta de millonarios.");
        this.visitar();
    }
    
    public double getPrecio(){
        return ((Paquete)this.getPaquete()).getPrecio();
    }
    
    
    
    
}
