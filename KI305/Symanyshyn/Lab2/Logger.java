package KI305.Symanyshyn.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Responsible for logging actions to a file.
 */
public class Logger {
    private PrintWriter logWriter;

    /**
     * Initializes the logger and opens the log file.
     */
    public Logger() {
        try {
            logWriter = new PrintWriter(new FileWriter("ClimberEquipment.log", true));
            logAction("Logger initialized.");
        } catch (IOException e) {
            System.out.println("Could not initialize logger: " + e.getMessage());
        }
    }

    /**
     * Logs an action to the log file.
     *
     * @param action The action to log.
     */
    public void logAction(String action) {
        if (logWriter != null) {
            logWriter.println(action);
        }
    }

    /**
     * Closes the logger and releases resources.
     */
    public void close() {
        if (logWriter != null) {
            logAction("Logger closed.");
            logWriter.close();
        }
    }
}
