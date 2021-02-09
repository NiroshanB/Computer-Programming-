package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public ListView<Friend> friendList = new ListView<>();
    public TextField txtGetName;
    public TextField txtGetPhone;
    public TextField txtGetEmail;
    public TextField txtGetAddress;
    public Label lblName;
    public Label lblPhone;
    public Label lblAddress;
    public Label lblEmail;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(txtGetName.getText(), txtGetPhone.getText(), txtGetAddress.getText(), txtGetEmail.getText());
        friendList.getItems().add(temp);
        txtGetName.clear();
        txtGetPhone.clear();
        txtGetAddress.clear();
        txtGetEmail.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText("Name: " + temp.getName());
        lblPhone.setText("Phone Number: " + temp.getPhoneNum());
        lblAddress.setText("Home Address: " + temp.getAddress());
        lblEmail.setText("Email: " + temp.getEmail());
    }

    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        lblName.setText("Name:");
        lblPhone.setText("Phone Number:");
        lblAddress.setText("Home Address:");
        lblEmail.setText("Email:");
    }

}
