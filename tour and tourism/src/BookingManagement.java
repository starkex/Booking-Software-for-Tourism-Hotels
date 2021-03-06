
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author h
 */
public class BookingManagement extends javax.swing.JFrame {

    /**
     * Creates new form BookingManagement
     */
    public BookingManagement() {
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

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("BookID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("BookNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("No.of Days");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Booked From");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Hotel Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Cancel Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 180, 30));

        jButton7.setBackground(new java.awt.Color(255, 153, 153));
        jButton7.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 78, 30));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 200, 29));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 200, 28));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 200, 29));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 200, 30));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 200, 29));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Booked By");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, 30));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 200, 30));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 200, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Payment Medium");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 200, 30));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 200, 30));
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 200, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Checkout Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-4-xl.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Guestroom-Double-HD.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bi=t1.getText();
        String bn=t2.getText();
        String nd=t3.getText();
        String bfr=t4.getText();
        String hn=t5.getText();
        String bb=t6.getText();
        String pn=t7.getText();
        String cd=t8.getText();
        String pm=t9.getText();
        
                 
        if(bi.isEmpty())
        JOptionPane.showMessageDialog(this,"Book ID not Entered");
        else if(bn.isEmpty())
        JOptionPane.showMessageDialog(this,"Book No. not Entered");
        else if(nd.isEmpty())
        JOptionPane.showMessageDialog(this,"Days not Entered");
        else if(bfr.isEmpty())
        JOptionPane.showMessageDialog(this,"Place from Where Room is Booked is not Entered");
         else if(hn.isEmpty())
        JOptionPane.showMessageDialog(this,"Hotel Name not Entered");
        else if(bb.isEmpty())
        JOptionPane.showMessageDialog(this,"Name of the person who Booked the Room is not Entered");
        else if(pn.isEmpty())
        JOptionPane.showMessageDialog(this,"mobile no. not Entered");
         else if(cd.isEmpty())
        JOptionPane.showMessageDialog(this,"Checkout Date not Entered");
        else if(pm.isEmpty())
        JOptionPane.showMessageDialog(this,"Pls define Your payment medium");
        else
        {
         try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/tourandtourism","root","999");
            Statement stmt=(Statement) con.createStatement();
            String query="INSERT INTO bro VALUES ('"+bi+"','"+bn+"','"+nd+"','"+bfr+"','"+hn+"','"+bb+"','"+pn+"','"+cd+"','"+pm+"');";
           stmt.executeUpdate(query);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
            
        }
         JOptionPane.showMessageDialog(this,"Your Room Booking is Successfully Cancelled");
        this.dispose();
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
         Home h = new Home();
         h.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
