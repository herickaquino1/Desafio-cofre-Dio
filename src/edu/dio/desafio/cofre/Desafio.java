package edu.dio.desafio.cofre;

import java.util.Scanner;

public class Desafio {
	  public static void main(String[] args) {
	    // Lê o tipo de cofre (primeira linha da entrada)
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Por favor informe o tipo de cofre:");
	    String tipoCofre = scanner.nextLine();
	    
	    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
	    if (tipoCofre.equalsIgnoreCase("digital")) {
	      System.out.println("Por favor insira sua senha:");
	      int senha = scanner.nextInt();
	      
	      CofreDigital cd = new CofreDigital(senha);
	      
	      System.out.println("Por favor confirme a senha:");
	      int confirmaSenha = scanner.nextInt();
	      
	        if(cd.validarSenha(confirmaSenha)){
	         cd.imprimirInformacoes();
	          System.out.println("Cofre aberto!");
	        }else{
	          cd.imprimirInformacoes();
	          System.out.println("Senha incorreta!");
	        }

	    }else{
	      CofreFisico cf = new CofreFisico();
	      cf.imprimirInformacoes();
	    }
}
	  }