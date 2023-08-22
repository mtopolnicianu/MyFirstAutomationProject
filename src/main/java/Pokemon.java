public class Pokemon {
    String name;
    int level;
    Pokemon( String pName, int pLevel){
        level = pLevel;
        name = pName;
    }
    void attack(){
        System.out.println(name + "Attack!");
    }

}
