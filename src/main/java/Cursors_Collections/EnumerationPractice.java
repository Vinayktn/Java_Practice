package Cursors_Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationPractice
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		
		//--->
	    v.addElement("aaa");
        v.addElement("bbb");
        v.addElement("ccc");
        v.addElement("ddd");
	 
        Enumeration e = v.elements();
        
         while(e.hasMoreElements())
        {
        	System.out.println(e.nextElement());
        }
	}
}
