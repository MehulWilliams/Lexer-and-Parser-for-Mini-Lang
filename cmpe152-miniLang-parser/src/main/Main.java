package main;

import inter.Node;
import inter.Prog;
import lexer.Lexer;
import parser.Parser;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		Prog tree = parse.program();
		System.out.printf("\nSyntax tree:\n");
		String treeStr = printTree(tree);
		System.out.printf(treeStr);
	}

	public static String printTree(Node root) {
		int indent = 0;
		StringBuilder sb = new StringBuilder();
		printTree(root, indent, sb);
		return sb.toString();
	}

	private static void printTree(Node root, int indent, StringBuilder sb) {
		sb.append(getIndentString(indent));
		sb.append("+--");
		sb.append(root.getNodeStr());
		sb.append("\n");
		for (Node n : root.getChildren()) {
			printTree(n, indent + 1, sb);
		}
	}

	private static String getIndentString(int indent) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < indent; i++) {
			sb.append("|  ");
		}
		return sb.toString();
	}
}
