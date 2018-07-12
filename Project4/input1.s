/* Data section */
	.section .data

	 .common b,4,4
	 .common a,4,4
L1:
	 .string "Hello Compiler !\n"
L2:
	 .string "I can do any calculation and some if-else statements and also any kind of printf.\n\n"
L3:
	 .string "Here's a calculation of increment.\n"
L4:
	 .string "Initialize : a = %d, b = %d\n"
L5:
	 .string "a = b + 8\n"
L6:
	 .string "a = %d\n\n"
L7:
	 .string "Here are some if-else statements\n"
L9:
	 .string "a is bigger than b (a = %d, b = %d)\n"
L11:
	 .string "b is bigger than a (b = %d, a = %d)\n"


/* Text section */
	.section .text
	.global main
	.type main,@function
main:
	 pushq %rbp
	 movq %rsp,%rbp
	 pushq %rbx
	 pushq %r12
	 pushq %r13
	 pushq %r14
	 pushq %r15
	 subq $8,%rsp

	 movl $1, %r14d
	 movl %r14d,a(%rip)
	 movl $5, %ebx
	 movl %ebx,b(%rip)
	 movl $L1, %edi
	 call printf
	 movl $L2, %edi
	 call printf
	 movl $L3, %edi
	 call printf
	 movl a(%rip), %esi
	 movl b(%rip), %edx
	 movl $L4, %edi
	 call printf
	 movl b(%rip), %ecx
	 movl $8, %r15d
	 addl %r15d, %ecx
	 movl %ecx,a(%rip)
	 movl $L5, %edi
	 call printf
	 movl a(%rip), %esi
	 movl $L6, %edi
	 call printf
	 movl $L7, %edi
	 call printf
	 movl a(%rip), %r8d
	 movl b(%rip), %r9d
	 cmpl %r8d, %r9d
	 jg L8
	 movl a(%rip), %esi
	 movl b(%rip), %edx
	 movl $L9, %edi
	 call printf
L8:
	 movl b(%rip), %r10d
	 movl a(%rip), %r11d
	 cmpl %r10d, %r11d
	 jg L10
	 movl b(%rip), %esi
	 movl a(%rip), %edx
	 movl $L11, %edi
	 call printf
L10:

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
