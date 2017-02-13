
package junitdayslab;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Junitdayslab {



    
    public static void main(String[] args) {
        Result myResult = JUnitCore.runClasses(junitdayslab.TestUnit.class);
   
        
         for (Failure failure : myResult.getFailures()) {
          System.out.print("Failed");
          System.out.println(failure.toString());
      }  
    }
    
}
