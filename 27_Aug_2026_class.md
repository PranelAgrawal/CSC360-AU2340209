# Class Reflection (27 August 2026)

---

## Topics

- Install
- JAR
- CI/CD pipeline
- UTF 8
- Release
- junit
- Version
- Control
- fxml

## Notes

- Install installs all the dependencies of the code if not already installed from public repositories.
- Jar is like a zip file containing java code, it also contains all packages that is needed to run the code.
- CI - Continuous Integration: Suppose there is an existing architecture, now if I do any changes like addition or subtraction of files/codes, then firstly the CI will pull the changes, then there will be a test, to check whether every function is working properly or not and so on, and lastly it will integrate the files and codes and now the repository will have the local architecture.
- CD - Continuous Deployment : Building and storing it somewhere, this keeps our deployed application up to date with our current version.
- UTF 8 (Unicode Transformation Format – 8) is a character set, utf 8 is an encoding of letters and numbers no matter the language, into bytes for the machine to understand. Now we cant globally use one say utf 8 only, the reason is wastage of memory, if I am working with just numbers, then it is preferable to use encoding for numbers only instead of utf 8.
- Release management is inside pom.xml, which tells the java application which version of java to use. For example if I just want to use java 8 everywhere even if java 26 is released, i would define java 8 in the release to make sure it takes java 8 compiler and not the latest compiler.
- Junit is the testing phase of development wherein every function that has been created is tested, is validated to make sure it works perfectly, passes all the tests for it to move further in the production. 
- Why is junit important and why cant we just manually check every single button? The reason is that say one button is not working but the problem might not be in the button, but a function that is called from other file, junit will tell me what exact function is problematic, while the manual testing will misguide me to some other file or function
- Lets take javafx as example, javafx has one particular version, now for all the components of javafx, there exists its own version, now it is very important to give every components the same javafx version.
- Control is basically all the buttons, etc.
- fxml, f stands for javafx, declarity way of defining user interface for any javafx application.