public class Printer{
    int cyan;
    int magenta;
    int yellow;
    int black;

    void print(Printable p){
        System.out.println("Printing: " + p.getName());
        System.out.println(p.getContent());
    }
}
