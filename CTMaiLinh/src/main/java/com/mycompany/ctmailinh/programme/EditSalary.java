/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ctmailinh.programme;

import com.mycompany.ctmailinh.libraly.QuerrySalary;
import com.mycompany.ctmailinh.object.Salary;
import com.mycompany.ctmailinh.libraly.HandleDate;
import com.mycompany.ctmailinh.object.IdDataAdmin;
import javax.swing.JOptionPane;
/**
 *
 * @author Windows
 */
public class EditSalary extends javax.swing.JFrame {
    IdDataAdmin iddataad = new IdDataAdmin();
    String totalprice = "";
    /**
     * Creates new form EditSalary
     */
    public EditSalary() {
        initComponents();
        setLocationRelativeTo(null);
        addComboBoxDate();
        addComboBoxMonth();
        addComboBoxYear();
        Salary salary = QuerrySalary.findById(iddataad.getIdChooseSalary());
        if (!"null".equals(salary.getOvertime())) {
            txtovertimeedit.setText(salary.getOvertime());
        }
        String[] date = salary.getDate().split("-");
        HandleDate handle = new HandleDate();
        txtdatesalaryedit.setSelectedItem(handle.dateString(date[0]));
        txtmonthsalaryedit.setSelectedItem("Tháng "+handle.dateString(date[1]));
        txtyearsalaryedit.setSelectedItem(handle.dateString(date[2]));
        totalprice = salary.getTotal_salary();
    }

    private void addComboBoxDate() {
        for (int i = 1; i < 32; i++) {
            txtdatesalaryedit.addItem(String.valueOf(i));
        }
    }

    private void addComboBoxMonth() {
        for (int i = 1; i < 13; i++) {
            txtmonthsalaryedit.addItem("Tháng "+String.valueOf(i));
        }
    }

    private void addComboBoxYear() {
        for (int i = 2000; i < 2024; i++) {
            txtyearsalaryedit.addItem(String.valueOf(i));
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
        txtovertimeedit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdatesalaryedit = new javax.swing.JComboBox<>();
        txtmonthsalaryedit = new javax.swing.JComboBox<>();
        txtyearsalaryedit = new javax.swing.JComboBox<>();
        áđâs = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Chỉnh sửa lương tháng");

        jLabel2.setText("Lương ngoài giờ:");

        jLabel3.setText("Ngày nhận:");

        txtyearsalaryedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearsalaryeditActionPerformed(evt);
            }
        });

        áđâs.setText("Sửa");
        áđâs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                áđâsActionPerformed(evt);
            }
        });

        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdatesalaryedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmonthsalaryedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtyearsalaryedit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtovertimeedit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(áđâs)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtovertimeedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdatesalaryedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonthsalaryedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyearsalaryedit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(áđâs)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtyearsalaryeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearsalaryeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyearsalaryeditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        iddataad.setIdChooseSalary(-1);
        SalaryNV salarynv = new SalaryNV();
        salarynv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void áđâsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_áđâsActionPerformed
        String overtime = txtovertimeedit.getText();
        
        String checkdate = String.valueOf(txtdatesalaryedit.getSelectedItem());
        String date = "";
        if (checkdate.length() == 1) {
            date = "0"+checkdate;
        } else {
            date = checkdate;
        }
        String[] checkmonth = String.valueOf(txtmonthsalaryedit.getSelectedItem()).split(" ");
        String month = "";
        if (checkmonth[1].length() == 1) {
            month = "0"+checkmonth[1];
        } else {
            month = checkmonth[1];
        }
        String year = String.valueOf(txtyearsalaryedit.getSelectedItem());
        
        Salary salary = new Salary();
        salary.setId_salary(iddataad.getIdChooseSalary());
        if (!"".equals(overtime)) {
            salary.setOvertime(overtime);
            salary.setTotal_salary(String.valueOf(Integer.parseInt(overtime)+Integer.parseInt(totalprice)));
        } else {
            salary.setTotal_salary(totalprice);
        }
        salary.setDate(date+"-"+month+"-"+year);
        QuerrySalary.update(salary);
        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_áđâsActionPerformed

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
            java.util.logging.Logger.getLogger(EditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtdatesalaryedit;
    private javax.swing.JComboBox<String> txtmonthsalaryedit;
    private javax.swing.JTextField txtovertimeedit;
    private javax.swing.JComboBox<String> txtyearsalaryedit;
    private javax.swing.JButton áđâs;
    // End of variables declaration//GEN-END:variables
}
