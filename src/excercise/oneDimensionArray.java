package excercise;

public class oneDimensionArray {
    public static void main(String[] args) {
        int array[]={0,0,0,0,0,0,0,0,0,0};
        int bonus[]= new int[15];
        for(int i = 0; i<15; i++){
           bonus[i]+=1;
        }
        int[] bestscores={23,45,23,45,67};
        for(int j=0;j<5;j++)
        {

                System.out.printf("%d\t",bestscores[j]);
        }
    }

}
