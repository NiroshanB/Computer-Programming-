package sample;

public class Friend {

    public String name;
    private String phoneNum;
    private String email;
    private String address;

    Friend(String name, String phoneNum, String address, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.email = email;
    }

    public String toString(){
        return ("Name: " + name + "\r" + "Phone Number: " + phoneNum + "\r" + "Home Address: " + address + "\r" + "Email: " + email + "\r");
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

