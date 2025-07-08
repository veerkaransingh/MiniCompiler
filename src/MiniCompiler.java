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
            return tokens;
        }

        // Syntax Analyzer
        static Iterator <Token> tokens;
        static Token lookahead;

        static void parse(List<Token> tokenList) throws Exception {
            tokens = tokenList.iterator();
            advance();
            program();
        }
        static void advance(){
            lookahead = tokens.hasNext() ? tokens.next() : null;
        }
        static void program() throws Exception {
            statement();
            if(lookahead != null){
                throw new Exception("Syntax Error: Extra tokens after valid statement: "+ lookahead);
            }
        }

        static void statement() throws Exception {
            parseVarList();

            if ("Assignment".equals(lookahead.type)) {
                //Assignment statement
                advance();
                expression();
                if (!"Delimiter".equals(lookahead.type)|| !lookahead.value.equals (anObject: ";")){
                    throw new Exception("Syntax Error: Expected ';' at the end, found " + lookahead);
                }
                advance();
                }else if("Delimiter".equals(lookahead.type)&& lookahead.value.equals(anObject: "real"))) {
                // declaration statement
                    advance();
                    if(!"Var_name".equals(lookahead.type)||!(lookahead.value.equals(anObject:"integer")||lookahead.value.equals(anObject:"real"))){
                        throw new Exception("Syntax Error: Expected type (integer/real), found"+lookahead);
                }
                    advance();
            }
            else {
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



        public static void main (String[]args){
            System.out.println("mini compiler");
        }
    }

