public class Animals {
    String name_p,species_p;
    int age_p;
    Animals(String name, int age, String species) {
       name_p = name;
       species_p = species;
       age_p= age;
    }
    public static void main(String[] args) {
        Animals animal = new Animals("Lion", 5, "Mammal");
        System.out.println(animal.species_p);
        System.out.println(animal.age_p);
        System.out.println(animal.name_p);
    }
}
