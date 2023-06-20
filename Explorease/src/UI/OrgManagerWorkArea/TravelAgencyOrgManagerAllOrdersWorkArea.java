/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrgManagerWorkArea;

import Business.Customer.Customer;
import Business.Organization.Organization;
import Business.Platform;
import Business.Product.AttractionProduct;
import Business.Product.FlightTicketProduct;
import Business.Product.HotelRoomsProduct;
import Business.Product.InsuranceProduct;
import Business.Product.Product;
import Order.Order;
import UI.CustomerWorkArea.BookAttractionTicketJPanel;
import UI.CustomerWorkArea.BookFlightJPanel;
import UI.CustomerWorkArea.BookHotelJPanel;
import UserAccount.UserAccount;
import WorkRequest.AirTicketWorkRequest;
import WorkRequest.AttractionBookingWorkRequest;
import WorkRequest.HotelBookingWorkRequest;
import WorkRequest.TripPlanningWorkRequest;
import WorkRequest.FoodServiceWorkRequest;
import WorkRequest.InsuranceWorkRequest;
import WorkRequest.WorkRequest;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class TravelAgencyOrgManagerAllOrdersWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AirlineOrgManagerAllOrdersWorkArea
     */
    Platform platform;
    UserAccount ua;
    JPanel container;
    Organization org;
    DefaultTableModel orderTable;
    TripPlanningWorkRequest pTrip;

    public TravelAgencyOrgManagerAllOrdersWorkArea(Platform platform, JPanel container, UserAccount ua) {
        initComponents();
        this.platform = platform;
        this.container = container;
        this.ua = ua;
        this.org = platform.findOrgByUserAccount(ua.getUsername(), ua.getPassword());
        this.orderTable = (DefaultTableModel) queue.getModel();
        populateOrders();
    }

    public void populateOrders() {
        this.org.getWorkQueue();
        orderTable.setRowCount(0);
        ArrayList<WorkRequest> wra = this.org.getWorkQueue().getWorkQueue();
        if (wra.size() > 0) {

            for (WorkRequest wr : wra) {
                TripPlanningWorkRequest twr = (TripPlanningWorkRequest) wr;
                Object[] row = new Object[12];
                row[0] = wr;
                row[1] = wr.getOrder();
                row[2] = wr.getCustomer().getPerson().getName();
                row[3] = wr.getOrder().getMainOrderTotal(); //not including other org's price for travel agency revenue
                row[4] = wr.getOrder().getOrderApproved();
                //replace row10 with returned plan details
                row[5] = wr.getOrder().getOrderitems().get(0).getSelectedproduct().toString();
                row[6] = wr.getAssignedTo();
                row[7] = twr.getNeedInsurance();
                row[8] = twr.getIsFullCoverage();
                row[9] = twr.getNeedBooking();
                row[10] = twr.getConfirmedToBook();
                row[11] = wr.getStatus();
                orderTable.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        queue = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orderInsurance = new javax.swing.JButton();
        appBtn = new javax.swing.JButton();
        rejBtn = new javax.swing.JButton();
        statusTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        assignBtn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        placeAllOrdersBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        queue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "WorkRequest ID", "Order ID", "Customer", "Agency Price", "Order Booked", "Order Details", "Assigned To", "Insurance Required", "Full Coverage", "Booking Service Required", "Confirmed To Book", "Status"
            }
        ));
        jScrollPane1.setViewportView(queue);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("WORK QUEUE");

        orderInsurance.setText("Order Insurance For Customer");
        orderInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderInsuranceActionPerformed(evt);
            }
        });

        appBtn.setText("Approve");
        appBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appBtnActionPerformed(evt);
            }
        });

        rejBtn.setText("Reject");
        rejBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Book Flights For Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        assignBtn1.setBackground(new java.awt.Color(0, 255, 204));
        assignBtn1.setText("Assign to me");
        assignBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtn1ActionPerformed(evt);
            }
        });

        jButton2.setText("Set Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Book Hotel For Customer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Book Attractions For Customer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Select Work Request to Work on");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        placeAllOrdersBtn.setBackground(new java.awt.Color(153, 204, 255));
        placeAllOrdersBtn.setText("Place Orders For Plan");
        placeAllOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeAllOrdersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1)
                .addGap(179, 612, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusTxt)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeAllOrdersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rejBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(assignBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(63, 63, 63)
                        .addComponent(orderInsurance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(placeAllOrdersBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(appBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rejBtn))
                    .addComponent(jScrollPane1))
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderInsuranceActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if(selectedRow>=0){
            
        Order order = (Order) orderTable.getValueAt(selectedRow, 1);
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
        this.pTrip = (TripPlanningWorkRequest) wr;
        Boolean needInsurance = this.pTrip.getNeedInsurance();

        if (!needInsurance) {
            JOptionPane.showMessageDialog(null, "No insurance required from customer");
        } else {
            //create insurance request
            Order insuranceOrderSentToIns = this.org.getOrderCatalog().createOrder(order.getCustomer());
            TripPlanningWorkRequest travelAgencyWR = (TripPlanningWorkRequest) wr;
            InsuranceProduct insSelected = (travelAgencyWR.getIsFullCoverage()) ? new InsuranceProduct("Full Coverage", 300) : new InsuranceProduct("Partial Coverage", 200);
            insuranceOrderSentToIns.newOrderItem(insSelected);
            InsuranceWorkRequest inswr = order.getOrderWorkQueue().newInsuranceWorkRequest(insuranceOrderSentToIns, order.getCustomer(), this.ua, this.platform);

            //link this request with customer's main trip planning order and request
            inswr.setCustomerTravelAgencyOrder(order);
            inswr.setCustomerTripPlanningRequest(travelAgencyWR);

            wr.setStatus("Making insurance request from insurance advisor");
            JOptionPane.showMessageDialog(null, "Insurance request sent");

            populateOrders();
        }
        }
    }//GEN-LAST:event_orderInsuranceActionPerformed

    private void appBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
        this.pTrip = (TripPlanningWorkRequest) wr;
            if (this.pTrip.getStatus().equalsIgnoreCase("Work Request Rejected")) {
                JOptionPane.showMessageDialog(null, "Can not approve rejected request");
            } else {
                if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {
                    this.org.getWorkQueue().sendDetailsToCustomer(pTrip);
                    populateOrders();
                    JOptionPane.showMessageDialog(null, "Sent Details to Customer");
                } else {
                    JOptionPane.showMessageDialog(null, "Request already assigned");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }

    }//GEN-LAST:event_appBtnActionPerformed

    private void rejBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejBtnActionPerformed
        // TODO add your handling code here:'
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
        this.pTrip = (TripPlanningWorkRequest) wr;
            if (this.pTrip.getStatus().equalsIgnoreCase("Details sent to customer")) {
                JOptionPane.showMessageDialog(null, "Can not reject approved request");
            } else {
                if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {

                    this.org.getWorkQueue().rejectWorkRequest(wr);
                    populateOrders();
                    JOptionPane.showMessageDialog(null, "Request rejected");

                } else {
                    JOptionPane.showMessageDialog(null, "Request already assigned");

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }

    }//GEN-LAST:event_rejBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);

        this.pTrip = (TripPlanningWorkRequest) wr;
            JPanel bookFlightJPanel = new BookFlightJPanel(platform, ua, pTrip);
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setLayout(new BorderLayout());
            frame.add(bookFlightJPanel, BorderLayout.CENTER);
            frame.setSize(1100, 870);
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void assignBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);

            if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {
                wr.setAssignedTo(ua.getUsername());
                populateOrders();
            } else {
                JOptionPane.showMessageDialog(null, "Request already assigned");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }
    }//GEN-LAST:event_assignBtn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if(selectedRow>=0){
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
        wr.setStatus(statusTxt.getText());
        populateOrders();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
            if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {
                this.pTrip = (TripPlanningWorkRequest) wr;
                JPanel bookHotelJPanel = new BookHotelJPanel(platform, ua, pTrip);
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setLayout(new BorderLayout());
                frame.add(bookHotelJPanel, BorderLayout.CENTER);
                frame.setSize(1100, 870);
            } else {
                JOptionPane.showMessageDialog(null, "Not assigned to you");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
        this.pTrip = (TripPlanningWorkRequest) wr;
            if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {

                if (this.pTrip.getNeedAttractionTicket()) {
                    JPanel bookAttJPanel = new BookAttractionTicketJPanel(platform, ua, pTrip);
                    JFrame frame = new JFrame();
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.add(bookAttJPanel, BorderLayout.CENTER);
                    frame.setSize(1100, 870);
                } else {
                    JOptionPane.showMessageDialog(null, "No attraction ticket required from customer");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not assigned to you");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
            if (wr.getAssignedTo().equals("None") || wr.getAssignedTo().equals(ua.getUsername())) {
                this.pTrip = (TripPlanningWorkRequest) wr;
                JOptionPane.showMessageDialog(null, "Work Request selected");
            } else {
                JOptionPane.showMessageDialog(null, "Not assigned to you");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void placeAllOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeAllOrdersBtnActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow;
            selectedRow = queue.getSelectedRow();
            if (selectedRow > -1) {
            WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);
            this.pTrip = (TripPlanningWorkRequest) wr;

            Customer c = this.pTrip.getCustomer();
            //check if the customer  has confirmed budget
                if (!this.pTrip.getConfirmedToBook()) {
                    JOptionPane.showMessageDialog(null, "Wait for customer to confirm trip");
                } else {
                    for (Product p : this.pTrip.getPlannedTrip()) {
//            if (p.getProductDetails().getClass().getSimpleName().contains("Flight")) {
                        if (p.getProductDetails() instanceof FlightTicketProduct) {
                            FlightTicketProduct atp = (FlightTicketProduct) p.getProductDetails();
                            Order o = c.getCustomerOrderCatalog().createOrder(c);
                            o.newOrderItem(atp);
//            } else {
//                //just to get the total price right for the order
//                o.newOrderItem(this.flightSelected);
//                o.newOrderItem(this.flightSelected);
//
//            }
                            AirTicketWorkRequest airworkReq = o.getOrderWorkQueue().newAirTicketWorkRequest(o, c, ua, this.platform); //this WR would be the main WR(initiated bycustomer) attached to the order

                            //prepare food info to send to airline org
//            if (foodCombo.getSelectedItem().equals("Order vegan meal")) {
//                airworkReq.setNeedFood(true);
//                airworkReq.setIsVegan(true);
//            } else if (foodCombo.getSelectedItem().equals("Order non-vegan meal")) {
//                airworkReq.setNeedFood(true);
//            }
                            o.setFlightOrderPriceWithFood(o.getMainOrderTotal()); //no food option for order placed by travel agency 
                            //no need to add to the org's order list, we just loop workQueue for org data
                        } else if (p.getProductDetails() instanceof HotelRoomsProduct) {
                            //create order for customer and add to customer's order list
                            Order o = c.getCustomerOrderCatalog().createOrder(c);
                            //link product with the order
                            HotelRoomsProduct hp = (HotelRoomsProduct) p.getProductDetails();
                            o.newOrderItem(hp);
                            HotelBookingWorkRequest workReq = o.getOrderWorkQueue().newHotelBookingWorkRequest(o, c, ua, this.platform);
                        } else if (p.getProductDetails() instanceof AttractionProduct) {
                            Order o = c.getCustomerOrderCatalog().createOrder(c);
                            //link product with the order
                            AttractionProduct ap = (AttractionProduct) p.getProductDetails();
                            o.newOrderItem(ap);
                            AttractionBookingWorkRequest workReq = o.getOrderWorkQueue().newAttractionBookingWorkRequest(o, c, ua, this.platform);

                        }
                    };
                    JOptionPane.showMessageDialog(null, "Booking requests sent for the planned trip!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a Work request!");

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_placeAllOrdersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appBtn;
    private javax.swing.JButton assignBtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderInsurance;
    private javax.swing.JButton placeAllOrdersBtn;
    private javax.swing.JTable queue;
    private javax.swing.JButton rejBtn;
    private javax.swing.JTextField statusTxt;
    // End of variables declaration//GEN-END:variables
}