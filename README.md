# Spring Cloud 微服务入门、实战与进阶

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20190925191737.png)

> 豆瓣地址: https://book.douban.com/subject/34441728/

## 第1章　Spring Cloud 与微服务概述 2

## 第2章　实战前的准备工作 8

## 第3章　Eureka 注册中心 32

## 第4章　客户端负载均衡 Ribbon 52

## 第5章　声明式REST客户端Feign 70

## 第6章　Hystrix 服务容错处理 84

## 第7章　API网关 103

## 第8章　API 网关之Spring Cloud Gateway 130

## 第12章 微服务之间调用的安全认证

### 12.1 什么是 JWT

JWT 由三部分构成，第一部分称为头部（Header），第二部称为消息体（Payload），第三部分是签名（Signature）。一个 JWT 生成的 Token 格式为:

token = encodeBase64(header) + '.' + encodeBase64(payload) + '.' + encodeBase64(signature)

头部的信息通常由两部分内容组成，令牌的类型和使用的签名算法，比如下面的代码：

{ "alg": "HS256", "typ": "JWT" }

消息体中可以携带一些你想、需要的信息，比如用户 ID。因为你得知道这个 Token 是哪个用户的，比如下面的代码：

{ "id": "1234567890", "name": "John Doe", "admin": true }

签名是用来判断消息在传递的路上是否被篡改，从而保证数据的安全性，格式如下：

HMACSHA256( base64URLEncode(header) + "." + base64URLEncode(payload),  secret)

通过这三部分就组成了我们的 Json Web Token。

### 12.2 创建统一的认证服务

#### 12.2.1 表结构

#### 12.2.2 JWT 工具类封装

jjwt

用工具类进行认证主要有以下几个方法：

- 生成 Token。

- 检查 Token 是否合法。

- 刷新 RSA 公钥以及私钥。

生成 Token 是在进行用户身份认证之后，通过用户的 ID 来生成一个 Token ，这个 Token 采用 RSA 加密的方式进行加密，Token 的内容包括用户的ID和过期时间。

检查 Token 则是根据调用方带来的 Token 检查是否为合法用户，就是对 Token 进行解密操作，能解密并且在有效期内表示合法，合法则返回用户 ID。

刷新 RSA 公钥及私钥的作用是防止公钥、私钥泄漏，公钥、私钥一般是写死的，不过我们可以做成配置的。集成配置管理中心后，可以对公钥、私钥进行动态修改，修改之后需要重新初始化公钥、私钥的对象信息。



## 第13章 Spring Boot Admin

## 第14章 Swagger

## 第16章 微服务之缓存

### 16.1 Guava Cache 本地缓存

### 16.2 Redis 缓存

### 16.3 防止缓存穿透方案

### 16.4 防止缓存雪崩方案

## 第17章 微服务之存储

### 17.1 存储选型

业务数据用 MySQL

搜索服务用 Elasticsearch 来构建

大数据量的基础数据，采用 Mongodb 存储

缓存用 Redis

### 17.2 Mongodb

### 17.3 Mysql

### 17.4 Elasticsearch


## 第18章 微服务之分布式事务解决方案

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20191024200509.png)

### 18.1 两阶段型

### 18.2 TCC 补偿型（不推荐）

### 18.3 最终一致性

### 18.4 最大努力通知型事务



