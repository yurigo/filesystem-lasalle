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

        String content = "";

        for (int i = 0 ; i < pixels.length ; i++){
            for (int j = 0 ; j < pixels[i].length ; j++){
                content = content + pixels[i][j] ;
            }
        }

        return "<IMG>" + content + "</IMG>";
    }
}
