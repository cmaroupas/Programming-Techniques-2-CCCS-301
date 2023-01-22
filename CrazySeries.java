import java.util.ArrayList;

public class CrazySeries {

    public static void main(String[] args) {
        int startNumber = 10;

        ArrayList<Integer> crazySeries = new ArrayList<>();
        getCrazySeries(startNumber, crazySeries);
        System.out.println(crazySeries);
    }

    public static void getCrazySeries(int startNumber, ArrayList<Integer> crazySeries) {
        if (startNumber > 100) {
            startNumber /= 3;
            crazySeries.add(startNumber);
            getCrazySeries(startNumber, crazySeries);
        } else if (startNumber < 5) {
            return;
        } else {
            startNumber *= 2;
            crazySeries.add(startNumber);
            getCrazySeries(startNumber, crazySeries);
        }
        if (startNumber > 5) {
            return; //added this line
        }
    }
}