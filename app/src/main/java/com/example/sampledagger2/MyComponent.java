package com.example.sampledagger2;

import dagger.Component;

@Component(modules = MyModule.class) //모듈을 참조하는 컴포넌트
public interface MyComponent {
    String getString(); // 프로비전 메서드, 바인드된 모듈로부터 의존성을 제공
    void inject(MyClass myClass);
}
