package com.google.firebase.p181q;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: GlobalLibraryVersionRegistrar.java */
/* renamed from: com.google.firebase.q.e */
/* loaded from: classes2.dex */
public class C6727e {

    /* renamed from: b */
    private static volatile C6727e f16187b;

    /* renamed from: a */
    private final Set<AbstractC6729g> f16188a = new HashSet();

    C6727e() {
    }

    /* renamed from: a */
    public static C6727e m20941a() {
        C6727e c6727e = f16187b;
        if (c6727e == null) {
            synchronized (C6727e.class) {
                c6727e = f16187b;
                if (c6727e == null) {
                    c6727e = new C6727e();
                    f16187b = c6727e;
                }
            }
        }
        return c6727e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC6729g> m20940b() {
        Set<AbstractC6729g> unmodifiableSet;
        synchronized (this.f16188a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f16188a);
        }
        return unmodifiableSet;
    }
}
