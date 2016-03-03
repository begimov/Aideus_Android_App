package com.aideus.android.app.injection.component;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import com.aideus.android.app.data.DataManager;
import com.aideus.android.app.data.SyncService;
import com.aideus.android.app.data.local.DatabaseHelper;
import com.aideus.android.app.data.local.PreferencesHelper;
import com.aideus.android.app.data.remote.RibotsService;
import com.aideus.android.app.injection.ApplicationContext;
import com.aideus.android.app.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    Bus eventBus();

}
