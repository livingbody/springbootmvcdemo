新版本mysql安装不提示设置密码，其密码默认存储，事后需要自行设置。
# mysql密码位置
*** 默认位置
```/etc/mysql/debian.cnf```
```livingbody@livingbody-PC:/etc/mysql$ ls
conf.d  debian.cnf  debian-start  my.cnf  my.cnf.fallback  mysql.cnf  mysql.conf.d
livingbody@livingbody-PC:/etc/mysql$ sudo cat debian.cnf 
# Automatically generated for Debian scripts. DO NOT TOUCH!
[client]
host     = localhost
user     = debian-sys-maint
password = 7y4wx5CKPsEpSrkz
socket   = /var/run/mysqld/mysqld.sock
[mysql_upgrade]
host     = localhost
user     = debian-sys-maint
password = 7y4wx5CKPsEpSrkz
socket   = /var/run/mysqld/mysqld.sock
```
瞧，密码就在这里。

# 更新密码
用找到的用户名密码进入系统，然后就可以设置密码了。
特别要注意的是，密码字段不是password，已经改为authentication_string了

```
mysql> update user set authentication_string=password('root') where user='root';
Query OK, 1 row affected, 1 warning (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 1

mysql> flush privileges;
Query OK, 0 rows affected (0.00 sec)

mysql> 
```
# 更正
```
select user, plugin from mysql.user;
mysql> select user, plugin from mysql.user;
+-----------+-----------------------+
| user      | plugin                |
+-----------+-----------------------+
| root      | auth_socket           |
| mysql.sys | mysql_native_password |
| dev       | mysql_native_password |
+-----------+-----------------------+
3 rows in set (0.01 sec)
update mysql.user set authentication_string=PASSWORD('123'), plugin='mysql_native_password' where user='root';
flush privileges;
```
这样就可以用root登陆了。

