package animals;

public class Dog extends Animals{
    private String noise="woof";
    public Dog(int age, String name, int gender){
        super( age, name, gender);
    }

    public void say(){
        System.out.println(this.noise);
    }
}
