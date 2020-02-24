package com.luokeji.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;

public class ScanJunit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = HBaseConfiguration.create();
		//获取链接
		Connection connection = ConnectionFactory.createConnection(conf);
		//根据表名进行
		Table table = connection.getTable(TableName.valueOf("content"));
		Scan scan = new Scan();
		ResultScanner scanner = table.getScanner(scan);
		for (Result result : scanner) {
			System.out.println(result);
		}
	}

}
