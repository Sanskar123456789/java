import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public int insertstudent(Student s) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getConn();
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,s.getid());
		ps.setString(2,s.getname());
		ps.setString(3,s.getemail());
		return ps.executeUpdate();
	}
	
	
	public List<Student> getallstudents() throws ClassNotFoundException, SQLException{
		ArrayList<Student> list=new ArrayList<>();
		Connection con=DbUtil.getConn();
		String sql="select * from student";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Student s=new Student();
			s.setid(rs.getString(1));
			s.setname(rs.getString(2));
			s.setemail(rs.getString(3));
			list.add(s);
			
		}
		return list;
	}

}
