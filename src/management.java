import java.sql.*;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * management.java
 *
 * Created on Dec 2, 2015, 3:01:36 PM
 */

/**
 *
 * @author student
 */
public class management extends javax.swing.JFrame {

    /** Creates new form management */
    public management() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 30, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHREENAV\\Downloads\\images (1).jpg")); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 60, 60));

        jButton3.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 90, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 90, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Aparajita", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (2).jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String a= t1.getText();
String b= new String(t2.getPassword());
try {
     Class.forName("java.sql.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
     Statement st =con.createStatement();
     String q= " select password from administrator where login_id ='"+a+"' ;";
     String z= "select login_id from administrator where login_id ='"+a+"'  ; " ;
ResultSet qw = st.executeQuery(z);
if (qw.next())
{String d =qw.getString("login_id");
 if (d.compareTo("")==0)
 
     JOptionPane.showMessageDialog(null,"check password");

}
else JOptionPane.showMessageDialog(null,"invalid id");


ResultSet rs = st.executeQuery(q);
if (rs.next())
{String c =rs.getString("password");
 if (c.compareTo(b)==0)
 { this.dispose();
   new adminlogin().setVisible(true);
 }
 else
     JOptionPane.showMessageDialog(null,"check password");

}


 }
  catch(Exception e){
   JOptionPane.showMessageDialog(null,e.getMessage());

  }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t1.setText("");t2.setText("");       // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new home().setVisible(true);         // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables

}
