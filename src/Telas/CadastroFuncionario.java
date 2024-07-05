/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Datas;
import Classes.Funcionario;
import Classes.MysqlConec.FuncionarioOpc;
import Classes.MysqlConec.MedicoOpc;
import Classes.MysqlConec.UserOpc;
import Classes.MysqlConec.pacienteOpc;
import Classes.Paciente;
import Classes.Users;
import Classes.classFuncionario;
import Telas.CadastroMedico;
import Telas.CadastroPaciente;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diógenes
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jmorada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcontacto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jdia = new javax.swing.JComboBox<>();
        jano = new javax.swing.JComboBox<>();
        jmes = new javax.swing.JComboBox<>();
        jsexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jsalario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        voltar = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jcontactop = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jfuncao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRAR DE FUNCIONÁRIO");

        jPanel1.setBackground(new java.awt.Color(0, 100, 148));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome Completo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 100, -1));

        jnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 400, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número do bi:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiActionPerformed(evt);
            }
        });
        jPanel1.add(jBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Morada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 50, -1));

        jmorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmoradaActionPerformed(evt);
            }
        });
        jPanel1.add(jmorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Nacimento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contacto: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contacto Alt.:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 119, -1));

        jcontacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontactoActionPerformed(evt);
            }
        });
        jPanel1.add(jcontacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 170, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 50, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 204, 51));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mark.png"))); // NOI18N
        jToggleButton1.setText("Confimar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 564, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiaActionPerformed(evt);
            }
        });

        jano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        jano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janoActionPerformed(evt);
            }
        });

        jmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        jmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jdia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 170, 20));

        jsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel1.add(jsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Salário:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));
        jPanel1.add(jsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 110, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-giraa-1 (1)c_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 749, 191));

        voltar.setBackground(new java.awt.Color(255, 204, 51));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 564, -1, -1));

        jTextField2.setText("jTextField1");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 6, 150, -1));

        jcontactop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontactopActionPerformed(evt);
            }
        });
        jPanel1.add(jcontactop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\diógenes\\Desktop\\Dália ISAF I(2º ano)\\dalia\\Add_User-80_icon-icons.com_57380.png")); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funçao:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jfuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Enfermeiro", "Recepcionista", "" }));
        jPanel1.add(jfuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnomeActionPerformed

    private void jBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBiActionPerformed

    private void jmoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmoradaActionPerformed

    private void jcontactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontactoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        try {

            
              classFuncionario f = new classFuncionario();
         Datas d = new Datas();
         
        d.setDia(Integer.valueOf(jdia.getSelectedItem().toString()));
        d.setMes(Integer.valueOf(jmes.getSelectedItem().toString()));
        d.setAno(Integer.valueOf(jano.getSelectedItem().toString()));
        f.setSalario(Double.valueOf(jsalario.getText()));
        f.setCargo((String) jfuncao.getSelectedItem());
        f.setNumDocIdent(jBi.getText());
        f.setNome(jnome.getText());
        f.setGenero((String) jsexo.getSelectedItem());
        f.setEndereco(jmorada.getText());
        f.setDataNascimento(d);
        f.setContacto(jcontacto.getText());
        f.setContactoAlt(jcontactop.getText());
        
        FuncionarioOpc fc = new FuncionarioOpc();
            try {
                fc.cadastrar(f);
            } catch (Exception ex) {
                Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
            Random pass = new Random();
         Users us = new Users();
         us.setBidoc(jBi.getText());
         
         int pi = pass.nextInt(900);
         us.setPassword(pi);        
         UserOpc usopc = new UserOpc();
         usopc.cadastrar(us);   
         
         
        TelaAdm tela = new TelaAdm();
        tela.dispose();
        tela.setVisible(true); 
    } catch (Exception ex) {
            Logger.getLogger(CadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdiaActionPerformed

    private void janoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_janoActionPerformed

    private void jmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmesActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        TelaAdm TelaAdm = new TelaAdm();
        this.dispose();
        TelaAdm.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jcontactopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontactopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontactopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jano;
    private javax.swing.JTextField jcontacto;
    private javax.swing.JTextField jcontactop;
    private javax.swing.JComboBox<String> jdia;
    private javax.swing.JComboBox<String> jfuncao;
    private javax.swing.JComboBox<String> jmes;
    private javax.swing.JTextField jmorada;
    private javax.swing.JTextField jnome;
    private javax.swing.JTextField jsalario;
    private javax.swing.JComboBox<String> jsexo;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
}