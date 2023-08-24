package practicalenum;

public enum Cereals {
    CAPATAIN_CRUNCH(50, 33.5),
    FROOT_LOOPS(500, 33.1),
    RESES_PUFFS(312, 12.02),
    COCOA_PUFFS(62, 44.654);

    final int levelOfDeliciouness;
    final double price;

    Cereals(int levelOfDeliciouness, double price) {
        this.levelOfDeliciouness = levelOfDeliciouness;
        this.price = price;
    }
}
