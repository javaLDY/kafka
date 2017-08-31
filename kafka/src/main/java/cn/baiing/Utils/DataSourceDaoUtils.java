package cn.baiing.Utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class DataSourceDaoUtils{
	
	private static String url = null;
	
	private static String username = null;
	
	private static String password = null;
	
	private static String driverName = "com.mysql.jdbc.Driver";
	
	private static Connection conn = null;
	
	public DataSourceDaoUtils(HttpServletRequest request){
		Map<String, String> map = getSqlData(request);
		String sqlName = map.get("sqlName");
		String sqlIp = map.get("sqlIp");
		String sqlUserName = map.get("sqlUserName");
		String sqlPassword = map.get("sqlPassword");
		url = "jdbc:mysql://"+ sqlIp +"/"+sqlName+"?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=round";
		username = sqlUserName;
		password = sqlPassword;
	}
	
	public static Connection getSqlConnection(){
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 释放资源
	 * @param conn
	 * @param stat
	 * @param rs
	 */
    public static void close(Connection connection, PreparedStatement pstat, ResultSet rs){  
         if(rs != null){  
             try {rs.close();} catch (SQLException e) {e.printStackTrace();}  
         } 
         if(pstat != null){  
             try {pstat.close();} catch (SQLException e) {e.printStackTrace();}  
         }
         if(connection != null){  
             try {connection.close();} catch (SQLException e) {e.printStackTrace();}  
         }  
    } 
    
    public static Map<String, String> getSqlData (HttpServletRequest request) {
    	File file =new File(request.getSession().getServletContext().getRealPath("/") + "DataSource.xml");
        SAXReader reader = new SAXReader();
        Map<String,String> map = new HashMap<String,String>();
        Document document =null;
        try {
            document = reader.read(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
         Element element = document.getRootElement();

         List<Element> list = element.elements();
         for (Element e : list) {
        	 map.put(e.getName(), e.attributeValue("value"));
         }
        return map;
	}
}
