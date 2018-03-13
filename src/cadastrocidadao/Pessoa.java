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
public class Pessoa {
    //atributos Pessoa 
    protected String nome, RG;
    
    //métodos para obter dados da Pessoa
    protected void obterDadosPessoa(){
        try{
            setNomePessoa(JOptionPane.showInputDialog(null, "Digite o nome da pessoa: "));
            setRGPessoa(JOptionPane.showInputDialog(null, "Digite o RG da pessoa"));
        }catch (HeadlessException e){
            System.out.println("Entrada nula!");
        }        
    }
    
    /*
        Método getNomePessoa
    */
    protected String getNomePessoa(){
        return nome;
    }
    /*
        Método setNomePessoa
    */    
    protected void setNomePessoa(String _nome){
        nome = _nome;
    }
    /*
        Método getRGPessoa
    */
    protected String getRGPessoa(){
        return RG;
    }
    /*
        Método setRGPessoa
    */
    protected void setRGPessoa(String _RG){
        RG = _RG;
    }
  
    
}
