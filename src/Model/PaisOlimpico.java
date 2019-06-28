/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

/**
 *
 * @author CarlosHVChaves
 */
public class PaisOlimpico {

        /*int ano1896 = this.getAnosOlimpicos().get(0).getTotalMedalhas();
        int ano1900 = this.getAnosOlimpicos().get(1).getTotalMedalhas();
        int ano1904 = this.getAnosOlimpicos().get(2).getTotalMedalhas();
        int ano1908 = this.getAnosOlimpicos().get(3).getTotalMedalhas();
        int ano1912 = this.getAnosOlimpicos().get(4).getTotalMedalhas();
        int ano1920 = this.getAnosOlimpicos().get(5).getTotalMedalhas();
        int ano1924 = this.getAnosOlimpicos().get(6).getTotalMedalhas();
        int ano1928 = this.getAnosOlimpicos().get(7).getTotalMedalhas();
        int ano1932 = this.getAnosOlimpicos().get(8).getTotalMedalhas();
        int ano1936 = this.getAnosOlimpicos().get(9).getTotalMedalhas();
        int ano1948 = this.getAnosOlimpicos().get(10).getTotalMedalhas();
        int ano1952 = this.getAnosOlimpicos().get(11).getTotalMedalhas();
        int ano1956 = this.getAnosOlimpicos().get(12).getTotalMedalhas();
        int ano1960 = this.getAnosOlimpicos().get(13).getTotalMedalhas();
        int ano1964 = this.getAnosOlimpicos().get(14).getTotalMedalhas();
        int ano1968 = this.getAnosOlimpicos().get(15).getTotalMedalhas();
        int ano1972 = this.getAnosOlimpicos().get(16).getTotalMedalhas();
        int ano1976 = this.getAnosOlimpicos().get(17).getTotalMedalhas();
        int ano1980 = this.getAnosOlimpicos().get(18).getTotalMedalhas();
        int ano1984 = this.getAnosOlimpicos().get(19).getTotalMedalhas();
        int ano1988 = this.getAnosOlimpicos().get(20).getTotalMedalhas();
        int ano1992 = this.getAnosOlimpicos().get(21).getTotalMedalhas();
        int ano1996 = this.getAnosOlimpicos().get(22).getTotalMedalhas();
        int ano2000 = this.getAnosOlimpicos().get(23).getTotalMedalhas();
        int ano2004 = this.getAnosOlimpicos().get(24).getTotalMedalhas();
        int ano2008 = this.getAnosOlimpicos().get(25).getTotalMedalhas();
        int ano2012 = this.getAnosOlimpicos().get(26).getTotalMedalhas();
        int ano2016 = this.getAnosOlimpicos().get(27).getTotalMedalhas();
        int[] guardaValores = new int[]{
            ano1896, ano1900, ano1904, ano1908, ano1912,
            ano1920, ano1924, ano1928, ano1932, ano1936,
            ano1948, ano1952, ano1956, ano1960, ano1964,
            ano1968, ano1972, ano1976, ano1980, ano1984,
            ano1988, ano1992, ano1996, ano2000, ano2004,
            ano2008, ano2012, ano2016,};
        return guardaValores;*/

    private String nome;
    private ArrayList<AnoOlimpico> anosOlimpicos;
    private Variance variancia = new Variance();

    ;

    public PaisOlimpico(String nome, ArrayList<AnoOlimpico> anosOlimpicos) {
        this.setNome(nome);
        this.setAnosOlimpicos(anosOlimpicos);
    }
    public PaisOlimpico() {
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return ("Nome do País: " + this.getNome());
    }

    public ArrayList<AnoOlimpico> getAnosOlimpicos() {
        return anosOlimpicos;
    }

    public void setAnosOlimpicos(ArrayList<AnoOlimpico> anosOlimpicos) {
        this.anosOlimpicos = anosOlimpicos;
    }

    public int totalMedalhas() {
        int m = 0;
        for (AnoOlimpico a : this.getAnosOlimpicos()) {
            if (a instanceof AnoOlimpico) {
                m += a.getTotalMedalhas();
            }
        }
        return m;
    }
public int[] pegaDadosCadaAno() {
        int[] m = new int[28];
        for (int i = 0; i < 28; i++) {
            //observed[i] = anosOlimpicos.get(i+1) - anosOlimpicos.get(i);
            m[i] = (int) this.getAnosOlimpicos().get(i).getTotalMedalhas();
        }
        return m;
    }

    public double mediaMedalhas() {
        double m;
        m = (double) totalMedalhas() / (anosOlimpicos.size() - 1);
        return m;
    }

    public double modaMedalhas() {
        int[] cont = new int[anosOlimpicos.size()];
        int vezes = 0;
        int indice = 0;
        for (int i = 0; i < (anosOlimpicos.size()); i++) {
            for (int j = 0; j < (anosOlimpicos.size()); j++) {
                if (anosOlimpicos.get(i).getTotalMedalhas() == anosOlimpicos.get(j).getTotalMedalhas()) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        vezes = cont[0];
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }
        return anosOlimpicos.get(indice).getTotalMedalhas();
    }

    public double medianaMedalhas() {
        int mediana;
        ArrayList<AnoOlimpico> ordered = quickSort(anosOlimpicos);
        if (ordered.size() % 2 == 0) {
            //mediana = ((ordered.size() / 2) + ((ordered.size() + 1) / 2)) / 2;
            int tam = ordered.size() / 2;
            AnoOlimpico meioA = ordered.get(tam - 1);
            AnoOlimpico meioB = ordered.get(tam);
            return (double) (meioA.getTotalMedalhas() + meioB.getTotalMedalhas()) / 2;
        } else {
            mediana = Math.round(ordered.size() / 2);
            return (double) ordered.get(mediana).getTotalMedalhas();
        }
    }

    private ArrayList<AnoOlimpico> quickSort(ArrayList<AnoOlimpico> anosOlimpicos) {
        if (anosOlimpicos.size() <= 1) {
            return anosOlimpicos; // Already sorted  
        }
        ArrayList<AnoOlimpico> sorted = new ArrayList<AnoOlimpico>();
        ArrayList<AnoOlimpico> lesser = new ArrayList<AnoOlimpico>();
        ArrayList<AnoOlimpico> greater = new ArrayList<AnoOlimpico>();
        AnoOlimpico pivot = anosOlimpicos.get(anosOlimpicos.size() - 1); // Use last Vehicle as pivot
        for (int i = 0; i < anosOlimpicos.size() - 1; i++) {
            //int order = list.get(i).compareTo(pivot);
            if (anosOlimpicos.get(i).getTotalMedalhas() < (pivot.getTotalMedalhas())) {
                lesser.add(anosOlimpicos.get(i));
            } else {
                greater.add(anosOlimpicos.get(i));
            }
        }

        lesser = quickSort(lesser);
        greater = quickSort(greater);

        lesser.add(pivot);
        lesser.addAll(greater);
        sorted = lesser;

        return sorted;
    }

    public double desvioMedio() {
        double[] observed = new double[28];
        double total = 0;

        for (int i = 0; i < anosOlimpicos.size() - 1; i++) {
            //observed[i] = anosOlimpicos.get(i+1) - anosOlimpicos.get(i);
            observed[i] = Math.abs(anosOlimpicos.get(i).getTotalMedalhas() - mediaMedalhas());
        }
        for (int i = 0; i < anosOlimpicos.size() - 1; i++) {
            total += observed[i];
        }
        return total / anosOlimpicos.size();
    }

    public double variancia() {
        double mean = mediaMedalhas();
        double temp = 0;
        double[] data = new double[28];

        for (int i = 0; i < anosOlimpicos.size(); i++) {
            data[i] = anosOlimpicos.get(i).getTotalMedalhas();
        }

        for (double a : data) {
            temp += (a - mean) * (a - mean);
        }
        return temp / (data.length - 1);
    }

    public double desvioPadrão() {
        double[] observed = new double[28];

        for (int i = 0; i < anosOlimpicos.size(); i++) {
            observed[i] = anosOlimpicos.get(i).getTotalMedalhas();
        }

        return Math.sqrt(this.variancia.evaluate(observed));
    }

    public double coeficienteDeVariacao() {
        return (double) desvioPadrão() / mediaMedalhas();
    }

    /*public void listarAnos(){
        for (AnoOlimpico p : anosOlimpicos) {
            if (p instanceof AnoOlimpico) {
                System.out.println(p.toString());
            }
        }
    }*/
}
