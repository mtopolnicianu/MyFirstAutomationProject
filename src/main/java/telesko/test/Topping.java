package telesko.test;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {
        switch (this) {
            case BACON:
                return 1.5;
            case CHEDDAR:
                return 5.2;
            case TOMATO:
                return 17.11;
            default:
                return 0.0;

        }
    }
}