package currency;
import java.util.*;
public class Currency {
public static void main(String[] args){
String arr[]={"INR 6700","INR 5500","INR 800","INR 9990"};
List<Integer> lis=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
{
lis.add(Integer.parseInt(arr[i].replaceAll("INR ","")));
}
Collections.sort(lis);
System.out.println("Minimum Value is :"+lis.get(0));
}
}