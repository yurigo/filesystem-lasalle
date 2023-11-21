public class Text extends File implements Printable{
    String content;

    public Text(String name, String content ){
        super(name);
        this.content = content;
    }

    public void replace(String strToReplace){
        this.content = strToReplace;
    }

    public void append(String strToAppend){
        this.content += strToAppend;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getContent() {
        return "<TXT>" + this.content + "</TXT>";
    }
}
