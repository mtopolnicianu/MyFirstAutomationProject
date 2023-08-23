package inheritance;

class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("twiddledeeedee");
    }
}

class Pelican extends Bird{
    public void sing(String sing){
        System.out.println("kwaaaah kwaaaah");
    }
}
public class Polymorphism {
    public static void main(String[]args){
        Robin robin = new Robin();
        robin.sing();
        Pelican pelican = new Pelican();
        pelican.sing();


    }
}
