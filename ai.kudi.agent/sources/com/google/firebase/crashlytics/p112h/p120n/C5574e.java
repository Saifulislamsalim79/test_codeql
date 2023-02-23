package com.google.firebase.crashlytics.p112h.p120n;

import java.io.File;
import java.util.Comparator;
/* compiled from: lambda */
/* renamed from: com.google.firebase.crashlytics.h.n.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5574e implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C5574e f13748c = new C5574e();

    private /* synthetic */ C5574e() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
        return compareTo;
    }
}
