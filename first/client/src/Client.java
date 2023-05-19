import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static Socket socket;
    private static InputStreamReader inputStreamReader;
    private static ObjectInputStream objectInputStream;
    private static PrintWriter printWriter;
    private static BufferedReader bufferedReader;
    private static Scanner scanner;
    private static Boolean isLoggedIn;
    private static Student student;

    public Client(Socket s) throws IOException {
        socket =s;
        inputStreamReader = new InputStreamReader(socket.getInputStream());
        objectInputStream = new ObjectInputStream(socket.getInputStream());
        printWriter= new PrintWriter(socket.getOutputStream());
        bufferedReader = new BufferedReader(inputStreamReader);
        scanner = new Scanner(System.in);
        isLoggedIn=false;
    }

    public void getInstructions () throws IOException {
        while (!socket.isClosed()) {
            System.out.println("Instructions : ");
            System.out.println("information: User Information");
            System.out.println("courses : User enrolled courses");
            System.out.println("logout : sign out from the account");
            String temp = scanner.nextLine();
            if (temp.equals("logout")) {
                isLoggedIn=false;
                student=null;
                break;
            }
            else if(temp.equals("information")){
                userInformation();
            }
            else if(temp.equals("courses")){
                userCourses();
            }
        }

    }
    public void login() throws IOException, ClassNotFoundException {

        while(!isLoggedIn) {
            System.out.print("Please Enter Your Email : ");
            String email = scanner.nextLine();
            System.out.print("Please Enter Your Password : ");
            String password = scanner.nextLine();
            printWriter.println("login");
            printWriter.flush();
            printWriter.println(email);
            printWriter.flush();
            printWriter.println(password);
            printWriter.flush();
            Boolean isExist = Boolean.valueOf(bufferedReader.readLine());
            if (isExist){
                isLoggedIn=true;
                Object object = objectInputStream.readObject();
                student = (Student) object;
            }
            else {
                System.out.println("Please enter an exitsting email ");
            }
        }

    }
    public void start() throws IOException, ClassNotFoundException {
        while(!socket.isClosed()) {
            if (!isLoggedIn) {
                login();
            } else {
                getInstructions();
            }
        }
    }

    public void userInformation(){
        System.out.println("Name : "+student.getName());
        System.out.println("Email : "+student.getEmail());
        System.out.println("Major : "+student.getMajor());
        System.out.println("Courses : ");
        for (Course course:  student.getCourses()) {
            System.out.println(course.getName());
        }

        System.out.println();
    }
    public void userCourses() throws IOException {
        System.out.println("Course\t\t\t\tMark");
        for (Course course:  student.getCourses()) {
            System.out.println(course.getName()+"\t\t\t"+course.getMark());
        }
        while(true) {
            System.out.println("Instructions : ");
            System.out.println("<Course Name> : Course information");
            System.out.println("exit : back to the main screen");
            String inst = scanner.nextLine();
            if (inst.equals("exit")){
                break;
            }
            else {
                int id=0;
                for (Course course:  student.getCourses()) {
                   if (course.getName().equals(inst)){
                       id=course.getId();
                   }

                }
                if (id==0){
                    System.out.println("Please enter an existing course");
                    continue;
                }
                printWriter.println("course:"+id);
                printWriter.flush();
                double min,max,avg,median;
                min = Double.parseDouble(bufferedReader.readLine());
                max = Double.parseDouble(bufferedReader.readLine());
                avg = Double.parseDouble(bufferedReader.readLine());
                median = Double.parseDouble(bufferedReader.readLine());
                System.out.println("Min mark : "+min);
                System.out.println("Max mark : "+max);
                System.out.println("Average : "+avg);
                System.out.println("Median : "+median);


            }
            }



        }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost",1234);
        Client client = new Client(socket);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Grading system");
        client.start();
    }

}
