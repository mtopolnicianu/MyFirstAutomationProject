package practicalenum;

class Main {
    public static void main(String[] args) {

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciouness);
        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.MONDAY;
        if (daysOfTheWeek == DaysOfTheWeek.MONDAY) {
            System.out.println("It's Monday!");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()
        ) {
            System.out.println(myDay);

        }
        Months[] months = Months.values();
        System.out.println(months.length);

        for (Months month : months
        ) {
            System.out.println("Name :" + month.name() + " Value :" + month.ordinal());
        }
        Gender[] genders = Gender.values();
        for (Gender gender : genders
        ) {
            System.out.println("Name :" + gender.name() + " Value :" + gender.ordinal());
        }

        Level myVar = Level.MEDIUM;

        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}


