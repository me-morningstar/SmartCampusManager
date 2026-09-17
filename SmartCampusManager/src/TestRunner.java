public class TestRunner {
    public static void main(String[] args) {
        System.out.println("=== RUNNING AUTOMATED UNIT TESTS ===");
        int totalTests = 0;
        int passedTests = 0;

        // Test 1: User Initialization
        totalTests++;
        User user = new User("U001", "Test User", "Student");
        if (user.getUserId().equals("U001") && user.getRole().equals("Student")) {
            System.out.println("[PASS] Test 1: User Initialization");
            passedTests++;
        } else {
            System.out.println("[FAIL] Test 1: User Initialization");
        }

        // Test 2: Resource Availability Toggle
        totalTests++;
        Resource res = new Resource("TR1", "Test Lab", "Lab");
        if (res.isAvailable()) {
            res.setAvailable(false);
            if (!res.isAvailable()) {
                System.out.println("[PASS] Test 2: Resource Availability Toggle");
                passedTests++;
            } else {
                System.out.println("[FAIL] Test 2: Resource Availability Toggle");
            }
        } else {
            System.out.println("[FAIL] Test 2: Resource Initial State");
        }

        // Test 3: Booking Logic
        totalTests++;
        BookingService service = new BookingService();
        Resource testRes = new Resource("TR2", "Test Hall", "Hall");
        service.addResource(testRes);
        boolean bookedFirst = service.bookResource("TR2", user);
        boolean bookedSecond = service.bookResource("TR2", user); // Should fail

        if (bookedFirst && !bookedSecond) {
            System.out.println("[PASS] Test 3: Double-Booking Prevention");
            passedTests++;
        } else {
            System.out.println("[FAIL] Test 3: Double-Booking Prevention");
        }

        System.out.println("\nTest Summary: " + passedTests + "/" + totalTests + " tests passed.");
    }
}