import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Karthik");

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employee.ser"))) {

            oos.writeObject(emp);
            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
