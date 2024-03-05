/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mariaeduardalista4;

import java.util.Scanner;

public class MariaEduardaLista4 {

    public static void main(String[] args) {
        int valr = 0, n;
        Scanner teclado = new Scanner(System.in);
        
                System.out.println("Digite um número.");
                n = teclado.nextInt();
     
                if (n == 0){
                    valr = 1;
                }else{
                    
                    while (n > 0){
                        n/= 10;
                        valr++;
                    }
                          
                            
                            }
                System.out.println("A quantidade de valores desse é: " + valr);
    }
}
