public class StarWriter {
    /*** Say "hello" to the world!
     */
    void writeBox() {
        printStars("Hello , World!");
    }
    void printStars(final String str){
        System.out.println(String.format("********************\n** %s **\n********************",str));
    }
    public static void main(String[] args) {
        new StarWriter().writeBox();
    }
}
