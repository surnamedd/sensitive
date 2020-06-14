# 变更日志

| 类型 | 说明 |
|:----|:----|
| A | 新增 |
| U | 更新 |
| D | 删除 |
| T | 测试 |
| O | 优化 |
| F | 修复BUG |

# release_0.0.1

时间： 2019-01-02 20:42:27

功能点：基础功能, 新增注解 `@Sensitive`


# release_0.0.2

时间：2019-01-11 00:10:37

调整：

1. 新增注解 `@SensitiveEntry`

2. 实现深拷贝

# release_0.0.3

时间：2019-01-15 21:48:31

新特性：

1. 添加常见内置注解。

2. 测试使用断言代替原来的日志打印，并与 CI 和以后的代码调整。

# release_0.0.5

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | O | 使用 jdk7 编译发布 | 2019-5-13 17:29:43 | |
| 2 | O | 使用 heaven 公共代码块 | 2019-5-13 17:29:43 | |

# release_0.0.6

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | A | 新增生成脱敏后的 JSON | 2019-6-26 13:18:42 | 提升性能 |

# release_0.0.7

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | A | 新增 SensitiveUtil#desCopyCollection | 2019-12-7 07:41:48 | 集合对象脱敏 |
| 2 | A | 新增 SensitiveUtil#desJsonCollection | 2019-12-7 07:41:48 | 集合对象脱敏 |

# release_0.0.8

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | O | 添加类字段反射 cache | 2019-12-24 20:07:45 | 初步优化性能 |

# release_0.0.9

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | A | 新增 Bs 引导类对应的深度拷贝 | 2020-2-2 18:18:50 | 文档优化 |
| 2 | P | 新增性能 benchmark  | 2020-2-2 18:18:50 | |

# release_0.0.10

| 序号 | 变更类型 | 说明 | 时间 | 备注 |
|:---|:---|:---|:---|:--|
| 1 | U | 更新 fast-json 版本 | 2020-6-14 21:10:38 | 安全问题 |
| 2 | U | 更新 heaven 依赖版本 | 2020-6-14 21:10:38 | 依赖优化 |