
package ViewComponent;

import Chart.ModelChart;
import Controller.AdminDashboardController;
import Model.AdminDashboardModel;
import database.DatabaseConnection;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeForm extends javax.swing.JPanel {

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        chart.setTitle("Events Report");
        chart.addLegend("Event",Color.decode("#7b4397"),Color.decode("#dc2430"));
        setData();
    }
    private void setData(){
        DatabaseConnection connection = new DatabaseConnection();
        List <AdminDashboardModel> lists=new ArrayList<>();
        String sql="select DATE_FORMAT(date,%m) as 'month',SUM(ID) as total_event";
        connection.retrive(sql);
        try {
            while(connection.retrive(sql).next()){
                String month=connection.retrive(sql).getString("month");
                int event=connection.retrive(sql).getInt("total_event");
                lists.add(new AdminDashboardModel(month,event));
                for(int i=lists.size()-1;i>0;i--){
                    AdminDashboardModel d=lists.get(i);
                    chart.addData(new ModelChart(d.getMonth(),new double[]{d.getEvent()}));
                }
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customJPanel1 = new com.mycompany.custombutton.CustomJPanel();
        jLabel2 = new javax.swing.JLabel();
        customJPanel2 = new com.mycompany.custombutton.CustomJPanel();
        jLabel1 = new javax.swing.JLabel();
        customJPanel3 = new com.mycompany.custombutton.CustomJPanel();
        jLabel3 = new javax.swing.JLabel();
        customJPanel5 = new com.mycompany.custombutton.CustomJPanel();
        jLabel4 = new javax.swing.JLabel();
        panelShadow1 = new panel.PanelShadow();
        chart = new Chart.CurveLineChart();

        setBackground(new java.awt.Color(255, 255, 255));

        customJPanel1.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel1.setRoundBottomLeft(60);
        customJPanel1.setRoundBottomRight(60);
        customJPanel1.setRoundTopLeft(60);
        customJPanel1.setRoundTopRight(60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Total Events");

        javax.swing.GroupLayout customJPanel1Layout = new javax.swing.GroupLayout(customJPanel1);
        customJPanel1.setLayout(customJPanel1Layout);
        customJPanel1Layout.setHorizontalGroup(
            customJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        customJPanel1Layout.setVerticalGroup(
            customJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        customJPanel2.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel2.setRoundBottomLeft(60);
        customJPanel2.setRoundBottomRight(60);
        customJPanel2.setRoundTopLeft(60);
        customJPanel2.setRoundTopRight(60);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total Bookings");

        javax.swing.GroupLayout customJPanel2Layout = new javax.swing.GroupLayout(customJPanel2);
        customJPanel2.setLayout(customJPanel2Layout);
        customJPanel2Layout.setHorizontalGroup(
            customJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        customJPanel2Layout.setVerticalGroup(
            customJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        customJPanel3.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel3.setRoundBottomLeft(60);
        customJPanel3.setRoundBottomRight(60);
        customJPanel3.setRoundTopLeft(60);
        customJPanel3.setRoundTopRight(60);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Total Venues");

        javax.swing.GroupLayout customJPanel3Layout = new javax.swing.GroupLayout(customJPanel3);
        customJPanel3.setLayout(customJPanel3Layout);
        customJPanel3Layout.setHorizontalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        customJPanel3Layout.setVerticalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        customJPanel5.setBackground(new java.awt.Color(153, 255, 153));
        customJPanel5.setRoundBottomLeft(20);
        customJPanel5.setRoundBottomRight(20);
        customJPanel5.setRoundTopLeft(20);
        customJPanel5.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Dashboard");

        javax.swing.GroupLayout customJPanel5Layout = new javax.swing.GroupLayout(customJPanel5);
        customJPanel5.setLayout(customJPanel5Layout);
        customJPanel5Layout.setHorizontalGroup(
            customJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(421, 421, 421))
        );
        customJPanel5Layout.setVerticalGroup(
            customJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow1.setBackground(new java.awt.Color(71, 108, 213));
        panelShadow1.setColorGradient(new java.awt.Color(3, 23, 79));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(customJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(99, 99, 99)
                .addComponent(customJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101)
                .addComponent(customJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
            .addComponent(customJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Chart.CurveLineChart chart;
    private com.mycompany.custombutton.CustomJPanel customJPanel1;
    private com.mycompany.custombutton.CustomJPanel customJPanel2;
    private com.mycompany.custombutton.CustomJPanel customJPanel3;
    private com.mycompany.custombutton.CustomJPanel customJPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
