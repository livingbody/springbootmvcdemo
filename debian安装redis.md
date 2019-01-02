# debian安装redis
```
wget http://download.redis.io/releases/redis-3.0.1.tar.gz
tar -xzf redis-3.0.1.tar.gz
cd redis-3.0.1 make
livingbody@livingbody-PC:/usr/local/redis-3.0.1$ sudo ./utils/install_server.sh 
Welcome to the redis service installer
This script will help you easily set up a running redis server

Please select the redis port for this instance: [6379] 
Selecting default: 6379
Please select the redis config file name [/etc/redis/6379.conf] 
Selected default - /etc/redis/6379.conf
Please select the redis log file name [/var/log/redis_6379.log] 
Selected default - /var/log/redis_6379.log
Please select the data directory for this instance [/var/lib/redis/6379] 
Selected default - /var/lib/redis/6379
Please select the redis executable path [/usr/local/bin/redis-server] 
Selected config:
Port           : 6379
Config file    : /etc/redis/6379.conf
Log file       : /var/log/redis_6379.log
Data dir       : /var/lib/redis/6379
Executable     : /usr/local/bin/redis-server
Cli Executable : /usr/local/bin/redis-cli
Is this ok? Then press ENTER to go on or Ctrl-C to abort.
Copied /tmp/6379.conf => /etc/init.d/redis_6379
Installing service...
Success!
Starting Redis server...
Installation successful!

service redis-server restart
修改配置文件

sudo vi /etc/redis/redis.conf
```
# 第一次订正
```
livingbody@livingbody-PC:~/IdeaProjects$ service --status-all
 [ + ]  acpid
 [ - ]  alsa-utils
 [ + ]  bluetooth
 [ + ]  cron
 [ - ]  cryptdisks
 [ - ]  cryptdisks-early
 [ + ]  cups
 [ + ]  dbus
 [ - ]  gdomap
 [ - ]  hwclock.sh
 [ + ]  ipsec
 [ + ]  kmod
 [ + ]  laptop-mode
 [ + ]  lightdm
 [ - ]  lvm2
 [ + ]  lvm2-lvmetad
 [ + ]  lvm2-lvmpolld
 [ - ]  mdadm
 [ - ]  mdadm-waitidle
 [ + ]  mysql
 [ + ]  network-manager
 [ + ]  networking
 [ - ]  nmbd
 [ - ]  openvpn
 [ - ]  plymouth
 [ - ]  plymouth-log
 [ - ]  pppd-dns
 [ - ]  procps
 [ + ]  rabbitmq-server
 [ + ]  redis_6379
 [ - ]  rsync
 [ - ]  samba-ad-dc
 [ + ]  smbd
 [ - ]  sudo
 [ + ]  udev
 [ - ]  x11-common
 [ - ]  xl2tpd
## 特此声明，服务名称为redis_6379
```
