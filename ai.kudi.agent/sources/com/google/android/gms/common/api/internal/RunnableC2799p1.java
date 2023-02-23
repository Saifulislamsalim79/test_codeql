package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.p1 */
/* loaded from: classes2.dex */
final class RunnableC2799p1 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ LifecycleCallback f7845c;

    /* renamed from: d */
    final /* synthetic */ String f7846d;

    /* renamed from: e */
    final /* synthetic */ FragmentC2802q1 f7847e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2799p1(FragmentC2802q1 fragmentC2802q1, LifecycleCallback lifecycleCallback, String str) {
        this.f7847e = fragmentC2802q1;
        this.f7845c = lifecycleCallback;
        this.f7846d = str;
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
        FragmentC2802q1 fragmentC2802q1 = this.f7847e;
        i = fragmentC2802q1.f7852d;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f7845c;
            bundle = fragmentC2802q1.f7853e;
            if (bundle != null) {
                bundle3 = fragmentC2802q1.f7853e;
                bundle2 = bundle3.getBundle(this.f7846d);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo31951f(bundle2);
        }
        i2 = this.f7847e.f7852d;
        if (i2 >= 2) {
            this.f7845c.mo31905j();
        }
        i3 = this.f7847e.f7852d;
        if (i3 >= 3) {
            this.f7845c.mo31906h();
        }
        i4 = this.f7847e.f7852d;
        if (i4 >= 4) {
            this.f7845c.mo31904k();
        }
        i5 = this.f7847e.f7852d;
        if (i5 >= 5) {
            this.f7845c.m32054g();
        }
    }
}
