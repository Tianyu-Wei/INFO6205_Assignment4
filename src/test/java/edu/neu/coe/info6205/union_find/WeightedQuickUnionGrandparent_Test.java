package edu.neu.coe.info6205.union_find;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WeightedQuickUnionGrandparent_Test {
	/**
    *
    */
   @Test
   public void testIsConnected01() {
       Connections h = new WeightedQuickUnionGrandparent(2);
       assertFalse(h.isConnected(0, 1));
   }

   /**
    *
    */
   @Test(expected = IllegalArgumentException.class)
   public void testIsConnected02() {
       Connections h = new WeightedQuickUnionGrandparent(1);
       assertTrue(h.isConnected(0, 1));
   }

   /**
    *
    */
   @Test
   public void testConnect01() {
       Connections h = new WeightedQuickUnionGrandparent(2);
       h.connect(0, 1);
   }

   /**
    *
    */
   @Test
   public void testConnect02() {
       Connections h = new WeightedQuickUnionGrandparent(2);
       h.connect(0, 1);
       h.connect(0, 1);
       assertTrue(h.isConnected(0, 1));
   }

   /**
    *
    */
   @Test
   public void testFind0() {
       UF h =  new WeightedQuickUnionGrandparent(1);
       assertEquals(0, h.find(0));
   }

   /**
    *
    */
   @Test
   public void testFind1() {
       UF h = new WeightedQuickUnionGrandparent(2);
       h.connect(0, 1);
       assertEquals(0, h.find(0));
       assertEquals(0, h.find(1));
   }

   /**
    *
    */
   @Test
   public void testFind2() {
       UF h = new WeightedQuickUnionGrandparent(3);
       h.connect(0, 1);
       assertEquals(0, h.find(0));
       assertEquals(0, h.find(1));
       h.connect(2, 1);
       assertEquals(0, h.find(0));
       assertEquals(0, h.find(1));
       assertEquals(0, h.find(2));
   }

   /**
    *
    */
   @Test(expected = IllegalArgumentException.class)
   public void testFind5() {
       UF h = new WeightedQuickUnionGrandparent(1);
       h.find(1);
   }


   /**
    *
    */
   @Test
   public void testConnected01() {
       Connections h = new WeightedQuickUnionGrandparent(10);
//       h.show();
       assertFalse(h.isConnected(0, 1));
   }
}
