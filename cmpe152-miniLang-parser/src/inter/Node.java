package inter;

import lexer.Lexer;

import java.util.ArrayList;

public class Node {

    int lexline = 0;

    Node() {
        lexline = Lexer.line;
    }

    ArrayList<Node> children = new ArrayList<>();

    public ArrayList<Node> getChildren() {
        return children;
    }

    public String getNodeStr() {
        return "";
    }

    void error(String s) {
        throw new Error("near line " + lexline + ": " + s);
    }
}
