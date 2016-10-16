package animals;

public abstract class Animals {
    private int age;
    private String name;
    private String gender;
    public Animals( int age, String name, String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    };
    public abstract void say();
}
