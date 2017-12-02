/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willi
 */
public class MainFrame extends javax.swing.JFrame {
    MyHashTable employeeHashTable;
    /**
     * Creates new form mainFrame
     */
    public MainFrame() throws IOException, FontFormatException {
        initComponents();
        employeeHashTable = new MyHashTable(2);
        getContentPane().setBackground(new Color(48, 55, 69));
        try {
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")).deriveFont(62f);
            Font sectionFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")).deriveFont(48f);
            Font headerFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Oswald\\Oswald-Regular.ttf")).deriveFont(24f);
            Font bodyFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Raleway\\Raleway-Regular.ttf")).deriveFont(28f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Oswald\\Oswald-Regular.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Raleway\\Raleway-Regular.ttf")));
            
            jLabel1.setFont(titleFont);
            jLabel3.setFont(sectionFont);
            jLabel16.setFont(sectionFont);
            jLabel18.setFont(sectionFont);
            jLabel25.setFont(sectionFont);
            
            jButton1.setFont(headerFont);
            jButton2.setFont(headerFont);
            jButton3.setFont(headerFont);
            jButton4.setFont(headerFont);
            jButton5.setFont(headerFont);
            jButton6.setFont(headerFont);
            jButton7.setFont(headerFont);
            jButton8.setFont(headerFont);
            jButton9.setFont(headerFont);
            jButton10.setFont(headerFont);
            jButton11.setFont(headerFont);
            jButton12.setFont(headerFont);
            jButton13.setFont(headerFont);
            jButton14.setFont(headerFont);
            jButton15.setFont(headerFont);
            
            jLabel5.setFont(headerFont);
            jLabel6.setFont(headerFont);
            jLabel7.setFont(headerFont);
            jLabel8.setFont(headerFont);
            jLabel9.setFont(headerFont);
            jLabel11.setFont(headerFont);
            jLabel12.setFont(headerFont);
            jLabel13.setFont(headerFont);
            jLabel14.setFont(headerFont);
            jLabel15.setFont(headerFont);
            jLabel17.setFont(headerFont);
            jLabel19.setFont(headerFont);
            searchFirstName.setFont(headerFont);
            searchLastName.setFont(headerFont);
            searchEmpNum.setFont(headerFont);
            searchLocation.setFont(headerFont);
            searchGender.setFont(headerFont);
            searchDeductRate.setFont(headerFont);
            searchYearlySalary.setFont(headerFont);
            searchHourlyWage.setFont(headerFont);
            searchHoursWeek.setFont(headerFont);
            searchWeeksYear.setFont(headerFont);
            jLabel28.setFont(headerFont);
            jLabel29.setFont(headerFont);
            jLabel30.setFont(headerFont);
            jLabel32.setFont(headerFont);
            jCheckBox1.setFont(headerFont);
            jCheckBox2.setFont(headerFont);
            jCheckBox3.setFont(headerFont);
            jCheckBox4.setFont(headerFont);
            
            searchFirstName1.setFont(bodyFont);
            searchLastName1.setFont(bodyFont);
            searchEmpNum.setFont(bodyFont);
            searchLocation.setFont(bodyFont);
            searchGender.setFont(bodyFont);
            searchDeductRate.setFont(bodyFont);
            searchYearlySalary1.setFont(bodyFont);
            searchHourlyWage1.setFont(bodyFont);
            searchHoursWeek1.setFont(bodyFont);
            searchWeeksYear1.setFont(bodyFont);
            
            firstNameField.setFont(bodyFont);
            lastNameField.setFont(bodyFont);
            empNumField.setFont(bodyFont);
            locationField.setFont(bodyFont);
            genderField.setFont(bodyFont);
            deductRateField.setFont(bodyFont);
            yearlySalaryField.setFont(bodyFont);
            hourlyWageField.setFont(bodyFont);
            hoursWeekField.setFont(bodyFont);
            weeksYearField.setFont(bodyFont);
            searchNumField.setFont(bodyFont);
            
            editFirstName.setFont(bodyFont);
            editLastName.setFont(bodyFont);
            editEmpNum.setFont(bodyFont);
            editLocation.setFont(bodyFont);
            editGender.setFont(bodyFont);
            editDeductRate.setFont(bodyFont);
            editYearlySalary.setFont(bodyFont);
            editHourlyWage.setFont(bodyFont);
            editHoursWeek.setFont(bodyFont);
            editWeeksYear.setFont(bodyFont);
            
            
        } 
        catch (Exception e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        empNumField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        deductRateField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        yearlySalaryField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        hourlyWageField = new javax.swing.JTextField();
        hoursWeekField = new javax.swing.JTextField();
        weeksYearField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        searchNumField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        searchFirstName = new javax.swing.JLabel();
        searchLastName = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        searchYearlySalary = new javax.swing.JLabel();
        searchYearlySalary1 = new javax.swing.JLabel();
        editYearlySalary = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        searchHourlyWage = new javax.swing.JLabel();
        searchHoursWeek = new javax.swing.JLabel();
        searchWeeksYear = new javax.swing.JLabel();
        searchHourlyWage1 = new javax.swing.JLabel();
        searchHoursWeek1 = new javax.swing.JLabel();
        searchWeeksYear1 = new javax.swing.JLabel();
        editWeeksYear = new javax.swing.JTextField();
        editHoursWeek = new javax.swing.JTextField();
        editHourlyWage = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        searchGender = new javax.swing.JLabel();
        searchEmpNum = new javax.swing.JLabel();
        searchLastName1 = new javax.swing.JLabel();
        searchFirstName1 = new javax.swing.JLabel();
        searchLocation = new javax.swing.JLabel();
        searchDeductRate = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        editFirstName = new javax.swing.JTextField();
        editLastName = new javax.swing.JTextField();
        editLocation = new javax.swing.JTextField();
        editGender = new javax.swing.JTextField();
        editDeductRate = new javax.swing.JTextField();
        editEmpNum = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(java.awt.Color.red);
        setPreferredSize(new java.awt.Dimension(1100, 850));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(77, 78, 96));
        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 248, 252));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Management System");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(50, 54, 71));
        jPanel1.setForeground(new java.awt.Color(72, 78, 96));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(77, 78, 96));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 248, 252));
        jLabel3.setText("Add New Employee");

        jLabel5.setBackground(new java.awt.Color(77, 78, 96));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 248, 252));
        jLabel5.setText("First Name: ");

        jLabel6.setBackground(new java.awt.Color(77, 78, 96));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(244, 248, 252));
        jLabel6.setText("Last Name: ");

        jLabel7.setBackground(new java.awt.Color(77, 78, 96));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 248, 252));
        jLabel7.setText("Gender:");

        jLabel8.setBackground(new java.awt.Color(77, 78, 96));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(244, 248, 252));
        jLabel8.setText("Employee Number:");

        jLabel9.setBackground(new java.awt.Color(77, 78, 96));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(244, 248, 252));
        jLabel9.setText("Location:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText(" ");

        jLabel11.setBackground(new java.awt.Color(77, 78, 96));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(244, 248, 252));
        jLabel11.setText("Deduction Rate:");

        jCheckBox1.setBackground(new java.awt.Color(77, 78, 96));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(244, 248, 252));
        jCheckBox1.setText("Full Time Employee");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(77, 78, 96));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(244, 248, 252));
        jCheckBox2.setText("Part Time Employee");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        firstNameField.setBackground(new java.awt.Color(72, 78, 96));
        firstNameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(244, 248, 252));
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        lastNameField.setBackground(new java.awt.Color(72, 78, 96));
        lastNameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(244, 248, 252));
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        empNumField.setBackground(new java.awt.Color(72, 78, 96));
        empNumField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        empNumField.setForeground(new java.awt.Color(244, 248, 252));
        empNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNumFieldActionPerformed(evt);
            }
        });

        genderField.setBackground(new java.awt.Color(72, 78, 96));
        genderField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderField.setForeground(new java.awt.Color(244, 248, 252));
        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });

        locationField.setBackground(new java.awt.Color(72, 78, 96));
        locationField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        locationField.setForeground(new java.awt.Color(244, 248, 252));
        locationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationFieldActionPerformed(evt);
            }
        });

        deductRateField.setBackground(new java.awt.Color(72, 78, 96));
        deductRateField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deductRateField.setForeground(new java.awt.Color(244, 248, 252));
        deductRateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductRateFieldActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(50, 54, 71));

        jLabel12.setBackground(new java.awt.Color(77, 78, 96));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(244, 248, 252));
        jLabel12.setText("Yearly Salary:");

        yearlySalaryField.setBackground(new java.awt.Color(72, 78, 96));
        yearlySalaryField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yearlySalaryField.setForeground(new java.awt.Color(244, 248, 252));
        yearlySalaryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlySalaryFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(yearlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(50, 54, 71));

        jLabel13.setBackground(new java.awt.Color(77, 78, 96));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(244, 248, 252));
        jLabel13.setText("Hourly Wage:");

        jLabel14.setBackground(new java.awt.Color(77, 78, 96));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(244, 248, 252));
        jLabel14.setText("Hours/Week:");

        jLabel15.setBackground(new java.awt.Color(77, 78, 96));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(244, 248, 252));
        jLabel15.setText("Weeks/Year:");

        hourlyWageField.setBackground(new java.awt.Color(72, 78, 96));
        hourlyWageField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hourlyWageField.setForeground(new java.awt.Color(244, 248, 252));
        hourlyWageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyWageFieldActionPerformed(evt);
            }
        });

        hoursWeekField.setBackground(new java.awt.Color(72, 78, 96));
        hoursWeekField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hoursWeekField.setForeground(new java.awt.Color(244, 248, 252));
        hoursWeekField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursWeekFieldActionPerformed(evt);
            }
        });

        weeksYearField.setBackground(new java.awt.Color(72, 78, 96));
        weeksYearField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        weeksYearField.setForeground(new java.awt.Color(244, 248, 252));
        weeksYearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeksYearFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursWeekField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weeksYearField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(hoursWeekField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)))
        );

        jButton2.setBackground(new java.awt.Color(77, 78, 96));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(244, 248, 252));
        jButton2.setText("Confirm");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(77, 78, 96));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(244, 248, 252));
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deductRateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deductRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)))
        );

        jPanel2.setVisible(false);
        jPanel3.setVisible(false);

        jButton3.setBackground(new java.awt.Color(77, 78, 96));
        jButton3.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(244, 248, 252));
        jButton3.setText("Search Existing Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(77, 78, 96));
        jButton4.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(244, 248, 252));
        jButton4.setText("Display All Employees");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(77, 78, 96));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 248, 252));
        jButton1.setText("New Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(50, 54, 71));
        jPanel4.setForeground(new java.awt.Color(72, 78, 96));

        jLabel16.setBackground(new java.awt.Color(77, 78, 96));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(244, 248, 252));
        jLabel16.setText("Search for Employee");

        jLabel17.setBackground(new java.awt.Color(77, 78, 96));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(244, 248, 252));
        jLabel17.setText("Enter Employee Number:");

        searchNumField.setBackground(new java.awt.Color(72, 78, 96));
        searchNumField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchNumField.setForeground(new java.awt.Color(244, 248, 252));

        jButton6.setBackground(new java.awt.Color(77, 78, 96));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(244, 248, 252));
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(77, 78, 96));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(244, 248, 252));
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addComponent(jLabel16)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(searchNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(50, 54, 71));
        jPanel6.setForeground(new java.awt.Color(72, 78, 96));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel25.setBackground(new java.awt.Color(77, 78, 96));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(244, 248, 252));
        jLabel25.setText("Search Results");

        searchFirstName.setBackground(new java.awt.Color(77, 78, 96));
        searchFirstName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchFirstName.setForeground(new java.awt.Color(244, 248, 252));
        searchFirstName.setText("First Name: ");

        searchLastName.setBackground(new java.awt.Color(77, 78, 96));
        searchLastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLastName.setForeground(new java.awt.Color(244, 248, 252));
        searchLastName.setText("Last Name: ");

        jLabel28.setBackground(new java.awt.Color(77, 78, 96));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(244, 248, 252));
        jLabel28.setText("Gender:");

        jLabel29.setBackground(new java.awt.Color(77, 78, 96));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(244, 248, 252));
        jLabel29.setText("Employee Number:");

        jLabel30.setBackground(new java.awt.Color(77, 78, 96));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(244, 248, 252));
        jLabel30.setText("Location:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setText(" ");

        jLabel32.setBackground(new java.awt.Color(77, 78, 96));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(244, 248, 252));
        jLabel32.setText("Deduction Rate:");

        jCheckBox3.setBackground(new java.awt.Color(77, 78, 96));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(244, 248, 252));
        jCheckBox3.setText("Full Time Employee");
        jCheckBox3.setEnabled(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jCheckBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox3KeyPressed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(77, 78, 96));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(244, 248, 252));
        jCheckBox4.setText("Part Time Employee");
        jCheckBox4.setEnabled(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jCheckBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox4KeyPressed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(50, 54, 71));

        searchYearlySalary.setBackground(new java.awt.Color(77, 78, 96));
        searchYearlySalary.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchYearlySalary.setForeground(new java.awt.Color(244, 248, 252));
        searchYearlySalary.setText("Yearly Salary:");

        searchYearlySalary1.setBackground(new java.awt.Color(77, 78, 96));
        searchYearlySalary1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchYearlySalary1.setForeground(new java.awt.Color(244, 248, 252));
        searchYearlySalary1.setText("0");

        editYearlySalary.setBackground(new java.awt.Color(72, 78, 96));
        editYearlySalary.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editYearlySalary.setForeground(new java.awt.Color(244, 248, 252));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(searchYearlySalary)
                .addGap(135, 135, 135)
                .addComponent(searchYearlySalary1)
                .addGap(39, 39, 39)
                .addComponent(editYearlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(searchYearlySalary)
                .addComponent(searchYearlySalary1)
                .addComponent(editYearlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        editYearlySalary.setVisible(false);

        jPanel8.setBackground(new java.awt.Color(50, 54, 71));

        searchHourlyWage.setBackground(new java.awt.Color(77, 78, 96));
        searchHourlyWage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchHourlyWage.setForeground(new java.awt.Color(244, 248, 252));
        searchHourlyWage.setText("Hourly Wage:");

        searchHoursWeek.setBackground(new java.awt.Color(77, 78, 96));
        searchHoursWeek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchHoursWeek.setForeground(new java.awt.Color(244, 248, 252));
        searchHoursWeek.setText("Hours/Week:");

        searchWeeksYear.setBackground(new java.awt.Color(77, 78, 96));
        searchWeeksYear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchWeeksYear.setForeground(new java.awt.Color(244, 248, 252));
        searchWeeksYear.setText("Weeks/Year:");

        searchHourlyWage1.setBackground(new java.awt.Color(77, 78, 96));
        searchHourlyWage1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchHourlyWage1.setForeground(new java.awt.Color(244, 248, 252));
        searchHourlyWage1.setText("0");

        searchHoursWeek1.setBackground(new java.awt.Color(77, 78, 96));
        searchHoursWeek1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchHoursWeek1.setForeground(new java.awt.Color(244, 248, 252));
        searchHoursWeek1.setText("0");

        searchWeeksYear1.setBackground(new java.awt.Color(77, 78, 96));
        searchWeeksYear1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchWeeksYear1.setForeground(new java.awt.Color(244, 248, 252));
        searchWeeksYear1.setText("0");

        editWeeksYear.setBackground(new java.awt.Color(72, 78, 96));
        editWeeksYear.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editWeeksYear.setForeground(new java.awt.Color(244, 248, 252));

        editHoursWeek.setBackground(new java.awt.Color(72, 78, 96));
        editHoursWeek.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editHoursWeek.setForeground(new java.awt.Color(244, 248, 252));

        editHourlyWage.setBackground(new java.awt.Color(72, 78, 96));
        editHourlyWage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editHourlyWage.setForeground(new java.awt.Color(244, 248, 252));
        editHourlyWage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHourlyWageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchWeeksYear)
                    .addComponent(searchHoursWeek)
                    .addComponent(searchHourlyWage))
                .addGap(136, 136, 136)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchHoursWeek1)
                    .addComponent(searchWeeksYear1)
                    .addComponent(searchHourlyWage1))
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editHoursWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editHourlyWage, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editWeeksYear, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchHourlyWage)
                    .addComponent(searchHourlyWage1)
                    .addComponent(editHourlyWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchHoursWeek)
                    .addComponent(searchHoursWeek1)
                    .addComponent(editHoursWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchWeeksYear)
                    .addComponent(searchWeeksYear1)
                    .addComponent(editWeeksYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editWeeksYear.setVisible(false);
        editHoursWeek.setVisible(false);
        editHourlyWage.setVisible(false);

        jButton8.setBackground(new java.awt.Color(77, 78, 96));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(244, 248, 252));
        jButton8.setText("OK");
        jButton2.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        searchGender.setBackground(new java.awt.Color(77, 78, 96));
        searchGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchGender.setForeground(new java.awt.Color(244, 248, 252));
        searchGender.setText("0");

        searchEmpNum.setBackground(new java.awt.Color(77, 78, 96));
        searchEmpNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchEmpNum.setForeground(new java.awt.Color(244, 248, 252));
        searchEmpNum.setText("0");

        searchLastName1.setBackground(new java.awt.Color(77, 78, 96));
        searchLastName1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLastName1.setForeground(new java.awt.Color(244, 248, 252));
        searchLastName1.setText("ln");

        searchFirstName1.setBackground(new java.awt.Color(77, 78, 96));
        searchFirstName1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchFirstName1.setForeground(new java.awt.Color(244, 248, 252));
        searchFirstName1.setText("fn");

        searchLocation.setBackground(new java.awt.Color(77, 78, 96));
        searchLocation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLocation.setForeground(new java.awt.Color(244, 248, 252));
        searchLocation.setText("0");

        searchDeductRate.setBackground(new java.awt.Color(77, 78, 96));
        searchDeductRate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchDeductRate.setForeground(new java.awt.Color(244, 248, 252));
        searchDeductRate.setText("0");

        jButton9.setBackground(new java.awt.Color(77, 78, 96));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(244, 248, 252));
        jButton9.setText("Delete Employee");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        editFirstName.setBackground(new java.awt.Color(72, 78, 96));
        editFirstName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editFirstName.setForeground(new java.awt.Color(244, 248, 252));
        editFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFirstNameActionPerformed(evt);
            }
        });

        editLastName.setBackground(new java.awt.Color(72, 78, 96));
        editLastName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editLastName.setForeground(new java.awt.Color(244, 248, 252));
        editLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLastNameActionPerformed(evt);
            }
        });

        editLocation.setBackground(new java.awt.Color(72, 78, 96));
        editLocation.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editLocation.setForeground(new java.awt.Color(244, 248, 252));

        editGender.setBackground(new java.awt.Color(72, 78, 96));
        editGender.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editGender.setForeground(new java.awt.Color(244, 248, 252));

        editDeductRate.setBackground(new java.awt.Color(72, 78, 96));
        editDeductRate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editDeductRate.setForeground(new java.awt.Color(244, 248, 252));

        editEmpNum.setBackground(new java.awt.Color(72, 78, 96));
        editEmpNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editEmpNum.setForeground(new java.awt.Color(244, 248, 252));

        jButton12.setBackground(new java.awt.Color(77, 78, 96));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(244, 248, 252));
        jButton12.setText("Edit Employee");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(77, 78, 96));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(244, 248, 252));
        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(77, 78, 96));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(244, 248, 252));
        jButton14.setText("Save");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(140, 140, 140)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14)))
                        .addGap(48, 48, 48))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31))
                            .addComponent(searchLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchLocation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchEmpNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchGender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchDeductRate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLastName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchFirstName1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editGender, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel31))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchFirstName)
                        .addGap(12, 12, 12)
                        .addComponent(searchLastName)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel30)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchFirstName1)
                            .addComponent(editFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchLastName1)
                            .addComponent(editLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchEmpNum)
                            .addComponent(editEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchGender)
                            .addComponent(editGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchLocation)
                            .addComponent(editLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchDeductRate)
                            .addComponent(editDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setVisible(false);
        jPanel7.setVisible(false);
        jPanel3.setVisible(false);
        jPanel8.setVisible(false);
        editFirstName.setVisible(false);
        editLastName.setVisible(false);
        editLocation.setVisible(false);
        editGender.setVisible(false);
        editDeductRate.setVisible(false);
        editEmpNum.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);

        jPanel5.setBackground(new java.awt.Color(50, 54, 71));
        jPanel5.setForeground(new java.awt.Color(72, 78, 96));

        jLabel18.setBackground(new java.awt.Color(77, 78, 96));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(244, 248, 252));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Delete ?");

        jButton10.setBackground(new java.awt.Color(77, 78, 96));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(244, 248, 252));
        jButton10.setText("No");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(77, 78, 96));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(244, 248, 252));
        jButton11.setText("Yes");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(46, 46, 46)
                        .addComponent(jButton11))
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton15.setBackground(new java.awt.Color(77, 78, 96));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(244, 248, 252));
        jButton15.setText("Save to File");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(77, 78, 96));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(244, 248, 252));
        jLabel19.setText("A Java Application by William King");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void reset() {
        firstNameField.setText("");
        lastNameField.setText("");
        empNumField.setText("");
        genderField.setText("");
        locationField.setText("");
        deductRateField.setText("");
        yearlySalaryField.setText("");
        hourlyWageField.setText("");
        hoursWeekField.setText("");
        weeksYearField.setText("");
        searchNumField.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jButton2.setEnabled(false);
        editFirstName.setText("");
        editLastName.setText("");
        editEmpNum.setText("");
        editGender.setText("");
        editLocation.setText("");
        editDeductRate.setText("");
        editYearlySalary.setText("");
        editHourlyWage.setText("");
        editHoursWeek.setText("");
        editWeeksYear.setText("");
        
        editFirstName.setVisible(false);
        editLastName.setVisible(false);
        editEmpNum.setVisible(false);
        editGender.setVisible(false);
        editLocation.setVisible(false);
        editDeductRate.setVisible(false);
        editYearlySalary.setVisible(false);
        editHourlyWage.setVisible(false);
        editHoursWeek.setVisible(false);
        editWeeksYear.setVisible(false);
        
        jCheckBox3.setEnabled(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setEnabled(false);
        jCheckBox4.setSelected(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();
        jPanel1.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        reset();
        jPanel4.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EmployeeListFrame displayEmployees = new EmployeeListFrame();
        displayEmployees.setVisible(true);
        try {
            employeeHashTable.writeFile();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel2.setVisible(true);
        jCheckBox2.setSelected(false);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jCheckBox1.setSelected(false);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void empNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNumFieldActionPerformed

    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFieldActionPerformed

    private void locationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationFieldActionPerformed

    private void deductRateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductRateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deductRateFieldActionPerformed

    private void yearlySalaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlySalaryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlySalaryFieldActionPerformed

    private void hourlyWageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyWageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyWageFieldActionPerformed

    private void hoursWeekFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursWeekFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursWeekFieldActionPerformed

    private void weeksYearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeksYearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weeksYearFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        int empNum =  Integer.parseInt(empNumField.getText());
        int locationNum = Integer.parseInt(locationField.getText());
        int genderNum = Integer.parseInt(genderField.getText());
        double deductNum = Double.parseDouble(deductRateField.getText());
        
        if(jCheckBox1.isSelected()) {
            double yearlySalary = Double.parseDouble(yearlySalaryField.getText());
            FullTimeEmployee fte = new FullTimeEmployee(empNum, firstName, lastName, locationNum, genderNum, deductNum, yearlySalary);
            employeeHashTable.addEmployee(fte);
        }
        else if(jCheckBox2.isSelected()) {
            double hourlyWage = Double.parseDouble(hourlyWageField.getText());
            double hoursWeek = Double.parseDouble(hoursWeekField.getText());
            double weeksYear = Double.parseDouble(weeksYearField.getText());
            PartTimeEmployee pte = new PartTimeEmployee(empNum, firstName, lastName, locationNum, genderNum, deductNum, hourlyWage, hoursWeek, weeksYear);
            employeeHashTable.addEmployee(pte);
        }
        employeeHashTable.displayContents();
        EmployeeAddedDialog confirmation = new EmployeeAddedDialog();
        confirmation.setVisible(true);
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        searchFirstName1.setVisible(true);
        searchLastName1.setVisible(true);
        searchEmpNum.setVisible(true);
        searchLocation.setVisible(true);
        searchGender.setVisible(true);
        searchDeductRate.setVisible(true);
        searchYearlySalary1.setVisible(true);
        searchHourlyWage1.setVisible(true);
        searchHoursWeek1.setVisible(true);
        searchWeeksYear1.setVisible(true);
        
        editFirstName.setVisible(false);
        editLastName.setVisible(false);
        editEmpNum.setVisible(false);
        editGender.setVisible(false);
        editLocation.setVisible(false);
        editDeductRate.setVisible(false);
        
        EmployeeInfo employeeResult = employeeHashTable.searchByEmployeeNumber(Integer.parseInt(searchNumField.getText()));
        searchFirstName1.setText(employeeResult.getFirstName());
        searchLastName1.setText(employeeResult.getLastName());
        searchEmpNum.setText(Integer.toString(employeeResult.getEmpNum()));
        searchGender.setText(Integer.toString(employeeResult.getSex()));
        searchLocation.setText(Integer.toString(employeeResult.getWorkLoc()));
        searchDeductRate.setText(Double.toString(employeeResult.getDeductRate()));
        
        if(employeeResult instanceof PartTimeEmployee) {
            PartTimeEmployee ptemp = (PartTimeEmployee) employeeResult;
            jPanel8.setVisible(true);
            jCheckBox4.setSelected(true);
            searchHourlyWage1.setText(Double.toString(ptemp.getHourlyWage()));
            searchHoursWeek1.setText(Double.toString(ptemp.getHoursPerWeek()));
            searchWeeksYear1.setText(Double.toString(ptemp.getWeeksPerYear()));  
        }
        else if(employeeResult instanceof FullTimeEmployee) {
            FullTimeEmployee ftemp = (FullTimeEmployee) employeeResult;
            jPanel7.setVisible(true);
            jCheckBox3.setSelected(true);
            searchYearlySalary1.setText(Double.toString(ftemp.calcAnnualGrossIncome()));
        }
        jPanel4.setVisible(false);
        jPanel6.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton12.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        jPanel7.setVisible(false);
        jPanel8.setVisible(true);
        jCheckBox3.setSelected(false);
        editHourlyWage.setVisible(true);
        editHoursWeek.setVisible(true);
        editWeeksYear.setVisible(true);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        jPanel7.setVisible(true);
        jPanel8.setVisible(false);
        jCheckBox4.setSelected(false);
        editYearlySalary.setVisible(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        employeeHashTable.removeEmployee(Integer.parseInt(searchEmpNum.getText()));
        reset();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jLabel18.setText("Delete " + searchFirstName1.getText() + " " + searchLastName1.getText() + "?");
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void editFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFirstNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_editFirstNameActionPerformed

    private void editHourlyWageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHourlyWageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editHourlyWageActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        EmployeeInfo employeeResult = employeeHashTable.searchByEmployeeNumber(Integer.parseInt(searchNumField.getText()));
        searchFirstName1.setVisible(false);
        searchLastName1.setVisible(false);
        searchEmpNum.setVisible(false);
        searchLocation.setVisible(false);
        searchGender.setVisible(false);
        searchDeductRate.setVisible(false);
        searchYearlySalary1.setVisible(false);
        searchHourlyWage1.setVisible(false);
        searchHoursWeek1.setVisible(false);
        searchWeeksYear1.setVisible(false);
        
        editFirstName.setVisible(true);
        editLastName.setVisible(true);
        editEmpNum.setVisible(true);
        editGender.setVisible(true);
        editLocation.setVisible(true);
        editDeductRate.setVisible(true);
        
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        

        if(employeeResult instanceof FullTimeEmployee) {
            editYearlySalary.setVisible(true);
        }
        else if(employeeResult instanceof PartTimeEmployee) {
            editHourlyWage.setVisible(true);
            editHoursWeek.setVisible(true);
            editWeeksYear.setVisible(true);
        }

        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        EmployeeInfo employeeResult = employeeHashTable.searchByEmployeeNumber(Integer.parseInt(searchNumField.getText()));
        
        employeeHashTable.removeEmployee(Integer.parseInt(searchEmpNum.getText()));
        
        String firstName = editFirstName.getText();
        String lastName = editLastName.getText();
        int empNum = Integer.parseInt(editEmpNum.getText());
        int gender = Integer.parseInt(editGender.getText());
        int workLoc = Integer.parseInt(editLocation.getText());
        double deductRate = Double.parseDouble(editDeductRate.getText());

        if(jCheckBox3.isSelected() == true) {
            double yearlySalary = Double.parseDouble(editYearlySalary.getText());
            FullTimeEmployee FTE = new FullTimeEmployee(empNum, firstName, lastName, gender, workLoc, deductRate, yearlySalary);
            employeeHashTable.addEmployee(FTE);
            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(empNum);
            System.out.println(yearlySalary);
        }
        else if(jCheckBox4.isSelected() == true) {
            double hourlyWage = Double.parseDouble(editHourlyWage.getText());
            double hoursWeek = Double.parseDouble(editHoursWeek.getText());
            double weeksYear = Double.parseDouble(editWeeksYear.getText());
            PartTimeEmployee PTE = new PartTimeEmployee(empNum, firstName, lastName, gender, workLoc, deductRate, hourlyWage, hoursWeek, weeksYear);
            employeeHashTable.addEmployee(PTE);
             System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(empNum);
            System.out.println(hourlyWage);
        }
       
        employeeHashTable.displayContents();
        reset();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jCheckBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3KeyPressed

    private void jCheckBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4KeyPressed

    private void editLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editLastNameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        employeeHashTable.readFile();
    }//GEN-LAST:event_formWindowOpened

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            // TODO add your handling code here:
            employeeHashTable.writeFile();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FontFormatException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deductRateField;
    private javax.swing.JTextField editDeductRate;
    private javax.swing.JTextField editEmpNum;
    private javax.swing.JTextField editFirstName;
    private javax.swing.JTextField editGender;
    private javax.swing.JTextField editHourlyWage;
    private javax.swing.JTextField editHoursWeek;
    private javax.swing.JTextField editLastName;
    private javax.swing.JTextField editLocation;
    private javax.swing.JTextField editWeeksYear;
    private javax.swing.JTextField editYearlySalary;
    private javax.swing.JTextField empNumField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField hourlyWageField;
    private javax.swing.JTextField hoursWeekField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel searchDeductRate;
    private javax.swing.JLabel searchEmpNum;
    private javax.swing.JLabel searchFirstName;
    private javax.swing.JLabel searchFirstName1;
    private javax.swing.JLabel searchGender;
    private javax.swing.JLabel searchHourlyWage;
    private javax.swing.JLabel searchHourlyWage1;
    private javax.swing.JLabel searchHoursWeek;
    private javax.swing.JLabel searchHoursWeek1;
    private javax.swing.JLabel searchLastName;
    private javax.swing.JLabel searchLastName1;
    private javax.swing.JLabel searchLocation;
    private javax.swing.JTextField searchNumField;
    private javax.swing.JLabel searchWeeksYear;
    private javax.swing.JLabel searchWeeksYear1;
    private javax.swing.JLabel searchYearlySalary;
    private javax.swing.JLabel searchYearlySalary1;
    private javax.swing.JTextField weeksYearField;
    private javax.swing.JTextField yearlySalaryField;
    // End of variables declaration//GEN-END:variables
}
