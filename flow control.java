-- Flow Control --

L1-00:24 What are Control flow statements?
    These are the statements which are used for -
      Decision making
      Looping
      Changing the control flow of a program on a particular case.

L1-00:58 Explain the if-else statement. | Explain how if-else changes the control flow of program?
    if-then:
      if(boolean arg){
        //code to be executed if condition returns true.
      }

      for example,
        public class Exercise{
          public static void main(String[] args){
	           int val= 25;
	           if(val<=30){
	              //execution will go inside the if block only if the condition returns true.
	           }
          }
        }

    else: else clause is optional.
        public class Exercise{
          public static void main(String[] args){
	           int val= 100;
	           if(val<=30){
	              //...
	           }else{
	              //...this block will be executed
	           }
          }
        }

L1-05:32 What if we have more than one or two conditions in program? Do we need to write if clause again and again?
    For this, we have else-if construct.

      public class Exercise{
        public static void main(String[] args){
	         int val= 50;
	         if(val<=30){
	            //...
	         }else if(val>30 && val<= 50){
	            //....this will be executed.
	         }else if(val>50 && val<=70){
	            //...
	         }else{
	            //...
	         }
        }
      }

    Note that, In java, if-else statement can only have boolean expressions as conditions.

L1-08:47 There is a boolean value a = true, and b = false. Can we put a=b condition in if block?
    boolean a = true;
    boolean b = false;
    if (a=b) {System.out.println("");}

    Yes we can put such conditions.

-----------------------------------------------------------------------------------------------------------

L1-10:29 Explain switch case. How it works and what object types can be used in the switch clause?
    The Switch clause provides several execution paths with case and default clause.
    -> Types it takes as switch values : byte, short, char, int and their wrapped versions.
                                         including enums and strings.

    for example,
      int yearsOfWorkingExperience = 8;
     	switch(yearsOfWorkingExperience){
          case 0:
              System.out.println("Fresher");
              break;
          case 1:
              System.out.println("Junior Developer");
              break;
          case 2:
              System.out.println("Developer");    //this will get executed
              break;
          case 3:
              System.out.println("Senior Developer");
              break;
          default:
              System.out.println("Team Lead");
      }

      There are 4 possible cases and one default case.

L1-11:43 How it works?
    switch statement evaluates each case expression for matching the value of variable that it is having.
    Then executes all the statements that are written inside that case if that case is matched.

    After executing the case we write break, so that the execution will break there and exits the switch
    statement.
    And if the none of the written cases are matched then the default block will get executed..

L1-12:43 What if we do not write the default block in switch statement?
    When none of the case will be matched, then nothing will get executed since default block is not there.

L1-13:17 What will happen when we forget to put break statement in case clause?
    In such case, it will continue executing all the cases which are written after that,
    until the break statement not found or until the end of switch statement.

        switch(yearsOfWorkingExperience){
          case 0:
            System.out.println("Fresher");
            break;
          case 1:
            System.out.println("Junior Developer");
          case 2:
            System.out.println("Developer");
          case 3:
            System.out.println("Senior Developer");
          break;
        }

L1-14:24 What if we put the default block in between the case labels?
    We can put the default block anywhere, compiler will not raise any error. But the best practice is
    we should always write the default block at the end.

L1-15:32 What is more preferable to use, switch over if-else or if-else over switch?
    The if-else statement is used
      -> when we need to check ranges of values or multiple conditions..

         public class Exercise{
           public static void main(String[] args){
   	         int val= 10;
   	         if((val%2)==0){
   	           System.out.println("Number is even");
   	         }else{
   	           System.out.println("Number is odd");
             }
           }

    The switch is used
      -> when we need to test a single variable against many single values.
         when several values executes the same code.

         int yearsOfWorkingExperience = 1;

   	     switch(yearsOfWorkingExperience){
   		      case 0:
   		         System.out.println("Fresher");
   		         break;
   		      case 1:
   		      case 2:
   		         System.out.println("Developer");
   		         break;
   		      case 3:
   		         System.out.println("Senior Developer");
   		         break;
   		      default:
   		         System.out.println("Team Lead");
   	     }


L2-00:16 What types of loops present in java?
   for, while, and do-while

   1. For loop: It provides a way to iterate over a range of values.
   We use for loop when we know in advance that how many times a task is going to be repeated.

       for(initialization; condition; incrementation/decrementation){
         //statements or code to be executed
       }

       for(int i=0;i<10;i++){
         System.out.println(i);
       }

L2-02:14 -> What if we do not put the condition in for loop?
       If we do not put the condition, then loop will execute for infinite times since we did not provide
       the condition and by default it will take true for that.

L2-03:27 -> What if we do not put the incrementation argument in for loop?
       If we do not increment the value then the 'i' will remain 0 always and will get printed for
       infinite times.

L2-03:36 -> What if we put break statement inside the for loop?
       In such case, the loop will get terminated.

   2. While loop: This loop is used to iterate a part of the program several times.
   We use while loop when the number of iteration is not fixed.

       We put only condition as argument with while.

       int i=10;
       while(i>1){		//condition
         System.out.println(i);	//statements
         i--;		//incrementing i
       }

   3. do-while loop: This loop is a variation of the while loop where the condition is evaluated at
   the bottom of the loop.
     do-while guarantees that the code will execute at least once!

     do{
       //statements to get executed
     } while(condition)

L2-07:38 What is enhanced for loop?
   The enhanced for loop is designed to iterate through all the elements of any collection,enum, array etc.

   for(DataType var : Collection){
     //statements to be executed
   }

L2-09:28 Except the arrays, which type of object we can iterate over using the foreach loop?
   We can iterate any object with this loop, which implements the Iterable interface.
   for example, lists, Set, and all the other collections.

L2-11:57 What are the difference between classic for loop and foreach loop?
    foreach is used to loop over a container which must implement the Iterable interface And
    there is no such requirement for the traditional for loop.

    for loop is present from the start in java, whereas the foreach loop was added in java in 1.5 version

    Enhanced for loop always executes in sequence.the counter is increased by one.
    whereas in for loop we can change the incremental step as per our requirement.

    foreach loop can iterate only in incremental order.
    But in traditional for loop we can also iterate in decremental order.
    By writing i-- in step counter to go backward

    we don't have the access to array index in foreach loop while iterating.
    so, we cannot replace the element at the given index.. whereas using for loop
    we are allowed to replace any element in the array by its index.

L2-14:23 How the foreach loop is different from foreach() method?
   Enhanced for loop or foreach loop iterates over the collection objects or the objects which implements
   Iterable interface. This is just the enhanced version of for loop..

   Foreach method is introduced in java 8, in the interface iterator as default method.
   We can iterate over any collection by passing the Lambda expression as argument.

L2-18:08 What are the various transfer statements used in java?
   There are six language constructs for transferring control in java:
   1. break: This statement is used to terminate the current loop or flow.

   2. continue: This is used to stop the execution in loop for the current iteration only.

   3. return: This statement stops the execution of a method and transfers the control to the caller.

   4. try-catch-finally

   5. throw

   6. assert
