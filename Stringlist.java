import java.util.ArrayList;
import java.util.Scanner;
public class Stringlist{
 public static void main(String[] args){
  ArrayList<String>Stringlist=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  Stringlist.add("Apple");
  Stringlist.add("Banana");
  Stringlist.add("Mango");
  Stringlist.add("Orange");
  System.out.println("original list:"+Stringlist);
  Stringlist.add(2,"grapes");
  System.out.println("After adding the list:"+Stringlist);
  Stringlist.remove("Banana");
  System.out.println("After removing the list:"+Stringlist);
  System.out.println("enter  the string to search:");
  String search =sc.nextLine();
  if(Stringlist.contains(search))
  {
   System.out.println(search+" found in the list");
   }
   else {
    System.out.println(search +" not found in the list");
    }
    System.out.println("final list:");
    for(String str:Stringlist)
    {
     System.out.println(str);
     }
     sc.close();
     }
     }
