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
public class PessoaFisica extends Pessoa{
    //atributos PessoaFisica
    String CPF;
    
    //métodos para obter dados da PessoaJuridica
    protected void obterDadosPessoaFisica(){
        try{
            setCPFPessoaFisica(JOptionPane.showInputDialog(null, "Digite o CPF da pessoa: "));            
        }catch (HeadlessException e){
            System.out.println("Entrada nula!");
        }        
    }
    
    /*
        Método getCPFPessoaFisica
    */
    protected String getCPFPessoaFisica(){
        return CPF;
    }
    /*
        Método setCPFPessoaFisica
    */
    protected void setCPFPessoaFisica(String _CPF){
        CPF = _CPF;
    }
    
}
