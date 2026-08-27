# Class Reflection (25 August 2026)

---

## Topics

- Upstream
- .gitignore
- pom.xml
- Target folder
- Accessible class
- Threads

## Notes

- Upstream means it looks to the original github repository, from which I have cloned this particular repository
- .gitignore is used wherein we put those files that we dont want to give out publicly.
- pom.xml is the code form which one can attach external code and execute it. So instead of writing commands I can use xml. Along with this, pom.xml has information on what all files need to be run, what java version and so on. So in this project, pom.xml has information about the "java" folder and now for all the files that are inside the java folder, pom.xml will have information on how to compile and execute the files.
- Firstly, it is important to check whether there is no error in the pom.xml.
- Now when we compile the main java program, we fill find that a target folder is created. The target folder will have similar folder structure like the main folder but instead of .java, there would be .class files which is similar to bytecode for machine to read the program.
- Accessible class is used for those people who can't see the images and that if we want the StringReader to read then this class will provide information on those images.
- Thread is a smallest unit of process, which is used if our aim is to do multitasking. Threads will help run the process independently for different users as and well required.
- There are 2 terms for it, thread-safe and not thread-safe. Java is said to be thread-safe meaning that no matter how many threads are working, if there is a shared variable, then that variable will have read access but for "write", thread-safe make sure at a time the shared variable is only accessed by one to "write" it and not multiple. 
- Now java swing is not thread-safe, the reason for it is for the actual use, at one time if we lock, then for one window, multiple different things cant be dont inside it, which might include making multiple shapes in the single window itself. So the reason for java swing to be not thread-safe is to allow multiple different components to run inside the same window hence accessing and writing on the shared variable is allowed.