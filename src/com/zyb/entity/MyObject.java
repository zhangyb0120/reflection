package com.zyb.entity;

import java.io.Serializable;

public final class MyObject implements Serializable
{
    private int a;
    
    public int getA()
    {
        return a;
    }
    
    public void setA(int a)
    {
        this.a = a;
    }
}
