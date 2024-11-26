package warehouse;

// for generate the id
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.Scanner;


abstract public class User implements UserInterface{
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String type;
    private String id;

    public User(String name, String email, String password, String address, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.type = getClass().getSimpleName();
        this.id = UUID.randomUUID().toString().substring(0,6);
    }


    // check if user is login
    public boolean isLogin(String[] credential){
       // login system logic with data base goes here...............
        System.out.println("login system logic with data base goes here...............");
        return true;
    }

    // is register
    public boolean isSignUp(String[] credential){
        // registration system logic with data base goes here...............
        System.out.println("registration system logic with data base goes here...............");
        return true;
    }

    // loginMenu
    @Override
    public void accessMenu(){

        System.out.println(type+" Menu");
        System.out.println("==========");
        System.out.println("1. Login");
        System.out.println("2. Sign Up");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String option = input.nextLine();
        switch (option){
            case "1":
                isLogin(loginMenu());
                break;
            case "2":
                isSignUp(signUpMenu());
                break;
            default:
                System.out.println("wrong option try again");
                break;
        }
    }

    // login menu
    @Override
    public String[] loginMenu(){
        System.out.println(type+"  Login Menu");
        System.out.println("-----------------");
        Scanner input = new Scanner(System.in);
        System.out.print("email: ");
        String email = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();

        String[] listCredential = new String[2];
        listCredential[0] = email;
        listCredential[1] = password;
        return listCredential;
    }

    @Override
    public String[] signUpMenu(){
        System.out.println(type+"  Signup Menu");
        System.out.println("-----------------");
        Scanner input = new Scanner(System.in);
        System.out.print("name: ");
        String name = input.nextLine();
        System.out.print("email: ");
        String email = input.nextLine();
        System.out.print("password: ");
        String password = input.nextLine();
        System.out.print("address: ");
        String address = input.nextLine();
        System.out.print("phone: ");
        String phone = input.nextLine();
        String[] listCredential = new String[5];
        if(!name.isEmpty() && !email.isEmpty() && !password.isEmpty() && !address.isEmpty() && !phone.isEmpty()) {
            listCredential[0] = name;
            listCredential[1] = email;
            listCredential[2] = password;
            listCredential[3] = address;
            listCredential[4] = phone;
        }else{
            System.out.println("all fields are required");
        }

        return listCredential;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, type);
    }
}

