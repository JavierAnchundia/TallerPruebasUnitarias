/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.time.ZoneId;
import java.util.Date;
import javaapplication8.Employee.EmployeeType;
import static javaapplication8.Employee.EmployeeType.Manager;
import static javaapplication8.Employee.EmployeeType.Supervisor;
import static javaapplication8.Employee.EmployeeType.Worker;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CltControl
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSalario0Worker() {
       /*CASO DE QUE empleador sea worker independiente de su salario */
       Employee e = new Employee(0,"USD",1,EmployeeType.Worker);
       //float sal = e.();
       //System.out.println("Salario: "+ sal);
       assertEquals(386.0F, e.CalculateYearBonus(),0.000F);
       
    }
    
        @Test
    public void testSalario0Supervisor() {
       /*CASO DE QUE UN SALARIO sea 0 pero el employe sea supervisor y la currency sea diferente de usd*/
       Employee e = new Employee(0,"EU",1,EmployeeType.Supervisor);
       assertNotEquals(386.0F, e.CalculateYearBonus(),1);
       
    }
     public void testCs() {
        System.out.println("cs");
        Employee instance = new Employee(100,"UKD", (float) 10.5,Worker);
        Employee instance2 = new Employee(100,"UKD", (float) 10.5,Manager);  
        Employee instance3 = new Employee(100,"UKD", (float) 10.5,Supervisor);  

        float esperado=  (float) (instance.getSalary()*0.95);
        Date date = new Date();
        int month = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
        //Compruebo que con currency que diferente a USD, devuelva los valores esperados tanto para  Worker como para Manager y para Supervisor
        assertEquals(95, instance.cs(), 0.0);
        assertEquals(95+(instance2.getBonusPercentage() * 0.7F), instance2.cs(), 0.0);
        assertEquals(95+(instance3.getBonusPercentage() * 0.35F), instance3.cs(), 0.0);

        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSalario0Manager() {
       /*CASO DE QUE UN SALARIO sea 0 pero el employe sea manager y la currency sea diferente a usd*/
       Employee e = new Employee(0,"EU",1,EmployeeType.Manager);
       assertEquals(386.0F, e.CalculateYearBonus(),1);
       
       
    }
    
    
    
}
