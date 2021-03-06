package org.baksia.rustycage.editors;

public class Parser {
    public static final String[] KEYWORDS = {
            "alt", "any", "as", "assert", "be", "bind", "block", "bool", "break",
            "char", "check", "claim", "const", "cont", "class",
            "do", "else", "export",
            "f32", "f64", "fail", "false", "float", "fn", "for", "i16", "i32", "i64", "i8",
            "if", "iface", "impl", "import", "in", "int", "let", "log", "mod", "mut",
            "native", "note", "prove", "pure", "resource", "return", "self", "str", "syntax",
            "tag", "true", "type", "u16", "u32", "u64", "u8", "uint", "unchecked", "unsafe",
            "use", "vec", "while", "enum", "copy", "loop", "match"};

    public static final String[] NEW_FILE = {"import", "export", "use", "mod", "dir"};
}
