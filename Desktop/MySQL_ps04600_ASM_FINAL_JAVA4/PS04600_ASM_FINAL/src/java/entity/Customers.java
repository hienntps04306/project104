package entity;
// Generated Oct 20, 2016 9:55:15 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private Serializable username;
     private Serializable password;
     private Serializable hoten;
     private Serializable email;
     private Boolean role;
     private Boolean gioitinh;

    public Customers() {
    }

	
    public Customers(Serializable username) {
        this.username = username;
    }
    public Customers(Serializable username, Serializable password, Serializable hoten, Serializable email, Boolean role, Boolean gioitinh) {
       this.username = username;
       this.password = password;
       this.hoten = hoten;
       this.email = email;
       this.role = role;
       this.gioitinh = gioitinh;
    }
   
    public Serializable getUsername() {
        return this.username;
    }
    
    public void setUsername(Serializable username) {
        this.username = username;
    }
    public Serializable getPassword() {
        return this.password;
    }
    
    public void setPassword(Serializable password) {
        this.password = password;
    }
    public Serializable getHoten() {
        return this.hoten;
    }
    
    public void setHoten(Serializable hoten) {
        this.hoten = hoten;
    }
    public Serializable getEmail() {
        return this.email;
    }
    
    public void setEmail(Serializable email) {
        this.email = email;
    }
    public Boolean getRole() {
        return this.role;
    }
    
    public void setRole(Boolean role) {
        this.role = role;
    }
    public Boolean getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }




}


