package com.luoh.lawliet.streamdemo;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: luoh
 * @Date: 2019-07-17 09:07
 * @Description:
 */

public class StreamDemo {

    @Autowired
    private final static Logger log = LoggerFactory.getLogger(StreamDemo.class);

    public static void main(String[] args) {
        //1.优雅的将一个对象的集合转化成另一个对象的集合
        StreamDemoTool streamDemoTool =new StreamDemoTool();
        List<OrderDetail> orderDetailList = streamDemoTool.listOrderDetails();

        System.out.println("orderDetailList:"+JSON.toJSONString(orderDetailList));


        List<CartDTO> cartDTOList = orderDetailList.stream()
                .map(e -> new CartDTO(e.getProductId(), e.getProductQuantity()))
                .collect(Collectors.toList());
        System.out.println("listToList:"+JSON.toJSONString(cartDTOList));



        //2.交集 (list1 + list2)
        List<OrderDetail>  orderDetail2= new ArrayList<>();

        orderDetail2.add(orderDetailList.get(2));

        List<OrderDetail>  orderDetail3= orderDetailList.stream()
                .filter(orderDetail2::contains)
                .collect(Collectors.toList());

        System.out.println("listAddList:"+JSON.toJSONString(orderDetail3));



        List<String> webs = Arrays.asList("voidcc.com", "voidmvn.com", "voidtool.com", "abbb.com", "biadu.com");
        //webs 必须是List<String>
        String allwebs = String.join(",", webs);
        System.out.println(allwebs);

        //stream
        String allwebs2 = webs.stream().collect(Collectors.joining(","));
        System.out.println(allwebs2);


        String allwebs3 = webs.stream().collect(Collectors.joining(",","aaa "," bbb"));
        System.out.println(allwebs3);


        String strJoin = Stream.of("1", "2", "3", "4")
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("strJoin: " + strJoin);


    }



}




