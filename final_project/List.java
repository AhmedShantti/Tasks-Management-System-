
package final_project;

import java.util.*;

public class List {

    public static TaskClass[] tasks = new TaskClass[50];
    public static int count = 0;                                    //
    public static int nextId = 0;                                   //to give a number to each task
    public static Scanner in = new Scanner(System.in);

    public static void menu(){

        System.out.println("1.Add a new task\n"
                +"2.Remove an existing task\n"
                +"3.Edit a task\n"
                +"4.Mark a task as completed\n"
                +"5.List all tasks\n"
                +"6.Sort tasks by date\n"
                +"7.Exit");
        System.out.println("\nEnter your choice:");


        Scanner x = new Scanner(System.in);
        int choice = x.nextInt();

        switch(choice){
            case 1: add();
                break;

            case 2: remove();
                break;

            case 3: Edit();
                break;

            case 4: mark();
                break;

            case 5: list();
                break;

            case 6: 
                break;

            case 7: System.exit(0);




        }
    }

    public static void add(){
        ++nextId;
        System.out.println("Add a new tasks ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Enter your task:");
        String des = in.next();
        System.out.println("Enter the day of month from [1 to 31]:");
        int day = in.nextInt();
        System.out.println("Enter the month of year from [ 1 to 12] :");
        int month = in.nextInt();
        System.out.println("Enter the year:");
        int year = in.nextInt();
        Dateclass date = new Dateclass(day, month, year);
        tasks[count] = new TaskClass(nextId, des, date);

        count++;
        System.out.println("\t");
        menu();
    }

    public static void remove() {

        System.out.println("Remove a task:");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Enter the ID of the task you want to remove:");
        int idremove = in.nextInt();

        for (int i = 0; i < count; i++) {
            if (tasks[i].getId() >= idremove) {
                tasks[i] = tasks[i + 1];
            }
        }
        count--;

            if (tasks[count].getId() == idremove) {
                tasks[count]=null;
                count--;
            }
        menu();
    }

    public static void Edit(){
        System.out.println("\tEdit task:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Enter the ID of task you want to edit :");

        int idedit = in.nextInt();

        for (int i = 0; i < count; i++) {

            if (idedit == tasks[i].getId()) {
                System.out.println("Enter the new task:");
                tasks[i].setdes(in.next());
                System.out.println("-EDITED SUCCESFULLAY-");
                break;
            }

        }

    }

   public static void mark() {
        System.out.println("Enter the ID of the task you want to mark:");
        int idcheck = in.nextInt();
        for (int i = 0; i < count; i++) {
            if (tasks[i].getId() == idcheck) {
                tasks[i].isCompleted(true);
                return;
            }
        }
        System.out.println("Task is completed");
        menu();
        }



    public static void list() {
        System.out.println("\t VIEW ALL TASKS:");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\t id \t task");

        for (int i =0 ; i<tasks.length;i++) {
            if (tasks[i] == null)
                continue;
            System.out.println(tasks[i].getId()+"\t\t\t\t\t"+tasks[i].getdes()+"\t\t\t\t\t"+tasks[i].getdueDate()+"\t\t\t"+tasks[i].IsCompleted());
        }
        menu();
    }

}  
    

    /*public static void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
              if (tasks[j].getdueDate())
            }
        }
        System.out.println("Tasks sorted by due date.");
        menu();
    }

  
}*/


