package excercise;

import java.util.Scanner;

public class sphere {
    double callSphere(int radius){
        double volume=Math.pow(radius, 3);
        double VolumeOfSphere=(4.0/3.0)*volume;
        System.out.printf("Volume=%.3f",VolumeOfSphere);

        return VolumeOfSphere;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int radius= sc.nextInt();
        sphere sph= new sphere();
        sph.callSphere(radius);
    }
}
