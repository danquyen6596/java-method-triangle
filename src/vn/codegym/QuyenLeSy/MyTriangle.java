package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;
        do {
            System.out.print("Nhập vào chiều dài cạnh thứ nhất: ");
            side1 = scanner.nextInt();
            System.out.print("Nhập vào chiều dài cạnh thứ hai: ");
            side2 = scanner.nextInt();
            System.out.print("Nhập vào chiều dài cạnh thứ ba: ");
            side3 = scanner.nextInt();
        }while(isValid(side1,side2,side3) == false);

        System.out.printf("Diện tích tam giác là: %5.2f", area(side1,side2,side3));

    }

    public static boolean isValid(double side1, double side2, double side3){
        boolean valid1 = (side1 + side2) > side3;
        boolean valid2 = (side2 + side3) > side1;
        boolean valid3 = (side1 + side3) > side2;
        if(valid1 && valid2 && valid3 )
            return true;
        else
            return false;
    }

    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));

        return area;
    }
}
