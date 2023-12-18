/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.Icon;


/**
 *
 * @author Lenovo
 */
public class venue {

   
    public void venue(String name,String address,int price,Icon image){
        this.name=name;
        this.address=address;
        this.price=price;
        this.image=image;
    }

    public String getName() {
        return name;
    }

 
    public String getAddress() {
        return address;
    }


    public int getPrice() {
        return price;
    }

  

    public Icon getImage() {
        return image;
    }
    private String name;
    private String address;
    private int price;
    private Icon image;
    
    
}
