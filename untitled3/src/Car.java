public class Car {

    private int horsepower;

    private double engineVolume;

    private String make;

    private String model;

    private int year;

    private String color;


    public Car(int horsepower, double engineVolume, String make, String model, int year, String color) {

        this.horsepower = horsepower;

        this.engineVolume = engineVolume;

        this.make = make;

        this.model = model;

        this.year = year;

        this.color = color;

    }


    public int getHorsepower() {

        return horsepower;

    }


    public double getEngineVolume() {

        return engineVolume;

    }


    public String getMake() {

        return make;

    }


    public String getModel() {

        return model;

    }


    public int getYear() {

        return year;

    }


    public String getColor() {

        return color;

    }


    public static void main(String[] args) {

        Car[] cars = new Car[10];

        for (int i = 0; i < 10; i++) {

            cars[i] = new Car(200 + i, 2.0 + i, "Make" + i, "Model" + i, 2010 + i, "Color" + i);

        }


        double sumEngineVolume = 0;

        int sumHorsepower = 0;

        for (Car car : cars) {

            sumEngineVolume += car.getEngineVolume();

            sumHorsepower += car.getHorsepower();

        }


        System.out.println("Sum of engine volumes: " + sumEngineVolume);

        System.out.println("Sum of horsepowers: " + sumHorsepower);

    }

}