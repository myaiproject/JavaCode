package Encapsulation100code.GetterSetter.intermediateLevel;

public class PasswordManager {
    private String password;

    // Write-only property
    public void setPassword(String password) {
        this.password = password;

    }

    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        pm.setPassword("SecurePassword123");
        // No getter, so we cannot read the password
    }
}
