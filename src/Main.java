public class Main {
    public static void main(String[] args) {

        Text t = new Text("Fichero de text", "Lorem ipsum dolor sit amet...");

        boolean[][] pictureBoolean = {{true,true},{true,false}};

        Picture p = new Picture("Fichero de imagen" , pictureBoolean);

        Printer hp = new Printer();

        hp.print(t);
        hp.print(p);

    }
}