/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fops;
import db.values.*;
import javax.swing.DefaultComboBoxModel;
import db.*;
import db.rules.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author brennan
 */
public class AddCommUI extends javax.swing.JFrame {
    private FopsDB db;
    /*
     * Creates new form AddCommUI
     */
    public AddCommUI(String title, FopsDB db){
        super(title);
        this.db = db;
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setVisible(true);
    }
    public AddCommUI() {
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

        jToolBar1 = new javax.swing.JToolBar();
        nameLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        committeeTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox();
        minRankCheckBox = new javax.swing.JCheckBox();
        yearsCheckBox = new javax.swing.JCheckBox();
        atLargeCheckBox = new javax.swing.JCheckBox();
        repsCheckBox = new javax.swing.JCheckBox();
        minRankComboBox = new javax.swing.JComboBox();
        yearsComboBox = new javax.swing.JComboBox();
        atLargeComboBox = new javax.swing.JComboBox();
        repsComboBox = new javax.swing.JComboBox();
        createCommittee = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        typeLabel.setText("Type");

        committeeTextField.setText("Committe Name");

        typeComboBox.setEditable(true);
        typeComboBox.setModel(new DefaultComboBoxModel(CommitteeType.values()));

        minRankCheckBox.setText("Minimum Rank");

        yearsCheckBox.setText("Years at UMW");

        atLargeCheckBox.setText("At-Large Slots");

        repsCheckBox.setText("Reps Per College");

        minRankComboBox.setEditable(true);
        minRankComboBox.setModel(new DefaultComboBoxModel(Rank.values()));

        yearsComboBox.setEditable(true);
        yearsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10+" }));

        atLargeComboBox.setEditable(true);
        atLargeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        repsComboBox.setEditable(true);
        repsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        createCommittee.setText("Create Committee");
        createCommittee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCommitteeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(committeeTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minRankCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(minRankComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(repsCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(repsComboBox, 0, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearsCheckBox)
                            .addComponent(atLargeCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atLargeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(createCommittee, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(committeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minRankCheckBox)
                    .addComponent(minRankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearsCheckBox)
                    .addComponent(yearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atLargeCheckBox)
                    .addComponent(atLargeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repsCheckBox)
                    .addComponent(repsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(createCommittee)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCommitteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCommitteeActionPerformed
        String name = committeeTextField.getText();
        CommitteeType type = (CommitteeType) typeComboBox.getSelectedItem();
        List<Rule> rules = new ArrayList<>();
        if(minRankCheckBox.isSelected()){
            rules.add(new MinimumRankRule(
                    (Rank) minRankComboBox.getSelectedItem()));
        }
        if(yearsCheckBox.isSelected()){
            rules.add(new MinimumYearsServiceRule(
                    yearsComboBox.getSelectedIndex() + 1));
        }
        if(atLargeCheckBox.isSelected()){
            rules.add(new NumberAtLargeMembersRule(
                    atLargeComboBox.getSelectedIndex() + 1));
        }
        if(repsCheckBox.isSelected()){
            rules.add(new NumberRepresentativesRule(
                    repsComboBox.getSelectedIndex() + 1));
        }
        rules.add(new MaxYearsOnCommittee(3));
        rules.add(new MaxCommitteesPerFaculty());
        db.addCommittee(new Committee(name,type,rules));
        dispose();
        
        
    }//GEN-LAST:event_createCommitteeActionPerformed

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
            java.util.logging.Logger.getLogger(AddCommUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCommUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCommUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCommUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new AddCommUI().setVisible(true);
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox atLargeCheckBox;
    private javax.swing.JComboBox atLargeComboBox;
    private javax.swing.JTextField committeeTextField;
    private javax.swing.JButton createCommittee;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JCheckBox minRankCheckBox;
    private javax.swing.JComboBox minRankComboBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox repsCheckBox;
    private javax.swing.JComboBox repsComboBox;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JCheckBox yearsCheckBox;
    private javax.swing.JComboBox yearsComboBox;
    // End of variables declaration//GEN-END:variables
}