package com.example.sampledagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    @Provides
    String provideName() {
        return "dkchoi";
    }

    @Provides
    int provideAge() {
        return 30;
    }
}
