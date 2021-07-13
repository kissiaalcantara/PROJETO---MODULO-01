
package TelaLogiin;

import ModelCadastro.LivroDeRegistros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaCadastro extends javax.swing.JFrame {
// objeto de coleção
    List<LivroDeRegistros> lista = new ArrayList<>();
    
    //método de consultar
    public void listarTodos (){
        DefaultTableModel dados = (DefaultTableModel) jTableTabelaDadosCadastrados.getModel();

        
        dados.setNumRows(0);//// vai limpar as linhas 

        //vou puxar todos os dados que estão dentro do banco de dados//coleção
        for(int i = 0; i < lista.size(); i++){ 
            dados.addRow(new Object[]{
                lista.get(i).getPaciente(),
                lista.get(i).getMedico(),
                lista.get(i).getData(),
                lista.get(i).getHorario()
            });
        }
    } 
    //esse comando vai fazer com que você consiga usar a tabela
    
    public TelaCadastro() {
        initComponents();
        listarTodos();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtData = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTableTabelaDadosCadastrados = new javax.swing.JTable();
        jLabelPaciente = new javax.swing.JLabel();
        jLabelMedico = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHorário = new javax.swing.JLabel();
        jLabelSistemaDeCadastramento = new javax.swing.JLabel();
        jLabelPlanoDeFundoTelaCadastro = new javax.swing.JLabel();
        jTextFieldNomePaciente1 = new javax.swing.JTextField();
        jTextFieldNomePaciente2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(null);
        getContentPane().add(txtData);
        txtData.setBounds(500, 130, 250, 30);
        getContentPane().add(txtPaciente);
        txtPaciente.setBounds(110, 130, 260, 30);
        getContentPane().add(txtHora);
        txtHora.setBounds(500, 190, 250, 30);
        getContentPane().add(txtMedico);
        txtMedico.setBounds(110, 190, 260, 30);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonSalvar.setText("SALVAR ");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(123, 320, 90, 23);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(340, 320, 90, 23);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(0, 102, 102));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(523, 320, 90, 23);

        jTableTabelaDadosCadastrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableTabelaDadosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Médico", "Data", "Horário"
            }
        ));
        jScrollPane.setViewportView(jTableTabelaDadosCadastrados);

        getContentPane().add(jScrollPane);
        jScrollPane.setBounds(120, 400, 550, 160);

        jLabelPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPaciente.setText("Paciente:");
        getContentPane().add(jLabelPaciente);
        jLabelPaciente.setBounds(50, 90, 130, 30);

        jLabelMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMedico.setText("Médico: ");
        getContentPane().add(jLabelMedico);
        jLabelMedico.setBounds(50, 170, 100, 17);

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setText("Data: ");
        getContentPane().add(jLabelData);
        jLabelData.setBounds(451, 110, 90, 20);

        jLabelHorário.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHorário.setText("Horário: ");
        getContentPane().add(jLabelHorário);
        jLabelHorário.setBounds(441, 170, 100, 17);

        jLabelSistemaDeCadastramento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelSistemaDeCadastramento.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSistemaDeCadastramento.setText("SISTEMA DE CADASTRAMENTO ");
        getContentPane().add(jLabelSistemaDeCadastramento);
        jLabelSistemaDeCadastramento.setBounds(210, 30, 390, 50);

        jLabelPlanoDeFundoTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPlanoDeFundoTelaCadastro.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPlanoDeFundoTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AdobeStock_177452394.jpg"))); // NOI18N
        getContentPane().add(jLabelPlanoDeFundoTelaCadastro);
        jLabelPlanoDeFundoTelaCadastro.setBounds(-10, 0, 800, 680);
        getContentPane().add(jTextFieldNomePaciente1);
        jTextFieldNomePaciente1.setBounds(500, 130, 250, 30);
        getContentPane().add(jTextFieldNomePaciente2);
        jTextFieldNomePaciente2.setBounds(500, 130, 250, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.jTableTabelaDadosCadastrados.getSelectedRow();
        lista.get(linhaSelecionada).setPaciente(txtPaciente.getText());
        lista.get(linhaSelecionada).setMedico(txtMedico.getText());
        lista.get(linhaSelecionada).setHorario(txtHora.getText());
        lista.get(linhaSelecionada).setData(txtData.getText());
        listarTodos();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        LivroDeRegistros paciente = new LivroDeRegistros();
        paciente.setPaciente(txtPaciente.getText());
        paciente.setMedico(txtMedico.getText());
        paciente.setHorario(txtHora.getText());
        paciente.setData(txtData.getText());
        lista.add(paciente);
        listarTodos();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.jTableTabelaDadosCadastrados.getSelectedRow();
        lista.remove(linhaSelecionada);
        listarTodos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHorário;
    private javax.swing.JLabel jLabelMedico;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JLabel jLabelPlanoDeFundoTelaCadastro;
    private javax.swing.JLabel jLabelSistemaDeCadastramento;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableTabelaDadosCadastrados;
    private javax.swing.JTextField jTextFieldNomePaciente1;
    private javax.swing.JTextField jTextFieldNomePaciente2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
