package jdbc_Template;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author zhazhahui
 * <p>
 * 事务配置类
 * @create 2021-07-25 10:38
 */
@Configuration
@ComponentScan(basePackages = "jdbc_Template")
@EnableTransactionManagement//开启事务
public class TransactionConfig {

    //创建数据库连接池
    @Bean
    public DruidDataSource getDruinDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://user_db");
        dataSource.setUsername("root");
        dataSource.setPassword("995749");
        return dataSource;
    }

    //创建jdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入DataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }


    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
