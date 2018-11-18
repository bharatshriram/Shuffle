/**
 * 
 */
package com.hanbit.ShuffleNumber.bo;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hanbit.ShuffleNumber.dao.ShuffleDAO;
import com.hanbit.ShuffleNumber.exceptions.BusinessException;
import com.hanbit.ShuffleNumber.response.vo.ResponseVO;

/**
 * @author Bharat Kumar
 *
 */
public class ShuffleBO {

	public String validateShuffle(String type,int number) throws ClassNotFoundException, BusinessException, SQLException {
		// TODO Auto-generated method stub
		
		String result="";
/*		Pattern pattern = Pattern.compile("[A-Za-z0-9]");
		Matcher matcher = pattern.matcher(number);

		if (!matcher.find()) {
			blockname = true;
		}*/
		ShuffleDAO shuffledao=new ShuffleDAO();
		ResponseVO responsevo=new ResponseVO();
		
		
		boolean flag = false;

		
		
		
		result=shuffledao.dataDAO(type,number);
		
		return result;
	}

}
