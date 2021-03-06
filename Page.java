/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECS;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Kenneth
 */
public class Page extends javax.swing.JFrame {
    
    //information data = new information();
    /**
     * Creates new form Page
     */
    public Page() {
        initComponents();
        CWS();
        Download.setEnabled(false);
    }
    
    final void CWS(){
        try {
            information data = new information();
            //conncect to the database 
            String location = "jdbc:derby://localhost:1527/Student";
            String username = "Admin1";
            String password = "password";

            Connection cnt = DriverManager.getConnection(location, username, password);
            Statement stmt = cnt.createStatement();

            //
            /*
            String gmid = "SELECT * FROM MODULE WHERE COURSE_ID = '"+ data.cid +"'";
            ResultSet midrs = stmt.executeQuery(gmid);
            */
            
            //midrs.next();
            String gcw = "SELECT * FROM COURSEWORK1";
            ResultSet cwrs = stmt.executeQuery(gcw);
            
            
            while (cwrs.next()){
                //add moudle for selection 
                CWselection.addItem( cwrs.getString(2) );
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
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

        FilePathLable = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        CWselection = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowBox = new javax.swing.JTextArea();
        path = new javax.swing.JTextField();
        previewB = new javax.swing.JButton();
        browse = new javax.swing.JButton();
        Download = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FilePathLable.setText("File Path:");

        Title.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Download Page");

        CWselection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CWselectionItemStateChanged(evt);
            }
        });
        CWselection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CWselectionActionPerformed(evt);
            }
        });

        ShowBox.setColumns(20);
        ShowBox.setRows(5);
        jScrollPane1.setViewportView(ShowBox);

        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        previewB.setText("Preview");
        previewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewBActionPerformed(evt);
            }
        });

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        Download.setText("Download");
        Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadActionPerformed(evt);
            }
        });

        back.setText("Return");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FilePathLable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(previewB))
                                    .addComponent(browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(CWselection, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Download)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CWselection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previewB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathLable)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Download)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //define dpath and select as a string
    public static String dpath;
    public static String select;
    
    
    private void CWselectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CWselectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CWselectionActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

    private void previewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewBActionPerformed
        // TODO add your handling code here:
        try{
            //Geting data from information.java
            information data = new information();
            
            //Let student preview their information
            //The infomationis getting from the programing "inforamtion"
            //print themout on teh show box
            ShowBox.setText("Below is your information: \n"
                    +"\nFirst Name: "+ data.fn
                    +"\nLast Name: "+ data.ln
                    +"\nSID:"+ data.sid
                    +"\n\n"
                    +"Course ID: "+ data.cid
                    +"\nCourse Name: "+ data.cn
                    +"\n\n"
                    +"Module ID: "+ data.mid
                    +"\nMoudle Name: "+ data.mn
                    +"\n\n"
                    +"Coursework ID: " + data.cwid
                    +"\nCoursework Title: " + data.cwt
                    +"\nCwoursework Exiry Date: " + data.cwed 
                    +"\n");
            
            //Disable the edit function
            ShowBox.setEditable(false);
            }catch(Exception x) {
                System.out.println(x);
            }
    }//GEN-LAST:event_previewBActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        // parent component of the dialog
        JFrame parentFrame = new JFrame();
        
        //using JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        //Seting the filter default to PDF 
        FileFilter filter = new FileNameExtensionFilter("PDF File","pdf");
        //define tilte as Save as
        fileChooser.setDialogTitle("Save as");
        fileChooser.setFileFilter(filter);
        
        //define user selection
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        
        //show path on the path box
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filename = fileToSave.getAbsolutePath();
            
            //the code below is to add .pdf for path when user only type the file name    
           // let l as the lenght of the path
           int l = filename.length();
           // defind a char array have 4 digi
           char[] e =new char[4];
           //gething last 4 char form the filename
           filename.getChars(l-4,l,e,0);
           //put array into string and name it file type
           String filetype = new String(e);
           //to check the filename have .pdf or not, if not print one with the file name
           if (!filetype.equals(".pdf")){
               path.setText(filename+ ".pdf");
               Download.setEnabled(true);
           }else{
               path.setText(filename);
               Download.setEnabled(true);
               
           }
           //getting the whole path of the PDF  file
           dpath = path.getText();
           //when user press canael it will close the windows
        } else if (userSelection == JFileChooser.CANCEL_OPTION) {
            parentFrame.setVisible(false); 
        }
        
    }//GEN-LAST:event_browseActionPerformed

    private void DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadActionPerformed
        // TODO add your handling code here:
        //run the program to download the covershhet
        create create = new create();
        //Show a pop up windows to tell user the download is complete  
        new pop().setVisible(true);
    }//GEN-LAST:event_DownloadActionPerformed

    private void CWselectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CWselectionItemStateChanged
        // TODO add your handling code here:
        try {
            //connecting the to database and using the information to get the function
            information data = new information();
            String location = "jdbc:derby://localhost:1527/Student";
            String username = "Admin1";
            String password = "password";

            Connection cnt = DriverManager.getConnection(location, username, password);
            Statement stmt = cnt.createStatement();

            //Query to select the student information uding the student id.
            String sc = "SELECT * FROM COURSEWORK1";
            ResultSet scrs = stmt.executeQuery(sc);
                        
            //getting user selection
            while (scrs.next()){
                //give select a value
                select = (String) CWselection.getSelectedItem();
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_CWselectionItemStateChanged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Page.this.setVisible(false);
        new StudentHome().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    
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
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CWselection;
    private javax.swing.JButton Download;
    private javax.swing.JLabel FilePathLable;
    private javax.swing.JTextArea ShowBox;
    private javax.swing.JLabel Title;
    private javax.swing.JButton back;
    private javax.swing.JButton browse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField path;
    private javax.swing.JButton previewB;
    // End of variables declaration//GEN-END:variables
}
