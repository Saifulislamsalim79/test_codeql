package com.google.firebase.crashlytics.p112h.p120n;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: lambda */
/* renamed from: com.google.firebase.crashlytics.h.n.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5575f implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C5575f f13749a = new C5575f();

    private /* synthetic */ C5575f() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith("event");
        return startsWith;
    }
}
