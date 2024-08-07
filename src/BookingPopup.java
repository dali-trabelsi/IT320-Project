
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mukkun
 */
public class BookingPopup extends javax.swing.JFrame {

    /**
     * Creates new form BookingPopup
     */
    ClientArea parent;
    Venue v;
    Client client;
    Booking b;
    Boolean editing = false;

    public BookingPopup(ClientArea cA, String uuid, Client c) {
        initComponents();
        parent = cA;
        parent.setEnabled(false);
        client = c;
        v = parent.Venues.get(uuid);
        System.out.println(v.toString());
        siteName.setText(v.getSiteName());
        capacity.setText(v.getCapacity() + " person.");
    }

    public BookingPopup(ClientArea cA, String uuid, Client c, Boolean edit) {
        initComponents();
        parent = cA;
        parent.setEnabled(false);
        client = c;
        b = parent.Bookings.get(uuid);
        v = b.getVenue();
        System.out.println(v.toString());
        siteName.setText(v.getSiteName());
        capacity.setText(v.getCapacity() + " person.");
        eName.setText(b.getEventName());
        ngsts.setText(String.valueOf(b.getNoGuests()));
        sD.setText(Utils.dateToStr(b.getStartDate()));
        eD.setText(Utils.dateToStr(b.getEndDate()));
        jButton1.setText("Edit booking");
        editing = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        siteName = new javax.swing.JLabel();
        capacity = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        eName = new javax.swing.JTextField();
        ngsts = new javax.swing.JTextField();
        sD = new javax.swing.JTextField();
        eD = new javax.swing.JTextField();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        title.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Book Event Venue");
        title.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Site Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Capacity:");

        siteName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        siteName.setForeground(new java.awt.Color(0, 0, 102));
        siteName.setText(" ");

        capacity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        capacity.setForeground(new java.awt.Color(0, 0, 102));
        capacity.setText(" ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Start Date:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Event Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("End Date:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("N° of guests:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("BOOK NOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ngsts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        eD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        err.setForeground(new java.awt.Color(204, 0, 51));
        err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngsts, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sD, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eD, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(siteName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(siteName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(capacity))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ngsts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        err.setText("");
        if (eName.getText().trim().length() == 0) {
            err.setText("Enter Event Name");
        } else if (ngsts.getText().trim().length() == 0) {
            err.setText("Enter number of guests ");
        } else if (!Utils.isStringInt(ngsts.getText().trim())) {
            err.setText("Number of guests must be a number.");
        } else if (Integer.parseInt(ngsts.getText()) < 10) {
            err.setText("The minimum number of guests is 10.");
        } else if (Integer.parseInt(ngsts.getText()) > v.getCapacity()) {
            err.setText("Number of guests exceeded capacity!");
        } else if (sD.getText().trim().length() == 0) {
            err.setText("Enter start date");
        } else if (!Utils.isValidDateStr(sD.getText().trim())) {
            err.setText("Invalid start date Must be of the format: \"dd-mm-yyyy\"");
        } else if (eD.getText().trim().length() == 0) {
            err.setText("Enter end date");
        } else if (!Utils.isValidDateStr(eD.getText().trim())) {
            err.setText("Invalid end date. Must be of the format: \"dd-mm-yyyy\"");
        } else {
            try {
                Date sDate = Utils.dateFromStr(sD.getText());
                Date eDate = Utils.dateFromStr(eD.getText());
                if (sDate.after(eDate)) {
                    err.setText("End date must be after or the same as start date.");
                } else {
                    if (editing) {
                        edit(sDate, eDate);
                    } else {
                        add(sDate, eDate);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void add(Date sDate, Date eDate) throws Exception {
        PreparedStatement stmt = parent.conn.prepareStatement("INSERT INTO bookings VALUES (?,?,?,?,?,?,?,?)");
        String uuid = UUID.randomUUID().toString();
        stmt.setString(1, uuid);
        stmt.setString(2, client.getUsername());
        stmt.setString(3, v.getUuid());
        stmt.setString(4, eName.getText());
        stmt.setInt(5, Integer.parseInt(ngsts.getText()));
        stmt.setDate(6, sDate);
        stmt.setDate(7, eDate);
        stmt.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Event was Booked!");
        this.setVisible(false);
        Booking b = new Booking(uuid, client.getUsername(), v,
                eName.getText(), Integer.parseInt(ngsts.getText()),
                sDate, eDate, new Timestamp(System.currentTimeMillis()));
        parent.Bookings.add(b);
        parent.addBookingToGui(b);
        parent.setEnabled(true);
        parent.setState(JFrame.ICONIFIED);
        parent.setState(JFrame.NORMAL);
    }

    public void edit(Date sDate, Date eDate) throws Exception {
        PreparedStatement stmt = parent.conn.prepareStatement("UPDATE `bookings` SET `eventName`=?,"
                + "`noGuests`=?,`startDate`=?,`endDate`=? WHERE uuid=?");
        stmt.setString(1, eName.getText());
        stmt.setInt(2, Integer.parseInt(ngsts.getText()));
        stmt.setDate(3, sDate);
        stmt.setDate(4, eDate);
        stmt.setString(5, b.getUuid());
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Booking was updated!");
        Booking bk = parent.Bookings.get(b.getUuid());
        bk.edit(b.getUuid(), client.getUsername(), v, eName.getText(),
                Integer.parseInt(ngsts.getText()), sDate, eDate, b.getAddedOn());
        parent.editBookingInGui(bk);
        parent.setEnabled(true);
        parent.setState(JFrame.ICONIFIED);
        parent.setState(JFrame.NORMAL);
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        parent.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capacity;
    private javax.swing.JTextField eD;
    private javax.swing.JTextField eName;
    private javax.swing.JLabel err;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ngsts;
    private javax.swing.JTextField sD;
    private javax.swing.JLabel siteName;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
