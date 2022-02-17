package io.github.neoqf.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration  // 表示这是配置
@ComponentScan(basePackages = {"io.github.neoqf"})  // 替代bean1.xml的开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)    // 替代bean1.xml的开启代理对象
public class ConfigAop {

}
