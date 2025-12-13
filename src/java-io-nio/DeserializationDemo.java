import java.io.*;

public class DeserializationDemo {

    public static void main(String[] args) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employee.ser"))) {

            Employee emp = (Employee) ois.readObject();
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Employee Name: " + emp.name);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
