public class Lion implements Animal {
    private String name;


    public Lion(String name ) {
        this.name = name;

    }



    @Override

    public String getName() {
        return this.name;
    }

    @Override
    public String calling() {
        return "Roaar";
    }

    @Override
    public void eat() {
        System.out.println("I eat Meat");

    }


}
