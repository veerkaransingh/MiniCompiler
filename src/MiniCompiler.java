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
                {"Var_name", "[a-zA-Z_][a-zA-Z0-9_]*"},
                {"Operator", "[+\\-*/^]"},
                {"Assignment", ":="},
                {"Delimiter", "[;,:]"},
                {"Paren", "[()]"}
        };

        List<Token> tokens = new ArrayList<>();
        int pos = 0;

        while (!sourceCode.isEmpty()) {
            sourceCode = sourceCode.trim();
            boolean matchFound = false;

            for (String[] pattern : patterns) {
                Matcher matcher = Pattern.compile("^" + pattern[1]).matcher(sourceCode);
                if (matcher.find()) {
                    String value = matcher.group();
                    tokens.add(new Token(pattern[0], value));
                    sourceCode = sourceCode.substring(matcher.end());
                    pos += matcher.end();
                    matchFound = true;
                    break;
                }
            }

            if (!matchFound) {
                throw new Exception("Invalid token found - position " + pos + ": " + sourceCode);
            }
        }

        return tokens;
    }

    // Syntax Analyzer
    static Iterator<Token> tokens;
    static Token lookahead;

    static void parse(List<Token> tokenList) throws Exception {
        tokens = tokenList.iterator();
        advance();
        program();
    }

    static void advance() {
        lookahead = tokens.hasNext() ? tokens.next() : null;
    }

    static void program() throws Exception {
        statement();
        if (lookahead != null) {
            throw new Exception("Syntax Error: Extra tokens after valid statement: " + lookahead);
        }
    }

    static void statement() throws Exception {
        parseVarList();

        if ("Assignment".equals(lookahead.type)) {
            // Assignment statement
            advance();
            expression();
            if (!"Delimiter".equals(lookahead.type) || !lookahead.value.equals(";")) {
                throw new Exception("Syntax Error: Expected ';' at the end, found " + lookahead);
            }
            advance();
        } else if ("Delimiter".equals(lookahead.type) && lookahead.value.equals(":")) {
            // Declaration statement
            advance();
            if (!"Var_name".equals(lookahead.type) ||
                    !(lookahead.value.equals("integer") || lookahead.value.equals("real"))) {
                throw new Exception("Syntax Error: Expected type (integer/real), found " + lookahead);
            }
            advance();
            if (!"Delimiter".equals(lookahead.type) || !lookahead.value.equals(";")) {
                throw new Exception("Syntax Error: Expected ';' after declaration, found " + lookahead);
            }
            advance();
        } else {
            throw new Exception("Syntax Error: Expected ':=' or ':', found " + lookahead);
        }
    }
    static void parseVarList() throws Exception {
        if (!"Var_name".equals(lookahead.type)) {
            throw new Exception("Syntax Error: Expected variable name, found " + lookahead);
        }
        advance();
        while (lookahead != null && "Delimiter".equals(lookahead.type) && lookahead.value.equals(",")) {
            advance();
            if (!"Var_name".equals(lookahead.type)) {
                throw new Exception("Syntax Error: Expected variable name after ',', found " + lookahead);
            }
            advance();
        }
    }

    static void expression() throws Exception {
        term();
        while (lookahead != null && "Operator".equals(lookahead.type) &&
                (lookahead.value.equals("+") || lookahead.value.equals("-"))) {
            advance();
            term();
        }
    }

    static void term() throws Exception {
        factor();
        while (lookahead != null && "Operator".equals(lookahead.type) &&
                (lookahead.value.equals("*") || lookahead.value.equals("/"))) {
            advance();
            factor();
        }
    }

    static void factor() throws Exception {
        power();
        while (lookahead != null && "Operator".equals(lookahead.type) &&
                lookahead.value.equals("^")) {
            advance();
            power();
        }
    }

    static void power() throws Exception {
        if (lookahead == null) {
            throw new Exception("Syntax Error: Unexpected end of input in power()");
        }
        if ("Paren".equals(lookahead.type) && lookahead.value.equals("(")) {
            advance();
            expression();
            if (lookahead == null || !"Paren".equals(lookahead.type) || !lookahead.value.equals(")")) {
                throw new Exception("Syntax Error: Expected ')' ");
            }
            advance();
        } else {
            operand();
        }
    }

    static void operand() throws Exception {
        if (lookahead == null) {
            throw new Exception("Syntax Error: Unexpected end of input in operand()");
        }
        if ("Integer".equals(lookahead.type) || "Real".equals(lookahead.type) || "Var_name".equals(lookahead.type)) {
            advance();
        } else {
            throw new Exception("Syntax Error: Invalid operand " + lookahead);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter code: ");
            String code = input.nextLine();

            System.out.println("\nSource Code => " + code + "\n");
            List<Token> tokens = tokenize(code);

            System.out.println("Tokens:");
            for (Token token : tokens) {
                System.out.println(token);
            }

            System.out.println("\nParsing:");
            parse(tokens);
            System.out.println("Syntax is correct!");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}






