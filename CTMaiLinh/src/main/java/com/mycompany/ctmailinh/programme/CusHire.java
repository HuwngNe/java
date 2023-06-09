/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ctmailinh.programme;

import com.mycompany.ctmailinh.libraly.QuerryEmployee;
import com.mycompany.ctmailinh.libraly.QuerryHire;
import com.mycompany.ctmailinh.libraly.QuerryVehice;
import com.mycompany.ctmailinh.object.Employee;
import com.mycompany.ctmailinh.object.Hire;
import com.mycompany.ctmailinh.object.IdLogin;
import com.mycompany.ctmailinh.object.Vehice;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class CusHire extends javax.swing.JFrame {
    IdLogin idlogin = new IdLogin();
    /**
     * Creates new form CusHire
     */
    public CusHire() {
        initComponents();
        setLocationRelativeTo(null);
        addComboBoxDate();
        addComboBoxMonth();
        addComboBoxYear();
        addComboVehice();
        addComboDriver();
    }

    private void addComboDriver() {
        List<Employee> ls = new ArrayList<>();
        ls = QuerryEmployee.selectDriver();
        txtdriverhireadd.addItem("0 - Không thuê");
        for (Employee l : ls) {
            txtdriverhireadd.addItem(String.valueOf(l.getId())+" - "+l.getFullname());
        }
    }
    
    private void addComboVehice() {
        List<Vehice> ls = new ArrayList<>();
        ls = QuerryVehice.findByStatus();
        for (Vehice vehice : ls) {
            txtvehicehireadd.addItem(String.valueOf(vehice.getId())+" - "+vehice.getName());
        }
    }
    
    private void addComboBoxDate() {
        for (int i = 1; i < 32; i++) {
            txtdatehireadd.addItem(String.valueOf(i));
        }
    }

    private void addComboBoxMonth() {
        for (int i = 1; i < 13; i++) {
            txtmonthhireadd.addItem("Tháng "+String.valueOf(i));
        }
    }

    private void addComboBoxYear() {
        for (int i = 2023; i < 2025; i++) {
            txtyearhireadd.addItem(String.valueOf(i));
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtvehicehireadd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtdriverhireadd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txthourhireadd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtminishireadd = new javax.swing.JTextField();
        txtdatehireadd = new javax.swing.JComboBox<>();
        txtmonthhireadd = new javax.swing.JComboBox<>();
        txtyearhireadd = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Đăng ký thuê");

        jLabel2.setText("Phương tiện muốn thuê:");

        jLabel3.setText("Nhân viên lái xe:");

        jLabel4.setText("Thời gian bắt đầu:");

        txthourhireadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthourhireaddKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthourhireaddKeyReleased(evt);
            }
        });

        jLabel5.setText(":");

        txtminishireadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtminishireaddActionPerformed(evt);
            }
        });
        txtminishireadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtminishireaddKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtminishireaddKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtminishireaddKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txthourhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtminishireadd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtdatehireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmonthhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtyearhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdriverhireadd, javax.swing.GroupLayout.Alignment.LEADING, 0, 230, Short.MAX_VALUE)
                                    .addComponent(txtvehicehireadd, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtvehicehireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdriverhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthourhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtminishireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdatehireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonthhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyearhireadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Đăng ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtminishireaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtminishireaddActionPerformed
        
    }//GEN-LAST:event_txtminishireaddActionPerformed

    private void txtminishireaddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminishireaddKeyTyped
        
    }//GEN-LAST:event_txtminishireaddKeyTyped

    private void txtminishireaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminishireaddKeyPressed
        String minis = txtminishireadd.getText();
        String regex = "^[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(minis);
        if (matcher.find()) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập số","Lỗi",JOptionPane.ERROR_MESSAGE);
            txtminishireadd.setText("");
        } else {
            
        }
    }//GEN-LAST:event_txtminishireaddKeyPressed

    private void txtminishireaddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminishireaddKeyReleased
        String minis = txtminishireadd.getText();
        if (minis.length() > 2) {
            txtminishireadd.setText("59");
        } else if (minis.length() == 2 ) {
            if (Integer.parseInt(minis) >= 60) {
                txtminishireadd.setText("59");
            }
        } 
//        else {
//            txtminishireadd.setText("0"+minis);
//        }
    }//GEN-LAST:event_txtminishireaddKeyReleased

    private void txthourhireaddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthourhireaddKeyReleased
        String minis = txthourhireadd.getText();
        if (minis.length() > 2) {
            txthourhireadd.setText("23");
        } else if (minis.length() == 2 ) {
            if (Integer.parseInt(minis) >= 24) {
                txthourhireadd.setText("23");
            }
        } 
    }//GEN-LAST:event_txthourhireaddKeyReleased

    private void txthourhireaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthourhireaddKeyPressed
        String minis = txthourhireadd.getText();
        String regex = "^[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(minis);
        if (matcher.find()) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập số","Lỗi",JOptionPane.ERROR_MESSAGE);
            txthourhireadd.setText("");
        } 
    }//GEN-LAST:event_txthourhireaddKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        User user = new User();
        user.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] vehiceChoose = String.valueOf(txtvehicehireadd.getSelectedItem()).split(" - ");
        String[] driverChoose = String.valueOf(txtdriverhireadd.getSelectedItem()).split(" - ");
        
        String checkdate = String.valueOf(txtdatehireadd.getSelectedItem());
        String date = "";
        if (checkdate.length() == 1) {
            date = "0"+checkdate;
        } else {
            date = checkdate;
        }
        String[] checkmonth = String.valueOf(txtmonthhireadd.getSelectedItem()).split(" ");
        String month = "";
        if (checkmonth[1].length() == 1) {
            month = "0"+checkmonth[1];
        } else {
            month = checkmonth[1];
        }
        String year = String.valueOf(txtyearhireadd.getSelectedItem());
        
        if (!"".equals(txthourhireadd.getText()) && !"".equals(txtminishireadd.getText())) {
            Hire hire = new Hire();
            hire.setCustomer_id(idlogin.getIdCurrent());
            hire.setStart_date(date+"-"+month+"-"+year+" "+txthourhireadd.getText()+":"+txtminishireadd.getText());
            hire.setVehice_id(Integer.parseInt(vehiceChoose[0]));
            hire.setEmployee_id(Integer.parseInt(driverChoose[0]));
            hire.setStatus_hire_id(3);
            hire.setStatus_correct_id(1);
            hire.setStatus_payment_id(1);
            QuerryHire.insert(hire);
            JOptionPane.showMessageDialog(rootPane, "Đăng ký thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hãy điền đầy đủ thông tin","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CusHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusHire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtdatehireadd;
    private javax.swing.JComboBox<String> txtdriverhireadd;
    private javax.swing.JTextField txthourhireadd;
    private javax.swing.JTextField txtminishireadd;
    private javax.swing.JComboBox<String> txtmonthhireadd;
    private javax.swing.JComboBox<String> txtvehicehireadd;
    private javax.swing.JComboBox<String> txtyearhireadd;
    // End of variables declaration//GEN-END:variables
}
