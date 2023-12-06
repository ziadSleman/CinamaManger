public class User {
    private String username;
    private String password;  // For simplicity, in a real project, you would use more secure methods for handling passwords
    private String userDetails;

    // Constructor
    public User(String username, String password, String userDetails) {
        this.username = username;
        this.password = password;
        this.userDetails = userDetails;
    }

    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userDetails='" + userDetails + '\'' +
                '}';
    }
}
