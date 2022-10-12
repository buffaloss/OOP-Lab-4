# OOP-Lab-4

## School Simulation 3.0

For this laboratory work, I continued improving my simulation of a school by using polymorphism mechanisms and adding different scenarios. 

Firstly, I changed some things: I made Location be an inner class of School, I created the abstract class Room to create a hierarchy with Classroom, Canteen and Sports Hall, I created a new class Parent to improve my simulation,I created the SubjectList class and Curriculum class (its child class) for storing and showing the list of existent school subjects. 

I made sure to use abstraction using interfaces ( like adjunctActivity, studentMainActivity, studentExtra, roomState etc.), I used abstract classes such as Person and I created nested classes. My 'Menu' has 6 different scenarios with their own complexities,as well as the option to view school subjects and exit the program. I used java.util.Scanner and java.utilRandom in order to be able to take input from user ( the choice of scenario) and to be able to generate random numbers and choices in my scenarios.

The scenarios include:
   1. Sleeping during class
   2. Parent-teacher meeting
   3. Occupied classroom
   4. Student fight
   5. The school nurse
   6. The school kitchen

![alt text](https://github.com/buffaloss/OOP-Lab-4/blob/main/Lab4%20Diagram.png?raw=true)
