spring.datasource.url = jdbc:mysql://localhost:3306/gaojianhuitest?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false
#spring.datasource.url = jdbc:mysql://localhost:3306/liuzhixitong?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false
#47.93.29.226

spring.datasource.type=com.zaxxer.hikari.HikariDataSource
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=15
spring.datasource.hikari.auto-commit=true
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.pool-name=DatebookHikariCP
spring.datasource.hikari.max-lifetime=1800000
spring.datasource.hikari.connection-timeout=28800
spring.datasource.hikari.connection-test-query=SELECT 1
#mine��
spring.datasource.username = root
spring.datasource.password = 111111
#jpa���ӵ����ݿ�
spring.jpa.database = MYSQL
# Show or not log for each sql query
spring.jpa.show-sql = true
spring.jpa.generate-ddl=true
# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto =update
# Naming strategy
#spring.jpa.hibernate.naming.strategy = org.hibernate.cfg.ImprovedNamingStrategy
 spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
# stripped before adding them to the entity manager)
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect


mybatis.type-aliases-package=com.sanyi.framework.model
mybatis.type-handlers-package=com.sanyi.framework.mybatisTypeHandler
mybatis.mapper-locations=classpath:mapper/*.xml
logging.level.com.sanyi.framework.dtomapper=debug
pagehelper.helperDialect=mysql
pagehelper.reasonable=true
pagehelper.supportMethodsArguments=true
pagehelper.params=count=countSql

logging.level.com.sanyi.framework.mapper=debug
spring.application.name=Gaojianhui-Platform
server.port=8080

jwt.header=Authorization
jwt.secret=SanYiSecret
#604800
jwt.expiration=604800
jwt.route.authentication.path=user/auth
jwt.route.authentication.refresh=refresh
spring.servlet.multipart.max-file-size=-1
spring.servlet.multipart.max-request-size=-1
server.tomcat.max-http-header-size=102400
assets.piclocation=imgs/

#menjinBaseUrl
menjinBaseUrl = http://192.168.18.254:8087/ocs/
#menjinBaseUrl = http://192.168.3.100:8080/ocs/


#wxappid=wxe4981a0c2ccb467c
#wxsecret=afe0c14d65e622e655d17d37a123863a
#wxloginApi=https://api.weixin.qq.com/sns/jscode2session
##spring mqtt
#spring.mqtt.username=
##MQTT-\u5BC6\u7801
#spring.mqtt.password=
##MQTT-\u670D\u52A1\u5668\u8FDE\u63A5\u5730\u5740\uFF0C\u5982\u679C\u6709\u591A\u4E2A\uFF0C\u7528\u9017\u53F7\u9694\u5F00\uFF0C\u5982\uFF1Atcp://127.0.0.1:61613\uFF0Ctcp://192.168.2.133:61613
#spring.mqtt.url=tcp://39.98.78.71:1883
##spring.mqtt.url=tcp://localhost:1883
##MQTT-\u8FDE\u63A5\u670D\u52A1\u5668\u9ED8\u8BA4\u5BA2\u6237\u7AEFID\uFF1Bin/pull \u63A5\u6536\u6D88\u606F\uFF0Cout/push \u63A8\u9001\u6D88\u606F
#spring.mqtt.client.in.id=clientPull
#spring.mqtt.client.out.id=clientPush
##MQTT-\u9ED8\u8BA4\u7684\u6D88\u606F\u63A8\u9001\u4E3B\u9898\uFF0C\u5B9E\u9645\u53EF\u5728\u8C03\u7528\u63A5\u53E3\u65F6\u6307\u5B9A
#spring.mqtt.default.topic=defaultTopic