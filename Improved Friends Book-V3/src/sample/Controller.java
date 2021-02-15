package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ListView<Friend> friendList;
    public TextField txtGetName;
    public TextField txtGetPhone;
    public TextField txtGetAddress;
    public TextField txtGetEmail;
    public Label lblName;
    public Label lblPhone;
    public Label lblAddress;
    public Label lblEmail;
    public ListView loadGroups;
    public TextField groupName;
    String line;
    int lineNum = 0;
    String loadName;
    String loadPhone;
    String loadAddress;
    String loadEmail;

    FileReader fr = new FileReader("friendInfo.txt");
    BufferedReader br = new BufferedReader(fr);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (lineNum % 4 == 1){
                    loadName = line;
                }else if (lineNum % 4 == 2){
                    loadPhone = line;
                }else if (lineNum % 4 == 3){
                    loadAddress = line;
                }
                else if (lineNum % 4 == 0){
                    loadEmail = line;
                    Friend friend = new Friend(loadName, loadPhone, loadAddress, loadEmail);
                    friendList.getItems().add(friend);
                }
            }
            br.close();
            FileReader frB = new FileReader("friendGroups.txt");
            BufferedReader brB = new BufferedReader(frB);
            while((line = brB.readLine()) != null){
                loadGroups.getItems().add(line);
            }
            brB.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public Controller() throws IOException {
    }
    public void viewFriendsGroup(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        FileReader fr = new FileReader(loadGroups.getSelectionModel().getSelectedItem() + ".txt");
        BufferedReader br = new BufferedReader(fr);
        lineNum =0;
        while ((line = br.readLine()) != null) {
            lineNum++;
            if (lineNum % 4 == 1){
                loadName = line;
            }else if (lineNum % 4 == 2){
                loadPhone = line;
            }else if (lineNum % 4 == 3){
                loadAddress = line;
            }
            else if (lineNum % 4 == 0){
                loadEmail = line;
                Friend friend = new Friend(loadName, loadPhone, loadAddress, loadEmail);
                friendList.getItems().add(friend);
            }
        }
        br.close();
    }
    public void viewAllFriendsList(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        FileReader fr = new FileReader("friendInfo.txt");
        BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            lineNum++;
            if (lineNum % 4 == 1){
                loadName = line;
            }
            else if (lineNum % 4 == 2){
                loadPhone = line;
            }
            else if (lineNum % 4 == 3){
                loadAddress = line;
            }
            else if (lineNum % 4 == 0){
                loadEmail = line;
                Friend friend = new Friend(loadName, loadPhone, loadAddress, loadEmail);
                friendList.getItems().add(friend);
            }
        }
        br.close();
    }
    public void newFriendGroup(ActionEvent actionEvent) throws IOException {
        FileWriter fw = new FileWriter(groupName.getText() + ".txt", true);
        loadGroups.getItems().add(groupName.getText());
        FileWriter fwB = new FileWriter("friendGroups.txt", true);
        BufferedWriter bwB = new BufferedWriter(fwB);
        bwB.write(groupName.getText() + "\n");
        bwB.close();
    }
    public void addFriendToGroup(ActionEvent actionEvent) throws IOException {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        FileWriter fw = new FileWriter(loadGroups.getSelectionModel().getSelectedItem()+ ".txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(temp.getName() + "\n" + temp.getPhoneNum() + "\n" + temp.getAddress() + "\n" + temp.getEmail() + "\n" );
        bw.close();
    }
    public void addFriend(ActionEvent actionEvent) throws IOException {
        Friend temp = new Friend(txtGetName.getText(), txtGetPhone.getText(), txtGetAddress.getText(), txtGetEmail.getText());
        FileWriter fw = new FileWriter("friendInfo.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(txtGetName.getText() + "\n" + txtGetPhone.getText() + "\n" + txtGetAddress.getText() + "\n" + txtGetEmail.getText() + "\n" );
        bw.close();
        friendList.getItems().add(temp);
        txtGetName.clear();
        txtGetPhone.clear();
        txtGetAddress.clear();
        txtGetEmail.clear();
    }
    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        lblName.setText("Name:");
        lblPhone.setText("Phone Number:");
        lblAddress.setText("Home Address:");
        lblEmail.setText("Email:");
    }
    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText("Name: " + temp.getName());
        lblPhone.setText("Phone Number: " + temp.getPhoneNum());
        lblAddress.setText("Home Address: " + temp.getAddress());
        lblEmail.setText("Email: " + temp.getEmail());
    }
}
