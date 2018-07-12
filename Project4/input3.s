/* Data section */
	.section .data

	 .common y,4,4
	 .common x,4,4
L1:
	 .string "Here is an if-else statement.\n\n"
L2:
	 .string "Initialize: x = %d, y = %d\n\n"
L4:
	 .string "x is bigger than y (x = %d, y = %d)\n"
L6:
	 .string "y is bigger than x (y = %d, x = %d)\n"


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

	 movl $2, %r14d
	 negl %r14d
	 movl %r14d,x(%rip)
	 movl $1, %ebx
	 movl %ebx,y(%rip)
	 movl x(%rip), %ecx
	 negl %ecx
	 movl y(%rip), %r15d
	 addl %r15d, %ecx
	 movl %ecx,y(%rip)
	 movl $L1, %edi
	 call printf
	 movl x(%rip), %esi
	 movl y(%rip), %edx
	 movl $L2, %edi
	 call printf
	 movl x(%rip), %r8d
	 movl y(%rip), %r9d
	 cmpl %r8d, %r9d
	 jg L3
	 movl x(%rip), %esi
	 movl y(%rip), %edx
	 movl $L4, %edi
	 call printf
L3:
	 movl y(%rip), %r10d
	 movl x(%rip), %r11d
	 cmpl %r10d, %r11d
	 jg L5
	 movl y(%rip), %esi
	 movl x(%rip), %edx
	 movl $L6, %edi
	 call printf
L5:

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
