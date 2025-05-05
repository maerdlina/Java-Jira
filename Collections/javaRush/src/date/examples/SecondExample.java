package date.examples;

import java.util.Date;

public class SecondExample {
    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);               // ждем 3 секунд
//        Thread.sleep(6000);              // ждем 6 секунд

        Date currentTime = new Date();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }
    }
}
