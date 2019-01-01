# springbootmvcdemo

# init
```
  git init
  git add README.md
  git commit -m "first commit"
  git remote add origin https://github.com/livingbody/springbootmvcdemo.git
  git push -u origin master
```
# push an existing repository from the command line
  
 ```
  git remote add origin https://github.com/livingbody/springbootmvcdemo.git
  git push -u origin master
```
# 备注
** “```” 是数字1上面那个符号，而不是单引号
# 第一次操作命令
```
livingbody@livingbody-PC:~/IdeaProjects$ echo "# springbootmvcdemo" >> README.md
livingbody@livingbody-PC:~/IdeaProjects$ ls
pringmvcdemo01  README.md
livingbody@livingbody-PC:~/IdeaProjects$ git init
已初始化空的 Git 仓库于 /home/livingbody/IdeaProjects/.git/
livingbody@livingbody-PC:~/IdeaProjects$ ls
pringmvcdemo01  README.md
livingbody@livingbody-PC:~/IdeaProjects$ git add README.md 
livingbody@livingbody-PC:~/IdeaProjects$ git commit -m "first commit"

*** 请告诉我你是谁。

运行

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

来设置您账号的缺省身份标识。
如果仅在本仓库设置身份标识，则省略 --global 参数。
fatal: 无法自动探测邮件地址（得到 'livingbody@livingbody-PC.(none)'）
livingbody@livingbody-PC:~/IdeaProjects$ git config --global user.email "you@example.com"
livingbody@livingbody-PC:~/IdeaProjects$ git config --global user.email "155203340@qq.com"
livingbody@livingbody-PC:~/IdeaProjects$ git config --global user.name "Your Name"
livingbody@livingbody-PC:~/IdeaProjects$ git config --global user.name "livingbody"
livingbody@livingbody-PC:~/IdeaProjects$ git commit -m "first commit"
[master（根提交） 578e5ce] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
livingbody@livingbody-PC:~/IdeaProjects$ git remote add origin https://github.com/livingbody/springbootmvcdemo.git
livingbody@livingbody-PC:~/IdeaProjects$ git push -u origin master
Username for 'https://github.com': livingbody
Password for 'https://livingbody@github.com': 
对象计数中: 3, 完成.
写入对象中: 100% (3/3), 230 bytes | 230.00 KiB/s, 完成.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/livingbody/springbootmvcdemo.git
 * [new branch]      master -> master
分支 'master' 设置为跟踪来自 'origin' 的远程分支 'master'。

```
# 第二次操作命令
```livingbody@livingbody-PC:~/IdeaProjects$ git pull
remote: Enumerating objects: 11, done.
remote: Counting objects: 100% (11/11), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 9 (delta 2), reused 0 (delta 0), pack-reused 0
展开对象中: 100% (9/9), 完成.
来自 https://github.com/livingbody/springbootmvcdemo
   578e5ce..2ab4ee2  master     -> origin/master
更新 578e5ce..2ab4ee2
Fast-forward
 README.md | 17 +++++++++++++++++
 1 file changed, 17 insertions(+)
```
# 第三次操作命令
```livingbody@livingbody-PC:~/IdeaProjects$ git add .
livingbody@livingbody-PC:~/IdeaProjects$ git commit -a
[master f6d487f] 更改文件夹名称、更新README.MD内容 2018.1.1 by livingbody
 18 files changed, 770 insertions(+)
 create mode 100644 springmvcdemo01/.gitignore
 create mode 100644 springmvcdemo01/.mvn/wrapper/maven-wrapper.jar
 create mode 100644 springmvcdemo01/.mvn/wrapper/maven-wrapper.properties
 create mode 100755 springmvcdemo01/mvnw
 create mode 100644 springmvcdemo01/mvnw.cmd
 create mode 100644 springmvcdemo01/pom.xml
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/Application.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController1.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController2.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController3.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController4.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController5.java
 create mode 100644 springmvcdemo01/src/main/java/cn/goingtodo/springmvcdemo/demo/MyController6.java
 create mode 100644 springmvcdemo01/src/main/resources/application.properties
 create mode 100644 springmvcdemo01/src/main/resources/templates/hello.html
 create mode 100644 springmvcdemo01/src/main/resources/templates/index.html
 create mode 100644 springmvcdemo01/src/test/java/cn/goingtodo/springmvcdemo/demo/DemoApplicationTests.java
livingbody@livingbody-PC:~/IdeaProjects$ git checkout master
已经位于 'master'
您的分支领先 'origin/master' 共 1 个提交。
  （使用 "git push" 来发布您的本地提交）
livingbody@livingbody-PC:~/IdeaProjects$ git push
Username for 'https://github.com': livingbody
Password for 'https://livingbody@github.com': 
对象计数中: 38, 完成.
Delta compression using up to 4 threads.
压缩对象中: 100% (27/27), 完成.
写入对象中: 100% (38/38), 52.03 KiB | 13.01 MiB/s, 完成.
Total 38 (delta 4), reused 0 (delta 0)
remote: Resolving deltas: 100% (4/4), done.
To https://github.com/livingbody/springbootmvcdemo.git
   2ab4ee2..f6d487f  master -> master
livingbody@livingbody-PC:~/IdeaProjects$ 
```
