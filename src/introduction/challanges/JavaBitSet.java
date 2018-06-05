/*
 *Input Format

The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively. 
The  subsequent lines each contain an operation in one of the following forms:

AND 
OR 
XOR 
FLIP
SET 
In the list above,  is the integer  or , where  denotes  and  denotes . 
 is an integer denoting a bit's index in the BitSet corresponding to .

For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand.
 */

package introduction.challanges;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

/*5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1*/

public class JavaBitSet {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt(); //length of both BitSets B1 and B2 
		int M= sc.nextInt(); //the number of operations to perform
		BitSet B1= new BitSet(N);
		BitSet B2= new BitSet(N);
		
		try {
			
		
		for (int i=0 ; i< M; i++) {
			
			String op= sc.next();	
			int first= sc.nextInt();
			int second= sc.nextInt();
			//.out.println(op);
			//System.out.println(first);
			//System.out.println(second);
			switch(op)
			{
			case "AND" : 
				if (first==1) 
					B1.and(B2);
				else
					B2.and(B1);break;
					
			
			case "OR"  :
				if (first==1 & second==2) 
					B1.or(B2);
				else
					B2.or(B1);break;
					
			case "XOR"  :
				if (first==1 & second==2) 
					B1.xor(B2);
				else
					B2.or(B1);break;
					
			case "SET" :
				if (first ==1)
					B1.set(second);
				else
					B2.set(second);break;
				
			case "FLIP":
				if (first==1)
					B1.flip(second);
				else
					B2.flip(second);break;
			default:
				System.out.println("not handled");
								
			}
			
			System.out.println(B1.cardinality()+" "+B2.cardinality());
		}
		sc.close();
		
		

	}catch(Exception E) {E.getMessage();}
		/* Scanner sc = new Scanner(System.in);
		    int setSize = sc.nextInt();
		    int noOps = sc.nextInt();
		    BitSet[] bitSets = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
		    Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>();
		    ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
		    ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
		    ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
		    ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
		    ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));
		    for (int i = 0; i < noOps; i++){
		        ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());    
		        System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
		    }*/
		
	}

}
