/**
 * 
 */
package com.hanbit.ShuffleNumber.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.ShuffleNumber.bo.ShuffleBO;
import com.hanbit.ShuffleNumber.dao.ShuffleDAO;
import com.hanbit.ShuffleNumber.exceptions.BusinessException;
import com.hanbit.ShuffleNumber.response.vo.ResponseVO;

/**
 * @author Bharat Kumar
 * 
 */
@Controller
public class ShuffleController {

	@RequestMapping(value = "/shuffle/{type}/{Number}", method = RequestMethod.GET, produces = "application/json")

	public @ResponseBody ResponseVO validateUser(@PathVariable("type") String type,@PathVariable("Number") int number)
			throws ClassNotFoundException, BusinessException, SQLException {

		ResponseVO responsevo = new ResponseVO();
		ShuffleBO shufflebo = new ShuffleBO();
		String result = "";

		try {
			result = shufflebo.validateShuffle(type,number);
		}

		catch (BusinessException e) {
			String message = e.getMessage();
			responsevo.setErrorMessage(message);
		}

		responsevo.setResult(result);

		return responsevo;
	}
	
	
	@RequestMapping(value = "/shuffleList", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseVO communitydetails() throws SQLException {

		ResponseVO responsevo = new ResponseVO();
		ShuffleDAO shuffledao = new ShuffleDAO();

		responsevo.setShuffleList(shuffledao.getShuffledetails());
		
		responsevo.setSize(shuffledao.getShuffledetails().size());

		return responsevo;
	}
	
	
	
}
