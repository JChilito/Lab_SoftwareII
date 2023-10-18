
package com.mycompany.is2laboratorio6;

public class PaqueteParty extends DecoradorBase{
    
    public PaqueteParty(IPaquete paquete) {
        super( paquete);
    }

    @Override
    public void visitar() {
        System.out.println("Lugares a visitar: "
                + "- Discotecas"
                + "- Licoreras");
    }
    
    @Override
    public void verInformacion(){
        System.out.println("===========Informacion del paquete basico + Party===========");
        System.out.println("Precio por persona: $7000");
        System.out.println("Duracion: 5 Dias");
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
