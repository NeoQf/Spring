package io.github.neoqf.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * 真实类：被增强的类
 */
@Component
public class User {
    public void add() {
        System.out.println("add........");
    }
}
