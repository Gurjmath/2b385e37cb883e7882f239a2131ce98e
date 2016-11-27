/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static ECS.StudentLogin.key;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class StudentHome extends javax.swing.JFrame {

    /**
     * Creates new form StudentHome
     */
    
    //geting the key from student login
    
   
    public StudentHome(){
        initComponents();
        checkGradebd();
        showW();
        
        //checkGradebd();
        
    }

    /**
     *
     */
    private void showW(){ 
        try{
        String location = "jdbc:derby://localhost:1527/Student";
        String username = "Admin1";
        String password = "password";
            
        Connection cnt = DriverManager.getConnection(location, username, password);
        Statement stmt = cnt.createStatement();
            
        //Query to select the student information uding the student id.
        String code = "SELECT * FROM STUDENT WHERE STUDENT_ID = '"+ key +"'";
        ResultSet rs = stmt.executeQuery(code);

        //go thought the database
        rs.next();
        Welcome_sign.setText("Welcome back, " + rs.getString(2)+ " " +rs.getString(3));
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    private void  checkGradebd(){
        try {
            int check = 1;
            Connection connectionToDB = DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Admin1","password");
            Statement statement = connectionToDB.createStatement();
            ResultSet rs = statement.executeQuery("select * from SUNMISSION1");
   
            while(rs.next())
            {
                if(rs.getInt(2)==key)
                {
                    check = 0;
                    break;
                }
            }
            if(check == 0)
            {
                checkGrade.setEnabled(true);
            }
            else
            {
                checkGrade.setEnabled(false);
            }

        // Generic try/catch from the superclass Exception
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome_sign = new javax.swing.JLabel();
        Page = new javax.swing.JButton();
        submitionB = new javax.swing.JButton();
        back = new javax.swing.JButton();
        checkGrade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Page.setText("Download coversheet");
        Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PageActionPerformed(evt);
            }
        });

        submitionB.setText("Submition");
        submitionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitionBActionPerformed(evt);
            }
        });

        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        checkGrade.setText("Check my Grade");
        checkGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitionB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Page)
                    .addComponent(checkGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Welcome_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(Page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkGrade)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

            
    private void PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PageActionPerformed
        // TODO add your handling code here:
        StudentHome.this.setVisible(false);
        new Page().setVisible(true);
    }//GEN-LAST:event_PageActionPerformed

    private void submitionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitionBActionPerformed
        // TODO add your handling code here:
        StudentHome.this.setVisible(false);
        new SubmitCoursework().setVisible(true);
    }//GEN-LAST:event_submitionBActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        //disable home page
        StudentHome.this.setVisible(false);
        //start the student login page
        new StudentLogin().setVisible(true);
        //performing memory management
        key = 0;
    }//GEN-LAST:event_backActionPerformed

    private void checkGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGradeActionPerformed
        // TODO add your handling code here:
        StudentHome.this.setVisible(false);
        new DisputeMain().setVisible(true);
    }//GEN-LAST:event_checkGradeActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new StudentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Page;
    private javax.swing.JLabel Welcome_sign;
    private javax.swing.JButton back;
    private javax.swing.JButton checkGrade;
    private javax.swing.JButton submitionB;
    // End of variables declaration//GEN-END:variables
}
