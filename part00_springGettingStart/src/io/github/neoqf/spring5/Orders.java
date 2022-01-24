package io.github.neoqf.spring5;

/**
 * 使用有参构造进行注入
 */
public class Orders {

    private String oname;

    public Orders(String oname) {
        this.oname = oname;
    }

    public void ordersTest() {
        System.out.println(oname);
    }
}
