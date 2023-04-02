import com.company.DateTime;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Spam {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Enter the message : ");
        String Text = sc.nextLine();
        System.out.println("How many times you want to send :");
        int size = sc.nextInt();

        System.out.println("Date  :"+date.toString());
        System.out.println("Time  :"+time.toString());


        //Clipboard
        StringSelection stringSelection = new StringSelection(Text) ;
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);
        Thread.sleep(3000);

        //Paste

        Robot robot = new Robot();
        for(int i=1 ; i<=size ; i++) {


            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(1000);
        }

    }
}
