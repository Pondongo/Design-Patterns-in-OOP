package FootShape;
import java.util.Scanner;

public class FootApplication {
    public static void main(String[] args) {
        FootShape footShape = new FootShape();
        Foot foot = new Foot(footShape);
        Scanner sc = new Scanner(System.in);
        System.out.println("What to draw? 1.Ellipse, 2.Rectangle ");
        int footType = sc.nextInt();
        sc.close();
        switch(footType) {
            case 1:
                foot.draw("Ellipse");
                break;
            case 2:
                foot.draw("Rectangle");
                break;
            default:
                System.out.println("default");
        }
    }
}
