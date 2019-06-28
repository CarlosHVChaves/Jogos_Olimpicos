/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Principal;
import Model.PaisOlimpico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author CarlosHVChaves
 */
public class GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas extends javax.swing.JFrame {

    /**
     * Creates new form GraphicOlimpico1
     */
    public GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas() {
        initComponents();
        //init();
        preencheComboBox();
    }

    private void preencheComboBox() {
        /*cbPais1.removeAllItems();
        cbPais2.removeAllItems();
        cbPais3.removeAllItems();
        cbPais4.removeAllItems();
        cbPais5.removeAllItems();*/
        ArrayList<PaisOlimpico> paisOlimpico = Principal.getPaisesOlimpicos();
        for (PaisOlimpico c : paisOlimpico) {
            cbPais1.addItem(c.getNome());
            cbPais2.addItem(c.getNome());
            cbPais3.addItem(c.getNome());
            cbPais4.addItem(c.getNome());
            cbPais5.addItem(c.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGraphic = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        cbPais1 = new javax.swing.JComboBox<>();
        cbPais2 = new javax.swing.JComboBox<>();
        cbPais3 = new javax.swing.JComboBox<>();
        cbPais4 = new javax.swing.JComboBox<>();
        cbPais5 = new javax.swing.JComboBox<>();
        btnGerarGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpGraphic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpGraphic.setLayout(new java.awt.BorderLayout());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cbPais1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um pais" }));

        cbPais2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um pais" }));

        cbPais3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um pais" }));

        cbPais4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um pais" }));

        cbPais5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um pais" }));

        btnGerarGrafico.setText("Gerar Gráfico");
        btnGerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGraphic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPais4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbPais5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbPais3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbPais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGerarGrafico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar)))
                        .addGap(0, 420, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpGraphic, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(cbPais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarGrafico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPais4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPais5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPais3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnGerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoActionPerformed
        int pos1 = cbPais1.getSelectedIndex();
        int pos2 = cbPais2.getSelectedIndex();
        int pos3 = cbPais3.getSelectedIndex();
        int pos4 = cbPais4.getSelectedIndex();
        int pos5 = cbPais5.getSelectedIndex();

        //Pegas os dados do 1º país
        if (pos1 == 0) {
            JOptionPane.showMessageDialog(null, "Todas as Opções devem ser selecionadas");
        }
        ArrayList<PaisOlimpico> paisOlimpico = Principal.getPaisesOlimpicos();
        PaisOlimpico Pais1 = paisOlimpico.get(pos1 - 1);
        String nome1 = Pais1.getNome();
        int totalMedalhas1 = Pais1.totalMedalhas();

        //Pegas os dados do 2º país
        if (pos2 == 0) {
            JOptionPane.showMessageDialog(null, "Todas as Opções devem ser selecionadas");
        }
        PaisOlimpico Pais2 = paisOlimpico.get(pos2 - 1);
        String nome2 = Pais2.getNome();
        int totalMedalhas2 = Pais2.totalMedalhas();

        //Pegas os dados do 3º país
        if (pos3 == 0) {
            JOptionPane.showMessageDialog(null, "Todas as Opções devem ser selecionadas");
        }
        PaisOlimpico Pais3 = paisOlimpico.get(pos3 - 1);
        String nome3 = Pais3.getNome();
        int totalMedalhas3 = Pais3.totalMedalhas();

        //Pegas os dados do 4º país
        if (pos4 == 0) {
            JOptionPane.showMessageDialog(null, "Todas as Opções devem ser selecionadas");
        }
        PaisOlimpico Pais4 = paisOlimpico.get(pos4 - 1);
        String nome4 = Pais4.getNome();
        int totalMedalhas4 = Pais4.totalMedalhas();

        //Pegas os dados do 5º país
        if (pos5 == 0) {
            JOptionPane.showMessageDialog(null, "Todas as Opções devem ser selecionadas");
        }
        PaisOlimpico Pais5 = paisOlimpico.get(pos5 - 1);
        String nome5 = Pais5.getNome();
        int totalMedalhas5 = Pais5.totalMedalhas();

        // cria o conjunto de dados
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(totalMedalhas1, "", nome1);
        ds.addValue(totalMedalhas2, "", nome2);
        ds.addValue(totalMedalhas3, "", nome3);
        ds.addValue(totalMedalhas4, "", nome4);
        ds.addValue(totalMedalhas5, "", nome5);

        // cria o gráfico
        JFreeChart grafico = ChartFactory.createBarChart("Desempenho de todas Olímpiadas", "Total", "Todas as medalhas até agora", ds, PlotOrientation.HORIZONTAL, false, false, false);
        CategoryPlot plot = grafico.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartPanel = new ChartPanel(grafico);
        jpGraphic.removeAll();
        jpGraphic.add(chartPanel, BorderLayout.CENTER);
        jpGraphic.validate();
    }//GEN-LAST:event_btnGerarGraficoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicOlimpicoDeDesempenhoEmTodasOlimpiadas().setVisible(true);
            }
        });
    }

    /*private void init() {
        // cria o conjunto de dados
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(40, "maximo", "dia 1");
        ds.addValue(38, "maximo", "dia 2");
        ds.addValue(37, "maximo", "dia 3");
        ds.addValue(31, "maximo", "dia 4");
        ds.addValue(35, "maximo", "dia 5");
        ds.addValue(42, "maximo", "dia 6");

        // cria o gráfico
        JFreeChart grafico = ChartFactory.createBarChart("Meu Grafico", "Dia", "Valor", ds, PlotOrientation.HORIZONTAL, false, false, false);
        CategoryPlot plot = grafico.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartPanel = new ChartPanel(grafico);
        jpGraphic.removeAll();
        jpGraphic.add(chartPanel, BorderLayout.CENTER);
        jpGraphic.validate();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbPais1;
    private javax.swing.JComboBox<String> cbPais2;
    private javax.swing.JComboBox<String> cbPais3;
    private javax.swing.JComboBox<String> cbPais4;
    private javax.swing.JComboBox<String> cbPais5;
    private javax.swing.JPanel jpGraphic;
    // End of variables declaration//GEN-END:variables
}
