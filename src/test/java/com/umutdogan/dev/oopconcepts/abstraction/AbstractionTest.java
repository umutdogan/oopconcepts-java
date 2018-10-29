package com.umutdogan.dev.oopconcepts.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractionTest
{
   private Employee employee;

   @Test
   public void testContractor()
   {
      employee = new Contractor("contractor", 10, 10);
      assertEquals(100, employee.calculateSalary());
   }

   @Test
   public void testFullTimeEmployee()
   {
      employee = new FullTimeEmployee("full time employee", 8);
      assertEquals(64, employee.calculateSalary());
   }
}
