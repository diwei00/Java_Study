import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelectDemo {
    public static void main(String[] args) throws SQLException {
        //创建数据源，描述数据库服务器位置
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/test9?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("wuhao1126");

        //建立连接
        Connection connection = dataSource.getConnection();

        //构造sql，预处理
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);

        //执行sql，返回结果集合
        ResultSet resultSet = statement.executeQuery();
        //遍历集合，打印数据
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + " " + name);
        }

        //释放资源
        resultSet.close();
        statement.close();
        connection.close();


    }
}
