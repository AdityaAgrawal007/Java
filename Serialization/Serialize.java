package Serialization;

import javax.imageio.IIOException;
import java.io.*;

// Process of converting object into byte stream (stream (linear) of bytes tha can store contents + metadata, platform
// independant hence can be saved as file, sent over network etc, deserialization is  vise-versa

// 1. object class should implement Serializable
public class Serialize implements Serializable {
    public static void main(String args[]) {
        party p = new party();
        p.name = "elon";
        p.age = 123;
        p.welcome();

        // FileOutPutStream is used to write binary to files, FileWrite is used to write chars
        try {
            FileOutputStream fos = new FileOutputStream("outputFile.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(p);
            out.close();
            fos.close();
            System.out.println("enjoy the party ;)");

        } catch (IIOException | FileNotFoundException e) {
            System.out.println("IIOException ouccured");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
