package com.rsouza01.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rsouza01.common.Processador;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
    		"Spring-Module.xml", 
    		"Spring-DAO.xml"});
    		
        Processador bean = (Processador)context.getBean("processador", Processador.class);
        bean.processe();
    }
}
