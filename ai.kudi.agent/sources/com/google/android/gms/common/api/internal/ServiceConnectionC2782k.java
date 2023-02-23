package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.AbstractC2883j;
import com.google.android.gms.common.internal.InterfaceC2889l;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2782k implements C2730a.InterfaceC2739f, ServiceConnection {

    /* renamed from: a */
    private final String f7809a;

    /* renamed from: b */
    private final String f7810b;

    /* renamed from: c */
    private final ComponentName f7811c;

    /* renamed from: d */
    private final Context f7812d;

    /* renamed from: e */
    private final C2766f f7813e;

    /* renamed from: f */
    private final Handler f7814f;

    /* renamed from: g */
    private final l f7815g;

    /* renamed from: h */
    private IBinder f7816h;

    /* renamed from: i */
    private boolean f7817i;

    /* renamed from: j */
    private String f7818j;

    /* renamed from: r */
    private final void m31957r() {
        if (Thread.currentThread() != this.f7814f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: s */
    private final void m31956s(String str) {
        String.valueOf(String.valueOf(this.f7816h)).length();
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: a */
    public final Set<Scope> mo31732a() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: b */
    public final void mo31968b(InterfaceC2889l interfaceC2889l, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: c */
    public final void mo31967c(String str) {
        m31957r();
        this.f7818j = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: d */
    public final boolean mo31966d() {
        m31957r();
        return this.f7817i;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    public final void disconnect() {
        m31957r();
        m31956s("Disconnect called.");
        try {
            this.f7812d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f7817i = false;
        this.f7816h = null;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: f */
    public final String mo31965f() {
        String str = this.f7809a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.s.j(this.f7811c);
        return this.f7811c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: g */
    public final void mo31964g(AbstractC2854c.InterfaceC2857c interfaceC2857c) {
        m31957r();
        m31956s("Connect started.");
        if (isConnected()) {
            try {
                mo31967c("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f7811c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f7809a).setAction(this.f7810b);
            }
            boolean bindService = this.f7812d.bindService(intent, this, AbstractC2883j.m31725a());
            this.f7817i = bindService;
            if (!bindService) {
                this.f7816h = null;
                this.f7815g.n(new C2826b(16));
            }
            m31956s("Finished connect.");
        } catch (SecurityException e) {
            this.f7817i = false;
            this.f7816h = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: h */
    public final void mo31963h(AbstractC2854c.InterfaceC2859e interfaceC2859e) {
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: i */
    public final boolean mo31238i() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    public final boolean isConnected() {
        m31957r();
        return this.f7816h != null;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: l */
    public final C2830d[] mo31962l() {
        return new C2830d[0];
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: m */
    public final String mo31961m() {
        return this.f7818j;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: n */
    public final boolean mo15467n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m31960o() {
        this.f7817i = false;
        this.f7816h = null;
        m31956s("Disconnected.");
        this.f7813e.m(1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f7814f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.q0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2782k.this.m31959p(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7814f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.p0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2782k.this.m31960o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m31959p(IBinder iBinder) {
        this.f7817i = false;
        this.f7816h = iBinder;
        m31956s("Connected.");
        this.f7813e.o(new Bundle());
    }

    /* renamed from: q */
    public final void m31958q(String str) {
    }
}
