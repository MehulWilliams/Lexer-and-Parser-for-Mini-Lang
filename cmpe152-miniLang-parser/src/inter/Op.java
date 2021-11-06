package inter;

import lexer.Token;
import symbols.Type;

public class Op extends Expr {

   public Op(Token tok, Type p)  { super(tok, p); }
}
