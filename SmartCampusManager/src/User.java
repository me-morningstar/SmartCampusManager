public class User {
    private String userId;
    private String name;
    private String role; // Student, Faculty, or Admin

    // Constructor to initialize a user
    public User(String userId, String name, String role) {
        this.userId = userId;
        this.name = name;
        this.role = role;
    }

    // Getters to access user data
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Display user details
    public void displayUserInfo() {
        System.out.println("User ID: " + userId + " | Name: " + name + " | Role: " + role);
    }
}