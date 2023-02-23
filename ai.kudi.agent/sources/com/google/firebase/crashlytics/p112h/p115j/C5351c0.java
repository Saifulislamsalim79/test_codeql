package com.google.firebase.crashlytics.p112h.p115j;

import android.content.Context;
/* compiled from: InstallerPackageNameProvider.java */
/* renamed from: com.google.firebase.crashlytics.h.j.c0 */
/* loaded from: classes2.dex */
class C5351c0 {

    /* renamed from: a */
    private String f13207a;

    /* renamed from: b */
    private static String m25071b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m25072a(Context context) {
        if (this.f13207a == null) {
            this.f13207a = m25071b(context);
        }
        return "".equals(this.f13207a) ? null : this.f13207a;
    }
}
