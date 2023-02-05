public class Driver {
    String name;
    Integer age;
    String drivesWhatCar;

    Integer yearsOfExperience;

    public Driver(String name, Integer age, String drivesWhatCar, Integer yearsOfExperience) {
    this.name = name;
    this.age = age;
    this.drivesWhatCar = drivesWhatCar;
    this.yearsOfExperience = yearsOfExperience;



    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", drivesWhatCar='" + drivesWhatCar + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
