/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fops;

import db.values.*;
import javax.swing.DefaultComboBoxModel;
import db.*;
import javax.swing.JFrame;
import util.*;



/**
 *
 * @author brennan
 */
public class addFacultyUI extends javax.swing.JFrame {
    
private FopsDB db;

    /**
     * Creates new form addFacultyUI
     */
    public addFacultyUI(String title, FopsDB db){
        super(title);
        this.db = db;
        initComponents();
        maleRadio.setActionCommand("Male");
        femaleRadio.setActionCommand("Female");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox5 = new javax.swing.JComboBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        genderGroup = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jCheckBox1 = new javax.swing.JCheckBox();
        nameLabel = new javax.swing.JLabel();
        rankLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        middleNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        rankComboBox = new javax.swing.JComboBox();
        hasTenureCheckBox = new javax.swing.JCheckBox();
        monthComboBox = new javax.swing.JComboBox();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        discLabel = new javax.swing.JLabel();
        collegeComboBox = new javax.swing.JComboBox();
        discComboBox = new javax.swing.JComboBox();
        yearTextField = new javax.swing.JTextField();
        createFacultyMember = new javax.swing.JButton();

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        rankLabel.setText("Rank");

        monthLabel.setText("Month Enstated");

        yearLabel.setText("Year Enstated");

        firstNameText.setText("First");

        middleNameText.setText("Mi");
        middleNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameTextActionPerformed(evt);
            }
        });

        lastNameText.setText("Last");

        rankComboBox.setEditable(true);
        rankComboBox.setModel(new DefaultComboBoxModel(Rank.values()));
        rankComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankComboBoxActionPerformed(evt);
            }
        });

        hasTenureCheckBox.setText("Has Tenure");

        monthComboBox.setEditable(true);
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        genderGroup.add(femaleRadio);
        femaleRadio.setSelected(true);
        femaleRadio.setText("Female");

        genderGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender");

        collegeLabel.setText("College");

        discLabel.setText("Discipline");

        collegeComboBox.setEditable(true);
        collegeComboBox.setModel(new DefaultComboBoxModel(College.values()));

        discComboBox.setEditable(true);
        discComboBox.setModel(new DefaultComboBoxModel(Discipline.values()));

        yearTextField.setText("2013");
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        createFacultyMember.setText("Create Faculty Member");
        createFacultyMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFacultyMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(monthLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(yearLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(femaleRadio)
                                            .addComponent(maleRadio))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(nameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(discLabel)
                                    .addComponent(collegeLabel)
                                    .addComponent(rankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(lastNameText))
                                    .addComponent(rankComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(collegeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hasTenureCheckBox)
                                            .addComponent(discComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(createFacultyMember)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel)
                    .addComponent(rankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasTenureCheckBox)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(collegeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collegeLabel))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(discLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femaleRadio)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monthLabel)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearLabel)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(createFacultyMember))
                    .addComponent(maleRadio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void middleNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameTextActionPerformed

    private void rankComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankComboBoxActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void createFacultyMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFacultyMemberActionPerformed
        String name = firstNameText.getText() +" "+  middleNameText.getText()
                +" "+ lastNameText.getText();
        Rank rank = (Rank) rankComboBox.getSelectedItem();
        boolean hasTenure = hasTenureCheckBox.isSelected();
        College college = (College) collegeComboBox.getSelectedItem();
        Discipline disc = (Discipline) discComboBox.getSelectedItem();
        String gend = genderGroup.getSelection().getActionCommand();
        Gender gender = gend.equals("Male") ? Gender.MALE : Gender.FEMALE;
        int month = monthComboBox.getSelectedIndex() + 1;
        int year =  Integer.parseInt(yearTextField.getText());
        db.addFaculty(new Staff(name,gender,college,disc,rank,
                new MonthYear(month,year),hasTenure));
       
        System.out.println(db.toJson());
        dispose();  
        
    }//GEN-LAST:event_createFacultyMemberActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox collegeComboBox;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JButton createFacultyMember;
    private javax.swing.JComboBox discComboBox;
    private javax.swing.JLabel discLabel;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameText;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JCheckBox hasTenureCheckBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField middleNameText;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox rankComboBox;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
