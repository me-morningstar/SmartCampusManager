import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Resource> resources;

    public BookingService() {
        // Load resources from file on startup
        this.resources = DataManager.loadResources();

        // If file is empty, seed default data and save it
        if (resources.isEmpty()) {
            resources.add(new Resource("R201", "AI Lab 1", "Lab"));
            resources.add(new Resource("R202", "4K Projector", "Equipment"));
            resources.add(new Resource("R203", "Seminar Hall A", "Hall"));
            DataManager.saveResources(resources);
        }
    }

    public void addResource(Resource resource) {
        resources.add(resource);
        DataManager.saveResources(resources); // Save change
    }

    public void listAllResources() {
        System.out.println("--- All Campus Resources ---");
        if (resources.isEmpty()) {
            System.out.println("No resources available.");
            return;
        }
        for (Resource r : resources) {
            r.displayResourceInfo();
        }
    }

    public boolean bookResource(String resourceId, User user) {
        for (Resource r : resources) {
            if (r.getResourceId().equalsIgnoreCase(resourceId)) {
                if (r.isAvailable()) {
                    r.setAvailable(false);
                    DataManager.saveResources(resources); // Save change
                    System.out.println("SUCCESS: " + user.getName() + " (" + user.getRole() + ") successfully booked " + r.getName() + ".");
                    return true;
                } else {
                    System.out.println("ERROR: Resource " + r.getName() + " is already booked.");
                    return false;
                }
            }
        }
        System.out.println("ERROR: Resource ID " + resourceId + " not found.");
        return false;
    }

    public boolean returnResource(String resourceId, User user) {
        for (Resource r : resources) {
            if (r.getResourceId().equalsIgnoreCase(resourceId)) {
                if (!r.isAvailable()) {
                    r.setAvailable(true);
                    DataManager.saveResources(resources); // Save change
                    System.out.println("SUCCESS: " + user.getName() + " returned " + r.getName() + ".");
                    return true;
                } else {
                    System.out.println("NOTICE: Resource " + r.getName() + " was not booked.");
                    return false;
                }
            }
        }
        System.out.println("ERROR: Resource ID " + resourceId + " not found.");
        return false;
    }
}