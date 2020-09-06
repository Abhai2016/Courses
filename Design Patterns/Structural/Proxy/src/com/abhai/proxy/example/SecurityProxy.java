package com.abhai.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {
    private Object object;

    public SecurityProxy(Object object) {
        this.object = object;
    }


    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new SecurityProxy(object));
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = "Invoke didn't work";
        try {
            if (method.getName().contains("post"))
                throw new IllegalAccessException("Posts are currently not allowed");
            else
                result = method.invoke(object, args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }
}
