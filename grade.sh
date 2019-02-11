#!/bin/sh
#run tests on students' homework:
#copy JUnit file into students' submission folder
#compile all files
#run the tests

for HW in ./*/
do
     echo "********************************STUDENT**********************************************"
     (cd "$HW" && echo $HW)
     echo "*************************************************************************************"
     echo $HW | xargs -n 1 cp Homework1_Grader.java
     (cd "$HW" && javac *.java && java org.junit.runner.JUnitCore Homework1_Grader)
done
echo "************************************END GRADING****************************************"

