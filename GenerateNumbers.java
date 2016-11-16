package studentSubmit;
import java.util.Random;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Gurjeet
 */
public class GenerateNumbers extends javax.swing.JFrame {
 
    /**
     * Creates new form GenerateNumbers
     */
    public GenerateNumbers() {
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

        addCoursework = new javax.swing.JFileChooser();
        noCwk = new javax.swing.JDialog();
        notification = new javax.swing.JLabel();
        okay = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        referenceCode = new javax.swing.JLabel();
        cwkStatus = new javax.swing.JLabel();
        addSubmission = new javax.swing.JButton();
        cwkSelected = new javax.swing.JLabel();
        modules = new javax.swing.JComboBox<>();

        addCoursework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseworkActionPerformed(evt);
            }
        });

        noCwk.setMinimumSize(new java.awt.Dimension(260, 153));
        noCwk.setModal(true);

        notification.setText("No coursework Submitted");

        okay.setText("Okay");
        okay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout noCwkLayout = new javax.swing.GroupLayout(noCwk.getContentPane());
        noCwk.getContentPane().setLayout(noCwkLayout);
        noCwkLayout.setHorizontalGroup(
            noCwkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noCwkLayout.createSequentialGroup()
                .addGroup(noCwkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(noCwkLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(notification))
                    .addGroup(noCwkLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(okay)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        noCwkLayout.setVerticalGroup(
            noCwkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noCwkLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(notification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okay)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Confirm.setText("Confirm");
        Confirm.setMaximumSize(new java.awt.Dimension(63, 23));
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        referenceCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cwkStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cwkStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addSubmission.setText("Add Submssion");
        addSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubmissionActionPerformed(evt);
            }
        });

        cwkSelected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modules.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "310CT", "340CT", "380CT" }));
        modules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cwkSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(cwkStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addSubmission)
                                .addGap(46, 46, 46)
                                .addComponent(modules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(referenceCode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(cwkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cwkSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubmission)
                    .addComponent(modules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(referenceCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
   
   if(cwkSelected.getText().isEmpty())
    {
        noCwk.setVisible(true); 
    }
   else
   {
        // TODO add your handling code here:    
        Random generator = new Random(); 
        //create a range frmo 100-999 so 3 digits are generated
        int n = generator.nextInt(901)+100;
        //allows the number to be displaye in this label. 
        result.setText(String.valueOf(n));
        result.setHorizontalAlignment(result.CENTER); 
        referenceCode.setText("Reference Code"); 
        referenceCode.setHorizontalAlignment(referenceCode.CENTER);
        cwkStatus.setText("Submitted for grading"); 
        cwkStatus.setHorizontalAlignment(cwkStatus.CENTER);
        Confirm.setEnabled(false);
        addSubmission.setEnabled(false); 
        modules.setEnabled(false); 
        //UPDATE submissions
        //SET status = 'Submitted', modules='selected string'
        //WHERE StudentID = '1'
        try{
            String db = "jdbc:derby://localhost:1527/Student";
            String Admin1 = null; //admin1
            String password = null; //password
            
            Connection con = DriverManager.getConnection(db, "Admin1", "password");
            Statement ste = con.createStatement();
            String query = "INSERT INTO SUNMISSION1"
                    + "(SUBMISSION_ID,STUDENT_ID,COURSEWORK_ID,STATUS)"
                    + "VALUES('"+result.getText()+"','5','1', '"+cwkStatus.getText()+"')"; 
            ste.execute(query); 
    }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
   }  
    }//GEN-LAST:event_ConfirmActionPerformed

    private void addSubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubmissionActionPerformed
        // TODO add your handling code here:
        FileFilter ft = new FileNameExtensionFilter("Word docs","doc","docx");
        addCoursework.addChoosableFileFilter(ft);
        
        int returnVal = addCoursework.showOpenDialog(this);
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION){
          
            java.io.File file = addCoursework.getSelectedFile();
            String file_name = file.getName(); 
            cwkSelected.setHorizontalAlignment(cwkSelected.CENTER); 
            cwkSelected.setText(file_name);
        }   
    }//GEN-LAST:event_addSubmissionActionPerformed

    private void okayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayActionPerformed
        // TODO add your handling code here:
       noCwk.dispose(); // get rid of dialog box. 
    }//GEN-LAST:event_okayActionPerformed

    private void addCourseworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCourseworkActionPerformed

    private void modulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modulesActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        SDBconnect connect = new SDBconnect();
        connect.connect("Admin1","password");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateNumbers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JFileChooser addCoursework;
    private javax.swing.JButton addSubmission;
    private javax.swing.JLabel cwkSelected;
    private javax.swing.JLabel cwkStatus;
    private javax.swing.JComboBox<String> modules;
    private javax.swing.JDialog noCwk;
    private javax.swing.JLabel notification;
    private javax.swing.JButton okay;
    private javax.swing.JLabel referenceCode;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}