import java.util.*

public class Battle{

public void turn(Character activeChar){
   Combat c = Combat();
   Scanner s = new scanner(System.in);
   System.out.println("Enter which action to perform/nATT for attack");
   if(s.nextLine().equals("ATT")){
   
      