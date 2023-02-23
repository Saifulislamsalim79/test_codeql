package io.intercom.android.sdk;

import android.os.Handler;
import android.os.Looper;
import p425j.p429b.p430a.p431a.p432a.C11129b;
import p425j.p429b.p430a.p431a.p432a.InterfaceC11138i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MainThreadBus extends C11129b {
    private final Handler mainThread;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MainThreadBus(InterfaceC11138i interfaceC11138i) {
        super(interfaceC11138i);
        this.mainThread = new Handler(Looper.getMainLooper());
    }

    @Override // p425j.p429b.p430a.p431a.p432a.C11129b
    public void post(final Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.post(obj);
        } else {
            this.mainThread.post(new Runnable() { // from class: io.intercom.android.sdk.MainThreadBus.1
                @Override // java.lang.Runnable
                public void run() {
                    MainThreadBus.super.post(obj);
                }
            });
        }
    }

    @Override // p425j.p429b.p430a.p431a.p432a.C11129b
    public void register(Object obj) {
        try {
            super.register(obj);
        } catch (Exception unused) {
        }
    }

    @Override // p425j.p429b.p430a.p431a.p432a.C11129b
    public void unregister(Object obj) {
        try {
            super.unregister(obj);
        } catch (Exception unused) {
        }
    }
}
