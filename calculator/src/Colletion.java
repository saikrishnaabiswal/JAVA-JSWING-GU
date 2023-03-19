import java.util.Scanner;
import java.util.ArrayList;

public class Colletion {
    public static void main(String[]args)
    {
ArrayList<String> o = new ArrayList();
Scanner s = new Scanner(System.in);
String n;
for(;;)
{
    System.out.println("ENTER 1 FOR APPEND\n \t2 FOR INSERT\n \t3 FOR SEARCH\n \t4 FOR START WITH \n \t5 FOR DISPLAY\n \t6 FOR EXIT");
    int c=s.nextInt();
    switch(c)
    {
        case 1: System.out.println("enter the string\n");
                n=s.next();
                o.add(n);
                break;
        case 2: System.out.println("enter the index and the string\n");
                int i=s.nextInt();
                n=s.next();
                o.add(i,n);
                break;
        case 3: System.out.println("enter the string to be searched\n");
                n=s.next();
                int b = o.indexOf(n);
                if(b==-1)
                    System.out.println("String not found\n");
                else
                    System.out.println("element found at"+b+"\n");
                break;
        case 4: System.out.println("enter the prefix\n");
                String d=s.next();
                for(int z=0;z<o.size();z++)
                {
                    n=o.get(z);
                    if(n.startsWith(d))
                        System.out.println(n);
                }
                break;
        case 5: System.out.println("list elements are\n");
                for(String name:o)
                System.out.println(name);
                System.out.println(o);
                break;
        case 6:System.exit(0);
                
    }
}
    
}
}
