package inter;

import lexer.Token;
import symbols.Type;

public class Expr extends Node {

   public Token op;
   public Type type;

   Expr(Token tok, Type p) { op = tok; type = p; }

   public String getNodeStr() {
      return "Token " + op.toString();
   }
}
