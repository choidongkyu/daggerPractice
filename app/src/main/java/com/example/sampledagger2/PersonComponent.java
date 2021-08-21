package com.example.sampledagger2;

import dagger.Component;

@Component(modules = PersonModule.class)
public interface PersonComponent {
    PersonA getPersonA(); // 프로비전 메서드
    void inject(PersonB personB);
}
