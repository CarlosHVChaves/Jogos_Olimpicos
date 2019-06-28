/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Principal;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author CarlosHVChaves
 */
public class LerArquivoCSV {

    public void run() {

        String arquivoCSV = "src\\CSV\\Jogos Olímpicos.csv";
        BufferedReader br = null;
        String linha = null;
        String csvDivisor = ";";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));

            linha = br.readLine();
            linha = br.readLine();

            while((linha = br.readLine()) != null){
            String[] campos = linha.split(csvDivisor);

            String nome = campos[0];
            int ano = 0;
            int ouro = 0;
            int prata = 0;
            int bronze = 0;
            int totalMedalhas = 0;


            ArrayList<AnoOlimpico> anos = new ArrayList();

            //for (int count = 0; count < 152; count++) {

                int pegarNovosCampos = 0;
                PaisOlimpico paisOlimpico = new PaisOlimpico(nome, anos);

                for (ano = 1896; ano < 2017; ano += 4) {
                    ouro = Integer.parseInt(campos[1 + pegarNovosCampos]);
                    prata = Integer.parseInt(campos[2 + pegarNovosCampos]);
                    bronze = Integer.parseInt(campos[3 + pegarNovosCampos]);
                    totalMedalhas = Integer.parseInt(campos[4 + pegarNovosCampos]);
                    if (ano == 1916) {
                        ano = 1920;
                    }
                    if (ano == 1940) {
                        ano = 1948;
                    }
                    AnoOlimpico anoOlimpico = new AnoOlimpico(ano, ouro, prata, bronze, totalMedalhas);
                    anos.add(anoOlimpico);
                    pegarNovosCampos += 4;

                    //System.out.println(anoOlimpico.toString());
                }

                paisOlimpico.setAnosOlimpicos(anos);
                Principal.adicionarPaisOlimpico(paisOlimpico);
                //System.out.println(paisOlimpico.toString());
            }
            //adicionarPaisOlimpico(p);
        } catch (FileNotFoundException e) {
            System.out.println("FILÉ NOT FOUND");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
