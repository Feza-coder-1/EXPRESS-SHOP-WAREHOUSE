package warehouse;

public interface UserInterface {
    public boolean isLogin(String[] credential);
    public boolean isSignUp(String[] credential);
    public void accessMenu();
    public String[] loginMenu();
    public String[] signUpMenu();
}
