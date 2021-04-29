# Automation Testing Design Pattern 
[Design Patterns Important](https://www.devbridge.com/articles/top-design-pattern-test-automation-frameworks/)
Is simply a solution that has shown to be successful again and again. Design patterns provide a general reusable solution for the common problems that occur on software design. Design Patterns are like collections 
of best practices as they provide a concept. Design patterns help reduce code complexity - as well as make code more extensible, and maintanable.

* Structural Patterns: Explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.
* Creation Patterns: Provide various object creation mechanisms, which increase flexibility and reuse of existing code.
* Behavioral Patterns: Are concerned with algorithms and tge assignment of responsabilities between objects

It's importantto become familiar with SOLID Principles that help make software design more understandable, flexible and maintanable.
1. The Single Responsibility Principle - A class should have one, and only one reason to change.
2. The Open Closed Principle - You should be able to extend a class behavior without modifying it.
3. The Liskov Substitution Principle - Derived classes must be substitutable for its base classes.
4. The Interface Segregation Principle - Make fine grained interfaces that are client-specific.
5. The Dependency Inversion Principle - Depend on abstractions, not on concretions.

Some automation Design Patterns

* POM (Page - Object - Model): Create Object Repository for web UI elements. The advantage of the model is that it reduces code duplication and improves test maintenance.
* Facade: Is mostly used to combine a few page objects/actions and provide uniform actions for consumers, For example, when a complex API needs to be executed in a specific order, create a facade for the designated functionality and provide a simplified interface for operating.
* Decorator: Add responsabilities to object dinamically
* Bridge: Separates an object's interfaces from its implementation
* Adapter: Match interfaces of different classes

## Java OPP
[Java](https://beginnersbook.com/2013/04/oops-concepts/)

- Modifiers: It is used to set the access level for classes, attributes, methods and cnstructors.
- Encapsulation: Is to make sure that "sensitive" data is hidden from users you declare attributees as private and you can access to them with get and set methods.
- Abstraction: Is a process where you show only "Relevant" data and "Hide" unnecesary details of an object from the user.
- Inheritance (Extends): The process by which one class acquires the properties and functionalities of another class os called inheritance. 
- Polymorphism (Abstract -> @Override and Extends):  Allows us to perform a single action in different ways.
- Interfaces (Implements): Iterfaces can contain only constants and abstract methods(methods with only signatures no body). Like abstract classes, interfaces cannot be instantiated, they can only be implemented by classes or extedns by other interfaces.

## Cucumber
[Cucumber](https://cucumber.io/)
## Jenkins
[Jenkins](https://github.com/hoto/jenkinsfile-examples)
 -is an open source automation server. Jenkins manages and controls softtware delivery processes throughout the entire lifecycle, including build, document, test, package, stage, deployment, static code analysis and much more. You cant set up Jenkins to watch for any code changes in places like Github, Bitbucket or Gitlab and automatically do a build a with tools like Maven and Gradle. You can utilize container technology such as Docker and Kubernetes, initiate test and then take actions like rolling back or rolling forward in production. It is written entirely in Java.

Some of the possible steps that can be performed using Jenkins
* Software build using build systems such as Gradle, Maven and more-
* Automation testing using test frameworks such as Nose2, PyTest, Robot, Selenium and more.
* Execute test scripts (using Windows terminal, Linux shellm etc)
* Achieve test results and perform post actions such as printing test reports, and more.
* Execute test scenarios against different input combinations for obtaining improved test coverage.
* Continuous Integration (CI) where the artifacts are automatically created and tested. This aids in identification of issues in the product at an early stage of development.


## UFT
[UFT](https://www.guru99.com/quick-test-professional-qtp-tutorial.html)
## APPIUM
[Appium](https://www.guru99.com/introduction-to-appium.html) 
## JMetter
[Jmetter](https://cwiki.apache.org/confluence/display/JMETER/Home)
## SoapUI 
[SoapUI](https://www.soapui.org/getting-started/soap-test/)
## Postman
[Postman](https://learning.postman.com/docs/writing-scripts/script-references/test-examples/)
## Design Patterns
[Design Patterns](https://github.com/ksatria/MK-Design-Pattern/blob/master/Ebook/Head%20First%20Design%20Patterns.pdf)
## Yarn
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
## Groovy
[Groovy](https://groovy-lang.org/) is a powerful, optionally typed and dynamic language, with static-typing and static compilation capabilities, for the Java platform aimed at improving developer productivity thanks to a concise, familiar and easy to learn syntax. It integrates smoothly with any Java program, and immediately delivers to your application powerful features, including scripting capabilities, Domain-Specific Language authoring, runtime and compile-time meta-programming and functional programming
## Katalon
[Katalon](https://medium.com/katalon-studio/a-sample-web-automation-test-project-9c532237c2bd)

## Github
[Github](https://git-scm.com/book/en/v2)

## Azure Test Plans
[Azure Test Plans](https://azure.microsoft.com/es-mx/services/devops/test-plans/)

## Performance Test
[Performance Test](https://azure.microsoft.com/es-es/blog/performance-testing-with-app-service-continuous-deployment/)

## JIRA
# Xray Test Management 

# Differences between Cookies and Cache
- Cookies are small files that contain: Password, Preferences, IP Address, date, etc is focus in the client
- Cache: Is just a collection of data downloaded to help display a web page.

# Difference between Relative and Absolute path
- Relative: Starts with a double slash(//)
- Absolute: Starts with a single slash(/), contains absolute path from the root element
## XPath
[Tutorial](https://www.youtube.com/watch?v=NhG__BL8zFo)
- //table[@id='table1']//tr[last()-4]/td[input]
- //label//a[span[@id='link']]
- (//label[@id='lable'])[1]
- //p[normalize-space(text()) = 'Tommy']
- //p[string-length(text())<30]
- //td[round(text())='7']
- //input[@type='radio' and not(@id='gender-0')]


## Xpath AXES
-  //div[@id='Y2']/parent::div
- //div[@id='Y2']//ancestor::div[@id='A'] 
- //div[@id='B2']/child::div[1]
- //div[@id='B2']/descendant::div[@id='Y3']
- //div[@id='B2']/following::input[1]
- //div[@id='B2']/following-sibling :: *
- //label[text()='Name']/following-sibling::div/input