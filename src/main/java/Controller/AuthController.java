
package Controller;

import View.Dashboard;
import View.UserDashboard;
import database.DatabaseConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthController {
    DatabaseConnection connection = new DatabaseConnection();
    public void SignupMethod(String fullname,String contact,String email,String password,String role){
        
        String query="INSERT INTO credentials(Full_Name,contact_number,Email,password,role) VALUES ('"+fullname+"','"+contact+"','"+email+"','"+password+"','"+role+"')";
        connection.manipulate(query);  
    }
    public void LoginMethod(String email,String password){
        String query="SELECT * FROM credentials WHERE Email='"+email+"' AND password='"+password+"' AND role='Admin' ";
        String query1="SELECT * FROM credentials WHERE Email='"+email+"' AND password='"+password+"' AND role='User' ";
        connection.retrive(query);
        connection.retrive(query1);
        try {
            if(connection.retrive(query).next()){
                Dashboard dash=new Dashboard();
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
                
            }else if(connection.retrive(query1).next()){
                UserDashboard dash1=new UserDashboard();
                    dash1.setVisible(true);
                    dash1.pack();
                    dash1.setLocationRelativeTo(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
