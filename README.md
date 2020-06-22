# dora-server

Dora崩溃日志后台管理系统【SpringBoot+MyBatis+MySQL】



第一步：执行SQL

结合您的实际情况，安装MySQL数据库，并执行dora.sql，创建需要的表



第二步：把项目打包成jar文件

使用maven脚本可以打包成jar文件



第三步：运行程序

java -jar dora-console-1.0-SNAPSHOT.jar	//临时运行

或

nohup java -jar dora-console-1.0-SNAPSHOT.jar > system.log 2>&1 & //永久运行
