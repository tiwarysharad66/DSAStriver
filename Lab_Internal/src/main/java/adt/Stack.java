package adt;

public interface Stack {
void push(int data);
int pop();
int peek();
boolean isUnderflow();
int getSize();
char[] display();

}
