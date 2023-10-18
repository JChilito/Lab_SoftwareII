
package com.mycompany.is2laboratorio6;

public class PaqueteNature extends DecoradorBase{
    public PaqueteNature(IPaquete paquete) {
        super( paquete);
    }

    @Override
    public void visitar() {
        System.out.println("Lugares a visitar: "
                + "- Kualoa Ranch"
                + "- Maui Ocean Center"
                + "- Akaka Falls State Park");
    }
    
    @Override
    public void verInformacion(){
        System.out.println("===========Informacion del paquete basico + Nature===========");
        System.out.println("Precio por persona: $7720");
        System.out.println("Duracion: 10 Dias");
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
