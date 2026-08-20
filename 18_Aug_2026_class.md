The class started by the question "How to draw the square"

For square, we require parameters like x coordinate, y coordinate of the centre and the length
Now suppose to make a square, i have the cx and cy (x and y coordinate of centre) and length.
NOw the starting point is to get any corner of the square.
Lets suppose, we look at the top left corner, then the coordinates for top left will be :
x = cx-x/2 and y = cy-l/2.
SImilarly for bottom left, x = cx-l/2,y = cy+l/2
for top right, x = cx+l/2, y=cy-l/2
for bottom right, x = cx+l/2, y = cy+l/2

Understanding the java code:

pom.xml- has the project header, similar structure like html
the import statements, all those folders are inside the jdk and the tool to run is java.

JFrame is the window to create any graphical application in java.
We can color the object using Color.RED or blue or anything like that.