/* Data section */
	.section .data

	 .common f,4,4
	 .common e,4,4
	 .common d,4,4
	 .common c,4,4
	 .common b,4,4
	 .common a,4,4
L1:
	 .string "This is a calculation with multiply and divided and substraction\n\n"
L2:
	 .string "Initial: a = %d, b = %d, c = %d\n\n"
L3:
	 .string "Calculate: d = a / b, e = b * c, f = a - b\n\n"
L4:
	 .string "Result: d = %d, e = %d, f = %d\n"


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

	 movl $235, %r14d
	 movl %r14d,a(%rip)
	 movl $5, %ebx
	 movl %ebx,b(%rip)
	 movl a(%rip), %ecx
	 movl b(%rip), %r15d
	 movl %ecx, %eax
	 movl $0, %edx
	 idivl %r15d
	 movl %eax, %ecx
	 movl %ecx,d(%rip)
	 movl $6, %r8d
	 negl %r8d
	 movl %r8d,c(%rip)
	 movl a(%rip), %r9d
	 movl b(%rip), %r10d
	 subl %r10d, %r9d
	 movl %r9d,f(%rip)
	 movl $L1, %edi
	 call printf
	 movl a(%rip), %esi
	 movl b(%rip), %edx
	 movl c(%rip), %ecx
	 movl $L2, %edi
	 call printf
	 movl $L3, %edi
	 call printf
	 movl b(%rip), %r11d
	 movl c(%rip), %r12d
	 imul %r12d, %r11d
	 movl %r11d,e(%rip)
	 movl d(%rip), %esi
	 movl e(%rip), %edx
	 movl f(%rip), %ecx
	 movl $L4, %edi
	 call printf

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
