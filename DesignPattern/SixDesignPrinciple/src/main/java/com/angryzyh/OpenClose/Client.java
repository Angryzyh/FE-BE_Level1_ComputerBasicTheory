package com.angryzyh.OpenClose;

/**
 * Client  用户端
 * @author Angryzyh
 * @since 2022 -08-22 21:22:49
 */
public class Client {
    /**
     * Main 用户端显示搜狗浏览器皮肤.
     * @author Angryzyh
     * @since 2022 -08-22 21:22:49
     */
    public static void main(String[] args) {
        //1,创建搜狗输入法对象
        SouGouInput input = new SouGouInput();
        //2,创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //3,将皮肤设置到输入法中
        input.setSkin(skin);
        //4,显示皮肤
        input.display();
    }
}
