/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javaapplication8.Employee.EmployeeType;
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
       /*CASO DE QUE UN SALARIO sea 0 pero el employe sea supervisor y la currency*/
       Employee e = new Employee(0,"EU",1,EmployeeType.Supervisor);
       assertNotEquals(386.0F, e.CalculateYearBonus(),1);
       
    }
    
    
    @Test
    public void testSalario0Manager() {
       /*CASO DE QUE UN SALARIO sea 0 pero el employe sea manager y la currency*/
       Employee e = new Employee(0,"EU",1,EmployeeType.Manager);
       assertEquals(386.0F, e.CalculateYearBonus(),1);
       
       
    }
    
    
    
}
