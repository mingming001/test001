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
 * 描述
 * @author Lewis Li
 * @created 2015-12-1 下午7:53:00
 */
public class TestDeployActivitiDef extends BaseDaoTestcase {


    @Autowired
    RepositoryService repositoryService;
    
    @Autowired
    RuntimeService runtimeService;
    //ProcessEngine processEngine;

    /**�������̶���*/
    @Test
    public void deploymentProcessDefinition(){
        Deployment deployment = repositoryService//�����̶���Ͳ��������ص�Service
                        .createDeployment()//����һ���������
                        .name("�¼�������������")//��Ӳ��������
                        .addClasspathResource("deployments/myProcess.bpmn")//��classpath����Դ�м��أ�һ��ֻ�ܼ���һ���ļ�
                        .addClasspathResource("deployments/myProcess.png")//��classpath����Դ�м��أ�һ��ֻ�ܼ���һ���ļ�
                        .deploy();//��ɲ���
        System.out.println("����ID��"+deployment.getId());//1
        System.out.println("�������ƣ�"+deployment.getName());//helloworld���ų���  
    }
    
    /**��������ʵ��*/
    @Test
    public void startProcessInstance(){
        //���̶����key
        String processDefinitionKey = "eventOrder";
        ProcessInstance pi = runtimeService//������ִ�е�����ʵ����ִ�ж�����ص�Service
                        .startProcessInstanceByKey(processDefinitionKey);//ʹ�����̶����key��������ʵ����key��Ӧhelloworld.bpmn�ļ���id������ֵ��ʹ��keyֵ������Ĭ���ǰ������°汾�����̶�������
        System.out.println("����ʵ��ID:"+pi.getId());//����ʵ��ID    101
        System.out.println("���̶���ID:"+pi.getProcessDefinitionId());//���̶���ID   helloworld:1:4
    }
}
