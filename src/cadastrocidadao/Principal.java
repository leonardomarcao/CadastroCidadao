/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocidadao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class Principal {
    //atributos para Menu
    private static int op = 0xffffffff;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        //reservando espaço memória para novos objetos
        PessoaJuridica pessoa1 = null;
        PessoaFisica pessoa2 = null;
        while(op!=0){
            //instânciando obtejos para método Menu()
            Menu(pessoa1, pessoa2);
        }
    }
    
    //Método Menu
    private static void Menu(PessoaJuridica pessoa1, PessoaFisica pessoa2){
        
        //tratamento de exceções
        try{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n\n"
                + "1 - Cadastro de Pessoa Jurídica\n"
                + "2 - Cadastro de Pessoa Física\n"
                + "3 - Printar dados Pessoa Juridica\n"
                + "4 - Printar dados Pessoa Física\n"
                + "0 - Sair do sistema"));
        }catch (HeadlessException | NumberFormatException e){
            System.out.println("Entrada inválida!");
        }
        //switch case p/ Menu
        switch(op){
            //system exit
            case 0:
                System.exit(1);
            case 1:                
                /*
                    Criação de PessoaJuridica física e 
                    chamada dos  métodos p/ obtenção de 
                    dados Pessao e PessoaJurica
                */
                pessoa1 = new PessoaJuridica();
                pessoa1.obterDadosPessoa();
                pessoa1.obterDadosPessoaJuridica();
                break;
            case 2:                
                /*
                    Criação de PessoaFisica física e 
                    chamada dos  métodos p/ obtenção de 
                    dados Pessao e PessoaFisica
                */
                pessoa2 = new PessoaFisica();
                pessoa2.obterDadosPessoa();
                pessoa2.obterDadosPessoaFisica();
                break;
            case 3:
                //verificação de existência de dados
                if (!"".equals(pessoa1.nome)) {
                    //print dos dados da PessoaJuridica
                    System.out.println("Dados da Pessoa: "+pessoa1.getNomePessoa()
                            +"\n\nRG: "+pessoa1.getRGPessoa()
                            +"\nCPNJ: "+pessoa1.getCNPJPessoaJuridica());
                }else
                    System.out.println("Não existe registros de Pessoa Jurídica");
                break;
            case 4:
                //verificação de existência de dados
                if (!"".equals(pessoa2.nome)) {
                    //print dos dadoos da PessaoFísica
                    System.out.println("Dados da Pessoa: "+pessoa2.getNomePessoa()
                            +"\n\nRG: "+pessoa2.getRGPessoa()
                            +"\nCPNJ: "+pessoa2.getCPFPessoaFisica());
                }else
                    System.out.println("Não existe registros de Pessoa Física");                
                break;
            default:                
                System.out.println("Opção inválida!");
        }
    }
    
}
