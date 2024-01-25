package AssignmentTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// User class
class User {
    private String userId;
    private String username;
    private String password;
    private String role;

    public User(String userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters...

    public void saveToFile() {
        // Save user details to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_details.txt", true))) {
            writer.write(userId + "," + username + "," + password + "," + role);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// EndUser class
class EndUser extends User {
    private String name;
    private String contactDetails;

    public EndUser(String userId, String username, String password, String name, String contactDetails) {
        super(userId, username, password, "EndUser");
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public void register() {
        // Register end user
        saveToFile();
    }

    public void bookAppointment(String technicianId, String appointmentDate) {
        // Book an appointment
        Appointment appointment = new Appointment(getUserId(), technicianId, appointmentDate);
        appointment.saveToFile();
    }
}

// CentreManager class
class CentreManager extends User {
    public CentreManager(String userId, String username, String password) {
        super(userId, username, password, "CentreManager");
    }

    public void manageRoles(String userId, String newRole) {
        // Manage roles
        // Update user roles in the file...
    }

    public void manageCustomerRegistration(String customerDetails) {
        // Manage customer registration
        // Save customer details to the file...
    }
}

// Technician class
class Technician extends User {
    private String technicianId;
    private String specialization;

    public Technician(String userId, String username, String password, String technicianId, String specialization) {
        super(userId, username, password, "Technician");
        this.technicianId = technicianId;
        this.specialization = specialization;
    }

    public void checkAppointments() {
        // Display technician's upcoming appointments
        // Read and display appointments from the file...
    }

    public void collectPayment(String appointmentId) {
        // Collect payment for an appointment
        // Update payment status in the file...
    }

    public void provideFeedback(String appointmentId, String feedback) {
        // Provide feedback for an appointment
        // Save feedback to the file...
    }
}

// Appointment class
class Appointment {
    private String appointmentId;
    private String customerId;
    private String technicianId;
    private String appointmentDate;
    private boolean paymentStatus;

    public Appointment(String customerId, String technicianId, String appointmentDate) {
        this.appointmentId = generateAppointmentId();
        this.customerId = customerId;
        this.technicianId = technicianId;
        this.appointmentDate = appointmentDate;
        this.paymentStatus = false;
    }

    public void saveToFile() {
        // Save appointment details to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("appointment_details.txt", true))) {
            writer.write(appointmentId + "," + customerId + "," + technicianId + "," + appointmentDate + ","
                    + paymentStatus);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateAppointmentId() {
        // Generate a unique appointment ID
        // Implementation logic...
        return "APPT123";
    }
}

public class AHHASCSystem {
    public static void main(String[] args) {
        // Example usage of the AHHASC system
        CentreManager manager = new CentreManager("M001", "manager1", "password123");
        manager.manageRoles("E001", "Technician");

        EndUser endUser = new EndUser("E001", "user1", "password456", "John Doe", "123-456-7890");
        endUser.register();
        endUser.bookAppointment("T001", "2024-01-30");

        Technician technician = new Technician("T001", "tech1", "password789", "T001", "Appliance Repair");
        technician.checkAppointments();
        technician.collectPayment("APPT123");
        technician.provideFeedback("APPT123", "Great service!");

        // Additional functionality and interactions can be added based on specific
        // requirements.
    }
}
