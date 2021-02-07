import java.util.ArrayList;
/*
It contains the information of the friends book
You are able to add and remove friends
You are able to print all friends
*/
public class FriendsBook {
    ArrayList<Friend> friends = new ArrayList<>();//friends in the friend book
    String friendBookName;//the name of the friends book

    //friends book constructor, it constructs the school
    FriendsBook(String friendBookName){
        this.friendBookName = friendBookName;
    }

    //method adds friend
    void addFriend(Friend friend){
        friends.add(friend);
    }

    //method removes friend
    void removeFriend(Friend friend){
        friends.remove(friend);
    }

    //method shows a list of friends
    void showAllFriends(){
        for (Friend friend: friends){
            System.out.println(friend);
        }
    }

    //getters and setters
    public String getFriendBookName() {
        return friendBookName;
    }

    public void setFriendBookName(String friendBookName) {
        this.friendBookName = friendBookName;
    }
}
