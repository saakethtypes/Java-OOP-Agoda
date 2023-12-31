/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrgManagerWorkArea;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Platform;
import Business.Product.FoodServiceProduct;
import Business.Product.InsuranceProduct;
import UserAccount.UserAccount;
import WorkRequest.FoodServiceWorkRequest;
import WorkRequest.InsuranceWorkRequest;
import WorkRequest.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class InsuranceOrgManagerAllOrdersWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AirlineOrgManagerAllOrdersWorkArea
     */
    Platform platform;
    UserAccount ua;
    JPanel container;
    Organization org;
    DefaultTableModel orderTable;

    public InsuranceOrgManagerAllOrdersWorkArea(Platform platform, JPanel container, UserAccount ua) {
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
                Object[] row = new Object[6];
                row[0] = wr;
                row[1] = wr.getCustomer().getPerson().getName();
                row[2] = wr.getOrder().getMainOrderTotal(); //only showing the insurance price
                row[3] = wr.getStatus();
                InsuranceProduct ip = (InsuranceProduct) wr.getOrder().getOrderitems().get(0).getSelectedproduct().getProductDetails();
                row[4] = ip.getInsurancePlan();
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
        appBtn = new javax.swing.JButton();
        rejBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        queue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Work Request ID", "Customer", "Insurance Price", "Insurance Status", "Order Details"
            }
        ));
        jScrollPane1.setViewportView(queue);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("WORK QUEUE");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(appBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rejBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(appBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rejBtn)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void appBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow;
        selectedRow = queue.getSelectedRow();
        if (selectedRow > -1) {
        WorkRequest wr = (WorkRequest) orderTable.getValueAt(selectedRow, 0);

            if (wr.getStatus().equalsIgnoreCase("Order requested")) {
                wr.setStatus("Insurance approved");
//          this.org.getWorkQueue().finishWorkRequest(wr);
                InsuranceWorkRequest foodwr = (InsuranceWorkRequest) wr;
                foodwr.getCustomerTripPlanningRequest().setStatus("Insurance confirmed");
                populateOrders();
            } else {
                JOptionPane.showMessageDialog(null, "Processing already completed");
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
            if (wr.getStatus().equalsIgnoreCase("Order requested")) {
                wr.setStatus("Insurance rejected");
//        this.org.getWorkQueue().rejectWorkRequest(wr);
                InsuranceWorkRequest foodwr = (InsuranceWorkRequest) wr;
                foodwr.getCustomerTripPlanningRequest().setStatus("Insurance rejected");
                populateOrders();
            } else {
                JOptionPane.showMessageDialog(null, "Already processed");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Select a Work request!");

        }
    }//GEN-LAST:event_rejBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable queue;
    private javax.swing.JButton rejBtn;
    // End of variables declaration//GEN-END:variables
}
