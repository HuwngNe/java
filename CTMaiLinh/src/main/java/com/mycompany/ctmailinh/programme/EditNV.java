/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ctmailinh.programme;

import com.mycompany.ctmailinh.libraly.CheckException;
import com.mycompany.ctmailinh.libraly.HandleDate;
import com.mycompany.ctmailinh.libraly.QuerryEmployee;
import com.mycompany.ctmailinh.libraly.QuerryOffice;
import com.mycompany.ctmailinh.libraly.QuerryPosition;
import com.mycompany.ctmailinh.object.Employee;
import com.mycompany.ctmailinh.object.IdDataAdmin;
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
public class EditNV extends javax.swing.JFrame {
    int idOffice;
    IdDataAdmin iddataad = new IdDataAdmin();
    /**
     * Creates new form EditNV
     */
    public EditNV() {
        initComponents();
        setLocationRelativeTo(null);
        addComboBoxYearBirthday();
        addPosition();
        Office office = QuerryOffice.findById(iddataad.getIdChooseNV());
        idOffice = office.getId_office();
        txtnameEdit.setText(office.getFullname());
        txtcmndEdit.setText(office.getID_card());
        switch (office.getGender()) {
            case "male" -> txtmaleEdit.setSelected(true);
            case "female" -> txtfemaleEdit.setSelected(true);
            default -> txtortherEdit.setSelected(true);
        }
        txtaddressEdit.setText(office.getAddress());
        txtphoneEdit.setText(office.getPhone());
        
        Position po = QuerryPosition.findByName(office.getPosition());
        txtposition.setSelectedItem(po.getId()+" - "+po.getName());
        txtsalaryEdit.setText(office.getSalary());
        String[] date = office.getBirthday().split("-");
        HandleDate handle = new HandleDate();
        txtdateEdit.setSelectedItem(handle.dateString(date[0]));
        txtmonthEdit.setSelectedItem("Tháng "+handle.dateString(date[1]));
        txtyearEdit.setSelectedItem(handle.dateString(date[2]));
        String[] dateJoin = office.getStart().split("-");
        txtdatejoinEdit.setSelectedItem(handle.dateString(dateJoin[0]));
        txtmonthjoinEdit.setSelectedItem("Tháng "+handle.dateString(dateJoin[1]));
        txtyearjoinEdit.setSelectedItem(handle.dateString(dateJoin[2]));
    }
    private void addPosition() {
        List<Position> ls = QuerryPosition.select();
        for (Position l : ls) {
            txtposition.addItem(l.getId()+" - "+l.getName());
        }
    }
    
    private void addComboBoxYearBirthday() {
        for (int i = 1980; i < 2023; i++) {
            txtyearEdit.addItem(String.valueOf(i));
            txtyearjoinEdit.addItem(String.valueOf(i));
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

        btngroupedit = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtnameEdit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtmaleEdit = new javax.swing.JRadioButton();
        txtfemaleEdit = new javax.swing.JRadioButton();
        txtortherEdit = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtdateEdit = new javax.swing.JComboBox<>();
        txtmonthEdit = new javax.swing.JComboBox<>();
        txtyearEdit = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtcmndEdit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtaddressEditTitle = new javax.swing.JScrollPane();
        txtaddressEdit = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        txtphoneEdit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtdatejoinEdit = new javax.swing.JComboBox<>();
        txtmonthjoinEdit = new javax.swing.JComboBox<>();
        txtyearjoinEdit = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtsalaryEdit = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtposition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Sửa thông tin nhân viên");

        jLabel11.setText("Tên nhân viên:");

        jLabel12.setText("Giới tính:");

        btngroupedit.add(txtmaleEdit);
        txtmaleEdit.setText("Nam");
        txtmaleEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaleActionPerformed(evt);
            }
        });

        btngroupedit.add(txtfemaleEdit);
        txtfemaleEdit.setText("Nữ");
        txtfemaleEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfemaleActionPerformed(evt);
            }
        });

        btngroupedit.add(txtortherEdit);
        txtortherEdit.setText("Khác");
        txtortherEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtortherActionPerformed(evt);
            }
        });

        jLabel13.setText("Ngày sinh:");

        txtdateEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtdateEdit.setSelectedIndex(-1);

        txtmonthEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        txtmonthEdit.setSelectedIndex(-1);

        jLabel14.setText("CMND/CCCD:");

        txtcmndEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmndActionPerformed(evt);
            }
        });

        jLabel15.setText("Địa chỉ:");

        txtaddressEdit.setColumns(20);
        txtaddressEdit.setRows(5);
        txtaddressEditTitle.setViewportView(txtaddressEdit);

        jLabel16.setText("Số điện thoại:");

        jLabel17.setText("Ngày vào:");

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Trở về");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtdatejoinEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtdatejoinEdit.setSelectedIndex(-1);

        txtmonthjoinEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        txtmonthjoinEdit.setSelectedIndex(-1);

        jLabel18.setText("Vị trí:");

        jLabel19.setText("Mức lương:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnameEdit)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtmaleEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfemaleEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtortherEdit))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtdateEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmonthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txtyearEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcmndEdit)
                            .addComponent(txtaddressEditTitle)
                            .addComponent(txtphoneEdit)
                            .addComponent(txtsalaryEdit)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtposition, javax.swing.GroupLayout.Alignment.LEADING, 0, 306, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtdatejoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtmonthjoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtyearjoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmaleEdit)
                    .addComponent(txtfemaleEdit)
                    .addComponent(txtortherEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtdateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyearEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcmndEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtaddressEditTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtdatejoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonthjoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtyearjoinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtsalaryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        iddataad.setIdChooseNV(-1);
        NV nv = new NV();
        nv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = txtnameEdit.getText();
        String cmnd = txtcmndEdit.getText();
        String checkdate = (String) txtdateEdit.getSelectedItem();
        String date = "";
        if (checkdate.length() == 1) {
            date = "0"+checkdate;
        } else {
            date = checkdate;
        }
        String[] strMonth = ((String) txtmonthEdit.getSelectedItem()).split(" ");
        String month = "";
        if (strMonth[1].length() == 1) {
            month = "0"+strMonth[1];
        } else {
            month = strMonth[1];
        }
        String year = (String) txtyearEdit.getSelectedItem();
        CheckException.checkDate(date+"-"+month+"-"+year);
        String gender = "";
        if (txtmaleEdit.isSelected()) {
            gender = "male";
        }
        if (txtfemaleEdit.isSelected()) {
            gender = "female";
        }
        if (txtortherEdit.isSelected()){
            gender = "orther";
        }
        System.out.println(gender);
        String phone = txtphoneEdit.getText();
        String address = txtaddressEdit.getText();
        
        String checkdateJoin = (String) txtdatejoinEdit.getSelectedItem();
        String dateJoin = "";
        if (checkdateJoin.length() == 1) {
            dateJoin = "0"+checkdateJoin;
        } else {
            dateJoin = checkdateJoin;
        }
        String[] strMonthJoin = ((String) txtmonthjoinEdit.getSelectedItem()).split(" ");
        String monthJoin = "";
        if (strMonthJoin[1].length() == 1) {
            monthJoin = "0"+strMonthJoin[1];
        } else {
            monthJoin = strMonthJoin[1];
        }
        String yearJoin = (String) txtyearjoinEdit.getSelectedItem();
        CheckException.checkDate(dateJoin+"-"+monthJoin+"-"+yearJoin);
        
        String[] po = String.valueOf(txtposition.getSelectedItem()).split(" - ");
        String position = po[0];
        String salary = txtsalaryEdit.getText();
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
                QuerryEmployee.update(em, iddataad.getIdChooseNV());
                Office off = new Office();
                off.setId_office(idOffice);
                off.setPosition(position);
                off.setStart(dateJoin+"-"+monthJoin+"-"+yearJoin);
                QuerryOffice.update(off);
                JOptionPane.showMessageDialog(rootPane, "Sửa thông tin thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Hãy điền đủ thông tin","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcmndActionPerformed

    private void txtortherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtortherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtortherActionPerformed

    private void txtfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfemaleActionPerformed

    private void txtmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaleActionPerformed

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
            java.util.logging.Logger.getLogger(EditNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngroupedit;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea txtaddressEdit;
    private javax.swing.JScrollPane txtaddressEditTitle;
    private javax.swing.JTextField txtcmndEdit;
    private javax.swing.JComboBox<String> txtdateEdit;
    private javax.swing.JComboBox<String> txtdatejoinEdit;
    private javax.swing.JRadioButton txtfemaleEdit;
    private javax.swing.JRadioButton txtmaleEdit;
    private javax.swing.JComboBox<String> txtmonthEdit;
    private javax.swing.JComboBox<String> txtmonthjoinEdit;
    private javax.swing.JTextField txtnameEdit;
    private javax.swing.JRadioButton txtortherEdit;
    private javax.swing.JTextField txtphoneEdit;
    private javax.swing.JComboBox<String> txtposition;
    private javax.swing.JTextField txtsalaryEdit;
    private javax.swing.JComboBox<String> txtyearEdit;
    private javax.swing.JComboBox<String> txtyearjoinEdit;
    // End of variables declaration//GEN-END:variables
}
