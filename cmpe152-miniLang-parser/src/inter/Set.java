package inter;
import lexer.*; import symbols.*;

public class Set extends Stmt {

   public Id id; public Expr expr;

   /*
   public Set(Id i, Expr x) {
      id = i; expr = x;
      if ( check(id.type, expr.type) == int ) {
         error("Type Error");
         children.add(id);
         children.add(expr);
      }
      else if( check(id.type, expr.type) ==  double ){
         error("Type Error");
         children.add(id);
         children.add(expr);
      }
      else if( check(id.type, expr.type) == char ){
         error("Type Error");
         children.add(id);
         children.add(expr);
      }
      else ( check(id.type, expr.type) == float ){
         error("Type Error");
         children.add(id);
         children.add(expr);
      }
   }

 static Type*Int, *Char, *Bool, *Float;
        static Type*get_Int() {
        return Int;
    }
        static Type*get_Char()
        {
            return Char;
        }
        static Type*get_Bool()
        {
            return Bool;
        }
        static Type*get_Float()
        {
            return Float;
        }
        static Type*get_Double()
        {
            return Double;
        }


    */


   public Set(Id i, Expr x) {
      id = i; expr = x;
      if ( check(id.type, expr.type) == null ) error(" Type error");
      children.add(id);
      children.add(expr);
   }
   public String getNodeStr() {
      return "ASSIGN";
   }

   public Type check(Type p1, Type p2) {
      if ( Type.numeric(p1) && Type.numeric(p2) ) return p2;
      else if ( p1 == Type.Bool && p2 == Type.Bool ) return p2;
      else return null;
   }
}
