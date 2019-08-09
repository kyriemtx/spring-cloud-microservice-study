# spring-cloud-microservice-study
springcloud微服务学习过程记录
1 完成注册中心、服务发现和服务消费者的基本实现

microservice-discovery-eureka  eureka注册中心模块，所有的服务都被注册到eureka server
microservice-provider-user 服务提供者（该项目中，到目前为止唯一的服务提供者）他所提供的服务被其他模块共同调用 
microservice-consumer-movie-ribbon 服务消费者，使用ribbon作为负载均衡客户端
microservice-consumer-movie-ribbon-with-hystrix 服务消费者，在上面的基础上集成了hystrix做断容处理 
microservice-consumer-movie-feign  服务消费者，使用feign作为负载均衡客户端（集成了hystrix处理断容器）
microservice-hystrix-dashboard hystrix监控
