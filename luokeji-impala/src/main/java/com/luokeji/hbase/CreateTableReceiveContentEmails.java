package com.luokeji.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

public class CreateTableReceiveContentEmails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//创建链接
		Configuration conf = HBaseConfiguration.create();
		//获取链接
		Connection connection = ConnectionFactory.createConnection(conf);
		//根据表名进行
		Table table = connection.getTable(TableName.valueOf("content"));
		
		Put put = new Put(Bytes.toBytes("q1"));
		put.addColumn(Bytes.toBytes("f1"), Bytes.toBytes("p1"), Bytes.toBytes("1000"));
		table.put(put);
		
		table.close();
		connection.close();
		
	}

}
