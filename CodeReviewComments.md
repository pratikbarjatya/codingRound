# Code Review Comments

1. Added testCases package and moved all file to a named package. The default unnamed package should not be used.
   To enforce this best practice, classes located in default package can no longer be accessed from named ones since Java 1.4.
2. Removed String literals duplication by creating CONSTANT for "webdriver.chrome.driver. As String literals should not be duplicated
3. Replaced Classes from "sun.*" and used Java API packages. As a part of best practise Classes in the sun.* or com.sun.* packages are considered implementation details, and are not part of the Java API.
   This can cause problems when moving to new versions of Java because there is no backwards compatibility guarantee. Similarly, they can cause problems when moving to a different Java vendor, such as OpenJDK.
   Such classes are almost always wrapped by Java API classes that should be used instead.
4. Replaced waitFor method with Explicit WebDriver Wait and removed "InterruptedException". Also "InterruptedException" should not be ignored in the code, and simply logging the exception counts in this case as "ignoring".
5. Removed unused imports as Useless imports should be removed. The imports part of a file should be handled by the Integrated Development Environment (IDE), not manually by the developer.
6. Used a Logger to Log TimeOutException. Throwable.printStackTrace(...) should not be called.
   As Throwable.printStackTrace(...) prints a Throwable and its stack trace to some stream. By default that stream System.Err, which could inadvertently expose sensitive information.
   Loggers should be used instead to print Throwables, as they have many advantages:
        Users are able to easily retrieve the logs.
        The format of log messages is uniform and allow users to browse the logs easily.
7. Added Abstraction CommonGlobals class for basic operation like ExplicitWait, isElementPresent, etc methods
8. Abstracted Locators to ClearTripPage class as common Object Repository (OR)
9. Created ClearTripTest as base test class for Webdriver Runner with setters and getters for chromedriver.
10. Updated .gitignore and added target in ignore list.