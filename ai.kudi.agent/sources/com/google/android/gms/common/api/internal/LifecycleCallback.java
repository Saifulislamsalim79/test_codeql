package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class LifecycleCallback {

    /* renamed from: c */
    protected final InterfaceC2775i f7734c;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC2775i interfaceC2775i) {
        this.f7734c = interfaceC2775i;
    }

    /* renamed from: c */
    public static InterfaceC2775i m32056c(Activity activity) {
        return m32055d(new C2772h(activity));
    }

    /* renamed from: d */
    protected static InterfaceC2775i m32055d(C2772h c2772h) {
        if (c2772h.m31986d()) {
            return C2808s1.m31915h(c2772h.m31996b());
        }
        if (c2772h.m31991c()) {
            return FragmentC2802q1.m31922f(c2772h.m32008a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC2775i getChimeraLifecycleFragmentImpl(C2772h c2772h) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m32058a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m32057b() {
        Activity mo31918d = this.f7734c.mo31918d();
        com.google.android.gms.common.internal.s.j(mo31918d);
        return mo31918d;
    }

    /* renamed from: e */
    public void mo31952e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo31951f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m32054g() {
    }

    /* renamed from: h */
    public void mo31906h() {
    }

    /* renamed from: i */
    public void mo31950i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo31905j() {
    }

    /* renamed from: k */
    public void mo31904k() {
    }
}
