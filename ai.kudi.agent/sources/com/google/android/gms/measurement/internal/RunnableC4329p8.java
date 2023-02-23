package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.p8 */
/* loaded from: classes2.dex */
public final class RunnableC4329p8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10588c;

    /* renamed from: d */
    final /* synthetic */ String f10589d;

    /* renamed from: e */
    final /* synthetic */ String f10590e;

    /* renamed from: f */
    final /* synthetic */ C4307na f10591f;

    /* renamed from: w */
    final /* synthetic */ boolean f10592w;

    /* renamed from: x */
    final /* synthetic */ C4410w8 f10593x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4329p8(C4410w8 c4410w8, AtomicReference atomicReference, String str, String str2, String str3, C4307na c4307na, boolean z) {
        this.f10593x = c4410w8;
        this.f10588c = atomicReference;
        this.f10589d = str2;
        this.f10590e = str3;
        this.f10591f = c4307na;
        this.f10592w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC4219g3 interfaceC4219g3;
        synchronized (this.f10588c) {
            try {
                interfaceC4219g3 = this.f10593x.f10772d;
            } catch (RemoteException e) {
                ((v5) this.f10593x).a.b().r().m28011d("(legacy) Failed to get user properties; remote exception", null, this.f10589d, e);
                this.f10588c.set(Collections.emptyList());
                atomicReference = this.f10588c;
            }
            if (interfaceC4219g3 == null) {
                ((v5) this.f10593x).a.b().r().m28011d("(legacy) Failed to get user properties; not connected to service", null, this.f10589d, this.f10590e);
                this.f10588c.set(Collections.emptyList());
                this.f10588c.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                com.google.android.gms.common.internal.s.j(this.f10591f);
                this.f10588c.set(interfaceC4219g3.mo27949C0(this.f10589d, this.f10590e, this.f10592w, this.f10591f));
            } else {
                this.f10588c.set(interfaceC4219g3.mo27925y(null, this.f10589d, this.f10590e, this.f10592w));
            }
            this.f10593x.m27879E();
            atomicReference = this.f10588c;
            atomicReference.notify();
        }
    }
}
