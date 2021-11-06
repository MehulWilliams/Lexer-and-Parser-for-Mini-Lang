package inter;
import lexer.Token;
import symbols.Type;

public class Logical extends Expr {

   public Expr expr1, expr2;

   Logical(Token tok, Expr x1, Expr x2) {
      super(tok, null);                      // null type to start
      expr1 = x1; expr2 = x2;
      type = check(expr1.type, expr2.type);
      if (type == null ) error("type error");
      children.add(expr1);
      children.add(expr2);
   }

   public Type check(Type p1, Type p2) {
      if ( p1 == Type.Bool && p2 == Type.Bool ) return Type.Bool;
      else return null;
   }
}
