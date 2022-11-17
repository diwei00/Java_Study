import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertDemo {
    public static void main(String[] args) throws SQLException {
        //先创建DateSource数据源，描述数据库服务器在哪
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/test9?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("wuhao1126");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号：");
        int id = scanner.nextInt();
        System.out.println("请输入姓名：");
        String name = scanner.next();

        //建立连接
        Connection connection = dataSource.getConnection();
        //构造sql语句
        //String sql = "insert into student values(" + id + " , '" + name + "')";
        String sql = "insert into student values(?,?)";//设置通配符
        //对sql语句进行预处理，jdbc 中还需要搭配一个特定的对象, 来描述这里的 sql 的情况
        PreparedStatement statement = connection.prepareStatement(sql);

        //替换通配符
        statement.setInt(1, id);
        statement.setString(2, name);

        //执行sql语句，返回所影响的行数
        int ret = statement.executeUpdate();
        System.out.println(ret);

        //释放资源，断开连接
        statement.close();
        connection.close();



    }

}
