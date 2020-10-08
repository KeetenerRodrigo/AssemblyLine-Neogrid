package br.com.assemblyline.model;

import java.util.List;

/**
 * @author Keetener Rodrigo
   Assembly line class.
 */
public class Line {

	private String description;
	private List<Process> process;
	/**
	 * @param description
	 * @param process
	 */
	public Line(String description, List<Process> process) {
		super();
		this.description = description;
	    this.process = process;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the process
	 */
	public List<Process> getProcess() {
		return process;
	}
	/**
	 * @param process the process to set
	 */
	public void setProcess(List<Process> process) {
		this.process = process;
	}
}
