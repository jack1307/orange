# orange
study springboot
and study git command

##工程说明
orange是用Spring cloud为技术框架搭建的微服务项目
jdk: 1.8
技术框架: spring cloud Hoxton.SR3
服务注册中心和配置中心: nacos
消息中间件: RocketMQ
调用链日志: zipkin+sleuth
监控: 可接入prometheus
数据源: druid
数据库: mysql+mybatis
定时任务: xxl-job


##分包说明

- config 配置
- constant 常量
- controller 控制器
- entity 实体类
- mapper 数据库操作
- fegin 调用外部微服务
- service 业务处理
- util 工具类


##开发规范

##常用工具类说明 
- 字符串判断用org.apache.commons.lang.StringUtils
- 集合判断使用org.apache.commons.collections.CollectionUtils
- 对象判断使用java.util.Objects


