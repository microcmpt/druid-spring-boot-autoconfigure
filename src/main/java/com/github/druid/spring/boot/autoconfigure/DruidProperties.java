package com.github.druid.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The type Druid properties.
 */
@ConfigurationProperties(prefix = "druid")
public class DruidProperties {
    /**
     * The Url.
     */
    private String url;

    /**
     * The Username.
     */
    private String username;

    /**
     * The Password.
     */
    private String password;

    /**
     * The Druid password.
     */
    private String druidPassword;

    /**
     * The Driver class name.
     */
    private String driverClassName;

    /**
     * The Initial size.
     */
    private int initialSize;

    /**
     * The Min idle.
     */
    private int minIdle;

    /**
     * The Max active.
     */
    private int maxActive;

    /**
     * The Max wait.
     */
    private int maxWait;

    /**
     * The Time between eviction runs millis.
     */
    private int timeBetweenEvictionRunsMillis;

    /**
     * The Min evictable idle time millis.
     */
    private int minEvictableIdleTimeMillis;

    /**
     * The Validation query.
     */
    private String validationQuery;

    /**
     * The Test while idle.
     */
    private boolean testWhileIdle;

    /**
     * The Test on borrow.
     */
    private boolean testOnBorrow;

    /**
     * The Test on return.
     */
    private boolean testOnReturn;

    /**
     * The Pool prepared statements.
     */
    private boolean poolPreparedStatements;

    /**
     * The Filters.
     */
    private String filters;

    /**
     * The Log slow sql.
     */
    private String logSlowSql;

    /**
     * The Connection properties.
     */
    private String connectionProperties;

    /**
     * The Max pool prepared statement per connection size.
     */
    private int maxPoolPreparedStatementPerConnectionSize;

    /**
     * The Transaction enable.
     */
    private boolean transactionEnable;

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets druid password.
     *
     * @return the druid password
     */
    public String getDruidPassword() {
        return druidPassword;
    }

    /**
     * Sets druid password.
     *
     * @param druidPassword the druid password
     */
    public void setDruidPassword(String druidPassword) {
        this.druidPassword = druidPassword;
    }

    /**
     * Gets driver class name.
     *
     * @return the driver class name
     */
    public String getDriverClassName() {
        return driverClassName;
    }

    /**
     * Sets driver class name.
     *
     * @param driverClassName the driver class name
     */
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    /**
     * Gets initial size.
     *
     * @return the initial size
     */
    public int getInitialSize() {
        return initialSize;
    }

    /**
     * Sets initial size.
     *
     * @param initialSize the initial size
     */
    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    /**
     * Gets min idle.
     *
     * @return the min idle
     */
    public int getMinIdle() {
        return minIdle;
    }

    /**
     * Sets min idle.
     *
     * @param minIdle the min idle
     */
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    /**
     * Gets max active.
     *
     * @return the max active
     */
    public int getMaxActive() {
        return maxActive;
    }

    /**
     * Sets max active.
     *
     * @param maxActive the max active
     */
    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    /**
     * Gets max wait.
     *
     * @return the max wait
     */
    public int getMaxWait() {
        return maxWait;
    }

    /**
     * Sets max wait.
     *
     * @param maxWait the max wait
     */
    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    /**
     * Gets time between eviction runs millis.
     *
     * @return the time between eviction runs millis
     */
    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    /**
     * Sets time between eviction runs millis.
     *
     * @param timeBetweenEvictionRunsMillis the time between eviction runs millis
     */
    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    /**
     * Gets min evictable idle time millis.
     *
     * @return the min evictable idle time millis
     */
    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    /**
     * Sets min evictable idle time millis.
     *
     * @param minEvictableIdleTimeMillis the min evictable idle time millis
     */
    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    /**
     * Gets validation query.
     *
     * @return the validation query
     */
    public String getValidationQuery() {
        return validationQuery;
    }

    /**
     * Sets validation query.
     *
     * @param validationQuery the validation query
     */
    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    /**
     * Is test while idle boolean.
     *
     * @return the boolean
     */
    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    /**
     * Sets test while idle.
     *
     * @param testWhileIdle the test while idle
     */
    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    /**
     * Is test on borrow boolean.
     *
     * @return the boolean
     */
    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    /**
     * Sets test on borrow.
     *
     * @param testOnBorrow the test on borrow
     */
    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    /**
     * Is test on return boolean.
     *
     * @return the boolean
     */
    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    /**
     * Sets test on return.
     *
     * @param testOnReturn the test on return
     */
    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    /**
     * Is pool prepared statements boolean.
     *
     * @return the boolean
     */
    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    /**
     * Sets pool prepared statements.
     *
     * @param poolPreparedStatements the pool prepared statements
     */
    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    /**
     * Gets filters.
     *
     * @return the filters
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Sets filters.
     *
     * @param filters the filters
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }

    /**
     * Gets log slow sql.
     *
     * @return the log slow sql
     */
    public String getLogSlowSql() {
        return logSlowSql;
    }

    /**
     * Sets log slow sql.
     *
     * @param logSlowSql the log slow sql
     */
    public void setLogSlowSql(String logSlowSql) {
        this.logSlowSql = logSlowSql;
    }

    /**
     * Gets connection properties.
     *
     * @return the connection properties
     */
    public String getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * Sets connection properties.
     *
     * @param connectionProperties the connection properties
     */
    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * Gets max pool prepared statement per connection size.
     *
     * @return the max pool prepared statement per connection size
     */
    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * Sets max pool prepared statement per connection size.
     *
     * @param maxPoolPreparedStatementPerConnectionSize the max pool prepared statement per connection size
     */
    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    /**
     * Is transaction enable boolean.
     *
     * @return the boolean
     */
    public boolean isTransactionEnable() {
        return transactionEnable;
    }

    /**
     * Sets transaction enable.
     *
     * @param transactionEnable the transaction enable
     */
    public void setTransactionEnable(boolean transactionEnable) {
        this.transactionEnable = transactionEnable;
    }
}
