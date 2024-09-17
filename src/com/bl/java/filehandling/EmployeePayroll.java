
package com.bl.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeePayroll {

    // Function to create a file
    public static void createFile(String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }

    // Function to write data to a file
    public static void writeData(String filePath, String data) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(data);
            System.out.println("Data Written Successfully");
        } catch (IOException e) {
            System.out.println("An error occurred during writing to the file");
            e.printStackTrace();
        }
    }

    // Function to read data from a file
    public static void readData(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "employee_payroll.txt";

        // Sample data to write
        String data = "ID,Name,Salary\n1,John Doe,50000\n2,Jane Smith,60000\n";

        // Create file and write data
        createFile(filePath);
        writeData(filePath, data);

        // Read and print data from the file
        System.out.println("Reading data from the file:");
        readData(filePath);
    }
}
