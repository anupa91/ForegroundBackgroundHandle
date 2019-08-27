package com.an.foregroundbackgroundhandle.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ForegroundBackgroundApplication extends Application implements Application.ActivityLifecycleCallbacks {

    private int activityReferencesCount = 0;
    private boolean isActivityConfigurationsChanging = false;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        if (++activityReferencesCount == 1 && !isActivityConfigurationsChanging) {
            // ForegroundBackgroundApplication enters foreground
            Toast.makeText(this, "Application is in foreground", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
        isActivityConfigurationsChanging = activity.isChangingConfigurations();
        if (--activityReferencesCount == 0 && !isActivityConfigurationsChanging) {
            Toast.makeText(this, "Application is in background", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }
}
