include 'emu8086.inc'
data segment
     
    message1 db 10,13,10,13,'Enter password(4 chars): $';
      
    actual_pass db '5678h'; 
      
data ends


stack segment
    dw 100 dup(0);
    top_stack label word;    
stack ends


display macro message
    mov ah,09h;       //output
    lea dx,message; 
    int 21h;
endm
     
code segment
    
    assume cs:code ds:data ss:stack 

start:  mov ax,data;
        mov ds,ax;
        mov es,ax;
        mov ax,stack;
        mov ss,ax;
        mov sp,offset top_stack;
        print '******WELCOME USER******';

        
        display message1;  
                          
        mov cx,04h;
        mov bx,offset actual_pass; 
                          
        again:  mov ah,08h;     //input one char in al 
                int 21h; 
                cmp al,[bx]; 
                jne l1; 
                inc bx;
                loop again;   
                print 'Password matched!';
                mov ax,0fabeh;
                jmp l2;
  
        
        l1: print 'Password did not match';
            mov dx,0bedah;
            jmp l2;
           
            
       
    l2: code ends
        end start       
             ret
                      