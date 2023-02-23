package com.google.firebase.perf.p172f;

import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p179k.EnumC6652d;
import java.lang.ref.WeakReference;
/* compiled from: AppStateUpdateHandler.java */
/* renamed from: com.google.firebase.perf.f.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6596b implements C6593a.InterfaceC6595b {
    private final WeakReference<C6593a.InterfaceC6595b> appStateCallback;
    private final C6593a appStateMonitor;
    private EnumC6652d currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6596b() {
        this(C6593a.m21528b());
    }

    public EnumC6652d getAppState() {
        return this.currentAppState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i) {
        this.appStateMonitor.m21524f(i);
    }

    @Override // com.google.firebase.perf.p172f.C6593a.InterfaceC6595b
    public void onUpdateAppState(EnumC6652d enumC6652d) {
        EnumC6652d enumC6652d2 = this.currentAppState;
        EnumC6652d enumC6652d3 = EnumC6652d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC6652d2 == enumC6652d3) {
            this.currentAppState = enumC6652d;
        } else if (enumC6652d2 == enumC6652d || enumC6652d == enumC6652d3) {
        } else {
            this.currentAppState = EnumC6652d.FOREGROUND_BACKGROUND;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.m21529a();
        this.appStateMonitor.m21519k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.m21515o(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6596b(C6593a c6593a) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC6652d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = c6593a;
        this.appStateCallback = new WeakReference<>(this);
    }
}
