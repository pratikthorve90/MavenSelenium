package OOP.Polymorphism;

import java.util.List;

public class Main {

    public static void changePasswordForAllUsers(List<User> users){

        for(User user : users){
            user.changeEmail("new email");
     //       user.takeHelpRequest()  // This fails as we can call only parent class
            if(user instanceof TA){
                System.out.println("This is student");
                TA ta =(TA)user;
                ta.takeHelpRequest();   // We need to type cast the same and then we can class specific method.
                // This is because at compile time the compiler does not know what type of object will come so it does
                // now allow it call derived class methods , as we are not sure what derived class object will come.
            }

            if(user instanceof Student){
                TA ta = (TA) user;
                // Will throw run time exception java.lang.ClassCastException
                // We can still get this done by using a copy constructor.
            }
        }
    }

    public static void main(String[] args) {
        User user1 = new Mentor();  // Here for user1 variable and methods of User class are only visible.
        User user2 = new Student(); // This cause the compiler does not know which type of object it is and hence allow user1
        User user3 = new TA();
        User user4 = new User();

        List<User> users = List.of(   // This is advantage of polymorphsim , the list is of parent class
                user1,                // But child class can go in as well
                user2,
                user3,
                user4
        );

        changePasswordForAllUsers(users);
    }
}
