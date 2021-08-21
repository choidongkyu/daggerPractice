package com.example.sampledagger2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testHelloWorld() {
        MyComponent myComponent = DaggerMyComponent.create();
        //System.out.println("result = "+ myComponent.getString());
    }

    @Test
    public void testMemberInjection() {
        MyClass myClass = new MyClass();
        String str = myClass.getStr();
        //assertNotNull("조회결과 null", str);
        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.inject(myClass);
        str = myClass.getStr();
        assertEquals("Hello World", str);
    }

    @Test
    public void testInjection() {
        PersonComponent personComponent = DaggerPersonComponent.create();

        PersonA personA = personComponent.getPersonA();
        System.out.println(personA.getName()+":"+personA.getAge());

        PersonB personB = new PersonB();
        DaggerPersonComponent.create().inject(personB);
        System.out.println(personB.getName()+":"+personB.getAge());
    }

}