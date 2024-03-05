/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mariaeduardalista2;

import java.util.Scanner;
public class MariaEduardaLista2 {

    public static void main(String[] args) {
        float critA,critB;
        int livros;
                
     Scanner teclado = new Scanner 
             (System.in);
     System.out.println("Na oferta A, você irá pagar R$0,25 em cada livro + R$7,50 fixo. \nNa oferta B, você irá pagar R$0,50 em cada livro + R$2,50 fixo. \nMas traremos a oferta que mais lhe agrada e que ão aperte o seu orçamento! Digite a quantidade de livros que precisa comprar");
     
     livros = teclado.nextInt();
     critA = (float) ((livros * 0.25) + 7.50);
     critB = (float) ((livros * 0.50) + 2.50);
     
     System.out.println("Seu total foi: Na oferta A R$" + critA + "\nNa oferta B R$" + critB);
     if (critA == critB){
         
         System.out.println("No seu caso, as duas ofertas servem perfeitamente para você.");
         
     }else if (critA > critB){
         System.out.println("Nesse caso a oferta B serve perfeitamente para você.");
         
     }else{
         System.out.println("Nesse caso a oferta B serve perfeitamente para você.");
         
     }
       
    }
}
