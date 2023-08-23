package inheritance;

public class Walking extends Shoe{
    public final boolean goreText;

    Walking(boolean goreText, String brand, double size){
        super(brand,size);
        this.goreText = goreText;

    }

}
