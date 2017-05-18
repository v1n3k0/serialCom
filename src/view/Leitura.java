/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlarAplicativo;
import javax.swing.JOptionPane;


public class Leitura extends javax.swing.JDialog {
    
    private ControlarAplicativo controleAplicativo;
    
    /**
     * Creates new form Leitura
     */
    public Leitura(java.awt.Frame parent, boolean modal, ControlarAplicativo controleAplicativo) {
        super(parent, modal);
        initComponents();
        this.controleAplicativo = controleAplicativo;
        buscar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField18 = new javax.swing.JTextField();
        cbPorta = new javax.swing.JComboBox<>();
        btnAplicar = new javax.swing.JButton();
        txtCount = new javax.swing.JTextField();
        lb01 = new javax.swing.JLabel();
        lb02 = new javax.swing.JLabel();
        lb03 = new javax.swing.JLabel();
        lb04 = new javax.swing.JLabel();
        lb05 = new javax.swing.JLabel();
        lb06 = new javax.swing.JLabel();
        lb07 = new javax.swing.JLabel();
        lb08 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb09 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbcount1 = new javax.swing.JLabel();
        lbcount2 = new javax.swing.JLabel();
        lbcount3 = new javax.swing.JLabel();
        lbcount4 = new javax.swing.JLabel();
        lbcount5 = new javax.swing.JLabel();
        lbcount6 = new javax.swing.JLabel();
        lbcount7 = new javax.swing.JLabel();
        lbcount8 = new javax.swing.JLabel();
        lbcount9 = new javax.swing.JLabel();
        lbcount10 = new javax.swing.JLabel();
        lbcount11 = new javax.swing.JLabel();
        lbcount12 = new javax.swing.JLabel();
        lbcount13 = new javax.swing.JLabel();
        lbcount14 = new javax.swing.JLabel();
        lbcount15 = new javax.swing.JLabel();
        lbcount16 = new javax.swing.JLabel();
        lbSetCount = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Leitura");
        setResizable(false);

        cbPorta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        cbPorta.setNextFocusableComponent(txtCount);

        btnAplicar.setMnemonic('A');
        btnAplicar.setText("Aplicar");
        btnAplicar.setNextFocusableComponent(btnAtualizar);
        btnAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAplicarMousePressed(evt);
            }
        });
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        btnAplicar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAplicarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnAplicarKeyReleased(evt);
            }
        });

        txtCount.setNextFocusableComponent(btnAplicar);
        txtCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountKeyTyped(evt);
            }
        });

        lb01.setText("Count 01:");

        lb02.setText("Count 02:");

        lb03.setText("Count 03:");

        lb04.setText("Count 04:");

        lb05.setText("Count 05:");

        lb06.setText("Count 06:");

        lb07.setText("Count 07:");

        lb08.setText("Count 08:");

        lb14.setText("Count 14:");

        lb15.setText("Count 15:");

        lb16.setText("Count 16:");

        lb09.setText("Count 09:");

        lb10.setText("Count 10:");

        lb11.setText("Count 11:");

        lb12.setText("Count 12:");

        lb13.setText("Count 13:");

        jLabel1.setText("Selecionar Count:");

        lbSetCount.setText("Count :");

        btnAtualizar.setMnemonic('t');
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("");
        btnAtualizar.setNextFocusableComponent(cbPorta);
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAtualizarMousePressed(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        btnAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAtualizarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnAtualizarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbcount1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb04)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbcount4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb03)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbcount3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbcount2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb08)
                            .addComponent(lb07)
                            .addComponent(lb06)
                            .addComponent(lb05))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbcount5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb09)
                            .addComponent(lb12)
                            .addComponent(lb11)
                            .addComponent(lb10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbcount11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbcount9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbcount10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbcount12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb16)
                            .addComponent(lb15)
                            .addComponent(lb13)
                            .addComponent(lb14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbcount16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcount15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSetCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAplicar))
                    .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb06)
                            .addComponent(lbcount6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcount7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb08))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbcount8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb09)
                                    .addComponent(lbcount9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb11)
                                    .addComponent(lbcount11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbcount16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAplicar)
                            .addComponent(cbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lbSetCount)
                            .addComponent(btnAtualizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        alterar();
        //Menssagem de status do programa
        lbStatus.setText("Concluído");
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnAplicarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAplicarKeyPressed
        //Menssagem de status do programa
        lbStatus.setText("Aguarde...");
    }//GEN-LAST:event_btnAplicarKeyPressed

    private void txtCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountKeyTyped
         String caracteres="0987654321";//String com caractes validos
        //Verifica se caracter e valido
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCountKeyTyped

    private void btnAplicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplicarMousePressed
        //Menssagem de status do programa
        lbStatus.setText("Aguarde...");
    }//GEN-LAST:event_btnAplicarMousePressed

    private void btnAplicarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAplicarKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER){
            alterar();
            //Menssagem de status do programa
            lbStatus.setText("Concluído");
        }
    }//GEN-LAST:event_btnAplicarKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        buscar();
        //Menssagem de status do programa
        lbStatus.setText("Concluído");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAtualizarKeyPressed
        //Menssagem de status do programa
        lbStatus.setText("Aguarde...");
    }//GEN-LAST:event_btnAtualizarKeyPressed

    private void btnAtualizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAtualizarKeyReleased
        buscar();
        //Menssagem de status do programa
        lbStatus.setText("Concluído");
    }//GEN-LAST:event_btnAtualizarKeyReleased

    private void btnAtualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMousePressed
        //Menssagem de status do programa
        lbStatus.setText("Aguarde...");
    }//GEN-LAST:event_btnAtualizarMousePressed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JComboBox<String> cbPorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JLabel lb01;
    private javax.swing.JLabel lb02;
    private javax.swing.JLabel lb03;
    private javax.swing.JLabel lb04;
    private javax.swing.JLabel lb05;
    private javax.swing.JLabel lb06;
    private javax.swing.JLabel lb07;
    private javax.swing.JLabel lb08;
    private javax.swing.JLabel lb09;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lbSetCount;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbcount1;
    private javax.swing.JLabel lbcount10;
    private javax.swing.JLabel lbcount11;
    private javax.swing.JLabel lbcount12;
    private javax.swing.JLabel lbcount13;
    private javax.swing.JLabel lbcount14;
    private javax.swing.JLabel lbcount15;
    private javax.swing.JLabel lbcount16;
    private javax.swing.JLabel lbcount2;
    private javax.swing.JLabel lbcount3;
    private javax.swing.JLabel lbcount4;
    private javax.swing.JLabel lbcount5;
    private javax.swing.JLabel lbcount6;
    private javax.swing.JLabel lbcount7;
    private javax.swing.JLabel lbcount8;
    private javax.swing.JLabel lbcount9;
    private javax.swing.JTextField txtCount;
    // End of variables declaration//GEN-END:variables
    
    //**************************************************************************
    
    private void buscar(){
        //Busca as leituras da remota
        lbcount1.setText( controleAplicativo.comando("get count 1"));
        lbcount2.setText( controleAplicativo.comando("get count 2"));
        lbcount3.setText( controleAplicativo.comando("get count 3"));
        lbcount4.setText( controleAplicativo.comando("get count 4"));
        lbcount5.setText( controleAplicativo.comando("get count 5"));
        lbcount6.setText( controleAplicativo.comando("get count 6"));
        lbcount7.setText( controleAplicativo.comando("get count 7"));
        lbcount8.setText( controleAplicativo.comando("get count 8"));
        lbcount9.setText( controleAplicativo.comando("get count 9"));
        lbcount10.setText( controleAplicativo.comando("get count 10"));
        lbcount11.setText( controleAplicativo.comando("get count 11"));
        lbcount12.setText( controleAplicativo.comando("get count 12"));
        lbcount13.setText( controleAplicativo.comando("get count 13"));
        lbcount14.setText( controleAplicativo.comando("get count 14"));
        lbcount15.setText( controleAplicativo.comando("get count 15"));
        lbcount16.setText( controleAplicativo.comando("get count 16"));
    }
    
    //**************************************************************************
    
    private void buscar(int i){
        //Busca as leituras da remota da porta selecionada
        if(i == 1)
            lbcount1.setText( controleAplicativo.comando("get count 1"));
        if(i == 2)
            lbcount2.setText( controleAplicativo.comando("get count 2"));
        if(i == 3)
            lbcount3.setText( controleAplicativo.comando("get count 3"));
        if(i == 4)
            lbcount4.setText( controleAplicativo.comando("get count 4"));
        if(i == 5)
            lbcount5.setText( controleAplicativo.comando("get count 5"));
        if(i == 6)
            lbcount6.setText( controleAplicativo.comando("get count 6"));
        if(i == 7)
            lbcount7.setText( controleAplicativo.comando("get count 7"));
        if(i == 8)
            lbcount8.setText( controleAplicativo.comando("get count 8"));
        if(i == 9)
            lbcount9.setText( controleAplicativo.comando("get count 9"));
        if(i == 10)
            lbcount10.setText( controleAplicativo.comando("get count 10"));
        if(i == 11)
            lbcount11.setText( controleAplicativo.comando("get count 11"));
        if(i == 12)
            lbcount12.setText( controleAplicativo.comando("get count 12"));
        if(i == 13)
            lbcount13.setText( controleAplicativo.comando("get count 13"));
        if(i == 14)
            lbcount14.setText( controleAplicativo.comando("get count 14"));
        if(i == 15)
            lbcount15.setText( controleAplicativo.comando("get count 15"));
        if(i == 16)
            lbcount16.setText( controleAplicativo.comando("get count 16"));
    }
    
    //**************************************************************************
    
    private void alterar(){
        boolean verifica = true;
        
        //Verifica se textField não e nulo
        if(!txtCount.getText().trim().equals("") ){
            //alterar valores do count
            if(!controleAplicativo.comando("set count "+(String) cbPorta.getSelectedItem()+" "+ txtCount.getText().trim()).equals("ok\r") )
                verifica = false;

            //Verifica-se todos os comandos foram enviado com sucesso
            if(verifica){
                //verifica se as alterações foram salvas
                if(!controleAplicativo.comando("save").equals("ok\r") ){ //Caso ocorra um problema ao salvar as configurações
                    JOptionPane.showMessageDialog(null, "Ocorreu um problema em salvar as configurações! Tente novamente.",
                        "Alerta",JOptionPane.ERROR_MESSAGE);
                    controleAplicativo.fechar();
                }else{// Caso as configurações salvas com sucesso
                    buscar( Integer.parseInt((String) cbPorta.getSelectedItem()) );
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ocorreu um problema em alterar as configurações! Tente novamente.",
                        "Alerta",JOptionPane.ERROR_MESSAGE);
                controleAplicativo.fechar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha campo corretamente.", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //**************************************************************************
}
