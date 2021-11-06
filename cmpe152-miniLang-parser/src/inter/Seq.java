package inter;

public class Seq extends Stmt {

   Stmt stmt1; Stmt stmt2;

   public Seq(Stmt s1, Stmt s2) {
      stmt1 = s1; stmt2 = s2;
      children.add(stmt1);
      children.add(stmt2);
   }

   public String getNodeStr() {
      return "STMTS";
   }
}
