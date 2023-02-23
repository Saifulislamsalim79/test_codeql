package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes2.dex */
public final class C3720b6 {

    /* renamed from: a */
    static volatile AbstractC3970r6<Boolean> f9198a = AbstractC3970r6.m29032c();

    /* renamed from: b */
    private static final Object f9199b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:33|(1:35)(1:41)|36|(2:38|(1:40))|27|28|29|30)|21|22|23|24|(1:26)|27|28|29|30) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m29799a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r5.length()
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r6 = r6.concat(r0)
            android.util.Log.e(r5, r6)
            return r1
        L24:
            com.google.android.gms.internal.measurement.r6<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.C3720b6.f9198a
            boolean r6 = r6.mo28912b()
            if (r6 == 0) goto L39
            com.google.android.gms.internal.measurement.r6<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.C3720b6.f9198a
            java.lang.Object r5 = r5.mo28913a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L39:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3720b6.f9199b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.r6<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.C3720b6.f9198a     // Catch: java.lang.Throwable -> La9
            boolean r0 = r0.mo28912b()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L52
            com.google.android.gms.internal.measurement.r6<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.C3720b6.f9198a     // Catch: java.lang.Throwable -> La9
            java.lang.Object r5 = r5.mo28913a()     // Catch: java.lang.Throwable -> La9
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> La9
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> La9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            return r5
        L52:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> La9
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L5f
            goto L80
        L5f:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La9
            r4 = 29
            if (r3 >= r4) goto L6d
            r3 = 0
            goto L6f
        L6d:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L6f:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L91
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> La9
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L80
            goto L91
        L80:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91 java.lang.Throwable -> La9
            int r5 = r5.flags     // Catch: java.lang.Throwable -> La9
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L91
            r1 = 1
        L91:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.measurement.r6 r5 = com.google.android.gms.internal.measurement.AbstractC3970r6.m29031d(r5)     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.measurement.C3720b6.f9198a = r5     // Catch: java.lang.Throwable -> La9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.measurement.r6<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.C3720b6.f9198a
            java.lang.Object r5 = r5.mo28913a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La9:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3720b6.m29799a(android.content.Context, android.net.Uri):boolean");
    }
}
