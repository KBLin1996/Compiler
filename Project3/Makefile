all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myC.g
	javac -cp antlr-3.5.2-complete.jar:. myC_test.java
	
clean:
	rm *.class
	rm myCLexer.java
	rm myCParser.java
	rm myC.tokens
