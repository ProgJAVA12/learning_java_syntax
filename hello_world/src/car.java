public class car {
    String model;
    int speed;

    public car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public static void main(String[] args) {

        car bugatti = new car("Bugatti Veron", 400);
        System.out.println(bugatti.model + " " + bugatti.speed);
    }
}
