package com.nvidia.cosmos.cloud.dtos;



public class DeleteUserDTO implements BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	


	public DeleteUserDTO() {
		super();
	}

	public DeleteUserDTO(String id) {
		super();
		this.id = id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	

}
