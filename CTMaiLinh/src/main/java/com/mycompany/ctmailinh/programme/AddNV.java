/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ctmailinh.programme;

import com.mycompany.ctmailinh.libraly.CheckException;
import com.mycompany.ctmailinh.libraly.QuerryEmployee;
import com.mycompany.ctmailinh.libraly.QuerryOffice;
import com.mycompany.ctmailinh.libraly.QuerryPosition;
import com.mycompany.ctmailinh.object.Employee;
import com.mycompany.ctmailinh.object.Office;
import com.mycompany.ctmailinh.object.Position;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class AddNV extends javax.swing.JFrame {

    /**
     * Creates new form AddNV
     */
    public AddNV() {
        initComponents();
        setLocationRelativeTo(null);
        txtmale.setSelected(true);
        addComboBoxYearBirthday();
        addPosition();
    }

    private void addPosition() {
        List<Position> ls = QuerryPosition.select();
        for (Position l : ls) {
            txtposition.addItem(l.getId()+" - "+l.getName());
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

        btnGroupGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmale = new javax.swing.JRadioButton();
        txtfemale = new javax.swing.JRadioButton();
        txtorther = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtdate = new javax.swing.JComboBox<>();
        txtmonth = new javax.swing.JComboBox<>();
        txtyear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtcmnd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtaddressAddTitle = new javax.swing.JScrollPane();
        txtaddressAdd = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtdatejoin = new javax.swing.JComboBox<>();
        txtmonthjoin = new javax.swing.JComboBox<>();
        txtyearjoin = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtposition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Thêm nhân viên");

        jLabel2.setText("Tên nhân viên:");

        jLabel3.setText("Giới tính:");

        btnGroupGender.add(txtmale);
        txtmale.setText("Nam");
        txtmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaleActionPerformed(evt);
            }
        });

        btnGroupGender.add(txtfemale);
        txtfemale.setText("Nữ");
        txtfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfemaleActionPerformed(evt);
            }
        });

        btnGroupGender.add(txtorther);
        txtorther.setText("Khác");
        txtorther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtortherActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày sinh:");

        txtdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtdate.setSelectedIndex(-1);

        txtmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        txtmonth.setSelectedIndex(-1);

        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });

        jLabel5.setText("CMND/CCCD:");

        txtcmnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmndActionPerformed(evt);
            }
        });

        jLabel6.setText("Địa chỉ:");

        txtaddressAdd.setColumns(20);
        txtaddressAdd.setRows(5);
        txtaddressAddTitle.setViewportView(txtaddressAdd);

        jLabel7.setText("Số điện thoại:");

        jLabel8.setText("Ngày vào:");

        jButton1.setText("Thêm");
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

        txtdatejoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtdatejoin.setSelectedIndex(-1);

        txtmonthjoin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        txtmonthjoin.setSelectedIndex(-1);

        jLabel9.setText("Vị trí:");

        jLabel10.setText("Mức lương:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtmale)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtorther))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcmnd)
                            .addComponent(txtaddressAddTitle)
                            .addComponent(txtphone)
                            .addComponent(txtsalary)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtposition, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtdatejoin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtmonthjoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtyearjoin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmale)
                    .addComponent(txtfemale)
                    .addComponent(txtorther))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtaddressAddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdatejoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonthjoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyearjoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcmndActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NV nv = new NV();
        nv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = txtname.getText();
        String cmnd = txtcmnd.getText();
        String checkdate = (String) txtdate.getSelectedItem();
        String date = "";
        if (checkdate.length() == 1) {
            date = "0"+checkdate;
        } else {
            date = checkdate;
        }
        String[] strMonth = ((String) txtmonth.getSelectedItem()).split(" ");
        String month = "";
        if (strMonth[1].length() == 1) {
            month = "0"+strMonth[1];
        } else {
            month = strMonth[1];
        }
        String year = (String) txtyear.getSelectedItem();
        CheckException.checkDate(date+"-"+month+"-"+year);
        String gender = "";
        if (txtmale.isSelected()) {
            gender = "male";
        }
        if (txtfemale.isSelected()) {
            gender = "female";
        }
        if (txtorther.isSelected()){
            gender = "orther";
        }
        String phone = txtphone.getText();
        String address = txtaddressAdd.getText();
        
        String checkdateJoin = (String) txtdatejoin.getSelectedItem();
        String dateJoin = "";
        if (checkdateJoin.length() == 1) {
            dateJoin = "0"+checkdateJoin;
        } else {
            dateJoin = checkdateJoin;
        }
        String[] strMonthJoin = ((String) txtmonthjoin.getSelectedItem()).split(" ");
        String monthJoin = "0"+strMonthJoin[1];
        if (strMonthJoin[1].length() == 1) {
            monthJoin = "0"+strMonthJoin[1];
        } else {
            monthJoin = strMonthJoin[1];
        }
        String yearJoin = (String) txtyearjoin.getSelectedItem();
        CheckException.checkDate(dateJoin+"-"+monthJoin+"-"+yearJoin);
        
        String[] po = String.valueOf(txtposition.getSelectedItem()).split(" - ");
        String position = po[0];
        String salary = txtsalary.getText();
        String regexNumber = "[0-9]+";
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(salary);
        if (!matcher.find()) {
            JOptionPane.showMessageDialog(rootPane, "Lương phải là số","Lỗi",JOptionPane.ERROR_MESSAGE);
        } else {
            
            if (!"".equals(name) && !"".equals(cmnd) && !"".equals(date) && !"".equals(month) && !"".equals(year) && !"".equals(gender) && !"".equals(phone) && !"".equals(address) && !"".equals(dateJoin) && !"".equals(monthJoin) && !"".equals(yearJoin) && !"".equals(position)) {
                Employee em = new Employee();
                em.setFullname(name);
                em.setGender(gender);
                em.setID_card(cmnd);
                em.setAddress(address);
                em.setBirthday(date+"-"+month+"-"+year);
                em.setPhone(phone);
                em.setSalary(salary);
                int keyE = QuerryEmployee.insertGetId(em);
                Office off = new Office();
                off.setId_employee(keyE);
                off.setPosition(position);
                off.setStart(dateJoin+"-"+monthJoin+"-"+yearJoin);
                QuerryOffice.insert(off);
                JOptionPane.showMessageDialog(rootPane, "Đăng ký thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Hãy điền đủ thông tin","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaleActionPerformed

    private void txtfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfemaleActionPerformed

    private void txtortherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtortherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtortherActionPerformed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
        
    }//GEN-LAST:event_txtyearActionPerformed

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
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea txtaddressAdd;
    private javax.swing.JScrollPane txtaddressAddTitle;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JComboBox<String> txtdate;
    private javax.swing.JComboBox<String> txtdatejoin;
    private javax.swing.JRadioButton txtfemale;
    private javax.swing.JRadioButton txtmale;
    private javax.swing.JComboBox<String> txtmonth;
    private javax.swing.JComboBox<String> txtmonthjoin;
    private javax.swing.JTextField txtname;
    private javax.swing.JRadioButton txtorther;
    private javax.swing.JTextField txtphone;
    private javax.swing.JComboBox<String> txtposition;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JComboBox<String> txtyear;
    private javax.swing.JComboBox<String> txtyearjoin;
    // End of variables declaration//GEN-END:variables

    private void addComboBoxYearBirthday() {
        for (int i = 1980; i < 2023; i++) {
            txtyear.addItem(String.valueOf(i));
            txtyearjoin.addItem(String.valueOf(i));
        }
    }
}
