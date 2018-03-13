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
public class PessoaJuridica extends Pessoa{
    //atributos PessoaJuridica
    protected String CNPJ;
    
    //métodos para obter dados da PessoaJuridica
    protected void obterDadosPessoaJuridica(){
        try{
            setCNPJPessoaJuridica(JOptionPane.showInputDialog(null, "Digite o CNPJ da pessoa: "));            
        }catch (HeadlessException e){
            System.out.println("Entrada nula!");
        }        
    }
            
    
    /*
        Método getCNPJPessoaJuridica
    */
    protected String getCNPJPessoaJuridica(){
        return CNPJ;
    }
    /*
        Método setCNPJPessoaJuridica
    */
    protected void setCNPJPessoaJuridica(String _CNPJ){
        CNPJ = _CNPJ;
    }
    
}
