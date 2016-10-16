package animals;

public abstract class Animals {
    private int age;
    private String name;
    private int gender;
    public Animals( int age, String name, int gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    };
    abstract void say();
}
