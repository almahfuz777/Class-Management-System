import java.util.*;

public class Main{

    // course sections
    static Set<Integer> data1 = new HashSet<Integer>();
    static Set<Integer> data2 = new HashSet<Integer>();
    static Set<Integer> data3 = new HashSet<Integer>();
    static Set<Integer> data4 = new HashSet<Integer>();
    static Set<Integer> data5 = new HashSet<Integer>();
    // Course List of Students
    static Set<Integer> myCourses_100 = new HashSet<Integer>();
    static Set<Integer> myCourses_200 = new HashSet<Integer>();
    static Set<Integer> myCourses_300 = new HashSet<Integer>();



    // program starts here
    public static void main(String[] args){
        landing();
    }
    public static void landing(){
        displayHeading("Teacher Student Centre");
        verification();
    }
    public static void displayHeading(String title){
        System.out.println("=======================");
        System.out.printf("%18s\n",title);
        System.out.println("=======================\n");
    }


    // verifies the type of user(teacher/student) and opens their corresponding menu
    public static void verification(){

        Scanner input = new Scanner(System.in);

        System.out.println("Are you a Student or a Teacher?");
        System.out.println("\n1) Teacher\n2) Student\n");

        System.out.print("Enter your choice: ");
        byte selection = input.nextByte();

        if(selection==1){
            System.out.print("Enter your Initial: ");
            String id = input.next();
            verifyTeacherID(id);

        }
        else if(selection==2){
            System.out.print("Enter your ID: ");
            int id = input.nextInt();
            verifyStudentID(id);
        }
        else{
            System.out.println("Wrong Selection. Try Again");
        }

    }
    public static void verifyTeacherID(String id){
        String[] list = new String[]{"Sfr1", "HAr", "MLE"}; // teacher initials
        byte flag = 0;
        for(int i=0;i< list.length;i++){
            if(id.equals(list[i])){
                flag = 1;
                switch(id){
                    case "Sfr1" : Sfr1_menu(); break;
                    case "HAr" : HAr_Menu(); break;
                    case "MLE" : MLE_menu(); break;
                }
            }
        }
        if(flag == 0){
            System.out.println("Wrong Input. Try Again");
            System.exit(0);
        }
    }
    public static void verifyStudentID(int id){
        int[] list = new int[]{100, 200, 300};  // student id's
        byte flag = 0;
        for(int i=0;i< list.length;i++){
            flag = 1;
            if(id==list[i]){
                switch(id){
                    case 100 : menu_100(); break;
                    case 200 : menu_200(); break;
                    case 300 : menu_300(); break;
                }
            }
        }
        if(flag == 0){
            System.out.println("Wrong Input. Try Again");
            System.exit(0);
        }
    }



    // Teacher Area
    public static int teacherLanding(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) View assigned sections\n2) Exit");
        System.out.print("\nEnter your choice: ");
        int selection = sc.nextInt();
        return selection;
    }

    // Teacher Menu
    public static void Sfr1_menu(){
        Scanner sc = new Scanner(System.in);
        displayHeading("Teacher Portal - Sfr1");

        int selection = teacherLanding();
        switch (selection){
            case 1 :    // view assigned sections
                System.out.println("\nYour sections:\n1) CSE115.2\n2) CSE215.1");
                System.out.print("\nView Student List for: ");
                byte sel = sc.nextByte();
                switch (sel){
                    case 1:
                        if(data2.isEmpty()) System.out.println("\nNo Student in this section yet");
                        else {
                            System.out.println("\nStudent List (CSE115.2)\n" + data2);
                        }
                    break;
                    case 2:
                        if(data3.isEmpty()) System.out.println("\nNo Student in this section yet");
                        else{
                            System.out.println("\nStudent List (CSE215.1)\n" + data3); break;
                        }
                    break;
                }
            break;

            case 2 :    // exit
                System.exit(0);
            break;
        }
        System.out.print("\n1) Main Menu 2) Sign Out 3) Exit\nEnter your choice:");
        byte c = sc.nextByte();
        switch (c){
            case 1: Sfr1_menu(); break;
            case 2: landing(); break;
            case 3: System.exit(0); break;
        }
    }
    public static void MLE_menu(){
        Scanner sc = new Scanner(System.in);
        displayHeading("Teacher Portal - MLE");

        int selection = teacherLanding();
        switch (selection){
            case 1 :
                System.out.println("\nYour sections:\n1) CSE115.1\n2) CSE215.2");
                System.out.print("\nView Student List for: ");
                byte sel = sc.nextByte();
                switch (sel){
                    case 1:
                        if(data1.isEmpty()) System.out.println("\nNo Student in this section yet");
                        else {
                            System.out.println("\nStudent List (CSE115.2)\n" + data1);
                        }
                        break;
                    case 2:
                        if(data4.isEmpty()) System.out.println("\nNo Student in this section yet");
                        else{
                            System.out.println("\nStudent List (CSE215.1)\n" + data4); break;
                        }
                        break;
                }
                break;

            case 2 :
                System.exit(0);
                break;
        }
        System.out.print("\n1) Main Menu 2) Sign Out 3) Exit\nEnter your choice:");
        byte c = sc.nextByte();
        switch (c){
            case 1: MLE_menu(); break;
            case 2: landing(); break;
            case 3: System.exit(0); break;
        }
    }
    public static void HAr_Menu(){
        Scanner sc = new Scanner(System.in);
        displayHeading("Teacher Portal - HAr");

        int selection = teacherLanding();
        switch (selection){
            case 1 :
                System.out.println("\nYour sections:\n1) MAT130.1.2");
                System.out.print("\nView Student List for: ");
                byte sel = sc.nextByte();
                switch (sel){
                    case 1:
                        if(data5.isEmpty()) System.out.println("\nNo Student in this section yet");
                        else {
                            System.out.println("\nStudent List (CSE115.2)\n" + data5);
                        }
                        break;
                }
                break;

            case 2 :
                System.exit(0);
                break;
        }
        System.out.print("\n1) Main Menu 2) Sign Out 3) Exit\nEnter your choice:");
        byte c = sc.nextByte();
        switch (c){
            case 1: HAr_Menu(); break;
            case 2: landing(); break;
            case 3: System.exit(0); break;
        }
    }


    // Student Area
    public static int studentLanding(){
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "1) Enrolled Courses\n" +
                "2) Add Course\n" +
                "3) Remove Course\n" +
                "4) Sign Out\n" +
                "5) Exit");
        System.out.print("Enter your choice: ");
        int sel = sc.nextInt();
        return sel;
    }
    public static int courseChoicePrompt(){
        displayHeading("Course Selection");
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "Courses\t\tSection\t\tTiming\t\tFaculty\n" +
                "1) CSE115\t  1\t\t\t8:00-9:30\t MLE\n" +
                "2) CSE115\t  2\t\t\t2:40-4:10\t Sfr1\n" +
                "3) CSE215\t  1\t\t\t8:00-9:30\t Sfr1\n" +
                "4) CSE215\t  2\t\t\t2:40-4:10\t MLE\n" +
                "5) MAT130\t  3\t\t\t11:20-12:50\t HAR\n");
        System.out.print("Enter your choice: ");
        int sel = sc.nextInt();
        return sel;
    }

    // Student Menu
    public static void menu_100(){
        Scanner sc = new Scanner(System.in);
        displayHeading("Student Portal - 100");

        int sel = studentLanding();
        switch (sel){
            case 1: // Enrolled Courses
                if(myCourses_100.isEmpty()) System.out.println("\nNot Enrolled in any Courses");
                else {
                    System.out.println("\nYour Courses: \n");
                    System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                    if (myCourses_100.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                    if (myCourses_100.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                    if (myCourses_100.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                    if (myCourses_100.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                    if (myCourses_100.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");
                }
            break;
            case 2: // Add Course
                int choice = courseChoicePrompt(); // prompts courses and returns with course serial

                switch (choice){
                    case 1:
                        if(myCourses_100.contains(1) || myCourses_100.contains(3)) {
                            System.out.println("\nCourse time clashes with your another course.");
                        }
                        else{
                            myCourses_100.add(1);
                            data1.add(100);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 2:
                        if(myCourses_100.contains(2) || myCourses_100.contains(4)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_100.add(2);
                            data2.add(100);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 3:
                        if(myCourses_100.contains(3) || myCourses_100.contains(1)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_100.add(3);
                            data3.add(100);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 4:
                        if(myCourses_100.contains(4) || myCourses_100.contains(2)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_100.add(4);
                            data4.add(100);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 5:
                        if(myCourses_100.contains(5)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_100.add(5);
                            data5.add(100);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                }
            break;
            case 3: // remove course
                System.out.println("\nYour Courses: \n");
                System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                if (myCourses_100.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                if (myCourses_100.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                if (myCourses_100.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                if (myCourses_100.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                if (myCourses_100.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");

                System.out.print("Select a course to delete: ");
                int c = sc.nextInt();

                myCourses_100.remove(c-1);
                System.out.println("Course removed Successfully");

                break;
            case 4: landing(); break;   // takes to the main landing
            case 5: System.exit(0); break;  // exits the program
        }
        System.out.print("\n1)Main menu 2) Sign Out 3) Exit\nEnter your choice: ");
        int c = sc.nextInt();
        switch(c){
            case 1: menu_100(); break;
            case 2: landing();
            case 3: System.exit(0); break;
        }
    }
    public static void menu_200(){
            Scanner sc = new Scanner(System.in);
            displayHeading("Student Portal - 200");

            int sel = studentLanding();
            switch (sel){
                case 1: // Enrolled Courses
                    if(myCourses_200.isEmpty()) System.out.println("\nNot Enrolled in any Courses");
                    else {
                        System.out.println("\nYour Courses: \n");
                        System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                        if (myCourses_200.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                        if (myCourses_200.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                        if (myCourses_200.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                        if (myCourses_200.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                        if (myCourses_200.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");
                    }
                    break;
                case 2: // Add Course
                    int choice = courseChoicePrompt(); // prompts courses and returns with course serial

                    switch (choice){
                        case 1:
                            if(myCourses_200.contains(1) || myCourses_200.contains(3)) {
                                System.out.println("\nCourse time clashes with your another course.");
                            }
                            else{
                                myCourses_200.add(1);
                                data1.add(200);
                                System.out.println("Course Added Successfully");
                            }
                            break;
                        case 2:
                            if(myCourses_200.contains(2) || myCourses_200.contains(4)) {
                                System.out.println("Course time clashes with your another course.");
                            }
                            else{
                                myCourses_200.add(2);
                                data2.add(200);
                                System.out.println("Course Added Successfully");
                            }
                            break;
                        case 3:
                            if(myCourses_200.contains(3) || myCourses_200.contains(1)) {
                                System.out.println("Course time clashes with your another course.");
                            }
                            else{
                                myCourses_200.add(3);
                                data3.add(200);
                                System.out.println("Course Added Successfully");
                            }
                            break;
                        case 4:
                            if(myCourses_200.contains(4) || myCourses_200.contains(2)) {
                                System.out.println("Course time clashes with your another course.");
                            }
                            else{
                                myCourses_200.add(4);
                                data4.add(200);
                                System.out.println("Course Added Successfully");
                            }
                            break;
                        case 5:
                            if(myCourses_200.contains(5)) {
                                System.out.println("Course time clashes with your another course.");
                            }
                            else{
                                myCourses_200.add(5);
                                data5.add(200);
                                System.out.println("Course Added Successfully");
                            }
                            break;
                    }
                    break;
                case 3: // remove course
                    System.out.println("\nYour Courses: \n");
                    System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                    if (myCourses_200.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                    if (myCourses_200.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                    if (myCourses_200.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                    if (myCourses_200.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                    if (myCourses_200.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");

                    System.out.print("Select a course to delete: ");
                    int c = sc.nextInt();

                    myCourses_200.remove(c-1);
                    System.out.println("Course removed Successfully");

                    break;
                case 4: landing(); break;   // takes to the main landing
                case 5: System.exit(0); break;  // exits the program
            }
            System.out.print("\n1)Main menu 2) Sign Out 3) Exit\nEnter your choice: ");
            int c = sc.nextInt();
            switch(c){
                case 1: menu_200(); break;
                case 2: landing();
                case 3: System.exit(0); break;
            }
    }
    public static void menu_300() {
        Scanner sc = new Scanner(System.in);
        displayHeading("Student Portal - 300");

        int sel = studentLanding();
        switch (sel){
            case 1: // Enrolled Courses
                if(myCourses_300.isEmpty()) System.out.println("\nNot Enrolled in any Courses");
                else {
                    System.out.println("\nYour Courses: \n");
                    System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                    if (myCourses_300.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                    if (myCourses_300.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                    if (myCourses_300.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                    if (myCourses_300.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                    if (myCourses_300.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");
                }
                break;
            case 2: // Add Course
                int choice = courseChoicePrompt(); // prompts courses and returns with course serial

                switch (choice){
                    case 1:
                        if(myCourses_300.contains(1) || myCourses_300.contains(3)) {
                            System.out.println("\nCourse time clashes with your another course.");
                        }
                        else{
                            myCourses_300.add(1);
                            data1.add(300);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 2:
                        if(myCourses_300.contains(2) || myCourses_300.contains(4)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_300.add(2);
                            data2.add(300);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 3:
                        if(myCourses_300.contains(3) || myCourses_300.contains(1)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_300.add(3);
                            data3.add(300);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 4:
                        if(myCourses_300.contains(4) || myCourses_300.contains(2)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_300.add(4);
                            data4.add(300);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                    case 5:
                        if(myCourses_300.contains(5)) {
                            System.out.println("Course time clashes with your another course.");
                        }
                        else{
                            myCourses_300.add(5);
                            data5.add(300);
                            System.out.println("Course Added Successfully");
                        }
                        break;
                }
                break;
            case 3: // remove course
                System.out.println("\nYour Courses: \n");
                System.out.println("Courses\t\tSection\t\tTiming\t\tFaculty");
                if (myCourses_300.contains(1)) System.out.println("CSE115\t\t  1\t\t\t8:00-9:30\t MLE");
                if (myCourses_300.contains(2)) System.out.println("CSE115\t\t  2\t\t\t2:40-4:10\t Sfr1");
                if (myCourses_300.contains(3)) System.out.println("CSE215\t\t  3\t\t\t8:00-9:30\t Sfr1");
                if (myCourses_300.contains(4)) System.out.println("CSE215\t\t  4\t\t\t2:40-4:10\t MLE");
                if (myCourses_300.contains(5)) System.out.println("MAT130\t\t  1\t\t\t8:00-9:30\t HAR");

                System.out.print("Select a course to delete: ");
                int c = sc.nextInt();

                myCourses_300.remove(c-1);
                System.out.println("Course removed Successfully");

                break;
            case 4: landing(); break;   // takes to the main landing
            case 5: System.exit(0); break;  // exits the program
        }
        System.out.print("\n1)Main menu 2) Sign Out 3) Exit\nEnter your choice: ");
        int c = sc.nextInt();
        switch(c){
            case 1: menu_300(); break;
            case 2: landing();
            case 3: System.exit(0); break;
        }
    }

}
