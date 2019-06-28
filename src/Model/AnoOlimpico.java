/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author CarlosHVChaves
 */
public class AnoOlimpico {

    private int ano;
    private int ouro;
    private int prata;
    private int bronze;
    private int totalMedalhas;

    public AnoOlimpico(int ano, int ouro, int prata, int bronze, int totalMedalhas) {
        this.setAno(ano);
        this.setOuro(ouro);
        this.setPrata(prata);
        this.setBronze(bronze);
        this.setTotalMedalhas(totalMedalhas);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getPrata() {
        return prata;
    }

    public void setPrata(int prata) {
        this.prata = prata;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getTotalMedalhas() {
        return totalMedalhas;
    }

    public void setTotalMedalhas(int totalMedalhas) {
        this.totalMedalhas = totalMedalhas;
    }

    public String toString() {
        return ("Ano Olímpico: " + this.getAno() + "  Medalha de ouro: " + this.getOuro()
                + "  Medalha de prata: " + this.getPrata() + "  Medalha de bronze: " + this.getBronze() + "  Total de medalhas do ano: " + this.getTotalMedalhas());
    }
}
