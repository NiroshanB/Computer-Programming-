package sample;

public class Friend {
    private String name;
    private String phoneNum;
    private String address;
    private String email;

    Friend(String name, String phoneNum, String address, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.email = email;
    }
    @Override
    public String toString(){
        return name;
    }

    //getters and setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

