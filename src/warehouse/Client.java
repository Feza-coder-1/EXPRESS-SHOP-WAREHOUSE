package warehouse;

public class Client extends User{

    public Client(String name, String email, String password, String address, String phone) {
        super(name, email, password, address, phone);
    }
    public Client(){
        super("","","","","");

    }
}
