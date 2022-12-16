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
public class DriverLogin extends javax.swing.JFrame {

    /**
     * Creates new form DriverLogin
     */
    String username = "";
    String passWord = "";
    
    public DriverLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DriverLogin | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 150, 64, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 180, 61, 19);

        usernameText.setText("admin");
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(280, 145, 123, 30);

        passwordText.setText("root");
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(280, 180, 123, 30);

        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(430, 180, 90, 32);

        jLabel3.setFont(new java.awt.Font("Freestyle Script", 0, 48)); // NOI18N
        //jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ride With Us");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 20, 200, 50);

        btnLogin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(430, 145, 90, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bus.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        FirstPage fp2 = new FirstPage();
        fp2.setVisible(true);
        fp2.pack();
        this.dispose();
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      username = usernameText.getText();
      passWord = passwordText.getText();
      
      String[] loginDetails = new String[2];
	String userName = "";
	String password = "";
	
	try(Scanner read = new Scanner(new FileInputStream("loginDetails.txt"))){
	
		boolean end = false;
		
		while(read.hasNextLine()&& !end){

			loginDetails = read.nextLine().split(",");
			userName = loginDetails[0];
			password = loginDetails[1];
                        
                        if(userName.compareTo(username)==0 && password.compareTo(passWord)==0){
                            LoadFile2 lf2 = new LoadFile2();
                            lf2.setVisible(true);
                            lf2.pack();
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid login credentials. Please try again.");
                        }
		}
	}
	catch(FileNotFoundException ex){
		 JOptionPane.showMessageDialog(null,"File Not Found");
	}
	catch(Exception ex){
		 JOptionPane.showMessageDialog(null,ex.getMessage());
	}
        
        
      
    }//GEN-LAST:event_btnLoginActionPerformed

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
				System.out.println("DriverLogin Successful");
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
            java.util.logging.Logger.getLogger(DriverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}