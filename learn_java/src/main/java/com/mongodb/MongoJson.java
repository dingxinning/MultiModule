package com.mongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import org.bson.Document;

/**
 * Created by Wuxiang on 2017/10/24.
 * MongoDB中是以Bson数据格式进行存储的，Json字符串没有办法直接写入MongoDB
 * 可以将Json字符串转换成DBObject或者Document，然后写入MongoDB
 *
 * 1、将Json字符转换成com.mongodb.DBObject（准确的说是BasicDBObject）
 * 2、将字符串转换成org.bson.Document
 */
public class MongoJson {
    public static void main(String[] args) {
        // 构造一个Json字符串
        String json = " {" +
                " 'school_code' : '111111', " +
                " 'school_name' : '汉东政法大学', " +
                " 'teacher_idcard' : '0000001', " +
                " 'teacher_name' : '高育良' " +
                " } ";

        MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
        MongoDatabase database = mongoClient.getDatabase("newdb");

        MongoCollection<DBObject> collection = database.getCollection("collectionName", DBObject.class);
//        DBObject bson = (DBObject) JSON.parse(json);
//        collection.insertOne(bson);
        System.out.println("集合内文档总数：" + collection.count());
        FindIterable<DBObject> findIterable1 = collection.find();
        MongoCursor<DBObject> mongoCursor1 = findIterable1.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }

        MongoCollection<Document> collection2 = database.getCollection("collectionName");
//        Document document = Document.parse(json);
//        collection2.insertOne(document);
        System.out.println("集合内文档总数：" + collection2.count());
        FindIterable<Document> findIterable2 = collection2.find();
        MongoCursor<Document> mongoCursor2 = findIterable2.iterator();
        while(mongoCursor2.hasNext()){
            System.out.println(mongoCursor2.next().toJson());
        }
    }
}
