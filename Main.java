import java.util.Arrays;

public class Main
{
    public static void main(String[] args){
        int[] c = new int[11];
        int b = 24;
        int a = 4;
        int i = 0;
        while (a <= b){
            c[i] = b;
            b = b - 2;
            ++i;
        }
        float[] x = new float[14];
        i = 0;
        while (i < 14){
             x[i] = (float)Math.random() * 14 - 3;
             ++i;
        }
        int[] el = {6, 12, 16, 18, 24};
        double[][] C = new double[11][14];
        for (i = 0;i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = switch(c[i]) {
                    case 22 -> Math.cbrt(Math.atan(Math.pow(Math.E, -1 * Math.abs(x[j]))));
                    case 6, 12, 16, 18, 24 -> Math.asin(Math.cos(Math.pow(Math.E, Math.pow(x[j], x[j]))));
                    default -> Math.pow(Math.atan(0.5 * Math.pow(Math.E, -1 * Math.abs(x[j]))) / 2, 2);
                };
            }
        }
        for (i = 0; i < C.length; ++i){
            for (int j = 0; j < C[i].length; ++j)
            {
                String res = String.format(" %11.5e", C[i][j]);
                System.out.print(res);
            }
            System.out.println();
        }
    }
}