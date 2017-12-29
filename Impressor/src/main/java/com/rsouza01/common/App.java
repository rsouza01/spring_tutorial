package com.rsouza01.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsouza01.common.Processador;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    		"Spring-Module.xml");
    		
        Processador bean = (Processador)context.getBean("processador", Processador.class);
        bean.processe();
    }
}
