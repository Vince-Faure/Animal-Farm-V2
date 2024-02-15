public class Sheep implements Animal {
    private String name;


    public Sheep(String name ) {
        this.name = name;

    }



    @Override

    public String getName() {
        return this.name;
    }

    @Override
    public String calling() {
        return"meeh meeh";
    }

    @Override
    public void eat() {
        System.out.println("I eat Grass");

    }


}
