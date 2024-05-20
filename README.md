# fullmall


mysql 5.7

node.js 10.24.1

#### 错误总结
1. renren-generator
failed to transfer from http://0.0.0.0/ during a previous attempt
如果仓库镜像是http 而不是https 就会被拦截禁止访问,而公司私服一般是http 而不支持https.
2. 路径问题，product的main函数放置到了另一个文件夹中导致spring找不到