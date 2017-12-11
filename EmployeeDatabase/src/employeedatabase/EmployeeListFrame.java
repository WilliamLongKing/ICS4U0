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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author willi
 */
public class EmployeeListFrame extends javax.swing.JFrame {
    /**
     * Creates new form EmployeeListFrame
     */
    public EmployeeListFrame() throws FontFormatException, IOException {
        initComponents();
        getContentPane().setBackground(new Color(48, 55, 69));
        Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")).deriveFont(62f);
        Font sectionFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")).deriveFont(48f);
        Font headerFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Oswald\\Oswald-Regular.ttf")).deriveFont(26f);
        Font bodyFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Raleway\\Raleway-Regular.ttf")).deriveFont(28f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\julius-sans-one\\JuliusSansOne-Regular.ttf")));
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Oswald\\Oswald-Regular.ttf")));
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Raleway\\Raleway-Regular.ttf")));

        jLabel1.setFont(titleFont);
        jButton1.setFont(headerFont);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 1000));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 248, 252));
        jLabel1.setText("List of Employees");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Employee #", "First Name", "Last Name", "Location", "Gender", "Deduction Rate", "Yearly Salary (F)", "Hourly Wage (P)", "Hours/Week (P)", "Weeks/Year (P)"
            }));
            jTable1.setGridColor(new java.awt.Color(244, 248, 252));
            jScrollPane1.setViewportView(jTable1);

            jButton1.setBackground(new java.awt.Color(77, 78, 96));
            jButton1.setForeground(new java.awt.Color(244, 248, 252));
            jButton1.setText("Close");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmployeeListFrame().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(EmployeeListFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeListFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void makeTable(MyHashTable hashTable) throws IOException {
        List<EmployeeInfo> employees = hashTable.writeFile();
        try {
            hashTable.writeFile();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numRows = hashTable.getNumEmp();
        hashTable.displayContents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Type", "Employee #", "First Name", "Last Name", "Location", "Gender", "Deduction Rate", "Yearly Salary (F)", "Hourly Wage (P)", "Hours/Week (P)", "Weeks/Year (P)"
            }));
        for(int i = 0; i < numRows; i++) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            EmployeeInfo employeeAdded = employees.get(i);
            if(employeeAdded instanceof FullTimeEmployee) {
                FullTimeEmployee FTE = (FullTimeEmployee) employeeAdded;
                double yearlySalary = FTE.calcAnnualGrossIncome();
                int empNum = employeeAdded.getEmpNum();
                String firstName = employeeAdded.getFirstName();
                String lastName = employeeAdded.getLastName();
                int gender = employeeAdded.getSex();
                int location = employeeAdded.getWorkLoc();
                double deductRate = employeeAdded.getDeductRate();
                model.addRow(new Object[] {"F", empNum, firstName, lastName, location, gender, deductRate, yearlySalary, "N/A", "N/A", "N/A"});
            }
            else if(employeeAdded instanceof PartTimeEmployee) {
                int empNum = employeeAdded.getEmpNum();
                String firstName = employeeAdded.getFirstName();
                String lastName = employeeAdded.getLastName();
                int gender = employeeAdded.getSex();
                int location = employeeAdded.getWorkLoc();
                double deductRate = employeeAdded.getDeductRate();
                PartTimeEmployee PTE = (PartTimeEmployee) employeeAdded;
                double hourlyWage = PTE.getHourlyWage();
                double hoursWeek = PTE.getHoursPerWeek();
                double weeksYear = PTE.getWeeksPerYear();
                model.addRow(new Object[] {"P", empNum, firstName, lastName, location, gender, deductRate, "N/A", hourlyWage, hoursWeek, weeksYear});                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
