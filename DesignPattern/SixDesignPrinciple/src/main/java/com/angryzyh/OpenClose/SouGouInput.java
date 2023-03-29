package com.angryzyh.OpenClose;

/**
 * SouGouInput 搜狗输入法
 * @author Angryzyh
 * @since 2022 -08-22 21:18:02
 */
public class SouGouInput {

    //搜狗输入发的皮肤对象
    private AbstractSkin skin;

    /**
     * Set skin set注入皮肤对象
     * @param skin  聚合皮肤子类
     */
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    /**
     * Display 定义display方法 对外暴露聚合皮肤的方法.
     */
    public void display() {
        skin.display();
    }
}
