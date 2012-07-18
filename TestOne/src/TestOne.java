import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.namespace.QName;

import oracle.jdbc.OracleTypes;
import ptk.ws.tools.resource.ConnectionManager;


public class TestOne {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("test ok");
		
		int noOfPriorities = 3;
		int maxRows = 11;
		int[][] prioritiesWages = new int[noOfPriorities][2];
		int[][] resultTableOfPriorities = new int[10][2];
		
		for (int i = 0; i < maxRows; i++) {
			
			resultTableOfPriorities[i][0] = i;
			resultTableOfPriorities[i][1] = i; 
			
		}
		
		for (int j = 0; j < resultTableOfPriorities.length; j++) {
			for (int j2 = 0; j2 < resultTableOfPriorities[j].length; j2++) {
				System.out.print(resultTableOfPriorities[j][j2]+" ");
			}
			System.out.println();
		}
		
//		getRandomMsisdn();
	}
	
	public static String getRandomMsisdn() throws SQLException, ClassNotFoundException {
		ConnectionManager connectionManager = new ConnectionManager();
		QName qname = new QName("ptk.config.jdbc", "BsitConnection");
		final Connection c = connectionManager.getJDBCConnection(qname);
		try {
			String statement = "{call BSIT.COMPLAINT_RES_SUPPORT.CHANGE_RESOURCE_STATUS(?,?)}";
			
			CallableStatement cs = c.prepareCall(statement,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			cs.setString(1, "-673");
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			
			cs.executeQuery();
			ResultSet rs = (ResultSet) cs.getObject(2);
			String result = "";
			while (rs.next()) {
				
				result = rs.getString(1);
			}
			cs.close();
			rs.close();
			return result;
		} finally {
			c.close();
		}
	}

	
}
