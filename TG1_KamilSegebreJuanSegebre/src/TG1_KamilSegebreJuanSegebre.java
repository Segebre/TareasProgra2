
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TG1_KamilSegebreJuanSegebre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longi;
        do
        {
            System.out.println("Longitud de arreglo: ");
            longi = sc.nextInt();
        }
        while(longi <= 0);
        Arreglo a = new Arreglo(longi);
        boolean check = false;
        int opc;
        System.out.println("Menu\n--------------------\n1. Llenar\n2. Suma\n3. Buscar\n4. Maximo\n5. Print\n6. Numero al Reves\n7. Palindromo\n8. Sort\n0. Salir!");

        do
        {
            System.out.println("Opcion: ");
            opc = sc.nextInt();
            switch(opc)
            {
                case 1: a.llenar();
                        check = true;
                    break;
                case 2: if(check){System.out.println("resultado: " + a.suma());}
                    break;
                case 3: if(check){System.out.println(a.buscar(sc.nextInt())?"Si esta :D":"No esta D:");}
                    break;
                case 4: if(check){System.out.println("resultado: " + a.maximo());}
                    break;
                case 5: if(check){a.print();}
                    break;
                case 6: if(check){System.out.println("resultado: " + a.numeroAlReves(sc.nextInt()));}
                    break;
                case 7: if(check){System.out.println(a.palindromo()?"Si es palindromo :D":"No es palindromo D:");}
                    break;
                case 8: if(check){a.sort();}
                    break;
                case 0: System.exit(1);
                default: System.out.println("Elija una opcion correcta!");
            }
        }
        while(opc != 0);
    }
    
}
