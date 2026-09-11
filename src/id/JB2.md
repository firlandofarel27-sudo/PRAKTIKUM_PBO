|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/PRAKTIKUM_PBO) |


Kode program Praktikum!
Kode Circle
```
package src.id.ac.polinema;

public class Circle {
     private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

```
Kode Main
```
package src.id.ac.polinema;

public class Main {
    public static void main(String[] args) {

        Rectangle[] shapes = new Rectangle[3];

        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(2, 2);

        for (Rectangle r : shapes) {
            System.out.println(
                "Area: " + r.area() +
                ", Perimeter: " + r.perimeter()
            );
        }

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());

        Circle c = new Circle(5);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Circumference: " + c.circumference());
    }
}

```
Kode Rectangle
```
package src.id.ac.polinema;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }
}

```
Kode Student
```
package src.id.ac.polinema;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String describe() {
        return name + " (" + studentId + ", GPA: " + gpa + ")";
    }
}


```
Hasil Running
```
Area: 24, Perimeter: 20
Area: 9, Perimeter: 12
Area: 4, Perimeter: 8
Nadia (S001, GPA: 3.8)
Circle Area: 78.53981633974483
Circle Circumference: 31.41592653589793

```