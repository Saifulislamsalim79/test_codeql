package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* loaded from: classes2.dex */
final class RunnableC2805r1 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ LifecycleCallback f7857c;

    /* renamed from: d */
    final /* synthetic */ String f7858d;

    /* renamed from: e */
    final /* synthetic */ C2808s1 f7859e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2805r1(C2808s1 c2808s1, LifecycleCallback lifecycleCallback, String str) {
        this.f7859e = c2808s1;
        this.f7857c = lifecycleCallback;
        this.f7858d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C2808s1 c2808s1 = this.f7859e;
        i = c2808s1.f7867d;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f7857c;
            bundle = c2808s1.f7868e;
            if (bundle != null) {
                bundle3 = c2808s1.f7868e;
                bundle2 = bundle3.getBundle(this.f7858d);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo31951f(bundle2);
        }
        i2 = this.f7859e.f7867d;
        if (i2 >= 2) {
            this.f7857c.mo31905j();
        }
        i3 = this.f7859e.f7867d;
        if (i3 >= 3) {
            this.f7857c.mo31906h();
        }
        i4 = this.f7859e.f7867d;
        if (i4 >= 4) {
            this.f7857c.mo31904k();
        }
        i5 = this.f7859e.f7867d;
        if (i5 >= 5) {
            this.f7857c.m32054g();
        }
    }
}
