import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args){
        System.out.println("Input the task's number (1-8)");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);


        int choice = input.nextInt();
        switch(choice){
            case 1:
                int x, y;
                int sum, difference, product;
                double quotient;
                System.out.println("Input x:");
                x = input2.nextInt();
                System.out.println("Input y:");
                y = input3.nextInt();
                sum = x + y;
                difference = x - y;
                product = x * y;
                quotient = x / y;
                System.out.println("Sum is " + sum);
                System.out.println("Difference is " + difference);
                System.out.println("Product is " + product);
                System.out.println("Quotient is " + quotient);
                break;

            case 2:
                int a, b, c;
                double z;
                System.out.println("Input a:");
                a = input2.nextInt();
                System.out.println("Input b:");
                b = input3.nextInt();
                System.out.println("Input c:");
                c = input4.nextInt();
                z = ((a - 3) * b/2) + c;
                System.out.println("Value is " + z);
                break;

            case 3:
                System.out.println("Input a:");
                a = input2.nextInt();
                System.out.println("Input b:");
                b = input3.nextInt();
                System.out.println("Input c:");
                c = input4.nextInt();
                double h1, h2, h3;
                h1 = Math.sqrt(Math.pow(b, 2) + (4 * a * c));
                h1 += b;
                h1 /= (2 * a);
                h2 = Math.pow(a, 3);
                h2 *= c;
                h3 = Math.pow(b, -2);
                z = h1 - h2 + h3;
                System.out.println("Value is " + z);
                break;

            case 4:
                int perimeter;
                double area;
                int s, h;
                System.out.println("Enter side parameter: ");
                s = input2.nextInt();
                System.out.println("Enter height parameter: ");
                h = input3.nextInt();
                perimeter = s * 3;
                area =  s * h / 2;
                System.out.println("Area is " + area);
                System.out.println("Perimeter is " + perimeter);
                break;

            case 5:
                int x1, x2, y1, y2;
                System.out.println("First Point");
                System.out.println("Input x1:");
                x1 = input2.nextInt();
                System.out.println("Input y1:");
                y1 = input3.nextInt();
                System.out.println("Second Point");
                System.out.println("Input x2:");
                x2 = input2.nextInt();
                System.out.println("Input y2:");
                y2 = input3.nextInt();
                h1 = Math.pow(x2 - x1, 2);
                h2 = Math.pow(y2 - y1, 2);
                z = Math.sqrt(h1 + h2);
                System.out.println("Distance between points is " + z);
                break;

            case 6:
                double square, length;
                int radius;
                System.out.println("Enter radius: ");
                radius = input2.nextInt();
                length = 2 * Math.PI * radius;
                square = 2 * Math.PI * Math.pow(radius, 2);
                System.out.println("Length is " + length);
                System.out.println("Square is " + square);
                break;

            case 7:
                int result;
                z = Math.PI;
                z *= 1000;
                z = Math.floor(z);
                result = (int) z;
                System.out.println("First 4 numbers are " + result);
                break;

            case 8:
                System.out.println("Enter your 4-digit number: ");
                x = input2.nextInt();
                if(x > 9999 || x < 1000) {
                    System.out.println("Error");
                    break;
                }
                int n1, n2, n3, n4;
                n4 = x % 10;
                x = x / 10;
                n3 = x % 10;
                x = x / 10;
                n2 = x % 10;
                x = x / 10;
                n1 = x % 10;
                product = n1 * n2 * n3 * n4;
                System.out.println("Product is " + product);
                break;

            default:
                System.out.println(":(");
                break;
        }

    }
}
