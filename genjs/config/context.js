module.exports = {
    projectName:"sample",
    src:"src/main/java",
    srcRes:"src/main/resources",
    test:"src/test/java",
    testRes:"src/test/resources",
    srcWeb:"src/main/webapp",
    // Helpers to instantiate
    types: {
        Date:"java.util.Date",
        BigDecimal:"java.math.BigDecimal",
        List:"java.util.List",
        ArrayList:"java.util.ArrayList"
    },
    maven:{
        groupId:"org.demo",
        artifactId:"sample",
        version:"0.1"
    },
    database:{
        schema:"ROOT",
        database:"DERBY",
        databasePlatform:"org.hibernate.dialect.DerbyDialect",
        showSql:"true",
        generateDdl:"true",
        driverClassName:"org.apache.derby.jdbc.ClientDriver",
        url:"jdbc:derby://localhost:1527/bookstore",
        username:"root",
        password:"admin"
    }
};