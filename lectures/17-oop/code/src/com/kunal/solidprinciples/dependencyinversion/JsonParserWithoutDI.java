package code.src.com.kunal.solidprinciples.dependencyinversion;

public class JsonParserWithoutDI {
    public JsonParserWithoutDI(){
    }
    public void parse(){
        System.out.println("parsing the response to Json format");
    }
}
