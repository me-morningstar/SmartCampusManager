import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static final String FILE_PATH = "../data/resources.txt";

    // Save all resources to text file
    public static void saveResources(List<Resource> resources) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Resource r : resources) {
                // Save format: ID,Name,Type,Available Status
                writer.write(r.getResourceId() + "," + r.getName() + "," + r.getType() + "," + r.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: Failed to save data to file: " + e.getMessage());
        }
    }

    // Load resources from text file
    public static List<Resource> loadResources() {
        List<Resource> loadedResources = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return loadedResources; // Return empty list if file doesn't exist yet
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String name = parts[1];
                    String type = parts[2];
                    boolean isAvailable = Boolean.parseBoolean(parts[3]);

                    Resource res = new Resource(id, name, type);
                    res.setAvailable(isAvailable);
                    loadedResources.add(res);
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: Failed to load data from file: " + e.getMessage());
        }
        return loadedResources;
    }
}