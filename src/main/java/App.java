public class App {
    public static void main(String[]args){
        Song holiday = new Song("Holiday", "Green Day", 200);
        Song americanIdiot = new Song("American Idiot" , "Green Day", 168);

        System.out.println(holiday.getArtist());
        System.out.println(americanIdiot.getSongsCount());

        Song africa = new Song("Africa", "Toto", 300);
        System.out.println(americanIdiot.getSongsCount());
        System.out.println(africa.getSongsCount());
    }
}
