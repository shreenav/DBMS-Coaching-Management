import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * due.java
 *
 * Created on Dec 2, 2015, 3:02:30 PM
 */

/**
 *
 * @author student
 */
public class due extends javax.swing.JFrame {

    /** Creates new form due */
    public due() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Scholar No.", "Class", "Installment_No.", "Installment Date", "Installment Amount"
            }
        ));
        jScrollPane1.setViewportView(tb1);
        tb1.getColumnModel().getColumn(5).setPreferredWidth(100);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 240));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Aparajita", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/000-1215881616550.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        jMenu1.setText("Class 9");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu1MouseReleased(evt);
            }
        });

        jMenuItem2.setText("Installment 1");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Installment 2");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setText("Installment 3");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Installment 4");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Class 10");

        jMenuItem17.setText("Installment 1");
        jMenuItem17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem17MouseReleased(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("Installment 2");
        jMenuItem18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem18MouseReleased(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setText("Installment 3");
        jMenuItem19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem19MouseReleased(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setText("Installment 4");
        jMenuItem20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem20MouseReleased(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Class 11");

        jMenuItem21.setText("Installment 1");
        jMenuItem21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem21MouseReleased(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuItem22.setText("Installment 2");
        jMenuItem22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem22MouseReleased(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem23.setText("Installment 3");
        jMenuItem23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem23MouseReleased(evt);
            }
        });
        jMenu7.add(jMenuItem23);

        jMenuItem24.setText("Installment 4");
        jMenuItem24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem24MouseReleased(evt);
            }
        });
        jMenu7.add(jMenuItem24);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Class 12");

        jMenuItem5.setText("Installment 1");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Installment 2");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Installment 3");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Installment 4");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empty Table");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Back");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu5MouseReleased(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseReleased
               // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased

DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '9' and installment_no ='1' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{
    String c=rs.getString("scholar_no");

 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;
}
if(x==0)
    JOptionPane.showMessageDialog(null,"No Such Record");



}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}








        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseReleased
   // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseReleased

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem17MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '10' and installment_no ='1' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");


  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}
if(x==0)
    JOptionPane.showMessageDialog(null,"No Such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17MouseReleased

    private void jMenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '9' and installment_no ='2' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}
if(x==0)
    JOptionPane.showMessageDialog(null,"No Such Record.");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '9' and installment_no ='3' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '9' and installment_no ='4' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem18MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '10' and installment_no ='2' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18MouseReleased

    private void jMenuItem19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem19MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '10' and installment_no ='3' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19MouseReleased

    private void jMenuItem20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem20MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '10' and installment_no ='4' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20MouseReleased

    private void jMenuItem21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem21MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '11' and installment_no ='1' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}

if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21MouseReleased

    private void jMenuItem22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem22MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '11' and installment_no ='2' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22MouseReleased

    private void jMenuItem23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem23MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '11' and installment_no ='3' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);

int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23MouseReleased

    private void jMenuItem24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem24MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '11' and installment_no ='4' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24MouseReleased

    private void jMenuItem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '12' and installment_no ='1' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5MouseReleased

    private void jMenuItem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '12' and installment_no ='2' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6MouseReleased

    private void jMenuItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '12' and installment_no ='3' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7MouseReleased

    private void jMenuItem8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseReleased
DefaultTableModel model=(DefaultTableModel)tb1.getModel();
try
{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/test","root","Nidhi98299");
Statement st =con.createStatement();
String q= "Select * from fees where class = '12' and installment_no ='4' and installment_date<curdate() and paid='no';";
ResultSet rs = st.executeQuery(q);
int x=0;
while(rs.next())
{String c=rs.getString("scholar_no");
 String b=rs.getString("Student_name");

 String d=rs.getString("class");
 String e=rs.getString("installment_no");
  String f=rs.getString("installment_date");
   String g=rs.getString("installment_amount");
 System.out.println(c);

  model.addRow(new Object[] {b,c,d,e,f,g} );
x=x+1;


}


if(x==0)
    JOptionPane.showMessageDialog(null,"No such Record");
}


catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8MouseReleased

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
 this.dispose();
        new adminlogin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
 int ans=JOptionPane.showConfirmDialog(null,"Do You Really Want To Empty The Table ? ");
        if (ans==JOptionPane.YES_OPTION) {

            DefaultTableModel model =(DefaultTableModel)tb1.getModel();
            int r=model.getRowCount();
            if(r>0) {
                int  i=0;
                while(i<r) {
                    model.removeRow(0);
                    i++;
                }

            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new due().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

}
