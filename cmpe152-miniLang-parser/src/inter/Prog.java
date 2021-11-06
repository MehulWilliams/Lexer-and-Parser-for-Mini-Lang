package inter;

public class Prog extends Node {
    Block block;

    public Prog(Block blk) {
        block = blk; children.add(block);
    }

    public String getNodeStr() {
        return "PROGRAM";
    }
}
