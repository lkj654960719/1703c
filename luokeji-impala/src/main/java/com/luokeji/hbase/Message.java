package com.luokeji.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

public class Message {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Configuration conf = HBaseConfiguration.create();
		//获取链接
		Connection connection = ConnectionFactory.createConnection(conf);
		//根据表名进行
		Table table = connection.getTable(TableName.valueOf("content"));
		Get get = new Get(Bytes.toBytes("q1"));
		Result result = table.get(get);
		System.out.println(result);
	}

}
