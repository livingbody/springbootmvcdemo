# solr 实做

```bash
livingbody@livingbody-PC:/usr/local/solr-7.6.0$ ./bin/solr start
*** [WARN] *** Your open file limit is currently 1024.  
 It should be set to 65000 to avoid operational disruption. 
 If you no longer wish to see this warning, set SOLR_ULIMIT_CHECKS to false in your profile or solr.in.sh
*** [WARN] ***  Your Max Processes Limit is currently 31326. 
 It should be set to 65000 to avoid operational disruption. 
 If you no longer wish to see this warning, set SOLR_ULIMIT_CHECKS to false in your profile or solr.in.sh
NOTE: Please install lsof as this script needs it to determine if Solr is listening on port 8983.

Started Solr server on port 8983 (pid=25616). Happy searching!

```

```bash
livingbody@livingbody-PC:/usr/local/solr-7.6.0$ ./bin/solr start -e cloud
*** [WARN] *** Your open file limit is currently 1024.  
 It should be set to 65000 to avoid operational disruption. 
 If you no longer wish to see this warning, set SOLR_ULIMIT_CHECKS to false in your profile or solr.in.sh
*** [WARN] ***  Your Max Processes Limit is currently 31326. 
 It should be set to 65000 to avoid operational disruption. 
 If you no longer wish to see this warning, set SOLR_ULIMIT_CHECKS to false in your profile or solr.in.sh
Picked up _JAVA_OPTIONS:   -Dawt.useSystemAAFontSettings=gasp
INFO  - 2019-01-07 15:40:12.423; org.apache.solr.util.configuration.SSLCredentialProviderFactory; Processing SSL Credential Provider chain: env;sysprop

Welcome to the SolrCloud example!

This interactive session will help you launch a SolrCloud cluster on your local workstation.
To begin, how many Solr nodes would you like to run in your local cluster? (specify 1-4 nodes) [2]: 
1
Ok, let's start up 1 Solr nodes for your example SolrCloud cluster.
Please enter the port for node1 [8983]: 
8983
Creating Solr home directory /usr/local/solr-7.6.0/example/cloud/node1/solr

Starting up Solr on port 8983 using command:
"bin/solr" start -cloud -p 8983 -s "example/cloud/node1/solr"

*** [WARN] ***  Your Max Processes Limit is currently 31326. 
 It should be set to 65000 to avoid operational disruption. 
 If you no longer wish to see this warning, set SOLR_ULIMIT_CHECKS to false in your profile or solr.in.sh
Waiting up to 180 seconds to see Solr running on port 8983 [/]  
Started Solr server on port 8983 (pid=27387). Happy searching!

INFO  - 2019-01-07 15:41:10.141; org.apache.solr.common.cloud.ConnectionManager; zkClient has connected
INFO  - 2019-01-07 15:41:10.179; org.apache.solr.common.cloud.ZkStateReader; Updated live nodes from ZooKeeper... (0) -> (1)
INFO  - 2019-01-07 15:41:10.214; org.apache.solr.client.solrj.impl.ZkClientClusterStateProvider; Cluster at localhost:9983 ready

Now let's create a new collection for indexing documents in your 1-node cluster.
Please provide a name for your new collection: [gettingstarted] 
gettingstarted
How many shards would you like to split gettingstarted into? [2]

How many replicas per shard would you like to create? [2] 

Please choose a configuration for the gettingstarted collection, available options are:
_default or sample_techproducts_configs [_default] 

Created collection 'gettingstarted' with 2 shard(s), 2 replica(s) with config-set 'gettingstarted'

Enabling auto soft-commits with maxTime 3 secs using the Config API

POSTing request to Config API: http://localhost:8983/solr/gettingstarted/config
{"set-property":{"updateHandler.autoSoftCommit.maxTime":"3000"}}
Successfully set-property updateHandler.autoSoftCommit.maxTime to 3000


SolrCloud example running, please visit: http://localhost:8983/solr 

```

