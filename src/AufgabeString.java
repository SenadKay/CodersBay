public class AufgabeString {
    public static void main(String[] args) {

        String world = "Hello World!";
        String bye = "Good Bye!";

        System.out.println(world);
        System.out.println(bye);

        System.out.println(world + " " + bye);

        world = bye;

        System.out.println(world);
        System.out.println(bye);
        System.out.println(world + bye);
    }
}
