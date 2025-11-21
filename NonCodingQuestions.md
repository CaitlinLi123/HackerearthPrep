# Non coding questions
## Interview Prep questions
#### 1. Can you explain what Scala is and why it’s used?
A: Scala is a multi-paradigm programming language. It is used because 
- It supports both OOP and functional programming. 
- It runs on JVM and is able to use Java libraries.
- It is type-safe and statically typed.
#### 2. What are the main differences between val and var in Scala?
A: The variable that is defined by val is immutable, while the one that is defined by var is mutable.
#### 3. Explain what an immutable variable is. How is it useful?
A: An immutable variable is the variable whose value or type cannot be changed after the creation. It is useful in scenario that requires high security, predictability and thread-safety.
#### 4. What is a function in Scala, and how do you define one?
A: A function in Scala is an expression that can have parameters and take arguments.
To define a function:
```Scala
def functionName(arg1: Type of arg1, ...):returnType={
    your code block
}
```
#### 5. What is the difference between a function and a method in Scala?
A: In Scala, a method is a block of code defined within a class, while a function is an object that has apply method and can be passed around as a value.
#### 6. How do you create a class in Scala?
```Scala
class ClassName{
    val instanceVariable: Type

    def instanceMethod:returnType{
        code block...
    }
}
```
OR
```Scala
class ClassName(val arg1:Type, var arg2:Type)
```
#### 7. What is an object in Scala, and how does it differ from a class?
A: An object is an instance of a given class in Scala. An object is a concrete entity which has its own unique set of data for properties. A class is more like a blueprint.
#### 8. Explain what a case class is and when you might use it.
A: A case class in Scala is a special kind of class designed to make immutable data modelling concise, safe and easy. It has the following characteristics:
- defined by keyword `case`
- It has built-in methods like `toString`,`equals`,`hashCode`,`copy`
- It supports pattern matching
- We can instantiate without `new` because a comopanion object with an `apply()` is auto-created.
We want to use case classes when we want to represent immutable data, perform pattern matching, do functional programming and for JSON serialization purposes.
#### 9. What is a trait in Scala, and how is it different from a class?
A: A trait in Scala is similar to an interface in Java. Compare to a class, a trait cannot be instantiated.
#### 10. How do you implement inheritance in Scala?
A: To inherit from a class use `extends` keyword. To inherit from one or multiple traits, use `with` keyword.
#### 11. What is the purpose of the 'main' method in Scala?
A: The `main` method provides an entry point for the JVM to start executing the prorgam.
#### 12. Can you describe what pattern matching is in Scala?
A: Pattern matching is a Scala feature that checks a vlue against a series of patterns, deconstructs it and executes code based on the first matching pattern. The following in an example:
```Scala
def describeNumber(x: Int):String = x match{
    case 0 => "zero"
    case _ => "other"
}

println(describeNumber(0)) // Output: zero
println(describeNumber(1)) // Output: other
```
#### 13. What is a Scala list, and how do you add elements to it?
A: A Scala list is a collection of immutable or mutable data. 
To add elements:
```Scala
val animals = List("Lion","Cat")
animals :+ "Dog"
println(animals.mkString(",")) // Output: Lion, Cat, Dog
```
#### 14. How do you iterate through a list in Scala?
```Scala
val sample = List(1,2,3)
sample.foreach(num => println(num))
```

#### 15. What are the advantages of using immutable collections in Scala?
- thread safe
- predictable, no side effects
- functional programming friendly
- better pattern matching

#### 16. What is an Option in Scala, and why is it useful?
`Option` is a type in Scala. It is useful in dealing ith variables that can have values or None, avoiding NullPointerException. 

#### 17. Explain the purpose of the 'for' comprehension in Scala.
A 'for' comprehension is a lightweight notation for expressing sequence comprehensions. It allows us to iterate, filter and transform collections in a concise and readable way.

#### 18. What is a tuple in Scala, and how do you access its elements?
A tuple is a class that can contain a miscellaneous collection of elements.
To access an element
```Scala
val tup = ("a",1,3.5)
println(tup._1) // Output:a
```
#### 19. Can you describe what a higher-order function is in Scala?
A higher-order function is a function that takes functions as arguments and returns a function.
#### 20. How do you handle exceptions in Scala?
Using `try catch` block.
#### 21. What is the REPL in Scala, and how is it used?
REPL is a tool in Scala to evaluate expressions. In interactive mode, the REPL reads expressions at the prompt, wraps them in an executable template, and then compiles and executes the result.
#### 22. How do you compile and run a Scala program?
```bash
scalac Hello.scala #compile the code
scala Hello #run the compiled code
```
#### 23. Explain the concept of currying in Scala.
Currying is the process of converting a function with multiple arguments into a sequence of functions that take one argument. Each function returns another function that consumes the following argument.

#### 24. What is the difference between ‘apply’ and ‘unapply’ methods in Scala?
apply function is the method called when we treat an object like a function.
```Scala
object Person {
  def apply(name: String, age: Int) = new Person(name, age)
}
val p = Person("Alice",25)
```
unapply function is used in pattern matching. It takes an object and extract values from it.
```Scala
object PersonExtractor{
    def unapply(p:Person):Option[(String,Int)] = 
        Some((p.name,p.age))
}

p match{
    case PersonExtractor(name,age)=> println(s"name is $age")
}
```

#### 25. How do you define default parameter values in a Scala function?
```
def functionName(arg1:Type = defaultValue):ReturnType = {
    ...
}
```

#### 26. Can you explain the concept of type inference in Scala?
The compiler can automatically figure out types because Scala is statically typed.

### 27. What are some of the benefits of using Scala over Java?
- Less boilerplate, more concise and simple to develop
- Scala supports functional programming
- Scala has interoperability with Java:
    - Scala runs on JVM
    - It can directly use Java libraries
#### 28. What does immutable mean in the context of Scala collections?
Immutable in Scala collections means once a collection is created, it cannot be changed. No elements can be added, removed or updated.

#### 29. Explain what you know about string interpolation in Scala.
String interpolation means embedding variables or expressions directly into a string literal.
In Scala, we can perform string interpolation as follows:
```Scala
s"${var1} other string content here"
```
#### 30. What does it mean for a function to be a 'first-class citizen' in Scala?
Functions are treated like any other value in the language. We can assign them to variables, pass around as arguments, return by other functions and so on.

#### 31. How would you create a simple class with a constructor in Scala?
```Scala
class Person(var firstname:String, var lastname:String)
```

#### 32. Explain what you know about the concept of immutability and how Scala supports it.
Immutability means once a value or object is created, it cannot be modified. 
Scala supports them by:
- using `val` keyword to define immutable values or objects
- support immutable collections
- case classes are immutable by default by design

#### 33. What are the basic building blocks of a simple Scala application?
A simple Scala application has the following basic building blocks:
- objects
- classes
- methods
- packages
- expressions

#### 34. How can you add extra behavior (methods) to a class after it's been defined in Scala, and what is this concept called?
We can realise it by extending the class and perform method overriding.

## MCQ
#### Q1. Scala bytecode can run on top of Java VM. What is the fundamental difference between Java object.clone() and Scala object.copy()?
- [ ] One is a Java object, the other is a Scala object.
- [x] clone() will copy class structures but not the data, while copy() will also copy data into new objects.
- [ ] There is no difference.
- [ ] copy() allows you to change values during the copying process; clone() does not.
#### Q2. What value does this code return?
```Scala
val m1 = Map("a"->1,
"b"->2,
"c"->3)
m1("a")
```
- [ ] a
- [ ] 2
- [ ] b
- [x] 1
#### Q3. What is one way to avoid low-level parallelization details?
- [ ] monads
- [ ] literal functions
- [ ] partially applied functions
- [x] parallel collections
#### Q4. What do you use in ScalaTest to see a detailed diagram of error messages when a test fails?
- [ ] ArgumentExceptions
- [ ] AssertionException
- [x] DiagrammedAssertions
- [ ] JUnit
#### Q5. What data type would you use to store an immutable collection of objects that contain a fixed number of varying types?
- [ ] Array
- [ ] ImmutableCollection
- [ ] List
- [x] Tuple
#### Q6. After defining a function in the interpreter, Scala returns the following. What does the `()` indicate?
```
myfnc: ()Unit
```
- [ ] The function has no side effects.
- [x] The function takes no parameters.
- [ ] The function returns no value.
- [ ] Returning unit types to the function is a closures.
#### Q7. What type of number is 1234.e5?
- [ ] hexadecimal
- [ ] short
- [x] floating point
- [ ] long
#### Q8. When you convert a map to a list using `toList`, the result will be of which type? 
- [x] `List[(String, String)]`
- [ ] `List[(Array, Array)]`
- [ ] `List[(Collection, Collection)]`
- [ ] `List`
#### Q9. What type of object does this code create?
```Scala
val x = (1234, "Active")
```
- [ ] List
- [ ] Map
- [x] Tuple
- [ ] Array
#### Q10. Which is a subclass of all classes?
- [ ] AnyVal
- [ ] AnyRef
- [ ] Method
- [x] Null
#### Q11. For the for-yield construct, is the scope separate between for-body and yield-body?
- [x] Yes and no. It is different depending on the for construct and what it does.
- [ ] Yes, because the for section does not expose its scope.
- [ ] No, because for-yield shares the same scope, even though they are within
separate curly braces.
- [ ] Yes, because they are within different curly braces.
### Q12. What is one way to implement pattern matching on methods?
- [ ] using regex
- [ ] using monads
- [ ] using string matching
- [x] using case classes
#### Q13. What is the value of z after executing this code?
```Scala
val y = List('a','b')
val z = y::List('c')
```
- [ ] List(a,b,c)
- [x] List(List(a, b), c)
- [ ] List(c,a,b)
- [ ] List(c,List(a,b))
#### Q14. What term is used to specify a precondition?
- [ ] assert
- [x] require
- [ ] precondition
- [ ] mustHave
#### Q15. Which Scala type may throw an exception or a successfully computed value, and is commonly used to trap and propagate errors?
- [ ] `
scala.util.ExceptionHandling
`
- [ ] `
scala.Catch.Throw
`
- [ ] `
scala.exception.TryFinally
`
- [x] `scala.util.Try`
#### Q16. What is the data type of y after this code is executed?
```
val y = (math floor 3.1415 * 2)
```
- [ ] short
- [x] double
- [ ] int
- [ ] bigInt
#### Q17. When using pattern matching, which character matches on any object?
- [ ] `%`
- [x] `_`
- [ ] `^`
- [ ] `-`
#### Q18. You have created an array using val. Can you change the value of any element of the array—and why or why not?
- [ ] Yes, the reference to the array is immutable, so the location that the array points
to is immutable. The values in the array are mutable.
- [ ] The 0th element is immutable and cannot be modified. All other elements can be modified.
- [ ] Yes, val does not make arrays immutable.
- [x] No, val makes the array and values of the array immutable.
#### Q19. What is the output of this function?
```Scala
def main () {
var a = 0
for (a<-1 until 5){println(a)}
}
```
- [ ] 1,2,3,4,5
- [ ] 0,1,2,3,4
- [x] 1,2,3,4
- [ ] 2,3,4,5
#### Q20. What do you call objects with immutable state?
- [ ] singletons
- [ ] stationary objects
- [x] functional objects
- [ ] fixed objects
#### Q21. You have written a Scala script. How would you access command-line arguments in the script?
- [x] use array named args
- [ ] use tuple named args
- [ ] use numbered variables with a _ prefix for example_1, _2, _3
- [ ] use numbered variables with a \$ prefix - for example \$1, \$2, $3
#### Q22. What does this code return? 
`
val x = 3; if (x > 2) x = 4 else x = x*2`
- [x] 4
- [ ] an error
- [ ] 6
- [ ] 3
#### Q23. Which statement returns a success or a failure indicator when you execute this code?
`
val MyFuture = Future {runBackgroundFunction() }`
- [x] myFuture.onComplete
- [ ] myFuture(status)
- [ ] myFuture.Finished
- [ ] complete(myFuture)
#### Q24. To denote a parameter that may be repeated, what should you place after type?
- [ ] `%`
- [ ] `&`
- [x] `_`
- [ ] `-`
#### Q25. What is called when a superclass has more than one subclass in Scala?
- [ ] polyinheritance
- [ ] multilevel inheritance
- [ ] multimode inheritance
- [x] hierarchical inheritance
#### Q26. One way to improve code reliability is to use `__` , which will evaluate a condition and return an error if the condition is violated.
- [ ] packages
- [ ] polymorphisms
- [x] assertions
- [ ] traits
#### Q27. Which statement about if-else-if-else statements is true?
- [ ] If the first else-if does not succeed, then no other else-ifs are tested.
- [ ] If an else-if does not succeed, then none of the remaining else-if statements or elses will be tested.
- [ ] All else-if statements are tested in all cases.
- [x] If an else-if succeeds, then none of the remaining else-if statements or elses will tested.
#### Q28. What do you call the process of changing the definition of an inherited method?
- [ ] recursive methods
- [ ] currying methods
- [ ] redefining methods
- [x] overriding methods
#### Q29. To denote a parameter that may be repeated, what should you place after
the type?
- [ ] `_`
- [x] `*`
- [ ] `%`
- [ ] `&`
#### Q30. What is the code below equivalent to?
```Scala
myClass.foreach(println_)
```
- [ ] `
myClass.foreach(println ())`
- [ ] `
myClass.foreach(print NIL)`
- [ ] `
myClass.loop(println ())`
- [x] `
myClass.foreach(x => println(x))`
#### Q31. What is an advantage of an immutable object?
- [ ] Immutable objects use less memory than their mutable counterparts.
- [ ] Immutable objects do not require error handling.
- [ ] Immutable objects can be used in classes, mutable objects cannot.
- [x] Immutable objects are threadsafe.
#### Q32. You want to create an iteration loop that tests the condition at the end of the loop body. Which iteration would you use?
- [x] do-while loop
- [ ] while loop
- [ ] for loop
- [ ] do-until loop
#### Q33. What can you use to make querying a database more efficient, by avoiding the need to parse the SQL string every time a query is executed from Scala?
- [ ] database driver
- [ ] connection
- [x] prepared statement
- [ ] SQL view
#### Q34. Which is not a member of the collections hierarchy?
- [ ] Set
- [ ] Seq
- [x] Hash
- [ ] Map
#### Q35. Which term makes the contents of packages available without prefixing?
- [ ] use
- [ ] include
- [x] import
- [ ] assertion
#### Q36. If you wanted to find the remainder after division, what operator would you use?
- [x] %
- [ ] DIV
- [ ] //
- [ ] /
#### Q37. What are defined inside a class definition?
- [ ] method
- [x] fields and methods
- [ ] fields, methods, and packages
- [ ] fields
#### Q38. What defines methods and fields that can then be reused by mixing into classes?
- [ ] singleton
- [ ] assertion
- [x] trait
- [ ] monad
#### Q39. When do you need to explicitly state the return type in a function definition?
- [ ] when the function has no side effects
- [ ] when the function returns a Unit type
- [x] when the function is recursive
- [ ] when the function has side effects
#### Q40. Why would you make a field private?
- [ ] so only methods in the same file can access the field
- [ ] so only methods in the same package can access the field
- [x] so only methods in the same class could access the field
- [ ] so only methods defined in a Java class can access the field
#### Q41. What's the difference between `equals` and `==`?
- [ ] They do the exact same thing
- [ ] `==` won't work on objects
- [ ] `==` cannot be applied to String
- [x] `==` is a wrapper of `equals()` and checks for nulls
#### Q42. What is denotes the intersection between two sets?
- [ ] ||
- [ ] &&
- [x] &
- [ ] %
#### Q43. What do you call a function defined in a block?
- [ ] private function
- [ ] block function
- [x] local function
- [ ] method
#### Q44. What do you call a Scala method that is parametrized by type as well as by value?
- [ ] multimode method
- [x] polymorphic method
- [ ] closure
- [ ] collection method
#### Q45. What type of exception is thrown when a precondition is violated?
- [x] IllegalArgumentException
- [ ] NumberFormatException
- [ ] NullPointerExcepetion
- [ ] MalformedParameterException
#### Q46. In scala what is precondition?
- [ ] a constraint on where a method may be called from
- [x] a constraint on values passed to a methode constructor
- [ ] a class of predifined error messages
- [ ] a class of Boolean operators
#### Q47. What would you change in this code to make it execute in parallel?
```Scala
val myNums = (1 to 500).toList
list.map(_+ 1)
```
- [x] Change **list.map** to **list.par.map.**
- [ ] Change **toList** to **toListPar**
- [ ] Change **val** to **val.par**
- [ ] Change **toList** to **toParallelList**
#### Q48. What is a free variable?
- [x] a variable defined outside a function
- [ ] a variable referenced in a function that is not assigned a value by that function
- [ ] a variable that has a global scope
- [ ] a variable defined in a class and available to all methods in that class
#### Q49. What's the best way to execute code in the background in a separate thread?
- [ ] AltThread
- [ ] AltFuture
- [ ] AltProcess
- [x] Future
#### Q50. What value does this code return?
```Scala
x= List(1,2,4); x(1)?
```
- [ ] (1,2,4)
- [ ] 1
- [ ] Nil
- [x] 2
#### Q51. Which data type does Scala use instead of null for optional values?
- [ ] Nil
- [x] Option
- [ ] Singleton
- [ ] Collection
#### Q53. Which expression is one way to iterate over a collection and generate a collection of each iteration's result?
- [x] for-yield
- [ ] for-collect
- [ ] for-collect until
- [ ] collectuntil
#### Q54. Which statement accesses the third element of an array named foo?
- [ ] foo[2]
- [ ] foo(3)
- [ ] foo[3]
- [x] foo(2)
#### Q55. What data type would you use to store an immutable collection of objects when you don't know how many members will be in the collection?
- [ ] Tuple
- [x] List
- [ ] Object
- [ ] Array
#### Q56. From where do all classes in Scala inherit?
- [x] AnyRef
- [ ] AnyColl
- [ ] AnyVal
- [ ] AnyClass
#### Q58. Which code sample will print the integers 1 through 4, each on a separate line?
- [ ] for(i <- 0 to 4) println(i)
- [ ] for(i <- 0 to 3) println(i+1)
- [ ] for(i <- 1 to 8 if i < 5) println(i)
- [x] for(i <- 1 to 4) println(i)

