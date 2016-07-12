/*
 * Copyright (c) 2005, 2015, EVECOM Technology Co.,Ltd. All rights reserved.
 * EVECOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.liy.test;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 鎻忚堪
 * @author Lewis Li
 * @created 2015-12-1 涓嬪崍7:53:00
 */
public class TestDeployActivitiDef extends BaseDaoTestcase {


    @Autowired
    RepositoryService repositoryService;
    
    @Autowired
    RuntimeService runtimeService;
    //ProcessEngine processEngine;

    /**部署流程定义*/
    @Test
    public void deploymentProcessDefinition(){
        Deployment deployment = repositoryService//与流程定义和部署对象相关的Service
                        .createDeployment()//创建一个部署对象
                        .name("事件工单处理流程")//添加部署的名称
                        .addClasspathResource("deployments/myProcess.bpmn")//从classpath的资源中加载，一次只能加载一个文件
                        .addClasspathResource("deployments/myProcess.png")//从classpath的资源中加载，一次只能加载一个文件
                        .deploy();//完成部署
        System.out.println("部署ID："+deployment.getId());//1
        System.out.println("部署名称："+deployment.getName());//helloworld入门程序  
    }
    
    /**启动流程实例*/
    @Test
    public void startProcessInstance(){
        //流程定义的key
        String processDefinitionKey = "eventOrder";
        ProcessInstance pi = runtimeService//与正在执行的流程实例和执行对象相关的Service
                        .startProcessInstanceByKey(processDefinitionKey);//使用流程定义的key启动流程实例，key对应helloworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动
        System.out.println("流程实例ID:"+pi.getId());//流程实例ID    101
        System.out.println("流程定义ID:"+pi.getProcessDefinitionId());//流程定义ID   helloworld:1:4
    }
}
