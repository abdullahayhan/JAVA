import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
      Connection connection=null;
      DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
      try{
            connection=helper.getConnection();
            String sql="delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4083);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
      }catch (SQLException exception){
            helper.showErrorMessage(exception);
      }
      finally {
          statement.close();
          connection.close();}
    }

    public static void selectDemo() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try{
            connection=helper.getConnection();
            statement = connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Name"),
                        resultSet.getString("Code"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {connection.close();}
    }

    public static void insertData() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection=helper.getConnection();
            String sql="insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Düzce");
            statement.setInt(4,70000);
            statement.executeUpdate();
            System.out.println("Kayıt Eklendi");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();}
    }

    public static void updateData() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection=helper.getConnection();
            String sql="update city set population=250000,district='Turkey' where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4083);
            statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();}
    }
}
