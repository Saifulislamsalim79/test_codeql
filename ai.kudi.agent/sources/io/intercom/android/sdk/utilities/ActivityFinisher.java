package io.intercom.android.sdk.utilities;

import android.app.Activity;
import java.util.Set;
import p201g.p218e.C7523b;
/* loaded from: classes3.dex */
public class ActivityFinisher {
    private final Set<Activity> activities = new C7523b();

    public void finishActivities() {
        for (Activity activity : this.activities) {
            activity.finish();
        }
        this.activities.clear();
    }

    public void register(Activity activity) {
        this.activities.add(activity);
    }

    public void unregister(Activity activity) {
        this.activities.remove(activity);
    }
}
