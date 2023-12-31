/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Platform;
import Roles.SystemAdminRole;
import UserAccount.UserAccount;
import Validation.VerifyNull;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Window;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author forumkaria
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */

    private Platform platform;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;

    public MainJFrame() throws ParseException{
        initComponents();
        this.platform = Platform.getInstance();

        this.setLocationRelativeTo(null); //center the window in screen
        loginPanel.setBackground(new Color(0, 0, 0, 90));
        logoutPanel.setBackground(new Color(67, 70, 86));

        logoutPanel.setVisible(false);
        container.setVisible(false);

        registerBtn.setVisible(false); //not using this button for final project, but keep the method written for this panel

    }
    public MainJFrame(Platform platform, UserAccount useraccount,Enterprise enterprise,Organization organization) {
        initComponents();
        this.setVisible(true);

        this.platform = platform;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        this.organization = organization;

    }

    private void switchPanel() {

        if (this.userAccount != null && userAccount.getRole() != null) {
            String greetings = "Hi "+ userAccount.getUsername() + "!";
            container.add("workArea", userAccount.getRole().createWorkArea(container,userAccount, platform ,enterprise,organization));
            greetingLabel.setText(greetings);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);

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

        logoutPanel = new javax.swing.JPanel();
        greetingLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        fieldusername = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldpassword = new javax.swing.JTextField();
        registerBtn2 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        bgPanel = new javax.swing.JPanel();
        bgImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(2000, 2000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetingLabel.setBackground(new java.awt.Color(255, 255, 255));
        greetingLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        greetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        greetingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        logoutBtn.setBackground(new java.awt.Color(8, 57, 97));
        logoutBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setToolTipText("");
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1014, Short.MAX_VALUE)
                .addComponent(greetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greetingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 70));

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Explorers");
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 270, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        loginBtn.setBackground(new java.awt.Color(0, 102, 255));
        loginBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, 40));

        fieldusername.setToolTipText("");
        fieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldusernameActionPerformed(evt);
            }
        });
        loginPanel.add(fieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 220, 42));

        registerBtn.setBackground(new java.awt.Color(0, 102, 255));
        registerBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Employee Register");
        registerBtn.setToolTipText("");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        loginPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 220, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));
        loginPanel.add(fieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 220, 40));

        registerBtn2.setBackground(new java.awt.Color(0, 102, 255));
        registerBtn2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        registerBtn2.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn2.setText("Customer Register");
        registerBtn2.setToolTipText("");
        registerBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtn2ActionPerformed(evt);
            }
        });
        loginPanel.add(registerBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 220, 40));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 650, 550));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 800));

        bgPanel.setLayout(new java.awt.BorderLayout());

        bgImageLabel.setBackground(new java.awt.Color(204, 204, 255));
        bgImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/mainpage.jpg"))); // NOI18N
        bgPanel.add(bgImageLabel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 870));

        setSize(new java.awt.Dimension(1300, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldusernameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String username = fieldusername.getText();
        String password = fieldpassword.getText();

        VerifyNull checkNull = new VerifyNull();
        boolean nonull = checkNull.checkNullObject(username,password);

        if(nonull){
            Boolean hasUserAtTopLevel = this.platform.getUad().accountExists(username, password);
            if(!hasUserAtTopLevel){
                for (Enterprise en: this.platform.getEnterpriseDirectory().getEnterpriseList()){
                    Boolean hasUserAtEnterpriseLevel = en.getUserAccountDirectory().accountExists(username, password);
                    if (!hasUserAtEnterpriseLevel){
                        for (Organization org: en.getOrganizationDirectory().getOrganizationList()){
                            Boolean hasUserAtOrgLevel = org.getUserAccountDirectory().accountExists(username, password);
//                            System.out.println("found user at org level");
                            if(hasUserAtOrgLevel){
                                //org level user login
                                this.enterprise = en;
                                this.organization = org;
                                this.userAccount = org.getUserAccountDirectory().getUserAccount(username, password);
                                //org employee user needs to be aprroved before loging in
                                if(org.getEmployeeDirectory().findEmployeeByUserAccount(this.userAccount)!=null){
//                                    System.out.println("user is an employee");
                                    if (!org.getEmployeeDirectory().findEmployeeByUserAccount(this.userAccount).getApproved()){
                                        this.userAccount = null;
//                                        System.out.println("employee status false");
                                    }
                                }
                                break;
                            }
                        }
                    } else{
                        //enterprise level user login
                        this.enterprise = en;
                        this.userAccount = en.getUserAccountDirectory().getUserAccount(username, password);
                        break;
                    }
                }
            }else{
                //system level user login
                this.userAccount = this.platform.getUad().getUserAccount(username, password);
            }

            if(this.userAccount!=null){
                loginPanel.setVisible(false);
                container.setVisible(true);
                logoutPanel.setVisible(true);
//                bgPanel.setVisible(true);
                fieldusername.setText("");
                fieldpassword.setText("");
                //get work area panel
                switchPanel();
            }else{
                //no such user at any level
                JOptionPane.showMessageDialog(null, "Invalid credentials");
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        container.add("EmployeeRegistrationArea", new EmployeeRegistrationJPanel(platform));

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        loginPanel.setVisible(false);
        container.setVisible(true);
        logoutPanel.setVisible(true);

    }//GEN-LAST:event_registerBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        loginPanel.setVisible(true);
        container.setVisible(false);
        logoutPanel.setVisible(false);
        container.removeAll();
        this.userAccount = null;
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void registerBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtn2ActionPerformed
        // TODO add your handling code here:
        container.add("CustomerRegistrationArea", new CustomerRegistrationJPanel( platform));

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        loginPanel.setVisible(false);
        container.setVisible(true);
        logoutPanel.setVisible(true);

    }//GEN-LAST:event_registerBtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException{
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImageLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel container;
    private javax.swing.JTextField fieldpassword;
    private javax.swing.JTextField fieldusername;
    private javax.swing.JLabel greetingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton registerBtn2;
    // End of variables declaration//GEN-END:variables
}
