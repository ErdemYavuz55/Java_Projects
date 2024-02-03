import java.io.File;
import java.util.Scanner;

public class FileExplorer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a directory path: ");
        String directoryPath = scan.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] fileList = directory.listFiles();
            System.out.println("Files in directory:");
            for (File file : fileList) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}

