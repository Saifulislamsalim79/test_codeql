package com.hwangjr.rxbus.thread;

import android.os.Looper;
import com.hwangjr.rxbus.Bus;
/* loaded from: classes2.dex */
public interface ThreadEnforcer {
    public static final ThreadEnforcer ANY = new ThreadEnforcer() { // from class: com.hwangjr.rxbus.thread.ThreadEnforcer.1
        @Override // com.hwangjr.rxbus.thread.ThreadEnforcer
        public void enforce(Bus bus) {
        }
    };
    public static final ThreadEnforcer MAIN = new ThreadEnforcer() { // from class: com.hwangjr.rxbus.thread.ThreadEnforcer.2
        @Override // com.hwangjr.rxbus.thread.ThreadEnforcer
        public void enforce(Bus bus) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return;
            }
            throw new IllegalStateException("Event bus " + bus + " accessed from non-main thread " + Looper.myLooper());
        }
    };

    void enforce(Bus bus);
}
