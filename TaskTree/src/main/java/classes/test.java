package classes;

import enums.Priority;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;

public class test {
    
    public static void main(String[] args) throws ParseException {
        Task test1 = new Task("Test1");
        Task test2 = new Task("Test2");
        Task test3 = new Task("Test3");
        
        test1.setPriority(Priority.VERYHIGH);
        test2.setPriority(Priority.MEDIUM);
        test3.setPriority(Priority.LOW);
        
        System.out.println("Test = "+test1.compareTo(test2));
        
        TaskTree t = new TaskTree();
        t.add(test1);
        t.add(test2);
        t.add(test3);
        
        t.traversal();
        
        DateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        Date due = f.parse("2023/12/12");
        Date now = new Date();
        
       // System.out.println(due);
        System.out.println(due);
        System.out.println(f.format(now));
        System.out.println(due.after(now));
       
    }
}
