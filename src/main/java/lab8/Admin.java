package lab8;

@UserPermission(value = 2)
public class Admin {
    private String username;

    public Admin(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
