import org.antlr.v4.runtime.*; // class ANTLRInputStream , Token

import parser.NumbersLexer;

public class Numbers {
    public static void main(String[] args) {
        NumbersLexer lexer;
        Token tk;
        
        // Cria instancia do lexer criado pelo ANTLR

        try {
            lexer = new NumbersLexer(new ANTLRInputStream( System.in ));
        } catch (Exception e) {
            // Pikachu!
            System.out.println("Erro:" + e);
            System.exit(1);
            return;
        }

        // Le da entrada padrao ateh chegar digitar CTRL-D (Linux/Mac)
        // ou CTRL-Z (Windows)

        do {
            tk = lexer.nextToken();
            switch(tk.getType()) {
                case NumbersLexer.BINARY:
                    System.out.println("bin: " + tk.getText());
                    break;

                case NumbersLexer.DECIMAL:
                    System.out.println("dec: " + tk.getText());
                    break;
                    
                case NumbersLexer.REAL:
                    System.out.println("real: " + tk.getText());
                    break;
                    
                case NumbersLexer.HEXADECIMAL:
                    System.out.println("hex: " + tk.getText());
                    break;
                
                case NumbersLexer.EXPONENCIAL:
                    System.out.println("exp: " + tk.getText());
                    break;
                    
            }
        } while (tk != null && tk.getType() != Token.EOF);

    }
}