|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/PRAKTIKUM_PBO) |

# Labs #1 Programming Fundamentals Review

## Percobaan 1

Kode program Bike.

```
package JOBSHEET1;

public class Bike {
    private String brand;
    private int speed;
    private int gear=1;

    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value. Gear must be between 1 and 6.");
        }
        else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed >= GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }
    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}


```
Kode program BikeDemo

```
package JOBSHEET1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

    }
}

```
Hasil running.
```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
```
## Percobaan 2
Kode program RoadBike

```
package JOBSHEET1;

public class RoadBike extends Bike {
     private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}


``` 
Kode Program BikeDemo modifikasi
```
package JOBSHEET1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}

```
Hasil Running
```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
Brand : Specialized
Speed : 5
Gear : 4
Tire Width : 25 mm
Bike Type : Road Bike
```
