package com.aideus.android.app.injection.component;

import dagger.Component;
import com.aideus.android.app.injection.PerActivity;
import com.aideus.android.app.injection.module.ActivityModule;
import com.aideus.android.app.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
