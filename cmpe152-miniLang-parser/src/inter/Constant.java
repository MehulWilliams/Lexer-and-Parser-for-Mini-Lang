package inter;

import lexer.Num;
import lexer.Token;
import lexer.Word;
import symbols.Type;

public class Constant extends Expr {

    public Constant(Token tok, Type p) {
        super(tok, p);
    }

    public Constant(int i) {
        super(new Num(i), Type.Int);
    }

    public static final Constant
            True = new Constant(Word.True, Type.Bool),
            False = new Constant(Word.False, Type.Bool);
            //Num = new Constant(Word.True, Type.Bool);

    public String getNodeStr() {
        return "Token " + op.toString();
    }
}
