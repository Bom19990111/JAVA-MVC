/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Comparator;

/**
 *
 * @author Nhat Thinh
 */
public class productbyprice implements Comparator<exercise13_2>{

    @Override
    public int compare(exercise13_2 o1, exercise13_2 o2) {
      double pr = (o1.getSoluong() - o2.getSoluong());
      return (int) pr;
      
    }

    

    
}
