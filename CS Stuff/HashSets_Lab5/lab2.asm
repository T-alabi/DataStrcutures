#prompt user to enter the following data 
#aside, bside, c side in different registers 
# multiply A side, Bside and C side 
	  .data
promptA: .asciiz "\n Enter a number for the A side: "
#promptB: .asciiz "\n Enter a number for the B side: "
#promptC  .asciiz "\n Enter a number for the C side: "
result: .asciiz "The number is "
	 .text
	 .globl main
main: 
	li $v0, 4 #load system call code to print string (prompt)
	la $a0, promptA #load address of promptA in $a0
	syscall
	li $v0,5 # system call code for read int
	syscall #read aside into $v0
	
	

# print the sum
li $v0, 4 # system call code for print string
la $a0, result # load addr of result msg in $a0
syscall # print result msg

li $v0, 1 # system call code for print int 
move $a0, $v0 # copy sum into $a0
syscall


	# exit from program
	li $v0, 10 #terminate execution
	syscall #return control to system