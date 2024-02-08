package org.example;

import java.util.Set;

public class Main {

    public static void out(String s) {
        System.out.println(s);
    }

    public static void out(int i) {
        System.out.println(i);
    }

    public static void out(char c) {
        System.out.println(c);
    }

    public static void out(Integer iObj) {
        System.out.println("Integer =" + iObj);
    }

    public static void out(Class aClass) {
        System.out.println(aClass);
    }

    public static void out(String ...sMany) {
        System.out.println(sMany);
    }


    public static void main(String[] args) {
        out("hej");
        out(5);
        out( "hej".indexOf('e'));
        out( Integer.parseInt("4",16));
        out(Integer.valueOf("10", 16));
        Integer jegInteger = 5;
        out(jegInteger);

        out('a');
        out(' ');
        out('帝');

        //out()'ي'')
        System.out.println("hej");

        for (int i=36890; i<36900; i++) {
            out("i+" + i + (char) i);
            out((char)i);
        }

        //var obj = Integer.parseInt();
        out('😉');
        char smil = '😉';
        out(smil);
        out((int)smil);
        out((char)55357);
        out(Integer.parseInt("ffff", 16));
        //Set<Character>
        var obj = "hej".getClass();
        out(obj);
        Class obj2 = obj.getClass();
        out(obj2);
        out("a", "b", "hej");







    }
}

