

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // 数据库连接信息
        String url = "jdbc:postgresql://localhost:5432/service"; // 替换为你的数据库名
        String user = "postgres"; // 替换为你的数据库用户名
        String password = "123456"; // 替换为你的数据库密码

        Connection connection = setConnection(url, user, password);
        // 获取 jOOQ 执行器
        /*DSLContext dslContext = DSL.using(connection, SQLDialect.POSTGRES);
        List<漫画BO> list = dslContext.select(漫画TB.漫画).from(漫画TB.漫画).orderBy(漫画TB.漫画.ID).fetchInto(漫画BO.class);
        list.forEach(System.out::println);*/
    }


    public static Connection setConnection(String url, String user, String password) {
        try {
            // 1. 加载 JDBC 驱动
            Class.forName("org.postgresql.Driver");
            // 2. 连接数据库
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
