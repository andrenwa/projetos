/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author AndreNwa
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int saldo;
        int valordepositado;
        int valorfinal;
        int escolha;
        int saque;

        System.out.println("Digite o valor inicial R$ ");
        saldo = teclado.nextInt();

        
        
        
        
        do {
            System.out.println("");    
        System.out.println("===============================================");
        System.out.println("Digite a opçao escolhida:");
        System.out.println("1- VER SALDO.");
        System.out.println("2- EFETUAR DEPOSITO.");
        System.out.println("3- EFETUAR SAQUE.");
        System.out.println("0- PARA SAIR.");
        System.out.println("==============================================="); 
        escolha=teclado.nextInt();
        System.out.println("===============================================");    
        switch (escolha) {

                             
           case 1:
                System.out.println("SEU SALDO ATUAL E : " +saldo);
             break;
            case 2:
                System.out.print("DIGITE O VALOR DO DEPOSITO R$ ");
                valordepositado=teclado.nextInt();
                valorfinal=saldo+valordepositado;
                saldo=valorfinal;
                System.out.println("DEPOSITO EFETUADO COM SUCESSO");
               break;
            case 3:
                System.out.print("DIGITE O VALOR DO SAQUE R$");
                 saque=teclado.nextInt();               
                if(saque>saldo){ 
                    System.out.println("SALDO INSUFICIENTE");
                }else{
                    System.out.println("SAQUE EFETUADO COM SUCESSO.");
                    valorfinal = saldo-saque;
                    saldo=valorfinal;
                }
                
                break;
            case 0:
                System.out.println("SAINDO DO SISTEMA !!!");
                break;
             default:
                 System.out.println("OPÇAO INVALIDA, DIGITE NOVAMENTE:");
                 break;
                             
        }
        
       
    }while(escolha!=0);

}
}
