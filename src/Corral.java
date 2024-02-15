public class Corral {
private Animal animal1;
private Animal animal2;

void addAnimal1(Animal animal){
    this.animal1=animal;
}

void addAnimal2(Animal animal){
    this.animal2=animal;
}
    void feedAnimals(){
        if (this.animal1 != null) {
            System.out.println("Je nourris " + this.animal1.getName());
        }
        if (this.animal2 != null) {
            System.out.println("Je nourris " + this.animal2.getName());
        }
    }


    void animalScreams(){
        if (this.animal1 != null) {
            String str = String.format("%s parle en faisant : %s", this.animal1.getName(), this.animal1.calling());
            System.out.println(str);
        }
        if (this.animal2 != null) {
            System.out.println(String.format("%s parle en faisant : %s", this.animal2.getName(), this.animal2.calling()));
        }
    }

}
