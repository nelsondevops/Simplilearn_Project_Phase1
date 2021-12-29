package com.codewithnelson;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner obj = new Scanner(System.in);

        while (true) {

            System.out.println("---------SIMPLILEARN PROJECT : PHASE 1---------------");
            System.out.println("----------BY NELSON----------");
            System.out.println("Welcome Agent : Company Lockers Pvt. Ltd. has hired you to perform these tasks ");
            System.out.println("Enter choice number 1 to CREATE a folder");
            System.out.println("Enter choice number 2 to Enter more OPTIONS");
            System.out.println("Enter choice number 3 to EXIT the program");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    File g = new File("/home/nelson/Folder1");
                    if (g.exists()) {
                        System.out.println("Folder already exists");
                    } else {
                        g.mkdir();
                        System.out.println("Folder is created.");
                    }
                    break;
                case 2: {
                    System.out.println("Choice 1 to create a File");
                    System.out.println("Choice 2 to delete a specific file");
                    System.out.println("Choice 3 to search a specific file");
                    System.out.println("Choice 4 to exit and any other number to return to main menu");
                    int choice_2 = obj.nextInt();

                    switch (choice_2) {
                        case 1:
                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Enter the name of the file u wish to create ");
                            String name2 = scan2.nextLine();
                            File k = new File("/home/nelson/Folder1/" + name2);
                            if (k.exists()) {
                                System.out.println("File is already there!!");
                            }
                            else {
                                try {
                                    k.createNewFile();
                                    {
                                        System.out.println("File named " + name2 + " is Created");
                                    }
                                }
                                catch (IOException e)
                                {
                                    System.out.println("An error occurred");
                                    e.printStackTrace();
                                }
                            }

                            break;

                        case 2:

                            System.out.println("All files");

                            File d = new File("/home/nelson/Folder1/");
                            File array[] = d.listFiles();
                            int ar[] = {1, 2, 3};

                            for (int i = 0; i < array.length; i++) {
                                System.out.println(array[i]);
                            }
                            Scanner scan3 = new Scanner(System.in);
                            System.out.println("Enter the name of the file to delete.");
                            String name3 = scan3.nextLine();
                            File l = new File("/home/nelson/Folder1/" + name3);

                            if (l.getName().startsWith(name3))
                            //if(l.exists())
                            {
                                l.delete();
                                System.out.println("File " + name3 + " is deleted");
                            } else {
                                System.out.println("Cannot be deleted");
                            }

                            break;

                        case 3:
                            Scanner scan = new Scanner(System.in);
                            System.out.println("All files");

                            File z = new File("/home/nelson/Folder1/");
                            File array3[] = z.listFiles();
                            int ar1[] = {1, 2, 3};
                            for (int i = 0; i < array3.length; i++) {
                            System.out.println(array3[i]);
                                                     }



                            System.out.println("Enter the file you wish to search.");
                            String name4 = scan.nextLine();
                            File f2 = new File("/home/nelson/Folder1/");
                            File arr[] = f2.listFiles();

                            for(int i=0;i<arr.length;i++) {
                                if (arr[i].getName().startsWith(name4)) {
                                    System.out.println("File you searched is located at: " + arr[i]);
                                }
                                else
                                {
                                    System.out.println("File is not available");
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Terminated from inner switch case");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Going to main menu....");
                            break;
                    }
                }
                break;
                case 3:
                    System.out.println("Program successfully exited");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice Please try again");
                    break;
            }
        }
    }
}





