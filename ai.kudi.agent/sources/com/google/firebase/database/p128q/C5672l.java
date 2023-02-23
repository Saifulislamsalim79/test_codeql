package com.google.firebase.database.p128q;

import java.lang.Comparable;
import java.util.Comparator;
/* compiled from: StandardComparator.java */
/* renamed from: com.google.firebase.database.q.l */
/* loaded from: classes2.dex */
public class C5672l<A extends Comparable<A>> implements Comparator<A> {

    /* renamed from: c */
    private static C5672l f13928c = new C5672l();

    private C5672l() {
    }

    /* renamed from: b */
    public static <T extends Comparable<T>> C5672l<T> m24191b(Class<T> cls) {
        return f13928c;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
