package fr.af.mondodb.ws.model;

/**
 * The Class Intervention.
 */
public class Intervention {

	/** The type. */
	private String type;

	/** The operation. */
	private String operation;

	/** The status. */
	private String status;

	/** The code intervention. */
	private String codeIntervention;

	/**
	 * Instantiates a new intervention.
	 *
	 * @param type
	 *            the type
	 * @param operation
	 *            the operation
	 * @param status
	 *            the status
	 * @param codeIntervention
	 *            the code intervention
	 */
	public Intervention(String type, String operation, String status, String codeIntervention) {
		super();
		this.type = type;
		this.operation = operation;
		this.status = status;
		this.codeIntervention = codeIntervention;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the operation.
	 *
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation.
	 *
	 * @param operation
	 *            the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the code intervention.
	 *
	 * @return the code_intervention
	 */
	public String getCodeIntervention() {
		return codeIntervention;
	}

	/**
	 * Sets the code intervention.
	 *
	 * @param codeIntervention
	 *            the code_intervention to set
	 */
	public void setCodeIntervention(String codeIntervention) {
		this.codeIntervention = codeIntervention;
	}

	@Override
	public String toString() {
		return "Intervention [type=" + type + ", operation=" + operation + ", status=" + status + ", codeIntervention="
				+ codeIntervention + "]";
	}

	
	
}
