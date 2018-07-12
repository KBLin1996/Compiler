all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar:. myCompilerLexer.java myCompilerParser.java myCompiler_test.java
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input1.c > input1.s
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input2.c > input2.s
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input3.c > input3.s

input1:
	gcc input1.s

input2:
	gcc input2.s

input3:
	gcc input3.s

clean:
	rm *.class
	rm myCompilerLexer.java
	rm myCompilerParser.java
	rm myCompiler.tokens
