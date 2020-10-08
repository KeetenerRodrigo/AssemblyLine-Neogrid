package br.com.assemblyline.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.assemblyline.model.Process;
import br.com.assemblyline.service.LineService;
import br.com.assemblyline.util.DateUtil;
import java.time.LocalDateTime;

/**
 * @author Keetener Rodrigo Controls all applications.
 */
public class LineController {

    private final LineService lineService;
    private final List<Process> processLineOne;
    private final List<Process> processLineTwo;

    public LineController() {
        lineService = new LineService();
        processLineOne = lineService.getLineOne().getProcess();
        processLineTwo = lineService.getLineTwo().getProcess();
    }

    /* Reads the input.txt file and inserts the content into a list of processes. */
    public void readInput() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("input.txt").getFile());
        List<Process> process = new ArrayList<>();
        
        try {
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNext()) {
                String processString = scanner.nextLine();
                String processDurationTime = processString.replaceAll("\\D+", "");
                if (processDurationTime.equals("")) {
                    processDurationTime = "5";
                }
                process.add(createProcess(processString, processDurationTime));

            }
            
            scanner.close();
        } catch (IOException e) {
            System.err.println("Could not read input.txt, make sure the file "
                    + " is in the location indicated.");
        }
        
        arrangeLines(process);
    }

    public Process createProcess(String processString, String processDurationTime) {
        return new Process(processString, Integer.parseInt(processDurationTime));
    }

    /* Configure the assembly lines with the processes and their respective schedules. */
    public void arrangeLines(List<Process> process) {

        for (int i = 0; i < process.size(); i++) {
            for (int j = 0; j < processLineOne.size(); j++) {
                if (process.get(i).getTime() == processLineOne.get(j).getTime() 
                        && processLineOne.get(j).getDescription().equals("")) {
                    processLineOne.get(j).setDescription(process.get(i).getDescription());
                    process.get(i).setTime(0);
                }
            }
        }
        
        for (int i = 0; i < process.size(); i++) {
            for (int j = 0; j < processLineTwo.size(); j++) {
                if (process.get(i).getTime() == processLineTwo.get(j).getTime() 
                        && processLineTwo.get(j).getDescription().equals("")) {
                    processLineTwo.get(j).setDescription(process.get(i).getDescription());
                    process.get(i).setTime(0);
                }
            }

        }
        
        printEventLines();
    }

    /* Displays the assembly lines. */
    public void printEventLines() {
        LocalDateTime DateTimeNow = LocalDateTime.now();

        //First assembly line.
        LocalDateTime localTimeAssemblyLineOne = LocalDateTime.of(DateTimeNow.getYear(),
                DateTimeNow.getMonth(), DateTimeNow.getDayOfMonth(), 9, 0);
        
        System.out.println(lineService.getLineOne().getDescription());
        for (Process t : processLineOne) {
            System.out.println(DateUtil.dateToString(localTimeAssemblyLineOne)
                    + " " + t.getDescription());
            localTimeAssemblyLineOne = localTimeAssemblyLineOne.plusMinutes(t.getTime());
        }

        System.out.println();

        //Second assembly line.
        LocalDateTime localTimeAssemblyLineTwo = LocalDateTime.of(DateTimeNow.getYear(),
                DateTimeNow.getMonth(), DateTimeNow.getDayOfMonth(), 9, 0);
        
        System.out.println(lineService.getLineTwo().getDescription());
        for (Process t : processLineTwo) {
            System.out.println(DateUtil.dateToString(localTimeAssemblyLineTwo)
                    + " " + t.getDescription());
            localTimeAssemblyLineTwo = localTimeAssemblyLineTwo.plusMinutes(t.getTime());
        }
    }
}
