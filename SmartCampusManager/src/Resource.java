public class Resource {
    private String resourceId;
    private String name;
    private String type; // e.g., "Lab", "Equipment", "Hall"
    private boolean isAvailable;

    // Constructor to initialize a resource
    public Resource(String resourceId, String name, String type) {
        this.resourceId = resourceId;
        this.name = name;
        this.type = type;
        this.isAvailable = true; // Available by default
    }

    // Getters and Setters
    public String getResourceId() {
        return resourceId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Display resource details
    public void displayResourceInfo() {
        String status = isAvailable ? "Available" : "Booked";
        System.out.println("ID: " + resourceId + " | Name: " + name + " | Type: " + type + " | Status: " + status);
    }
}