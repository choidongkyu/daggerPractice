package com.example.sampledagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger는 컴파일 타임의 의존성 주입에 필요한 애노테이션을 읽고 의존성 주입에 필요한 클래스 파일들을 생성
 * Dagger는 컴파일 타임에 @Module과 @Provides 애노테이션을 읽고 의존성 주입에 필요한 파일들을 생성한다.
 */
@Module // 의존성을 제공하는 클래스에 붙임
public class MyModule {
    @Provides // 의존성을 제공하는 메서드에 붙임
    String provideHelloWorld() {
        return "Hello World";
    }
}
