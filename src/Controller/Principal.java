/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AnoOlimpico;
import Model.LerArquivoCSV;
import Model.PaisOlimpico;
import View.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author carlo
 */
public class Principal {

    private static ArrayList<PaisOlimpico> paisesOlimpicos = new ArrayList<PaisOlimpico>();
    //private static ArrayList<AnoOlimpico> anosOlimpicos = new ArrayList<AnoOlimpico>();

    public static ArrayList<PaisOlimpico> getPaisesOlimpicos() {
        return paisesOlimpicos;
    }
    
    /*public static ArrayList<AnoOlimpico> getAnosOlimpicos() {
        return anosOlimpicos;
    }*/

    public static void adicionarPaisOlimpico(PaisOlimpico c) {
        paisesOlimpicos.add(c);
    }

    /*public static void listarAnoOlimpico() {
        for (AnoOlimpico a : anosOlimpicos) {
            if (a instanceof AnoOlimpico) {
                System.out.println(a.toString());
            }
        }
    }*/

    public static void listarPaisOlimpico() {
        for (PaisOlimpico p : paisesOlimpicos) {
            if (p instanceof PaisOlimpico) {
                System.out.println(p.toString());
            }
        }
    }

    public static void adicionarAnoOlimpico(PaisOlimpico p, ArrayList<AnoOlimpico> c) {
        p.setAnosOlimpicos(c);
    }
    

    public static void main(String[] args) {

        LerArquivoCSV csv = new LerArquivoCSV();
        csv.run();
        TelaPrincipal application = new TelaPrincipal();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setLocationRelativeTo(null);
        application.setVisible(true);

    }
}
