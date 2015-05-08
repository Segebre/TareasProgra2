
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Arreglo {
    Scanner sc = new Scanner(System.in);
    private int[] enteros;
    
    public Arreglo(int longi)
    {
        enteros = new int[longi];
    }
    
    public void llenar()
    {
        llenar(0);
    }
    
    private void llenar(int cont)
    {
        if(cont < enteros.length)
        {
            enteros[cont] = sc.nextInt();
            llenar(cont + 1);
        }
    }
    
    public int suma()
    {
        return suma(0);
    }
    
    private int suma(int pos)
    {
        if(pos < enteros.length - 1)
            return suma(pos + 1) + enteros[pos];
        return enteros[pos];
    }
    
    public boolean buscar(int n)
    {
        return buscar(n, 0);
    }
    
    private boolean buscar(int n, int cont)
    {
        if(cont < enteros.length)
        {
            if(enteros[cont] != n)
                return buscar(n, cont + 1);
            return true;
        }
        return false;
    }
    
    public int maximo()
    {
        return maximo(0, enteros[0]);
    }
    
    private int maximo(int cont, int max)
    {
        if(cont < enteros.length)
            return maximo(cont + 1, enteros[cont] > max ? enteros[cont] : max);
        return max;
    }
    
    public void print()
    {
        print(0);
    }
    
    private void print(int cont)
    {
        if(cont < enteros.length)
        {
            System.out.println("Posicion " + cont + ": " +enteros[cont]);
            print(cont + 1);
        }
    }
    
    public String numeroAlReves(int pos)
    {
        if(pos < enteros.length && pos >= 0)
        {
            
            return numeroAlReves(Integer.toString(enteros[pos]), 0, Integer.toString(enteros[pos]).length());
        }
        return "Posicion no existe";
    }
    
    private String numeroAlReves(String n, int cont, int longi)
    {
        if(longi > cont)
            return numeroAlReves(n, cont + 1, longi) + n.charAt(cont);
        return " ";
    }
    
    public boolean palindromo()
    {
        return palindromo(0);
    }
    
    private boolean palindromo(int cont)
    {
        if(cont + 0.5 < enteros.length / 2)
        {
            if(enteros[cont] == enteros[enteros.length - (cont + 1)])
                return palindromo(cont + 1);
            return false;
        }
        return true;
    }
    
    //buble sort(ordenamiento por bubuja)
    public void sort()
    {
        sort(0, enteros[0], 1);
    }
    
    private void sort(int cont, int temp, int corridas)
    {
        if(corridas < enteros.length - 1)
        {
            if(cont < enteros.length - 1)
            {
                if(enteros[cont] > enteros[cont + 1])
                {
                    enteros[cont] = enteros[cont + 1];
                    enteros[cont + 1] = temp;
                    sort(cont + 1, enteros[cont + 1], corridas);
                }
                else
                    sort(cont + 1, enteros[cont + 1], corridas);
            }
            sort(0, enteros[0], corridas + 1);
        }
    }
}
