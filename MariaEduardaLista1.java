/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mariaeduardalista1;

import java.util.Scanner;

public class MariaEduardaLista1 {

    public static void main(String[] args) {
        
      int Pri1,Seg2,Ter3,media,recup,mF;
        Scanner tex = new Scanner (System.in); 
        System.out.println("Digite a primeira nota:");
        Pri1 = tex.nextInt();
        
        System.out.println("Digite a segunda nota:");
        Seg2 = tex.nextInt();
        
        System.out.println("Digite a terceira nota:");
        Ter3 = tex.nextInt();
        
        media=(Pri1+Seg2+Ter3)/3;
        System.out.println("Digite sua media" + media );
        if(media>=7) {
            System.out.println("Parabéns, você esta aprovado!:");
    
        }
        else{
            System.out.println("Poxa, você esta de recuperaçãoo!:");
            System.out.println("Digite qual foi a nota da recuperação:");
            
            recup = tex.nextInt();
            mF = (media+recup)/2;
            
            System.out.println("Media da recuperaçãoo:" + mF);
            
           if(mF>=5){
               System.out.println("Parabéns, você esta aprovado!:");
               
           }
            
           else{
               System.out.println("Poxa, você esta de recuperação!:");
           }
        }
        
        
            
            }  
    }
