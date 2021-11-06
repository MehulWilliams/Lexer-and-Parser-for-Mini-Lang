package inter;

import symbols.Type;

public class For extends Stmt {

    Stmt contr, incr;
    Expr cond;
    Stmt stmt;

    public For() {
        contr = null;
        cond = null;
        incr = null;
        stmt = null;
    }

    public void init(Stmt st, Expr y, Stmt z, Stmt s) {
        contr = st;
        cond = y;
        incr = z;
        stmt = s;
        if (cond.type != Type.Bool) contr.error("boolean required in while");
        children.add(contr);
        children.add(cond);
        children.add(stmt);
    }

    public String getNodeStr() {
        return "FOR";
    }
}