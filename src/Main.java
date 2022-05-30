public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] one = new int[1];
        one[0] = 34;
        int[] two = new int[2];
        two[0] = 26;
        two[1] = 10;
        double[] array = {1.57, 7.654, 9.986};{
            System.out.println(array[2]);
        }

        System.out.println("Задание 2");
        {
            System.out.println(one[0]);
        }
        {
            System.out.println(two[0] + ", " + two[1]);
        }
        {
            System.out.print(array[0] + ", " + array[1] + ", " + array[2]);
        }
        System.out.println();
        System.out.println("Задание 3");
        {
            System.out.println(one[0]);
        }
        {
            System.out.println(two[1] + ", " + two[0]);
        }
        {
            System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
        }
        System.out.println("Задание 4");
        for (int i = 0; i < two.length; i++) {
            two[0] = two[0]+1;
            two[1] = two[1]+1;
            System.out.println(two[i]);
        }
    }
}