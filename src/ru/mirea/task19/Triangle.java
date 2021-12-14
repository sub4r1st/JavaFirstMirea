package ru.mirea.task19;
import java.util.Scanner;

public class Triangle {
    public Triangle(int angle1, int angle2, int angle3) throws InvalidAngleException {
        if ((angle1 + angle2 + angle3 != 180) || (angle1!=90  && angle2!=90 && angle3!=90)) {
            throw new InvalidAngleException("Углы заданы неверно.");
        }
        else System.out.println("Треугольник успешно создан!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите углы треугольника: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        try {
            Triangle tr = new Triangle(angle1, angle2, angle3);
        } catch (InvalidAngleException exc) {
            exc.printStackTrace();
        }
    }
}
