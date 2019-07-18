package com.luoh.lawliet.demo.streamdemo;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: luoh
 * @Date: 2019-07-17 09:13
 * @Description:
 */
public class StreamDemoTool {

    public List<OrderDetail> listOrderDetails(){
        List<OrderDetail>  orderDetail= Arrays.asList(new OrderDetail("o1","p1","12"),
                new OrderDetail("o2","p2","102"),
                new OrderDetail("o3","p3","2"),
                new OrderDetail("o4","p4","34"),
                new OrderDetail("o5","p5","56"));
        return orderDetail;
    }


}


class OrderDetail{
    private  String orderId;
    private  String productId;
    private  String productQuantity;

    public OrderDetail(String orderId, String productId, String productQuantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
}

class  CartDTO {
    private String productId;
    private String productQuantity;

    public CartDTO(String productId, String productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
}