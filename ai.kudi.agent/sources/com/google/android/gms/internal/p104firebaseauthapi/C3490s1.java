package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s1 */
/* loaded from: classes2.dex */
public final class C3490s1 {

    /* renamed from: a */
    private final C3505sg f8932a;

    /* renamed from: b */
    private final InterfaceC3464r1 f8933b;

    private C3490s1(InterfaceC3464r1 interfaceC3464r1) {
        C3478rf c3478rf = C3478rf.f8912b;
        this.f8933b = interfaceC3464r1;
        this.f8932a = c3478rf;
    }

    /* renamed from: b */
    public static C3490s1 m30293b(char c) {
        return new C3490s1(new C3383no(new C3424pd('.')));
    }

    /* renamed from: c */
    public static C3490s1 m30292c(String str) {
        AbstractC3351mi m30494a = C3407om.m30494a("[.-]");
        if (!((C3637xi) m30494a.mo30424a("")).f9090a.matches()) {
            return new C3490s1(new C3670z(m30494a));
        }
        throw new IllegalArgumentException(C3516t1.m30221b("The pattern may not match the empty string: %s", m30494a));
    }

    /* renamed from: d */
    public final List<String> m30291d(CharSequence charSequence) {
        if (charSequence != null) {
            Iterator<String> mo29916a = this.f8933b.mo29916a(this, charSequence);
            ArrayList arrayList = new ArrayList();
            while (mo29916a.hasNext()) {
                arrayList.add(mo29916a.next());
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw null;
    }
}
