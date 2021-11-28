package loginTRIAL;

import java.sql.*;




public class userDB {
	public static Connection create() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/userdb";
			String uname = "root";
			String pass = "root";
			
			Connection con =  DriverManager.getConnection(url, uname, pass);
			return con;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean save(userDetails obj){
		Connection con=userDB.create();
		int status=0;
		try {
			String nametemp =obj.getName();
			String mobtemp=obj.getMob();
			
			PreparedStatement ps=con.prepareStatement("insert into userdb.usertrial values(?,?)");
			ps.setString(1, nametemp);
			ps.setString(2, mobtemp);
			status=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(status==1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean check(String name,String pass) {
		Connection con=userDB.create();
		try{
			PreparedStatement ps=con.prepareStatement("select NAME,MOB from userdb.usertrial where name=? and mob=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			boolean b =rs.next();
			return b;

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
