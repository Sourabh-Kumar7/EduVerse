/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.professor;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Course;
import model.CustomExceptions.InvalidCourseFeesException;
import model.CustomExceptions.InvalidDescriptionException;
import model.CustomExceptions.InvalidNameException;
import model.CustomExceptions.InvalidSemesterException;
import model.CustomExceptions.InvalidYearException;
import model.DataManager;
import model.Professor;
import model.User;
import model.validationUtil;

/**
 *
 * @author sourabhkumar
 */
public class ViewCourseDetailsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewCourseDetailsJFrame
     */
    Course course;
    Professor p;
    User u;
    public ViewCourseDetailsJFrame(Course course, Professor p, User u) {
        this.course = course;
        this.p = p;
        this.u = u;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Set close operation
        loadCourseDetails();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the position to be at the top right corner
        int x = screenSize.width - getWidth();
        int y = 0;

        setLocation(x, y);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ManageCourseJFrame manageCourse = new ManageCourseJFrame(p, u);
                manageCourse.setVisible(true);
                dispose(); // Close the second frame
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        txtCourseFees = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();
        lblSemester = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jComboBoxSemester = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Course Fees");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Description");

        txtCourseID.setEditable(false);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Course");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course ID");

        txtAreaDesc.setColumns(20);
        txtAreaDesc.setRows(5);
        jScrollPane1.setViewportView(txtAreaDesc);

        lblSemester.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSemester.setText("Semester");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Course Status");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Course Name");

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall", "Spring", "Summer" }));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lblSemester)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate))
                            .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lblSemester});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxSemester, jComboBoxStatus, jScrollPane1, txtCourseFees, txtCourseID, txtCourseName, txtYear});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(lblSemester)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxSemester, jComboBoxStatus, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lblSemester, txtCourseFees, txtCourseID, txtCourseName, txtYear});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
            // Check if there are enrolled students
        if (course.getCountEnrolledStudents() > 0) {
            int choice = JOptionPane.showConfirmDialog(this, "There are enrolled students. Do you want to deactivate this course instead of deleting?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                // Deactivate the course
                course.setActive(false);
                // Update the course status in the database or wherever it's stored
                // You may want to add code here to save the updated status.
                JOptionPane.showMessageDialog(this, "Course deactivated successfully.");
            }
        } else {
            int deleteChoice = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this course?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
            if (deleteChoice == JOptionPane.YES_OPTION) {
                // Remove the course from the professor's course list
                Professor professor = DataManager.professorMap.get(course.getInstructorID());
                if (professor != null) {
                    professor.getCreatedCourseIds().remove(Integer.valueOf(course.getCourseId()));
                }

                // Handle the deletion impact here, e.g., removing the course from the database.
                // You can remove it from the courseMap if that's where you store your courses.
                DataManager.courseMap.remove(course.getCourseId());

                // Show a message to indicate successful deletion
                JOptionPane.showMessageDialog(this, "Course deleted successfully.");

                // Close the window after deletion
                ManageCourseJFrame manageCourse = new ManageCourseJFrame(p, u);
                manageCourse.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        // Check if there are enrolled students
        if (course.getCountEnrolledStudents() > 0) {
            // Check if you're trying to update year, semester, or course fees
            if (!txtYear.getText().equals(String.valueOf(course.getYear())) ||
                !jComboBoxSemester.getSelectedItem().equals(course.getSemester()) ||
                !txtCourseFees.getText().equals(String.valueOf(course.getCourseFees()))) {
                int choice = JOptionPane.showConfirmDialog(this, "There are enrolled students. Do you want to deactivate this course?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Deactivate the course
                    course.setActive(false);
                    // Update the course status in the database or wherever it's stored
                    // You may want to add code here to save the updated status.
                    JOptionPane.showMessageDialog(this, "Course deactivated successfully.");
                }
                return;
            }
        }
        else {
            try {
                
                try{
                    // Validate the year input
                    int year = Integer.parseInt(txtYear.getText());
                    validationUtil.validateYear(year);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid year format. Please enter a valid year.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate the course semester
                validationUtil.validateCourseSemester(jComboBoxSemester.getSelectedItem().toString());

                // Validate and format the course fees
                double courseFees = Double.parseDouble(txtCourseFees.getText());
                DecimalFormat df = new DecimalFormat("#.00");
                courseFees = Double.parseDouble(df.format(courseFees));

                // Check if the course fees are valid
                validationUtil.validateCourseFees(courseFees);

                // Update the course details
                course.setYear(Integer.parseInt(txtYear.getText()));
                course.setSemester(jComboBoxSemester.getSelectedItem().toString());
                course.setCourseFees(courseFees);
            } catch (InvalidYearException | InvalidSemesterException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            } catch (NumberFormatException | InvalidCourseFeesException e) {
                JOptionPane.showMessageDialog(this, "Invalid course fees format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        try {
            validationUtil.validateName(txtCourseName.getText());
            validationUtil.validateDescription(txtAreaDesc.getText());
        } catch (InvalidNameException | InvalidDescriptionException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        course.setCourseName(txtCourseName.getText());
        course.setDescription(txtAreaDesc.getText());
        JOptionPane.showMessageDialog(this, "Course updated successfully.");

    }//GEN-LAST:event_btnUpdateActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBoxSemester;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JTextArea txtAreaDesc;
    private javax.swing.JTextField txtCourseFees;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void loadCourseDetails() {
        txtCourseID.setText(String.valueOf(course.getCourseId()));
        txtCourseName.setText(course.getCourseName());
        txtCourseFees.setText(String.valueOf(course.getCourseFees()));
        txtYear.setText(String.valueOf(course.getYear()));
        txtAreaDesc.setText(course.getDescription());

        // Set the selected value in the combo boxes
        jComboBoxSemester.setSelectedItem(course.getSemester());
        jComboBoxStatus.setSelectedItem(course.isActive() ? "Active" : "Inactive");
    }

    private Professor professorMap(int instructorID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}