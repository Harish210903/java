import java.util.Scanner;
class UserNameValidator{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a username:");
String username=scanner.nextLine();
boolean isValid=username.length()>=5 && username.matches("^[a-zA-Z0-9]*$");
System.out.println(isvalid ? "Valid username!" : "Invalid username.Must have atleast 5 charcters and contain only letters and numbers.");
}
}