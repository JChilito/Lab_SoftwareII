
package com.mycompany.is2laboratorio6;

public class PaqueteAmazingHawaii extends DecoradorBase{
    
    public PaqueteAmazingHawaii( IPaquete paquete) {
        super(paquete);
    }

    @Override
    public void visitar() {
        System.out.println("Lugares a visitar: "
                + "- Waipio Valley"
                + "- Playas Waikiki"
                + "- Playa Hanalei Bay"
                + "- Hanauma Bay");
    }
    
    @Override
    public void verInformacion(){
        System.out.println("===========Informacion del paquete basico + Amazin Hawaii===========");
        System.out.println("Precio por persona: $7931");
        System.out.println("Duracion: 8 Dias");
        System.out.println("- Tiquetes aéreos"
                + "- Hotel en habitacion estandar"
                + "- Alimentacion"
                + "- Vuelta a las isla"
                + "- Recepcion con lei hawaiano y camiseta de millonarios.");
        this.visitar();
    }
    
    @Override
    public double getPrecio(){
        return getPaquete().getPrecio();
    }
    
}
