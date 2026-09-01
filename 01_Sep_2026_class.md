# Class Reflection (01  September 2026)

---

## Topics

- Equations for triangle
- Queue vs Stack
- Tree

## Notes

- For a triangle, we need atleast 3 equations, if we just have 2 equations, we just have 2 lines and hence for the third, it could be anything hence infinitely many solutions/lines
- The equation for a triangle is : Ax = b
- For example, 2x+3y=5, vector x = [x,y]' meaning this is a column matrix 
- Maven helps in formulating equations so that we wont have to look at the numerical part of the project.
- Now to solve this, take 2 equations at once, get one point (x,y) and do the same for other 2 equations and then other 2 equations simultaneously, and then we will get 3 different coordinates and hence the triangle is made.
- Queue works on the principle of first-in-first-out, while stack works on principle of last-in-first-out, meaning that suppose I am performing an operation of CTRL+Z, then if i use Queue, it will have information of the very first operation performed by the user while stack will have information of the very last operation performed by the user, hence for CTRL+Z, it is expected to use stack since it has the information of the last action performed by the user.
- For a tree, a node must be classified whether it is a parent or a child, each child will have atmost one parent, for a binary tree, each parent can have atmost 2 children.