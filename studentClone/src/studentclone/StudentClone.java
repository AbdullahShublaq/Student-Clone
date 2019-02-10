package studentclone;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentClone {

    public static Student std = new Student();
    public static ArrayList<Student> list = new ArrayList<Student>();

    public static void AddStudent(String name, long id, String collage) {
        Student std2;
        try {
            std2 = (Student) std.clone();
            std2.setName(name);
            std2.setId(id);
            std2.setCollage(collage);
            list.add(std2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void display() {
        for (Student std : list) {
            std.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("1.add\n2.display\n3.end");
            System.out.print("   Choice:");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name");
                    in.nextLine();
                    String name = in.nextLine();

                    System.out.println("Enter the id");
                    long id = in.nextLong();
                    in.nextLine();

                    System.out.println("Enter the collage");
                    String collage = in.nextLine();

                    AddStudent(name, id, collage);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
    }

}
