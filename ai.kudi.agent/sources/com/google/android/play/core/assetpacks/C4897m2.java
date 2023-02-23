package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.m2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4897m2 implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f12411a = new C4897m2();

    private C4897m2() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = C4901n2.f12415a.matcher(str).matches();
        return matches;
    }
}
