package org.org.org.org.android.util.lib;

import android.view.Window;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public abstract class Config {
    public abstract void clear(Window window);

    public void update(Window window) {
        Log_OC.getArray(window, "window");
    }
}
