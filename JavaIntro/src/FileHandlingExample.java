import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException {

        //create object for local file system
        FileSystem fileSystem = FileSystems.getDefault();

        Path currentDirectory = Paths.get("C/Users");//path obj for my current directory

        System.out.println(currentDirectory);

        Path filePath = Paths.get("person.txt");

        if(Files.exists(filePath)){
            System.out.println("File exists");
        }else{
            System.out.println("File doesn't exist, creating a file");

            Files.createFile(filePath); //creating file by reading path, throw FileAlreadyExistsException if file is present.

            Files.write(filePath, "Hello, World!".getBytes());//writing some data to file
            Files.writeString(filePath,"Welcome to the course", StandardOpenOption.APPEND);

            byte[] data = Files.readAllBytes(filePath);
            System.out.println(data);
            System.out.println( Files.readString(filePath));

        }





    }
}
