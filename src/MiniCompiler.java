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
                {"Integer", "[0-9]+"},
                {"Var_name", "[a-zA-Z_][a-zA-Z0-9]*"},
                {"Operator", "[+\\-*/^]"},
                {"Assignment", ":="},
                {"Delimiter", "[;,:]"},
                {"Paren", "[()]"}
        };
        List<Token>tokens = new ArrayList<>();
        int pos = 0;

        while (!sourceCode.isEmpty()) {
            sourceCode = sourceCode.trim();
            boolean matchFound = false;

            for (String[] pattern : patterns) {
                Matcher matcher = Pattern.compile("^"+ pattern[1]).matcher(sourceCode);
            }

        }
    }
        public static void main (String[]args){
            System.out.println("mini compiler");
        }
    }

