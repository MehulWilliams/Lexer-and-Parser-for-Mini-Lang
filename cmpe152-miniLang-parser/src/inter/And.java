package inter;

import lexer.Token;

public class And extends Logical {

   public And(Token tok, Expr x1, Expr x2) {
      super(tok, x1, x2);
   }

   public String getNodeStr() {
      return "AND";
   }
}
