package com.company;

public class CodeWordChecker implements StringChecker{
    private int x;
    private int y;
    private String s;
    public CodeWordChecker(int x, int y, String s){
        this.x=x;
        this.y=y;
        this.s=s;
    }
    public CodeWordChecker(String s){
        this.x=6;
        this.y=20;
        this.s=s;
    }

    @Override
    public boolean isValid(String str) {
        if(str.length()>=x&&str.length()<=y){
            return str.indexOf(s) == -1;
        }
            return false;
        }
    }

