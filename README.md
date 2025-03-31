Encapsulation
- setName() Updates the students name.
- getName() Returns the students name
- setGrade() ensures the grade is between 0-100
- getGrade() returns the grade
- The constructor initializes the student name and ensures valid grade using setGrade() method

Method Overloading and Overriding
- 2 methods both called multiplies but one allows 2 numbers the other 3 numbers the compiler decides which to call determining on the number of parameters
- Dog and cat classes inherit makesound from animal class but override it
- when calling makesound on animal you can have 3 different methods determined by which class you are referring to

Abstraction
- The Appliance class is abstract, so it cant be called directly e.g [Appliance tv = new Appliance()] 
- Fan and Tv extend Appliance and have their own versions of turnOn()

Exception Handling
- Import scanner so I can receive inputs
- attempts to divide by 2
- If num 2 is 0 ArithmeticException is caught and prints error message
