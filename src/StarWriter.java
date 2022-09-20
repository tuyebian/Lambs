public class StarWriter {
    /*** Say "hello" to the world!
     */
    void writeBox() {
        printStars();
    }
    void printStars(){
        System.out.println("********************");
        System.out.println("** Hello , World! **");
        System.out.println("********************");
    }
    public static void main(String[] args) {
        new StarWriter().writeBox();
    }
}
