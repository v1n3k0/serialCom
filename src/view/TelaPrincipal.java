package view;

import control.ControlarAplicativo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.SerialCom;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private ControlarAplicativo controleAplicativo = new ControlarAplicativo();

    public TelaPrincipal() {
        initComponents();
        listaSerialCom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPorta = new javax.swing.JLabel();
        cbPortas = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JToggleButton();
        lbSlaveadd = new javax.swing.JLabel();
        lbInitialregister = new javax.swing.JLabel();
        lbInitialinput = new javax.swing.JLabel();
        lbMaxpulses = new javax.swing.JLabel();
        lbRegsize = new javax.swing.JLabel();
        lbBaudrate = new javax.swing.JLabel();
        lbStopbits = new javax.swing.JLabel();
        lbParity = new javax.swing.JLabel();
        lbFormat = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnPadrao = new javax.swing.JButton();
        txtSlaveadd = new javax.swing.JTextField();
        txtInitialRegister = new javax.swing.JTextField();
        txtInitialInput = new javax.swing.JTextField();
        txtMaxpulses = new javax.swing.JTextField();
        txtRegSize = new javax.swing.JTextField();
        txtBaudrate = new javax.swing.JTextField();
        txtParity = new javax.swing.JTextField();
        txtFormat = new javax.swing.JTextField();
        txtStopBits = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ECOflow v0.1");
        setName("framePrincipal"); // NOI18N

        lbPorta.setText("Porta:");

        cbPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        lbSlaveadd.setText("Slaveadd:");

        lbInitialregister.setText("Initialregister:");

        lbInitialinput.setText("Initialinput:");

        lbMaxpulses.setText("Maxpulses:");

        lbRegsize.setText("Regsize:");

        lbBaudrate.setText("Baudrate:");

        lbStopbits.setText("Stopbits:");

        lbParity.setText("Parity:");

        lbFormat.setText("Format:");

        btnSalvar.setText("Aplicar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPadrao.setText("Padrão");
        btnPadrao.setEnabled(false);
        btnPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadraoActionPerformed(evt);
            }
        });

        txtSlaveadd.setEnabled(false);

        txtInitialRegister.setEnabled(false);

        txtInitialInput.setEnabled(false);

        txtMaxpulses.setEnabled(false);

        txtRegSize.setEnabled(false);

        txtBaudrate.setEnabled(false);

        txtParity.setEnabled(false);

        txtFormat.setEnabled(false);

        txtStopBits.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSlaveadd)
                            .addComponent(lbInitialinput)
                            .addComponent(lbInitialregister)
                            .addComponent(lbMaxpulses)
                            .addComponent(lbRegsize)
                            .addComponent(lbBaudrate)
                            .addComponent(lbStopbits)
                            .addComponent(lbParity)
                            .addComponent(lbFormat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInitialRegister)
                            .addComponent(txtInitialInput)
                            .addComponent(txtMaxpulses)
                            .addComponent(txtRegSize)
                            .addComponent(txtBaudrate)
                            .addComponent(txtParity)
                            .addComponent(txtSlaveadd)
                            .addComponent(txtStopBits)
                            .addComponent(txtFormat, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbPorta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelecionar)
                    .addComponent(btnPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPorta)
                    .addComponent(cbPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSlaveadd)
                    .addComponent(btnPadrao)
                    .addComponent(txtSlaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInitialregister)
                    .addComponent(btnSalvar)
                    .addComponent(txtInitialRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInitialinput)
                    .addComponent(txtInitialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaxpulses)
                    .addComponent(txtMaxpulses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegsize)
                    .addComponent(txtRegSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBaudrate)
                    .addComponent(txtBaudrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStopbits)
                    .addComponent(txtStopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbParity)
                    .addComponent(txtParity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFormat)
                    .addComponent(txtFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        getValores();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        aplicar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadraoActionPerformed
        padrao();
    }//GEN-LAST:event_btnPadraoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    //**************************************************************************
    
    private void listaSerialCom(){
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbPortas.getModel();
        comboModel.removeAllElements();
        
        ArrayList<SerialCom> listas = controleAplicativo.getListaSerialCom();
        for(int i = 0; i < listas.size(); i++ ){
            SerialCom com = listas.get(i);
            comboModel.addElement(com.getNome() );
        }
    }
    
    //**************************************************************************
    
    private void getValores(){
        controleAplicativo.selecionarPorta((String) cbPortas.getSelectedItem());
        
        //Ativar botões e campos
        btnPadrao.setEnabled(true);
        btnSalvar.setEnabled(true);
        txtSlaveadd.setEnabled(true);
        
        buscar();
    }
    
    //**************************************************************************
    
    private void buscar(){
        //Busca valor atual configurado
        txtSlaveadd.setText(controleAplicativo.comando("get slaveadd") );
        txtInitialRegister.setText(controleAplicativo.comando("get initialregister") );
        txtInitialInput.setText(controleAplicativo.comando("get initialinput") );
        txtMaxpulses.setText(controleAplicativo.comando("get maxpulses") );
        txtRegSize.setText(controleAplicativo.comando("get regsize") );
        txtBaudrate.setText(controleAplicativo.comando("get baudrate") );
        txtStopBits.setText(controleAplicativo.comando("get stopbits") );
        txtParity.setText(controleAplicativo.comando("get parity") );
        txtFormat.setText(controleAplicativo.comando("get format") );
    }
    
    //**************************************************************************
    
    private void aplicar(){
        System.out.println(controleAplicativo.comando("set slaveadd " + txtSlaveadd.getText() ) );
        System.out.println(controleAplicativo.comando("set initialregister 33") );
        System.out.println(controleAplicativo.comando("set initialinput 1") );
        System.out.println(controleAplicativo.comando("set maxpulses 999") );
        System.out.println(controleAplicativo.comando("set regsize 2") );
        System.out.println(controleAplicativo.comando("set baudrate 9600") );
        System.out.println(controleAplicativo.comando("set stopbits 1") );
        System.out.println(controleAplicativo.comando("set parity 0") );
        System.out.println(controleAplicativo.comando("set format bin") );
        System.out.println(controleAplicativo.comando("save") );
        
        buscar();
    }
    
    //**************************************************************************
    
    private void padrao(){
        System.out.println(controleAplicativo.comando("set slaveadd 1") );
        System.out.println(controleAplicativo.comando("set initialregister 33") );
        System.out.println(controleAplicativo.comando("set initialinput 1") );
        System.out.println(controleAplicativo.comando("set maxpulses 999") );
        System.out.println(controleAplicativo.comando("set regsize 2") );
        System.out.println(controleAplicativo.comando("set baudrate 9600") );
        System.out.println(controleAplicativo.comando("set stopbits 1") );
        System.out.println(controleAplicativo.comando("set parity 0") );
        System.out.println(controleAplicativo.comando("set format bin") );
        System.out.println(controleAplicativo.comando("save") );
        
        buscar();
    }
    
    //**************************************************************************

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPadrao;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JToggleButton btnSelecionar;
    private javax.swing.JComboBox<String> cbPortas;
    private javax.swing.JLabel lbBaudrate;
    private javax.swing.JLabel lbFormat;
    private javax.swing.JLabel lbInitialinput;
    private javax.swing.JLabel lbInitialregister;
    private javax.swing.JLabel lbMaxpulses;
    private javax.swing.JLabel lbParity;
    private javax.swing.JLabel lbPorta;
    private javax.swing.JLabel lbRegsize;
    private javax.swing.JLabel lbSlaveadd;
    private javax.swing.JLabel lbStopbits;
    private javax.swing.JTextField txtBaudrate;
    private javax.swing.JTextField txtFormat;
    private javax.swing.JTextField txtInitialInput;
    private javax.swing.JTextField txtInitialRegister;
    private javax.swing.JTextField txtMaxpulses;
    private javax.swing.JTextField txtParity;
    private javax.swing.JTextField txtRegSize;
    private javax.swing.JTextField txtSlaveadd;
    private javax.swing.JTextField txtStopBits;
    // End of variables declaration//GEN-END:variables
}