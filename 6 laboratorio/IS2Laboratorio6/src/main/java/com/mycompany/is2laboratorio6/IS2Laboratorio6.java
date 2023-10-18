package com.mycompany.is2laboratorio6;

import java.util.Scanner;

public class IS2Laboratorio6 {
    static Scanner  leer = new Scanner(System.in);
    public static void main(String[] args) {
        procesoPrincipal();
    }
    
    public static void procesoPrincipal(){
        
        int opcion;
        do{
            menu();
            System.out.print("Digite una opcion: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    menuPaquetes();
                    System.out.print("Seleccione un paquete: ");
                    opcion = leer.nextInt();
                    procesoCotizacin(opcion);
                    break;
                case 2:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opcion equivocada");
                    break;
            }
        }while(opcion != 2);
    }
    
    public static void procesoCotizacin(int paquete){
        int op,cantPersonas;
        double precio;
        IPaquete pack;
        switch(paquete){
                case 1:
                    Paquete paqueteB = new Paquete(7000,5,"info");
                    paqueteB.verInformacion();
                    System.out.print("Volver Si(1), No(2) ");
                    op = leer.nextInt();
                    if(op == 1){
                        break;
                    }
                    System.out.print("Digite la cantidad de personas: ");
                    cantPersonas = leer.nextInt();
                    precio = cantPersonas * paqueteB.getPrecio();
                    System.out.println("Precio Total: $"+precio);
                    break;
                case 2:
                    IPaquete paquetePH = new PaquetePearlHarbor(new Paquete(7653,7,"info"));
                    paquetePH.verInformacion();
                    System.out.print("Volver Si(1), No(2) ");
                    op = leer.nextInt();
                    if(op == 1){
                        break;
                    }
                    System.out.print("Digite la cantidad de personas: ");
                    cantPersonas = leer.nextInt();
                    precio = cantPersonas * paquetePH.getPrecio();
                    System.out.println("=========Total a Pagar=========");
                    System.out.println("Precio: $"+precio);
                    break;
                case 3:
                    IPaquete paquetePN = new PaqueteNature(new Paquete(7720,10,"info"));
                    paquetePN.verInformacion();
                    System.out.print("Volver Si(1), No(2) ");
                    op = leer.nextInt();
                    if(op == 1){
                        break;
                    }
                    System.out.print("Digite la cantidad de personas: ");
                    cantPersonas = leer.nextInt();
                    precio = cantPersonas * paquetePN.getPrecio();
                    System.out.println("=========Total a Pagar=========");
                    System.out.println("Precio: $"+precio);
                    break;
                case 4:
                    IPaquete paqueteAH = new PaqueteAmazingHawaii(new Paquete(7931,8,"info"));
                    paqueteAH.verInformacion();
                    
                    System.out.println("PRECIO DE PRUEBA : "+ paqueteAH.getPrecio());
                    System.out.print("Volver Si(1), No(2) ");
                    op = leer.nextInt();
                    if(op == 1){
                        break;
                    }
                    System.out.print("Digite la cantidad de personas: ");
                    cantPersonas = leer.nextInt();
                    precio = cantPersonas * paqueteAH.getPrecio();
                    System.out.println("=========Total a Pagar=========");
                    System.out.println("Precio: $"+precio);
                    break;
                case 5:
                    IPaquete paqueteP = new PaqueteParty(new Paquete(7000,5,"info"));
                    System.out.print("Volver Si(1), No(2) ");
                    op = leer.nextInt();
                    if(op == 1){
                        break;
                    }
                    System.out.print("Digite la cantidad de personas: ");
                    cantPersonas = leer.nextInt();
                    precio = cantPersonas * paqueteP.getPrecio();
                    System.out.println("=========Total a Pagar=========");
                    System.out.println("Precio: $"+precio);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
    }
    
    public static void menu(){
        System.out.println("====================Menu====================");
        System.out.println("1) Cotizar Paquetes.");
        System.out.println("2) Salir.");
    }
    
    public static void menuPaquetes(){
        System.out.println("====================Paquetes====================");
        System.out.println("1) Paquete basico.");
        System.out.println("2) Paquete Pearl Harbor.");
        System.out.println("3) Paquete Nature.");
        System.out.println("4) Paquete Amazing Hawaii.");
        System.out.println("5) Paquete Party.");
        
    }
}
