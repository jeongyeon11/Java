package school.exam2;

public class exam4 {
    public static void main(String[] args) {
        double[][] interestes = {{3.2,3.1,3.2,3.0},{2.9,2.8,2.7,2.6},{2.7,2.6,2.5,2.7}};
        double[] sum1 = new double[3];
        double sum2 = 0.0;
        for(int i = 0; i < interestes.length; i++) {
            for(int j = 0; j < interestes[i].length; j++)
                sum1[i] += interestes[i][j];
            System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i+1, sum1[i]/4);
            sum2 += sum1[i];
        }
        System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2/(3*4));
    }
}
