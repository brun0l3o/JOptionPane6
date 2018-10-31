/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane6;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class JOptionPane6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome,sexo;
        int idade, adultoEx;
        float peso;
        adultoEx=0;
            nome=JOptionPane.showInputDialog(null,"Digite seu nome: ");
                while(!"fim".equals(nome)){
                    peso=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o seu peso:"));
                    idade=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade:"));
                    sexo=JOptionPane.showInputDialog(null,"Digite 'm' para homem ou 'f' para mulher: ");
                        if(idade>=18 && "m".equals(sexo) && peso>=150){
                            adultoEx=adultoEx+1;
                        }
                        if(idade>=18 && "f".equals(sexo)&& peso>=100){
                            adultoEx=adultoEx+1;
                        }
                        JOptionPane.showMessageDialog(null,nome+" do sexo "+sexo+" tem "+peso+" kg, "+" possui "+idade+" anos");
                        nome=JOptionPane.showInputDialog(null,"Digite seu nome para continuar ou 'fim' para finalizar ");
                 }
                JOptionPane.showMessageDialog(null,"A quantidade de adultos na categoria Extra é: "+adultoEx);
            }
    }
    

