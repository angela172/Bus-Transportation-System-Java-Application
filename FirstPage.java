

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Senarathna
 */
public class FirstPage extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public FirstPage() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStudent = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        
        jLabel1.setFont(new java.awt.Font("Freestyle Script", 0, 48)); // NOI18N
        //jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ride With Us");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 300, 50);


        //Student Button
        btnStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent);
        btnStudent.setBounds(150, 100, 90, 32);

        //Driver Button
        btnDriver.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });
        getContentPane().add(btnDriver);
        btnDriver.setBounds(300, 100, 90, 32);

        //Admin Button
        btnAdmin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin);
        btnAdmin.setBounds(450, 100, 90, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bus.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 650);


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        StudentLogin sLogin = new StudentLogin();
        sLogin.pack();
        sLogin.setVisible(true);
        this.dispose();
                     
	}

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        DriverLogin dLogin = new DriverLogin();
        dLogin.pack();
        dLogin.setVisible(true);
        this.dispose();
                     
	}

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        AdminLogin aLogin = new AdminLogin();
        aLogin.pack();
        aLogin.setVisible(true);
        this.dispose();
                     
	}
	
        
        
    //GEN-LAST:event_btnLoginActionPerformed

   /* public void login(){

	String[] loginDetails = new String[2];
	String userName = "";
	String password = "";
	
	try(Scanner read = new Scanner(new FileInputStream("loginDetails.txt"))){
		//PrintWriter pw = new PrintWriter(new FileOutputStream(outputFile))){
	
		boolean end = false;
		
		while(read.hasNextLine()&& !end){

			loginDetails = read.nextLine().split(",");
			userName = loginDetails[0];
			password = loginDetails[1];
			
			if(userName.compareTo(username)==0 && password.compareTo(passWord)==0){
				System.out.println("Login Successful");
			}

			
		}
	}
	catch(FileNotFoundException ex){
		System.out.println("File Not Found");
	}
	catch(Exception ex){
		System.out.println("Exception");
	}
}  */                      
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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
