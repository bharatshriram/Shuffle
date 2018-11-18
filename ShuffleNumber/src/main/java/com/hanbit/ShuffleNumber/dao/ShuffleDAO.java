/**
 * 
 */
package com.hanbit.ShuffleNumber.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.hanbit.ShuffleNumber.constants.DataBaseConstants;
import com.hanbit.ShuffleNumber.response.vo.ShuffleResponseVO;

/**
 * @author Bharat Kumar
 *
 */
public class ShuffleDAO {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName(DataBaseConstants.DRIVER_CLASS);
		connection = DriverManager.getConnection(DataBaseConstants.DRIVER_URL, DataBaseConstants.USER_NAME,
				DataBaseConstants.PASSWORD);
		return connection;
	}

	public String dataDAO(String type, int number) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;

		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		String result = "Failure";
		String deleteFlag = "Failure";

		Boolean flag = false;
		Random random = new Random();

		try {

			con = getConnection();

			int n = random.nextInt(number);

			System.out.println("type==>"+type+"--------->"+number);
			
			System.out.println("NNNN==>" + n);

			if (type.equalsIgnoreCase("main")) {

				pstmt = con.prepareStatement("delete from shuffleData");

				if (pstmt.executeUpdate() > 0) {
					deleteFlag = "Success";
				}
				if (deleteFlag.equalsIgnoreCase("Success")) {

					String sql = "INSERT INTO shuffleData(shuffleCount,shuffleNumber,lastDate) VALUES(?,?,SYSDATETIME())";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, n);
					pstmt.setInt(2, number);

					if (pstmt.executeUpdate() > 0) {
						result = "Success";
					}

				}

			} else if (type.equalsIgnoreCase("submain")) {

				pstmt1 = con.prepareStatement(
						"select DISTINCT shuffleCount,lastDate from shuffleData where shuffleCount=?");
				pstmt1.setInt(1, n);
				rs = pstmt1.executeQuery();
				if (rs.next()) {

					System.out.println("Innnnnnnnnnnside");
					flag = true;
				}

				if (!flag) {

					String sql = "INSERT INTO shuffleData(shuffleCount,shuffleNumber,lastDate) VALUES(?,?,SYSDATETIME())";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, n);
					pstmt.setInt(2, number);

					if (pstmt.executeUpdate() > 0) {
						result = "Success";
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}

	public List<ShuffleResponseVO> getShuffledetails() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ShuffleResponseVO> shuffledetailslist = null;
		try {
			con = getConnection();
			shuffledetailslist = new LinkedList<ShuffleResponseVO>();

			

				pstmt = con.prepareStatement(
						"SELECT DISTINCT shuffleCount,shuffleNumber,lastDate FROM [ShuffleData] ORDER BY lastDate");

			rs = pstmt.executeQuery();
			ShuffleResponseVO shufflevo = null;
			while (rs.next()) {
				shufflevo = new ShuffleResponseVO();
				shufflevo.setShuffleNumber(rs.getInt("shuffleCount"));
				shufflevo.setDateTime(rs.getString("lastDate"));
				shuffledetailslist.add(shufflevo);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pstmt.close();
			rs.close();
			con.close();
		}
		return shuffledetailslist;
	}
}