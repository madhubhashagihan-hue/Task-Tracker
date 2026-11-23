
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> done = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //TASK TRACKER

        loadFromFile();

        int choice;

        System.out.println("--------------------");
        System.out.println("*** Task Tracker ***");
        System.out.println("--------------------");
        while(true){
            //Display options
            System.out.println("1. Add a task");
            System.out.println("2. Update task");
            System.out.println("3. Delete tasks");
            System.out.println("4. Mark task");
            System.out.println("5. Show all tasks");
            System.out.println("6. Show done tasks");
            System.out.println("7. Show not yet done tasks");
            System.out.println("8. Exit");

            //Select a choice
            System.out.print("Choice: ");
            if(!scanner.hasNextInt()){
                System.out.println("Use a number (1-8)");
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> add();
                case 2 -> update();
                case 3 -> delete();
                case 4 -> mark();
                case 5 -> showAll();
                case 6 -> showDone();
                case 7 -> showNotDone();
                case 8 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid");

            }

        }



    }
    //tasks save to text file
    public static void savetoFile(){
        try{
            FileWriter writer = new FileWriter("tasks.txt");
            for(int i = 0; i < tasks.size(); i++){
                writer.write(tasks.get(i)+" | " + done.get(i) + "\n");
            }
            writer.close();
            System.out.println("saved file!");
        }
        catch (IOException e){
            System.out.println("Error saving file!");
        }
    }
    //tasks load from text file
    public static void loadFromFile(){
        try {
            File file = new File("tasks.txt");
            if(!file.exists()) return;
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();

                if(line.trim().isEmpty()){
                    continue;
                }
                String[] parts = line.split("\\|");
                if(parts.length < 2){
                    continue;
                }
                tasks.add(parts[0].trim());
                done.add(Boolean.parseBoolean(parts[1].trim()));

            }
            fileScanner.close();
        }
        catch (Exception e){
            System.out.println("Can't load.");
        }
    }
    //add option
    static void add(){
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        done.add(false);
        savetoFile();
        System.out.println("Added!");
    }
    //see all tasks
    static void showAll(){
        if(tasks.isEmpty()){
            System.out.println("no tasks yet." );
        }
        else{
            System.out.println("------------------------");
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i + 1)  + " " + tasks.get(i) + "| Done: " + done.get(i));
            }
            System.out.println("------------------------");
        }

    }
    //mark tasks
    static void mark(){
        showAll();

        System.out.print("Which task num to mark as done? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if(num < 1 || num > tasks.size()){
            System.out.println("Invalid task number!");
            return;
        }

        done.set(num - 1, true);
        savetoFile();
        System.out.println("Marked as done!");

    }
    //update tasks
    static void update(){
        if(tasks.isEmpty()){
            System.out.println("no tasks yet." );
        }
        else{
            showAll();

            System.out.print("Which task num to update? ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if(num < 1 || num > tasks.size()){
                System.out.println("Invalid task number!");
                return;
            }

            System.out.print("Enter new task: ");
            String newTask = scanner.nextLine();

            tasks.set(num - 1, newTask);
            savetoFile();

            System.out.println("Updated!");
        }

    }
    //delete tasks
    static void delete(){
        if(tasks.isEmpty()){

            System.out.println("no tasks yet." );
        }else{
            showAll();

            System.out.print("Which task num to delete? ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if(num < 1 || num > tasks.size()){
                System.out.println("Invalid task number!");
                return;
            }

            tasks.remove(num - 1);
            done.remove(num - 1);
            savetoFile();

            System.out.println("Deleted!");
        }

    }
    //see done tasks
    static void showDone(){
        if(tasks.isEmpty()){
            System.out.println("no tasks yet." );

        }
        else {

            for(int i = 0; i < tasks.size(); i++){
                if(done.get(i) == true){
                    System.out.println((i + 1)  + " " + tasks.get(i) + " Done: " + done.get(i));
                }

            }


        }
    }
    //see not done tasks
    static void showNotDone(){
        if(tasks.isEmpty()){

            System.out.println("no tasks yet." );
        }
        for(int i = 0; i < tasks.size(); i++){
            if(done.get(i) == false){
                System.out.println((i + 1)  + " " + tasks.get(i) + " Done: " + done.get(i));
            }

        }

    }

}