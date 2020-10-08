package br.com.assemblyline.service;

import java.util.ArrayList;
import java.util.List;


import br.com.assemblyline.model.Line;
import br.com.assemblyline.model.Process;

/**
 * @author Keetener Rodrigo
 * Configures the assembly line and its processes.
 */

public class LineService {

	private final static List<Process> assemblyLineOne;
	private final static List<Process> assemblyLineTwo;

   /*Pre-define the time of each process on the assembly lines*/ 
   static {
		assemblyLineOne = new ArrayList<>();		
		assemblyLineOne.add(new Process("", 60));
		assemblyLineOne.add(new Process("", 60));
		assemblyLineOne.add(new Process("", 60));
		assemblyLineOne.add(new Process("Lunch", 60));
		assemblyLineOne.add(new Process("", 60));
		assemblyLineOne.add(new Process("", 45));
		assemblyLineOne.add(new Process("", 45));
		assemblyLineOne.add(new Process("", 45));
		assemblyLineOne.add(new Process("", 30));
		assemblyLineOne.add(new Process("", 5));
		assemblyLineOne.add(new Process("Labor Gymnastics", 10));

		assemblyLineTwo = new ArrayList<>();		
		assemblyLineTwo.add(new Process("", 60)); 
		assemblyLineTwo.add(new Process("", 45));
		assemblyLineTwo.add(new Process("", 45));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("Lunch", 60));
		assemblyLineTwo.add(new Process("", 45));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("", 30));
		assemblyLineTwo.add(new Process("Labor Gymnastics", 30));
	}
   
    public Line getLineOne() {
    	Line line = new Line("Assembly Line 1:", assemblyLineOne);
    	return line;
    }
    
    public Line getLineTwo() {
    	Line line = new Line("Assembly Line 2:", assemblyLineTwo);
    	return line;
    }
	

}
