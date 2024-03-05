/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mariaeduardalista3;

import java.util.Scanner;

public class MariaEduardaLista3 {

    public static void main(String[] args) {
        int n, hrs1, mts1, seg1, hrs2, mts2, seg2, dif, soma, somat1, somat2;
        float horas, minutos, segundos;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro horário (hora): ");
        hrs1 = teclado.nextInt();
        
         System.out.println("minutos/s");
         mts1 = teclado.nextInt();
          
         System.out.println("segundos/s:");
         seg1 = teclado.nextInt();
         
         System.out.println("Digite o segundo horário (hora): ");
         hrs2 = teclado.nextInt();
         
         System.out.println("minutos/s");
         mts2 = teclado.nextInt();
         
         System.out.println("segundos/s");
         seg2 = teclado.nextInt();
         
         System.out.println("Escreva a operação:\n1- soma\n2- diferença");
         n = teclado.nextInt();
          
         somat1 = ((hrs1 * 3600) + (mts1 * 60) + seg1);
         somat2 = ((hrs2 * 3600) +(mts2 * 60) + seg2);

         if (n == 1){
             soma = (somat1 + somat2);
             horas = soma / 3600;
             minutos = (horas % 3600) / 60;
             segundos = (horas % 3600) % 60;
             
             System.out.printf("A soma das horas são: %.0f:%.0f:%.0f",horas,minutos,segundos);
             
         }else if (somat1 > somat2){
             dif = somat1 - somat2;
             
         }else{
             dif = (somat2 - somat1);
             horas = dif / 3600;
             minutos = (horas % 3600) / 60;
            segundos = (horas % 3600) % 60;
            
            System.out.printf("A diferença das horas são: %.0f:%.0f:%.0f", horas,minutos,segundos);
         }         
         
         
    }
}
