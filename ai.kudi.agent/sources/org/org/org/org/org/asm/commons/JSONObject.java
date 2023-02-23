package org.org.org.org.org.asm.commons;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.SetupOptions;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public abstract class JSONObject {
    /* renamed from: a */
    public void mo976a(Activity activity) {
        Log_OC.getArray(activity, "activity");
    }

    public void add(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
    }

    public void close() {
    }

    public void close(Activity activity) {
        Log_OC.getArray(activity, "activity");
    }

    public void close(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
    }

    public void close(Throwable th) {
        Log_OC.getArray(th, "cause");
    }

    public void get(Activity activity) {
        Log_OC.getArray(activity, "activity");
    }

    public void read() {
    }

    public void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
    }

    public void read(SetupOptions setupOptions) {
        Log_OC.getArray(setupOptions, "setupOptions");
    }

    public void run() {
    }

    public void run(Activity activity) {
        Log_OC.getArray(activity, "activity");
    }

    public void setTitle(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
    }

    public void write() {
    }
}
