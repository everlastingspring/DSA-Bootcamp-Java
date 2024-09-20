package code.src.com.kunal.solidprinciples.dependencyinversion;

public class ResponseParserApplication {
    public static void main(String[] args) {
        ResponseParserWithoutDI responseParser =
                new ResponseParserWithoutDI(new JsonParserWithoutDI());
        responseParser.parse();
        ResposeParserWithDI resposeParserWithDI =
                new JsonParserWithDI();
        resposeParserWithDI.parse();
        ResposeParserWithDI resposeParser =
                new XmlParserWithDI();
        resposeParser.parse();
    }
}
