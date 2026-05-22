package ab00463240.day1.log4j;

import org.apache.log4j.Logger;

public class LoginService {

    // Create a logger instance for this class
    private static final Logger logger = Logger.getLogger(LoginService.class);

    // Hardcoded credentials (for demonstration)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    // Method to perform login
    public boolean login(String user, String pass) {
        logger.info("Login attempt for user: " + user);

        if (user == null || pass == null) {
            logger.warn("Login failed: Missing username or password");
            return false;
        }

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            logger.info("✅ Login successful for user: " + user);
            return true;
        } else {
            logger.error("❌ Login failed for user: " + user + " (invalid credentials)");
            return false;
        }
    }

    // Main method to test logging
    public static void main(String[] args) {
        LoginService service = new LoginService();

        System.out.println("--- Login Simulation ---");

        // Successful login
        service.login("admin", "password123");

        // Failed login - wrong password
        service.login("admin", "wrongpass");

        // Failed login - missing username
        service.login(null, "password123");

        System.out.println("\nCheck 'login_activity.log' for saved logs.");
    }
}


