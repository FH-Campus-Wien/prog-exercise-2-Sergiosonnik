package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        int num = 1;

        System.out.print("Number " + num + ": ");
        num += 1;

        x = sc.nextDouble();
        y = 1;
        if (x < 0 && num == 2)
        {
            System.out.println("No number entered.");
        }
            while (x > 0 && y > 0)
        {
            System.out.print("Number " + num + ": ");
            num += 1;
            y = sc.nextDouble();
            double temp = Math.max(x,y);

            if (x > y)
            {
                x = y;
            }
            else
            {
                x = temp;
            }

            if (y <= 0 || x <= 0)
            {
                System.out.printf("The largest number is " + "%.2f" + "%n", temp);
            }
        }



    }


    //todo Task 2
    public void stairs(){
        Scanner sc = new Scanner(System.in);
        int num1 = 1;
        System.out.print("n: ");
        int num2 = sc.nextInt();

        if (num2 < 0)
        {
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0; i < num2; i++)
        {
            for (int j = 0; j < num2; j++)
            {
                if (i >= j)
                {
                    System.out.print(num1 + " ");
                    num1++;
                }
            }
            System.out.println();
        }
    }



    //todo Task 3
    public void printPyramid(){
        int pyramide = 6;
        int empty = pyramide-1;
        int output = 1;
        for (int i = 0; i < pyramide; i++)
        {
            for (int j = 0; j < empty; j++)
            {
                System.out.print(" ");
            }
            for (int y = 0; y < output; y++)
            {
                System.out.print("*");
            }
            output += 2;
            empty--;
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        if(h % 2 == 0)
        {
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }

        for (int i = 1; i < h / 2 + 2; i++)
        {
            for (int j = 0; j < h / 2 - i + 1; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                char amk = (char) (c + 1 - k);
                System.out.print(amk);
            }
            for (int l = 2; l <= i; l++)
            {
                char amk2 = (char) (c + 1 - l);
                System.out.print(amk2);
            }
            System.out.println();
        }

        for (int i = 0; i < h / 2; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= h/2-1; k++)
            {
                char num1 = (char) ((c-h/2+1)+k);
                System.out.print(num1);
            }
            for (int k = i; k <= h/2-2; k++)
            {
                char num2 = (char) (c-1-k);
                System.out.print(num2);
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int input;
        int sum = 0;
        double ave = 0.00;
        int neg = 0;
        do {
            System.out.print("Mark " + count + ": ");
            input = sc.nextInt();

            if (input < 6 && input != 0)
            {
                sum += input;
                if (input == 5)
                {
                    neg++;
                }
                count++;

            }
            else if (input != 0)
            {
                System.out.println("Invalid mark!");
            }
            else
            {
                count--;
            }
        } while (input != 0);

        if (count != 0)
        {
            ave = (double) sum / count;
        }
        System.out.println("Average: " + String.format("%.2f", ave));
        System.out.println("Negative marks: " + neg);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int helper = 0;
        while (n != 1 && n != 4)
        {
            while (n != 0)
            {
                helper += Math.pow((n % 10), 2);
                n = n / 10;
            }
            n = helper;
            helper = 0;
        }
        if (n == 1)
        {
            System.out.println("Happy number!");
        }
        else
        {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}