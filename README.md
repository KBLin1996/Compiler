# Compiler
Junior Year/ Second Semester/ Using ANTLR 3.5.2 to generate my own compiler

**ANTLR 3.5.2 Download:** http://www.antlr3.org/download.html

--------------------------------------------------------------------------------------------------------------------

Hi there,

For a start, please download ANTLR 3.5.2 with the link above or just download the files in my projects.
The projects will lead you step by step to create your own compiler.



Here are the main purpose of the projects →

**● Project 1:** Write a "mylexer.g" file to set the tokens (terminals) of your compiler. Input 1, 2, 3 will be the testing files to check the defined tokens.


**● Project 2:** Write a "myC.g" file to set the context free gramma (CFG) or so-called nonterminals to your compiler. Input 1, 2, 3 will be the testing files to check the defined rules.


**● Project 3:** Write a "myC.g" file for setting error preventions to your compiler.
             For instance, "Undefined Veriable", "Type mismatch" and some other careless errors.
             Input 1, 2, 3 will be the testing files to check if the error detection works.


**● Project 4:** Write a "myC.g" to generate x86 code (.s files) for executing C codes on my own compiler.
             Input 1, 2, 3 will be the testing files to check if the error detection works.

--------------------------------------------------------------------------------------------------------------------

**Q: How to Compile?**

● Project 1:
    
    make
    java -cp ./antlr-3.5.2-complete.jar:. testLexer input1.c
    java -cp ./antlr-3.5.2-complete.jar:. testLexer input2.c
    java -cp ./antlr-3.5.2-complete.jar:. testLexer input3.c
   
   
● Project 2:

     make
     java -cp ./antlr-3.5.2-complete.jar:. myC_test input1.c
     java -cp ./antlr-3.5.2-complete.jar:. myC_test input2.c
     java -cp ./antlr-3.5.2-complete.jar:. myC_test input3.c


● Project 3:
    
    make
    java -cp ./antlr-3.5.2-complete.jar:. myC_test input1.c
    java -cp ./antlr-3.5.2-complete.jar:. myC_test input2.c
    java -cp ./antlr-3.5.2-complete.jar:. myC_test input3.c


● Project 4:  (command "./a.out" each time you "make inputX")
  
    make
    make input1
    make input2
    make input3
    ./a.out


**Thanks For Reading !**
