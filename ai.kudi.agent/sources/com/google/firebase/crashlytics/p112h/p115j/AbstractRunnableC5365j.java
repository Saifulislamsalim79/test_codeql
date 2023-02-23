package com.google.firebase.crashlytics.p112h.p115j;

import android.os.Process;
/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: com.google.firebase.crashlytics.h.j.j */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC5365j implements Runnable {
    /* renamed from: a */
    protected abstract void mo24831a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo24831a();
    }
}
