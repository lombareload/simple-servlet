package com.sample;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("rest")
public class App extends Application {
    @Override
    public Set<Class<?>> getClasses(){
        return Collections.singleton(SimpleRest.class);
    }
}
