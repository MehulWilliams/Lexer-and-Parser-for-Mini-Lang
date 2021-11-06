package inter;

public class Block extends Stmt {
    Stmt stmt;
    public Block(Stmt s) {
        stmt = s;
        children.add(stmt);
    }
    public String getNodeStr() {
        return "BLOCK";
    }
}
