package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.C4957a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.f2 */
/* loaded from: classes2.dex */
public final class C4862f2 {

    /* renamed from: c */
    private static final C4957a f12308c = new C4957a("PackageStateCache");

    /* renamed from: a */
    private final Context f12309a;

    /* renamed from: b */
    private int f12310b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4862f2(Context context) {
        this.f12309a = context;
    }

    /* renamed from: a */
    public final synchronized int m26122a() {
        if (this.f12310b == -1) {
            try {
                this.f12310b = this.f12309a.getPackageManager().getPackageInfo(this.f12309a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f12308c.m25955e("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f12310b;
    }
}
