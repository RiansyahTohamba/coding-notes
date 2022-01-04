# Natural languages 
Natural language such as English is the language, which is spoken and written for communication. The natural language consists of syntax, semantics, phonetics, etc. All natural languages have some fundamental rules, which are based on the structure of grammar. These grammatical rules are used by people in communication.
# Programming Language
Programming languages are used for developing computer programs, which enable a computer to perform some operations. The structure of these languages is based on some syntactic and semantic rules. Context-free, lexical and syntactic grammar may be used in Java programming (Dubey, 2006).

# Grammar Differences
The differences in the grammar of high level programming languages (e.g. Java) and natural language (e.g. English) are as follows:


Natural languages are used for communication between people and programming languages enable human to interact with machines.
Programming languages need a high degree of expertise, completeness and precision because computer can not think outside the statement while in speaking, some minor errors are ignored.
The programming language syntax is not based on natural language grammar.
Thus, the main difference in the grammar of high level language (Java) and natural language (English) is that natural language may be informal in speaking but not in written communication while the grammar of programming language follows specific syntax.

Compiler
A compiler is a specific computer program that converts the statements written in any high level (such as C, C++, etc) into the language that computer can understand, i.e. machine level language. The original program, which needs to be converted, is known as the source code and the generated machine language program is known as object code. The reason to convert a high level language program into machine code is to make an executable program. The operations performed by a compiler are: lexical analysis, preprocessing, parsing, semantic analysis, code generation and code optimization. Compilers are classified as native or cross compilers. The output of native compiler runs on the computer and operating system where the compiler is running and the output of cross compiler can be run on different platforms. Cross platform compilers are used for embedded systems (Aho, Sethi & Ullman, 1986).

The compiler group inputs characters into tokens because the original text can not be used by the data structure and it is very necessary to convert the source code into tokens. It makes the source code understandable for the computer. For example, an expression of ‘C’ language: sum=2+3; would be converted into tokens (such as ‘sum’ into IDENT, ‘=’ into ASSIGN_OP, ‘2’ into NUMBER, ‘+’ into ADD_OP, ‘3’ into NUMBER and ‘;’ into SEMICOLON). The compilation process analyses the syntax of programming language. Syntax analysis is further divided into tokenizing (grouping of input characters into tokens) and parsing (attempting to match the tokens to the syntax rules). In the process of compilation, lexical analyzer reads the source code and groups them into tokens (Ivantsov, 2008).

A token is a categorized block of text (lexeme). Each token is a single unit of language, for example symbol name, keyword or an identifier. The lexical analyzer processes these lexemes according to their function by providing them meaning. This process is known as tokenization. After tokenizing, the tokens are sent for some other form of processing. The process may be considered a sub-task of parsing input. Parsing is the process of analyzing token sequence with respect to grammatical structure. Now, the data may be loaded for compilation.

Thus, the compiler is a computer program, which converts the source code into machine readable form. This compilation process passes through various steps like lexical analysis, tokens, parser, etc. and makes the code available for the computer