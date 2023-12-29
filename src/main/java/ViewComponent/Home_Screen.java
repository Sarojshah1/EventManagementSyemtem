/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewComponent;

import Table.TableActionCellEditor;
import Table.TableActionCellRender;
import Table.TableActionEvent;
import View.Payment;
//import database.DatabaseConnection;
//import java.awt.Image;
//import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Home_Screen extends javax.swing.JPanel {
    private DefaultTableModel model;
    private ResultSet result;

    public Home_Screen() {
//        init();
        initComponents();
        TableActionEvent event = new TableActionEvent(){
            @Override
            public void onClick(int row) {
                System.out.println("Edit row : " + row);
                Payment pay = new Payment();
                pay.setVisible(true);
                
            }
            
        };
        table.getColumnModel().getColumn(7).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(7).setCellEditor(new TableActionCellEditor(event));
    }
//    private void init(){
//        try{
//            DatabaseConnection conn=new DatabaseConnection();
//        model=(DefaultTableModel) table.getModel();
//        String query="SELECT * FROM events";
//        conn.retrive(query);
//        while(conn.retrive(query).next()){
//            int No=conn.retrive(query).getInt(0);
//            Image image=(Image) conn.retrive(query).getBlob(1);
//            String name=conn.retrive(query).getString(2);
//            int price=conn.retrive(query).getInt(3);
//            String decription=conn.retrive(query).getString(4);
//            String venue=conn.retrive(query).getString(5);
//            Date date=conn.retrive(query).getDate(9);
//            model.addRow(new Object[]{table.getRowCount()+1,No,image,name,decription,venue,date,price});
//            
//            
//            
//            
//        }
//        }catch(Exception E){
//            E.printStackTrace();
//            
//        }
//        
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBarCustom1 = new scrollbar.ScrollBarCustom();
        jScrollPane7 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setColumnHeaderView(null);
        jScrollPane7.setVerticalScrollBar(scrollBarCustom1);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Image", "Event Name", "Description", "Venue", "Date", "Ticket Price", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(60);
        jScrollPane7.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private scrollbar.ScrollBarCustom scrollBarCustom1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
