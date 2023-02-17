package task;

import enums.Priority;
import enums.UserLevel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;

public class test {
    
    public static void main(String[] args) throws ParseException {
         TaskTree test = new TaskTree("Theo");
         
         Task x = new Task("Eat");
         Task y = new Task("Sleep");
         Task z = new Task("Drink");
         
         x.setPriority(Priority.VERYHIGH);
         y.setPriority(Priority.LOW);
         z.setPriority(Priority.MEDIUM);
         
         test.add(x);
         test.add(y);
         test.add(z);
         
         test.user.setLeaves(200);
         test.user.setRanking(UserLevel.SAPLING);
         
         int max = UserLevel.getLevel(test.user.getLeaves()).leaves;
         
         System.out.println(max);
    }
}
