public class Picture extends File implements Printable{

    boolean[][] pixels;

    public Picture(String name , boolean[][] pixels){
        super(name);
        this.pixels = pixels;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getContent() {

        StringBuilder content = new StringBuilder();

        for (boolean[] pixel : pixels) {
            for (boolean b : pixel) {
                content.append(b);
            }
        }

        return "<IMG>" + content + "</IMG>";
    }
}
