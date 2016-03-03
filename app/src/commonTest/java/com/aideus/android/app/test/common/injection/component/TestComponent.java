package com.aideus.android.app.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.aideus.android.app.injection.component.ApplicationComponent;
import com.aideus.android.app.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
