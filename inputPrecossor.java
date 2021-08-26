package XO_Class;
import java.io.Console;
public class inputPrecossor {
    private final int[][] numpadArray = {{7,8,9},{4,5,6},{1,2,3}};
    private int position;
    private String consoleInput;
    public inputPrecossor() {
        Console console = System.console();
        consoleInput = console.readLine();
        this.inputChecker();
    }
    private void inputChecker() {
        while (true) {
            try {
                int pos = Integer.parseInt(consoleInput);
                if (0 < pos && pos < 10) {
                    this.position = pos;
                    break;
                } else {
                    System.out.print("Please Enter 1-9 : ");
                    Console console = System.console();
                    consoleInput = console.readLine();
                }
                
            } catch (Exception e) {
                System.out.print("Please Enter 1-9 : ");
                Console console = System.console();
                consoleInput = console.readLine();
            }
        }
    }
    public int getPosition(Boolean Numpad) {
        if (Numpad) {
            int x = (this.position-1)%3;
            int y = (this.position-1)/3;
            return numpadArray[y][x];
        } else {
            return this.position;
        }
    }
}
