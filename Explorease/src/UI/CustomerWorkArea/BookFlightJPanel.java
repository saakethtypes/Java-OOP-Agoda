/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Platform;
import Business.Product.FlightTicketProduct;
import Business.Product.Product;
import Order.Order;
import UserAccount.UserAccount;
import Validation.VerifyNull;
import WorkRequest.AirTicketWorkRequest;
import WorkRequest.TripPlanningWorkRequest;
import WorkRequest.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    Platform platform;
    UserAccount ua;
    JPanel container;
    DefaultTableModel resultTable;
    Organization org;
    Customer cus;
    Employee emp;
    Boolean isEmp;
    FlightTicketProduct flightSelected;
    TripPlanningWorkRequest trp;

    public BookFlightJPanel(JPanel container, Platform platform, UserAccount ua) {
        initComponents();
        this.platform = platform;
        this.container = container;
        this.ua = ua;
        this.org = this.platform.getAirlineOrg();
        this.isEmp = false;
        this.resultTable = (DefaultTableModel) flights.getModel();
        this.cus = this.platform.getCustomerDirectory().findCustomerById(ua.getAccountId());
    }

    public BookFlightJPanel(Platform platform, UserAccount ua, TripPlanningWorkRequest wr) {
        initComponents();
        this.platform = platform;
        this.ua = ua;
        this.isEmp = true;
        this.org = this.platform.getAirlineOrg();
        this.resultTable = (DefaultTableModel) flights.getModel();
        this.emp = this.platform.getTravelAgencyOrg().getEmployeeDirectory().findById(ua.getAccountId());
        this.trp = wr;
        this.bookBtn.setText("Add to Customer Plan");
        this.depCity.setText(wr.getDepCity());
        this.depDate.setDate(wr.getDepDate());
        this.desCity.setText(wr.getDesCity());
//        this..setText(wr.getDepCity());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desCity = new javax.swing.JTextField();
        depCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        flights = new javax.swing.JTable();
        selectBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nonStop = new javax.swing.JCheckBox();
        tripTypeCombo = new javax.swing.JComboBox<>();
        depDate = new com.toedter.calendar.JDateChooser();
        foodCombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Departure City");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel2.setText("Destination City");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));
        add(desCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 113, -1));
        add(depCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 113, -1));

        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        flights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Airline", "Departure City", "Destination City", "Departure Date", "Departure TIme", "Flight Duration", "Non Stop", "Price"
            }
        ));
        jScrollPane2.setViewportView(flights);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 890, 420));

        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/aircraft_16px.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 36, 23));

        jLabel5.setText("Flight Selected");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, 20));

        jTextField3.setEditable(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 105, -1));

        jLabel6.setText("Total Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 70, 20));

        jTextField4.setEditable(false);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 80, -1));

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 80, -1));

        jLabel7.setText("From");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 35, 20));

        jTextField5.setEditable(false);
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 105, -1));

        jLabel8.setText("To");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 20, 20));

        jTextField6.setEditable(false);
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 105, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/airplane_128px.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 138, 136));

        nonStop.setText("Non-stop");
        add(nonStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 90, -1));

        tripTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One-way", "Round-trip" }));
        add(tripTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 130, -1));
        add(depDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 150, -1));

        foodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No in-flight food", "Order vegan meal", "Order non-vegan meal" }));
        foodCombo.setToolTipText("");
        foodCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                foodComboItemStateChanged(evt);
            }
        });
        foodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodComboActionPerformed(evt);
            }
        });
        add(foodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        resultTable.setRowCount(0);

        ArrayList<Product> searchResult = new ArrayList<Product>();

        String dep = depCity.getText();
        String des = desCity.getText();
        Date date = depDate.getDate();
        
        VerifyNull checkNull = new VerifyNull();
        boolean nonull = checkNull.checkNullObject(dep,des,date);
        
        if(nonull){
        for (Product flight : this.org.getProductCatalog().getProducts()) {
            FlightTicketProduct f = (FlightTicketProduct) flight.getProductDetails();
            if (!nonStop.isSelected()) {
                if (f.getDepartureCity().equalsIgnoreCase(dep) && f.getDestinationCity().equalsIgnoreCase(des) && f.getDepartureDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().equals(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())) {
                    searchResult.add(flight);
                }
            } else {
                if (f.getDepartureCity().equalsIgnoreCase(dep) && f.getDestinationCity().equalsIgnoreCase(des) && f.getDepartureDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().equals(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())
                        && f.getNonStop()) {
                    searchResult.add(flight);
                }
            }
        }

        if (searchResult.size() > 0) {
            for (Product flightFound : searchResult) {
                FlightTicketProduct f = (FlightTicketProduct) flightFound.getProductDetails();
                Object[] row = new Object[9];
                row[0] = f;
                row[1] = f.getAirline();
                row[2] = f.getDepartureCity();
                row[3] = f.getDestinationCity();
                row[4] = new SimpleDateFormat("yyyy-MM-dd").format(f.getDepartureDate());
                row[5] = f.getDepartureTime();
                row[6] = f.getFlightDuration();
                row[7] = (f.getNonStop()) ? "Yes" : "No";
                row[8] = f.getPrice();
                resultTable.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Oops...no flight found");
        }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flights.getSelectedRow();
        if(selectedRow>=0){
            this.flightSelected = (FlightTicketProduct) resultTable.getValueAt(selectedRow, 0);
            jTextField3.setText(flightSelected.getProductId());
            jTextField5.setText(flightSelected.getDepartureCity());
            jTextField6.setText(flightSelected.getDestinationCity());
            jTextField4.setText(String.valueOf((tripTypeCombo.getSelectedItem().equals("One-way")) ? flightSelected.getPrice() : flightSelected.getPrice() * 2));
        }else{
            JOptionPane.showMessageDialog(null, "Please select a flight");
        }
        
    }//GEN-LAST:event_selectBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        //create order for customer and add to customer's order list
        if(this.flightSelected!=null){
        if (this.isEmp) {
            trp.addToTripDetails(flightSelected);
            JOptionPane.showMessageDialog(null, "Added to trip details");

        } else {
            Order o = this.cus.getCustomerOrderCatalog().createOrder(cus);
            
            AirTicketWorkRequest airworkReq = o.getOrderWorkQueue().newAirTicketWorkRequest(o, this.cus, this.cus.getUserAccount(), this.platform); //this WR would be the main WR(initiated bycustomer) attached to the order

            //link product with the order
            if (tripTypeCombo.getSelectedItem().equals("One-way")) {
                o.newOrderItem(this.flightSelected);
            } else {
                //just to get the total price right for the order
                o.newOrderItem(this.flightSelected);
                o.newOrderItem(this.flightSelected);
                
                airworkReq.setIsRooundTrip(true);

            }
            
            //prepare food info to send to airline org
            if (foodCombo.getSelectedItem().equals("Order vegan meal")) {
                airworkReq.setNeedFood(true);
                airworkReq.setIsVegan(true);
            } else if (foodCombo.getSelectedItem().equals("Order non-vegan meal")) {
                airworkReq.setNeedFood(true);
            }

            o.setFlightOrderPriceWithFood(Integer.valueOf(jTextField4.getText())); //only works for orders created from UI

            //no need to add to the org's order list, we just loop workQueue for org data
            JOptionPane.showMessageDialog(null, "Booking request sent");
            
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            
        }} else {
            JOptionPane.showMessageDialog(null, "Select a product!");

        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void foodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodComboActionPerformed

    private void foodComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_foodComboItemStateChanged
        // TODO add your handling code here:
        int foodPrice = (foodCombo.getSelectedItem().equals("Order vegan meal")) ? 30 : 40;
        int flightPrice = flightSelected.getPrice();
        int oneWayPrice = foodPrice + flightPrice;
        Boolean isOneWay = (tripTypeCombo.getSelectedItem().equals("One-way")) ? true : false;
        int totalPrice = (isOneWay) ? oneWayPrice : oneWayPrice * 2;

        jTextField4.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_foodComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField depCity;
    private com.toedter.calendar.JDateChooser depDate;
    private javax.swing.JTextField desCity;
    private javax.swing.JTable flights;
    private javax.swing.JComboBox<String> foodCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JCheckBox nonStop;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox<String> tripTypeCombo;
    // End of variables declaration//GEN-END:variables
}
