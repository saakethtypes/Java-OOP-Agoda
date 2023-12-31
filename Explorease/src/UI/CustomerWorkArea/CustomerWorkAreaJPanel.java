/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Customer.Customer;
import Business.Platform;
import UI.OrgManagerWorkArea.AirlineManagerProductWorkArea;
import UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author forumkaria
 */
public
        class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    Platform platform;
    UserAccount ua;
    JPanel container;
    Customer cus;
    
    public CustomerWorkAreaJPanel(JPanel container, Platform platform, UserAccount ua) {
        initComponents();
        this.setVisible(true);
        
        this.platform = platform; 
        this.container = container;
        this.ua = ua;
        this.cus = this.platform.getCustomerDirectory().findCustomerById(ua.getAccountId());
        
        //default screen for customer
        bookFlight();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workArea = new javax.swing.JPanel();
        toolBar = new javax.swing.JPanel();
        flightBtn = new javax.swing.JButton();
        hotelBtn = new javax.swing.JButton();
        attBtn = new javax.swing.JButton();
        planBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();

        workArea.setDoubleBuffered(false);
        workArea.setPreferredSize(new java.awt.Dimension(1100, 800));
        workArea.setLayout(new java.awt.CardLayout());

        toolBar.setBackground(new java.awt.Color(61, 69, 100));
        toolBar.setPreferredSize(new java.awt.Dimension(200, 168));

        flightBtn.setBackground(new java.awt.Color(8, 57, 97));
        flightBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        flightBtn.setForeground(new java.awt.Color(255, 255, 255));
        flightBtn.setText("Flight Ticket");
        flightBtn.setContentAreaFilled(false);
        flightBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flightBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightBtnActionPerformed(evt);
            }
        });

        hotelBtn.setBackground(new java.awt.Color(8, 57, 97));
        hotelBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        hotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        hotelBtn.setText("Hotel Reservation");
        hotelBtn.setContentAreaFilled(false);
        hotelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotelBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelBtnActionPerformed(evt);
            }
        });

        attBtn.setBackground(new java.awt.Color(8, 57, 97));
        attBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        attBtn.setForeground(new java.awt.Color(255, 255, 255));
        attBtn.setText("Tourist Attraction Ticket");
        attBtn.setContentAreaFilled(false);
        attBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        attBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attBtnActionPerformed(evt);
            }
        });

        planBtn.setBackground(new java.awt.Color(8, 57, 97));
        planBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        planBtn.setForeground(new java.awt.Color(255, 255, 255));
        planBtn.setText("Plan A Trip");
        planBtn.setContentAreaFilled(false);
        planBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        planBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        planBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planBtnActionPerformed(evt);
            }
        });

        orderBtn.setBackground(new java.awt.Color(8, 57, 97));
        orderBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("My Orders");
        orderBtn.setContentAreaFilled(false);
        orderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolBarLayout = new javax.swing.GroupLayout(toolBar);
        toolBar.setLayout(toolBarLayout);
        toolBarLayout.setHorizontalGroup(
            toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hotelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(toolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(planBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        toolBarLayout.setVerticalGroup(
            toolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolBarLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(flightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workArea, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(workArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void flightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightBtnActionPerformed
        // TODO add your handling code here:
        bookFlight();
    }//GEN-LAST:event_flightBtnActionPerformed

    private void hotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelBtnActionPerformed
        // TODO add your handling code here:
        bookHotel();
    }//GEN-LAST:event_hotelBtnActionPerformed

    private void attBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attBtnActionPerformed
        // TODO add your handling code here:
        bookAttraction();
    }//GEN-LAST:event_attBtnActionPerformed

    private void planBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planBtnActionPerformed
        // TODO add your handling code here:
        planTrip();
    }//GEN-LAST:event_planBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        viewOrders();
    }//GEN-LAST:event_orderBtnActionPerformed
    
    public void bookFlight(){
        JPanel bookFlightJPanel = new BookFlightJPanel( container, platform, ua);
        workArea.add(bookFlightJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void bookHotel(){
        JPanel bookHotelJPanel = new BookHotelJPanel( container, platform, ua);
        workArea.add(bookHotelJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void bookAttraction(){
        JPanel bookAttractionJPanel = new BookAttractionTicketJPanel( container, platform, ua);
        workArea.add(bookAttractionJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void planTrip(){
        JPanel planTripJPanel = new PlanATripJPanel( container, platform, ua);
        workArea.add(planTripJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void viewOrders(){
        JPanel OrdersJPanel = new ViewOrdersJPanel( container, platform, ua);
        workArea.add(OrdersJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attBtn;
    private javax.swing.JButton flightBtn;
    private javax.swing.JButton hotelBtn;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton planBtn;
    private javax.swing.JPanel toolBar;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
