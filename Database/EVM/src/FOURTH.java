


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MUJ
 */
public class FOURTH extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    public static String x;
    FOURTH(String s)
    {
        x=s;
    }

    /**
     * Creates new form FOURTH
     */
    public FOURTH() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","root");
        }
        catch(Exception ex)
                {
                    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BJP = new javax.swing.JButton();
        congress = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 1, 5, 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("BJP");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("CONGRESS");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("AAM AADMI PARTY");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("BSP");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("JDU");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("SP");
        jPanel1.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("NCP");
        jPanel1.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("NOTA");
        jPanel1.add(jLabel8);

        jPanel2.setLayout(new java.awt.GridLayout(8, 1, 5, 5));

        BJP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/bjp.jpg"))); // NOI18N
        BJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJPActionPerformed(evt);
            }
        });
        jPanel2.add(BJP);

        congress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/congress.jpg"))); // NOI18N
        congress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congressActionPerformed(evt);
            }
        });
        jPanel2.add(congress);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aap - Copy.jpg"))); // NOI18N
        jPanel2.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/bsp.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/JDU - Copy.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/SP - Copy.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/NCP - Copy.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evm/nota.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BJPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJPActionPerformed
      String party="BJP";
      String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }
      
    }//GEN-LAST:event_BJPActionPerformed

    private void congressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congressActionPerformed
        // TODO add your handling code here: String party="BJP";
    String party="CONGRESS";
    String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }
    }//GEN-LAST:event_congressActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here: String party="CONGRESS";
    String party="AAP";
    String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String party="SP";
     String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code her   String party="BSP";
    String party="JDU";
            String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }  // TODO add your handling code here:e:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         String party="NCP";
     String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }  // TODO add your handling code here:/ TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          String party="NOTA";
     String sql="insert into info values(?,?)";
      try{
      ps=con.prepareStatement(sql);
      ps.setString(1,x);
      ps.setString(2,party);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Thank you for voting.");
      this.setVisible(false);
      
      }
      catch(Exception ex)
      {
          
      }  // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FOURTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOURTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOURTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOURTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOURTH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BJP;
    private javax.swing.JButton congress;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
