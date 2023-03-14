import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {
        try{

         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chena","root","1997");
            System.out.println("connected");
            String sql = "CREATE TABLE REGISTRATION1 " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Table created successfully....");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
