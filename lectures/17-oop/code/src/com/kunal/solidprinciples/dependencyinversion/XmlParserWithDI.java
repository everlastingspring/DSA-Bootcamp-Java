package code.src.com.kunal.solidprinciples.dependencyinversion;

public class XmlParserWithDI implements ResposeParserWithDI{
    @Override
    public void parse() {
        System.out.println("parsing the response to Xml format");
    }
}
