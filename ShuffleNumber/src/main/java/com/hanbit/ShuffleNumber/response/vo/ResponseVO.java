/**
 * 
 */
package com.hanbit.ShuffleNumber.response.vo;

import java.util.List;

/**
 * @author Bharat Kumar
 *
 */
public class ResponseVO {

	private String result;
	private String errorMessage;
	private List<ShuffleResponseVO> shuffleList;
	private int size;
	
	
	
	
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<ShuffleResponseVO> getShuffleList() {
		return shuffleList;
	}

	public void setShuffleList(List<ShuffleResponseVO> shuffleList) {
		this.shuffleList = shuffleList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	
}
