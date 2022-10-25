/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

/**
 *
 * @author User
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        StudentLogin = new javax.swing.JButton();
        AdminLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 560));
        setMinimumSize(new java.awt.Dimension(700, 560));
        setPreferredSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-schoolboy-at-a-desk-30.png"))); // NOI18N
        StudentLogin.setText("Student");
        StudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentLoginActionPerformed(evt);
            }
        });
        getContentPane().add(StudentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        AdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-admin-settings-male-30.png"))); // NOI18N
        AdminLogin.setText("Admin");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });
        getContentPane().add(AdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 560));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 560));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 560));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, -430, 1350, 1010));

        pack();
    }// </editor-fold>                        

    private void StudentLoginActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        setVisible(false);
        StudentLoginPage frame = new StudentLoginPage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }                                            

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        setVisible(false);
        AdminLoginPage frame = new AdminLoginPage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }                                          

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AdminLogin;
    private javax.swing.JButton StudentLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
