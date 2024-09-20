package code.src.com.kunal.solidprinciples.dependencyinversion;

public class JsonParserWithDI implements ResposeParserWithDI{
    @Override
    public void parse() {
        System.out.println("parsing the response to Json format");
    }
}
