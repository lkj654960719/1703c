package com.luokeji.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class CreateTableContent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String fc = "f1";
		//��������
		Configuration conf = HBaseConfiguration.create();
		//��ȡ����
		Connection connection = ConnectionFactory.createConnection(conf);
		Admin admin = connection.getAdmin();
		//��������
		HTableDescriptor td = new HTableDescriptor(TableName.valueOf("content"));
		//�����м�
		HColumnDescriptor cd = new HColumnDescriptor(fc );
		td.addFamily(cd);
		admin.createTable(td);
		//�ر�����
		admin.close();
		connection.close();
	}

}
