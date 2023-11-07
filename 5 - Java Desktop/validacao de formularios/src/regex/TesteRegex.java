package regex;

public class TesteRegex {
    public static void main(String[] args) {
        Boolean palavra = "Java2023".matches("^Java$");
        
        Boolean palavra2 = "Java2023".matches("^Java.*$");
        
        Boolean time = "Brasil".matches("Brasil|Alemanha");


        
        System.out.println(palavra);
        System.out.println(palavra2);
        System.out.println(time);
    }        
}
