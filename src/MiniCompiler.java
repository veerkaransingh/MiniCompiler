import java.util.regex.*;
import java.util.*;

public class MiniCompiler {

    static class Token {
        String type, value;

        Token(String type, String value) {
            this.type = type;
            this.value = value;
        }

        @Override
        public String toString() {
            return type + ": " + value;
        }
    }

    // Lexical Analyzer
    static List<Token> tokenize(String sourceCode) throws Exception {
        String[][] patterns = {
                {"Real", "[0-9]*\\.[0-9]+"},
                {"Integer", "[]"}
        }

    }
    public static void main(String[] args) {
        System.out.println("mini compiler");
    }
}

