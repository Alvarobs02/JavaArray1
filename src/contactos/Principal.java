/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class Principal {
    public static void main(String[] args) {
        //Array de 50 contactios
        Contacto[] listadoContactos =new Contacto [50];
        //Lector de contacto
        Scanner lector = new Scanner(System.in);
        int opcion =0;
        int posicion=0;
        do{
        do {
            System.out.println("1 Crear contacto");
            System.out.println("2 Imprimir lista de contactos");
            System.out.println("3 Salir");
            System.out.println("Indique la ocion elegida ");
            opcion= lector.nextInt();
            lector.nextLine();
        } while (opcion <1 || opcion >3);
        switch(opcion){
            case 1: {
                if (posicion<50) {
                    //Recogida de datos por el usuario
                    System.out.println("Indique Nombre");
                    String nombre = lector.nextLine();
                    System.out.println("Indique Telefono");
                    String telefono = lector.nextLine();
                    System.out.println("Indique Correo");
                    String correo = lector.nextLine();
                    //Cero el objeto contacto
                    Contacto contacto = new Contacto (nombre,telefono,correo);
                    //Añade el contacto al Array y aumenta la posicion
                    //de escritorio del Array
                    listadoContactos[posicion]=contacto;
                    posicion++;
                    break;
                }else{
                    System.out.println("La lista esta llena si quieres paga mas , PERROOOOO");
                }
           
            }
             case 2 : {
            if(posicion>0){
                for (int i = 0; i < posicion; i++) {
                    System.out.println(listadoContactos[i].toString());
                    
                }
              }else{
                System.out.println("No hay contactos en la lista");
            }
            }
        
        }
        
        }while (opcion >0 && opcion <3);
        
    }
    
}    
    
    
    
    

