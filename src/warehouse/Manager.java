package warehouse;


public class Manager extends User{

    public Manager(String name, String email, String password, String address, String phone){
        super(name, email, password, address, phone);
    }
    public Manager() {
       super("", "", "", "", "");
    }



}
