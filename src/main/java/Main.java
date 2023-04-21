//quang bình nhật oop
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JButton;
import org.openide.awt.DropDownButtonFactory;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ducbinh
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        settingMenu = new javax.swing.JPopupMenu();
        questionMenuItem = new javax.swing.JMenuItem();
        categoryMenuItem = new javax.swing.JMenuItem();
        importMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        page = new javax.swing.JPanel();
        itLabel = new javax.swing.JLabel();
        pageLink = new javax.swing.JLabel();
        turnEditingButton = new javax.swing.JButton();
        settingButton = DropDownButtonFactory.createDropDownButton(settingMenuButtonIcon, settingMenu);
        ;
        content = new javax.swing.JPanel();
        listQuiz = new gui.component.ListQuiz();
        listQuestion = new gui.component.Content();

        settingMenu.setBackground(new java.awt.Color(7, 116, 163));
        settingMenu.setForeground(new java.awt.Color(7, 116, 163));

        questionMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(questionMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.questionMenuItem.text")); // NOI18N
        questionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(questionMenuItem);

        categoryMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(categoryMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.categoryMenuItem.text")); // NOI18N
        categoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(categoryMenuItem);

        importMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(importMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.importMenuItem.text")); // NOI18N
        importMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(importMenuItem);

        exportMenuItem.setBackground(new java.awt.Color(7, 116, 163));
        org.openide.awt.Mnemonics.setLocalizedText(exportMenuItem, org.openide.util.NbBundle.getMessage(Main.class, "Main.exportMenuItem.text")); // NOI18N
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        settingMenu.add(exportMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        topbar.setBackground(new java.awt.Color(7, 116, 163));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton1.text")); // NOI18N

        jButton2.setBackground(new java.awt.Color(7, 116, 163));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no-profile.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(Main.class, "Main.jButton2.text")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setIconTextGap(10);

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        page.setPreferredSize(new java.awt.Dimension(172, 115));

        itLabel.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        itLabel.setForeground(new java.awt.Color(192, 36, 36));
        org.openide.awt.Mnemonics.setLocalizedText(itLabel, org.openide.util.NbBundle.getMessage(Main.class, "Main.itLabel.text")); // NOI18N

        pageLink.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(pageLink, org.openide.util.NbBundle.getMessage(Main.class, "Main.pageLink.text")); // NOI18N

        turnEditingButton.setBackground(new java.awt.Color(7, 116, 163));
        turnEditingButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        turnEditingButton.setForeground(new java.awt.Color(255, 255, 255));
        org.openide.awt.Mnemonics.setLocalizedText(turnEditingButton, org.openide.util.NbBundle.getMessage(Main.class, "Main.turnEditingButton.text")); // NOI18N

        settingButton.setBorder(null);
        settingButton.setContentAreaFilled(false);
        settingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageLayout = new javax.swing.GroupLayout(page);
        page.setLayout(pageLayout);
        pageLayout.setHorizontalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageLayout.createSequentialGroup()
                        .addComponent(itLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingButton))
                    .addGroup(pageLayout.createSequentialGroup()
                        .addComponent(pageLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turnEditingButton)))
                .addGap(26, 26, 26))
        );
        pageLayout.setVerticalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itLabel)
                    .addComponent(settingButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageLink)
                    .addComponent(turnEditingButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        content.setLayout(new java.awt.CardLayout());
        content.add(listQuiz, "listQuizCard");
        content.add(listQuestion, "listQuestionCard");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, 1577, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void questionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionMenuItemActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if (source instanceof JMenuItem) {
            JMenuItem clickedMenuItem = (JMenuItem) source;
            String menuText = clickedMenuItem.getText();
            if ("Question".equals(menuText)) {
                CardLayout contentLayout = (CardLayout)content.getLayout();
                contentLayout.show(content, "listQuestionCard");
            }

        }
    }//GEN-LAST:event_questionMenuItemActionPerformed

    private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingButtonActionPerformed

    private void categoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryMenuItemActionPerformed

    private void importMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importMenuItemActionPerformed

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    private ImageIcon settingMenuButtonIcon = new ImageIcon(getClass().getResource("/images/settings.png"));

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JPanel content;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JLabel itLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private gui.component.Content listQuestion;
    private gui.component.ListQuiz listQuiz;
    private javax.swing.JPanel page;
    private javax.swing.JLabel pageLink;
    private javax.swing.JMenuItem questionMenuItem;
    private javax.swing.JButton settingButton;
    private javax.swing.JPopupMenu settingMenu;
    private javax.swing.JPanel topbar;
    private javax.swing.JButton turnEditingButton;
    // End of variables declaration//GEN-END:variables
}
