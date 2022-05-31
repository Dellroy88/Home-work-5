public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 - 2");
        int[] precent = {560, 266, 145};
        int[] salary = {5614, 29329, 17956};
        double[] arr = {1.57, 7.654, 9.986};
        for (int i = 0; i < precent.length; i++) {
            if (i != precent.length - 1)
                System.out.print(precent[i] + ", ");
            else
                System.out.print(precent[i]);
        }
        System.out.println();

        for (int i = 0; i < salary.length; i++) {

            if (i != salary.length - 1)
                System.out.print(salary[i] + ", ");
            else
                System.out.print(salary[i]);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = precent.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(precent[i] + ", ");
            else if (i == 0)
                System.out.print(precent[i]);
        }
        System.out.println();

        for (int i = salary.length - 1; i >= 0; i--) {

            if (i != 0)
                System.out.print(salary[i] + ", ");
            else if (i == 0)
                System.out.print(salary[i]);
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");
            else if (i == 0)
                System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < precent.length; i++) {
            if (precent[i] % 2 == 1)
                precent[i] = precent[i] + 1;
            if (i != precent.length - 1)
                System.out.print(precent[i] + ", ");
            else
                System.out.print(precent[i]);
        }
        System.out.println();

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] % 2 == 1)
                salary[i] = salary[i] + 1;
            if (i != salary.length - 1)
                System.out.print(salary[i] + ", ");
            else
                System.out.print(salary[i]);
        }

        }
    }
