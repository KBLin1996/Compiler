all: mylexer.class
mylexer.class: testLexer.java mylexer.java
	       javac -cp ./antlr-3.5.2-complete.jar testLexer.java mylexer.java
mylexer.java: mylexer.g 
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool mylexer.g
