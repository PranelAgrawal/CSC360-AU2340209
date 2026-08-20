# Class Reflection (20 August 2026)

---

## TOPICS

- JFrame
- Autonomous Class
- "super" keyword
- drawRect function

## NOTES

- JFrame is the class taken from javax.swing wherein it creates a new window.
- When the JFrame class is called, there is an autonomous class being called, which means that instead of creating a whole new class, we are just having an inline class so that we dont have to worry about creating the class and calling the class and so on.
- Inside the JFrame autonomous class, I call the paint function and override it and call the "super.paint()" function, the super function calls the function inside the parent class, this is necessary because it actually creates the window and does the basic things in order for me to edit anything like color or anything else and then I set the color and draw Rectangle and so on.
- The drawRect function could have been done using 2 ways, first is the (x coord, y coord, length, width), other is to have 2 diagonal points (x,y) and connect them.