# scala-snippets
Scala code snippets that I use

## Install Apache Toree (Scala kernel)
(Docs) [https://toree.apache.org/docs/current/user/installation/]

### Make a pure Scala kernel
* Get a stanalone version for Apache Spark and install in `/opt/spark/spark-2.2.1-bin-hadoop2.7`:
```
wget http://apache.uib.no/spark/spark-2.2.1/spark-2.2.1-bin-hadoop2.7.tgz

```
* Install Toree:
```
pip3.5 install --user https://dist.apache.org/repos/dist/dev/incubator/toree/0.2.0/snapshots/dev1/toree-pip/toree-0.2.0.dev1.tar.gz;

jupyter toree install --kernel_name='Scala 2.11.7' --spark_home='/opt/spark/spark-2.2.1-bin-hadoop2.7'  --toree_opts='--nosparkcontext'  --user
```
