public class Main {
    public static void main(String[] args) {

        //Instruction 6: Constructeur par defaut n'a pas ete cree, il faut le faire manuellement
        Animal lion = new Animal ();
            lion.family="Félidés";
            lion.age=10;
            lion.name="Simba";
            lion.isMammal=true;
        Animal singe = new Animal("Primates", "Gerdoun", 35, true);

        Zoo myZoo = new Zoo ();
            myZoo.name = "Belvédère";
            myZoo.city = "Tunis";
            myZoo.nbrCages = 50;

        Zoo myZoo2 = new Zoo ("Friguia", "Bouficha", 100);

        myZoo.displayZoo();
        myZoo2.displayZoo();

        //Instruction 8: affichage d'adresse AVANT la redefintion de toString
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion.toString());

    }
}