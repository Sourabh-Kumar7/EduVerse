/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import ui.professor.ProfessorPortalJFrame;
import ui.admin.AdminPortalJFrame;
import ui.student.StudentPortalJFrame;
import javax.swing.JOptionPane;
import static model.DataManager.emailUserMap;
import model.HashingUtil;
import model.User;
import ui.thirdpartyauthority.ThirdPartyDegreeAuthorityPortal;

/**
 *
 * @author saatw
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the position to be at the lower left corner
        int x = 0;
        int y = screenSize.height - getHeight();

        setLocation(x, y);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        lblusertype = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jRadioButtonShowPassword = new javax.swing.JRadioButton();
        jComboBoxUserType = new javax.swing.JComboBox<>();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("EDU-NET");

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblemail.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblpassword.setText("Password:");

        lblusertype.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblusertype.setText("User Type:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jRadioButtonShowPassword.setText("show password");
        jRadioButtonShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonShowPasswordActionPerformed(evt);
            }
        });

        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor", "DegreeAuthority", "Admin" }));

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin)
                    .addComponent(jRadioButtonShowPassword)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblusertype, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxUserType, 0, 188, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(jPassword))))
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        loginpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblemail, lblpassword, lblusertype});

        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusertype, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        loginpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxUserType, jPassword, lblemail, lblpassword, lblusertype, txtEmail});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jRadioButtonShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonShowPasswordActionPerformed
        // TODO add your handling code here:
        boolean showPassword = jRadioButtonShowPassword.isSelected();

        if (showPassword) {
            // Show password as plain text
            jPassword.setEchoChar((char) 0); // Set echo char to 0 to display plain text
        } else {
            // Hide password with asterisks (default behavior)
            jPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButtonShowPasswordActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtEmail.setText("");
        jPassword.setText("");  // Assuming 'txtpassword' is your JPasswordField
        jComboBoxUserType.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignUpPageJFrame signUpPage = new SignUpPageJFrame();
        signUpPage.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        // Get the entered email, password, and user type
        String enteredEmail = txtEmail.getText();
        char[] password = jPassword.getPassword();
        String passwordString = String.valueOf(password);
        
        String selectedUserType = jComboBoxUserType.getSelectedItem().toString();

        // Check if email and password fields are empty
        if (enteredEmail.isEmpty() || passwordString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both email and password.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method early
        }
        
        User usr = emailUserMap.get(enteredEmail);
        if(usr!=null){
            if(selectedUserType.equals(usr.getUserType())){
                String hashedPassword = HashingUtil.hashString(passwordString);
//                System.out.println(hashedPassword);
//                System.out.println(usr.getHashedPassword());
                if(hashedPassword.equals(usr.getHashedPassword())){
//                    JOptionPane.showMessageDialog(this, "Login Successful!");
                    if(usr.isEnabled()){
                        switch (selectedUserType) {
                            case "Admin" -> {
                                AdminPortalJFrame adminFrame = new AdminPortalJFrame(usr);
                                adminFrame.setVisible(true);
    //                            this.dispose();
                            }
                            case "Professor" -> {
                                ProfessorPortalJFrame profPortal = new ProfessorPortalJFrame(usr);
                                profPortal.setVisible(true);
                            }
                            case "DegreeAuthority" -> {
                                ThirdPartyDegreeAuthorityPortal degreeAuthorityPortal = new ThirdPartyDegreeAuthorityPortal(usr);
                                degreeAuthorityPortal.setVisible(true);
                            }
                            default -> {
                                StudentPortalJFrame studentPortal = new StudentPortalJFrame(usr);
                                studentPortal.setVisible(true);
                            }

                        }
                        btnClearActionPerformed(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Your account deactivated, Please contact admin/support team !", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> jComboBoxUserType;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioButtonShowPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusertype;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}