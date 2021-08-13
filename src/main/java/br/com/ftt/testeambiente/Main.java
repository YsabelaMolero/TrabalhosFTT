/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftt.testeambiente;

import java.util.Scanner;

/**
 *
 * @author Ysabela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exercício Tradução de Código");
        
        int valor1;
        int valor2;
        String operacao;
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o simbolo desejado para realizar a operação (+, -, *, /): ");
	operacao = entrada.nextLine();
	
	System.out.println("Digite o primeiro valor: ");
	valor1 = Integer.parseInt(entrada.nextLine());
	
	System.out.println("Digite o segundo valor: ");
	valor2 = Integer.parseInt(entrada.next());
	
	if(operacao.equals("+")) {
		System.out.println("Soma = " +(valor1 + valor2));
		contador++;			
	}
	
	if(operacao.equals("-")) {
		System.out.println("Subtração = " +(valor1 - valor2));
		contador++;		
	}
	
	if(operacao.equals("*")) {
		System.out.println("Multiplicação = " +(valor1 * valor2));
		contador++;			
	}
	
	if(operacao.equals("/")) {
            
		try{
                System.out.println("Divisão = " +(valor1 / valor2));}
                catch(ArithmeticException ex){
                    System.out.println("Divisão não pode ser realizada, verifique o valor do denominador.");
                }
            }
		contador++;			
	
        if(contador ==0){
		System.out.println("Operação inválida! Verifique o símbolo digitado.");
        }
        
    }    
}
