<h3 id="dIBP6">【扫码关注公众号：爱婆小屋】</h3>
![](https://cdn.nlark.com/yuque/0/2024/jpeg/1203091/1728245476969-4c5125f9-a9cc-451a-bf27-3fbfce8c7dda.jpeg)

<h1 id="kmeWx">智汇 - 知识付费社区</h1>
<h2 id="VNIHx">定位：知识付费博客/论坛/社区</h2>
<h2 id="NXrwV">竞品：</h2>
知乎 Live：知乎是一个中国的问答社区，知乎 Live 是其推出的付费直播讲座服务。

得到：由罗辑思维团队创建的平台，提供音频课程、电子书、专栏文章等知识服务。

喜马拉雅：一个音频平台，提供有声书、付费课程、播客等内容。

腾讯课堂：腾讯公司推出的在线教育平台，提供各种在线课程，包括编程、设计、语言学习等。

网易云课堂：网易公司推出的在线学习平台，提供丰富的课程资源。

Coursera：一个国际知名的在线教育平台，与多所大学合作提供在线课程。

Udemy：一个国际性的在线课程市场，用户可以购买单门课程或订阅会员。

LinkedIn Learning：领英推出的在线学习平台，提供各种职业相关的课程。

知识星球：一个社群平台，允许创建者建立付费的知识社群，分享专业内容。

小密圈：与知识星球类似，也是一个创建付费社群的平台。

<h2 id="kjCTA">业务功能：</h2>
该系统包括前端和运营后台，前端主要划分 5 大模块，包括登录鉴权、用户中心、文章教程、评论、消息通知，整个生态其实主要围绕用户和文章来展开；运营后台主要对文章、教程、标签、广告位、用户权限进行管理。

<h3 id="GChGL">博客：</h3>
文章&教程发布/搜索/评论/统计

<h3 id="XIagk">社区：</h3>
评论/点赞/关注/收藏

<h3 id="r5tUv">知识付费：</h3>
付费博客/文章

<h2 id="oKmzl">权限</h2>
用户 + 管理员

<h3 id="S7g91">用户</h3>
首页，门户

<h3 id="xTJOX">管理员</h3>
admin管理后台







<h2 id="Cj1ub">本地部署（Windows）</h2>
<h3 id="xWScW">环境搭建</h3>
<h4 id="Zhhx2">0、Java8</h4>
<h4 id="e6mjC">1、Maven</h4>
<h4 id="B2zPM">2、MySQL8</h4>
<h4 id="OASkr">3、Redis</h4>
<h4 id="UqxwL">4、Nginx</h4>
<h2 id="ElKDT">云服务器部署（Linux-Ubuntu-22.04-x64）</h2>
<h3 id="zGVwe">域名</h3>
+ 域名购买 `wangenhui.top`
+ 公网DNS解析，添加主机记录，记录值为下面购买的云服务器ip地址

![](https://cdn.nlark.com/yuque/0/2024/png/1203091/1728120734641-362aae15-ab74-4217-bbba-392cd5a0319a.png)

主机记录说明解释如下：

![](https://cdn.nlark.com/yuque/0/2024/png/1203091/1728120886707-2700be3d-0361-439a-a1b7-d007b747e37c.png)

<h3 id="AItBj">云服务器/ESC/VPS</h3>
+ 青云互联-香港特价9.9/月，优点是免ba，配置：
  - <font style="color:rgb(131, 131, 142);">CPU核心：</font>**<font style="color:rgb(131, 131, 142);">1核</font>**
  - <font style="color:rgb(131, 131, 142);">RAM内存：</font>**<font style="color:rgb(131, 131, 142);">2G</font>**
  - <font style="color:rgb(131, 131, 142);">线路：</font>**<font style="color:rgb(131, 131, 142);">CN2</font>**
  - <font style="color:rgb(131, 131, 142);">带宽峰值：</font>**<font style="color:rgb(131, 131, 142);">10M</font>**
  - <font style="color:rgb(131, 131, 142);">数据盘：</font>**<font style="color:rgb(131, 131, 142);">弹性配置</font>**
  - <font style="color:rgb(131, 131, 142);">流量限制：</font>**<font style="color:rgb(131, 131, 142);">弹性配置</font>**
  - <font style="color:rgb(131, 131, 142);">DDOS防御：</font>**<font style="color:rgb(131, 131, 142);">5G</font>**
  - <font style="color:rgb(131, 131, 142);">轻量机型不支持安装win系统</font>
+ 安装系统
+ 设置安全组【保证公网端口访问】![](https://cdn.nlark.com/yuque/0/2024/png/1203091/1728121129089-8b3b2433-4b7b-4513-b356-7ff8a3876446.png)
+ mobaXterm ssh连接服务器【可操作性更好，有文件目录】

<h3 id="BQDn3">环境搭建</h3>
<h4 id="vUCB3">0、Java8</h4>
+

<h4 id="i94Iq">1、Maven</h4>
+

<h4 id="UIsEF">2、MySQL8</h4>
+

<h4 id="Xbm4d">3、Redis</h4>
+

<h4 id="v7kD8">4、Nginx</h4>
+ Nginx配置文件
+ 检查
+ 启动Nginx服务

<h3 id="ZLLuy">构建方式</h3>
<h4 id="lblpe">方式一：源码构建</h4>
注意：当前Linux目录结构为`/usr/local/soft/`

里面有多个文件夹，maven、mysql、redis、nginx、workspace

其中workspace下有bearcoding文件夹，内有项目文件

1. **进入工作目录，git下载最新代码**

```bash
cd /usr/local/soft/workspace/bearcoding

git clone git@github.com:Petermaner/bearcoding.git
```

2. **线上部署**

线上部署选择prod生产环境，因此需要设置对应的数据库相关配置信息【修改源码的部分】

两个地方的数据库配置信息：

+ `/usr/local/soft/workspace/bearcoding/bearcoding-web/src/main/resources/application.yml`

这里改一下数据库的名字，目前上线的是my_new_try，和github里面的测试版的应该是不一样的

+ `/usr/local/soft/workspace/bearcoding/bearcoding-web/src/main/resources-env/prod/application-dal.yml` 【prod是因为当前是生产环境了，以前是dev的测试环境】
3. **编译启动**

```bash
cd bearcoding
./launch.sh start
```

ps：

+ 若launch.sh脚本没有执行权限，可以通过命令行 chmod +x launch.sh 添加
+ 启动之后，可以发现当前目录下新增一个 pid.log 文件，里面记录的是启动的服务进程号
+ 业务日志在当前目录的 logs下
  - 请求日志: logs/req-prod.log
  - 业务日志: logs/forum-prod.log
4. **应用重启**

若只是单纯的希望应用重启一下

```bash
cd bearcoding
./launch.sh restart
```

5. **应用发布**

当有新的改动时，若希望重新发布应用，执行下面的命令【其实就是重新编译启动】

```bash
cd bearcoding
./launch.sh start
```

<h4 id="pKNpC">方式二：Jar/War包构建</h4>
首先确保服务器配置已准备完毕

接下来确保本地生产环境的数据库等相关配置已更新为正确的配置

然后就是再项目根目录下执行

```bash
# 打包jar，并上传到服务器，关闭旧的应用，重新启动新的应用
./deploy.sh prod
```



<h2 id="dGLJX">问题汇总</h2>
本地部署时：

1. 要在IEDA里配置好maven 和 JDK8

注意maven本地仓库、path 和 jdk8的path

2. 要清除redis之前的一些缓存

【可以用IDEA连上可视化的看一下】

```bash
# 先启动redis服务端
redis-server
```

```bash
# 再连接redis后，清空 Redis 实例中的所有数据库
redis-cli FLUSHALL
```

3. 可以drop mysql之前生成的数据库【可选】
4. Git push失败，提示ssh路径有中文，可以把IDEA的VSC缓存清一下。

云服务器部署时

1. maven配置好path后，重启还是会报错找不到mvn

这是因为配置的是用户自己的，改成配置全局的就行。

使用的是 Bash shell，在 ~/.bash_profile 或 ~/.profile 文件中添加以下内容：

```bash
export MAVEN_HOME=/usr/local/soft/maven/apache-maven-3.6.3
export PATH=${MAVEN_HOME}/bin:${PATH}
```

然后执行：

```bash
source ~/.profile
```

2. maven在test时bearcoding-web报错

这里主要是数据库配置出错，当时没有区分好测试时的dev，上线部署时是prod【要改这里面的】

3. mysql8解决数据库一切问题
4. 浏览器访问wangenhui.top时，总是显示nginx默认首页

这里是因为nginx的conf配置文件有很多个，有几个是默认的，会覆盖你的，删掉默认的就好

