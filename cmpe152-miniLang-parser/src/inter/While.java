package inter;

import symbols.Type;

public class While extends Stmt {

    Expr expr;
    Stmt stmt;

    public While() {
        expr = null;
        stmt = null;
    }

    public void init(Expr x, Stmt s) {
        expr = x;
        stmt = s;
        if (expr.type != Type.Bool) expr.error("boolean required in while");
        children.add(expr);
        children.add(stmt);
    }

    public String getNodeStr() {
        return "WHILE";
    }
}
