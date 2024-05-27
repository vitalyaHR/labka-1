public class User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;
    public User(int id, int age, String name, String surname, double weight, double height) {

        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public static void main(String[] args) {

        User[] users = new User[10];

        for (int i = 0; i < 10; i++) {

            users[i] = new User(i + 0, 20 + i, "Name" + i, "Surname" + i, 100 + i, 180 + i);

        }
        int sumAge = 0;

        double sumWeight = 0;

        double sumHeight = 0;

        for (User user : users) {

            sumAge += user.getAge();

            sumWeight += user.getWeight();

            sumHeight += user.getHeight();

        }


        System.out.println("Сума віку: " + sumAge);

        System.out.println("Сума ваги: " + sumWeight);

        System.out.println("Сума росту: " + sumHeight);

    }

}