package com.southwind.Ioc;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MyClassPathXmlApplicationContext implements MyApplicationContext{
private Map<String,Object> ioc=new HashMap<String,Object>();

    public MyClassPathXmlApplicationContext(String path) {

        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read("src/main/resources/"+path);
            System.out.println(document);
            Element root=document.getRootElement();
            Iterator<Element> iterator=root.elementIterator();
            while(iterator.hasNext()){
                Element bean =iterator. next();
                System.out.println(bean);
                String id=bean.attributeValue("id");
                String className=bean.attributeValue("class");
           System.out.println(id);
           System.out.println(className);
           Class clazz=Class.forName(className);
                Constructor constructor=clazz.getConstructor();
                Object object=constructor.newInstance();
                //赋值
                Iterator<Element> beanIter=bean.elementIterator();
                while(beanIter.hasNext()){
                   Element property=beanIter.next();
                   String name=property.attributeValue("name");
                   String value=property.attributeValue("value");
                   System.out.println(name+value);
                   String methodName="set"+name.substring(0,1).toUpperCase()
                           +name.substring(1);
                   System.out.println(methodName);
                    Field field=clazz.getDeclaredField(name);
                   Object val=value;
                   switch (field.getType().getTypeName()){
                       case "java.lang.Integer": val=Integer.parseInt(value);
break;
                   }
                   Method method=clazz.getMethod(methodName,field.getType());
             method.invoke(object,val);

                }

                ioc.put(id,object);






            }







        } catch (Exception e) {

            e.printStackTrace();


        }

    }
    public Object getBean(String id){
        return ioc.get(id);
    }

}
