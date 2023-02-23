package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes2.dex */
public final class RunnableC4280l7 implements Runnable {

    /* renamed from: c */
    private final URL f10450c;

    /* renamed from: d */
    private final String f10451d;

    /* renamed from: e */
    final /* synthetic */ C4292m7 f10452e;

    /* renamed from: f */
    private final C4440z4 f10453f;

    public RunnableC4280l7(C4292m7 c4292m7, String str, URL url, byte[] bArr, Map map, C4440z4 c4440z4, byte[] bArr2) {
        this.f10452e = c4292m7;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(url);
        com.google.android.gms.common.internal.s.j(c4440z4);
        this.f10450c = url;
        this.f10453f = c4440z4;
        this.f10451d = str;
    }

    /* renamed from: b */
    private final void m28040b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        ((v5) this.f10452e).a.a().m27810z(new Runnable() { // from class: com.google.android.gms.measurement.internal.k7
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC4280l7.this.m28041a(i, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m28041a(int i, Exception exc, byte[] bArr, Map map) {
        C4440z4 c4440z4 = this.f10453f;
        c4440z4.f10853a.h(this.f10451d, i, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.l7] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.m7 r0 = r9.f10452e
            r0.g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.m7 r2 = r9.f10452e     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            java.net.URL r3 = r9.f10450c     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            if (r4 == 0) goto L80
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            com.google.android.gms.measurement.internal.b5 r4 = r2.a     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r4.z()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            com.google.android.gms.measurement.internal.b5 r2 = r2.a     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r2.z()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L66
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L66
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L66
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5d
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L5d:
            if (r3 == 0) goto L62
            r3.disconnect()
        L62:
            r9.m28040b(r2, r1, r0, r4)
            return
        L66:
            r0 = move-exception
            goto L6a
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L70:
            r0 = move-exception
            goto L8d
        L72:
            r0 = move-exception
            goto L9b
        L74:
            r0 = move-exception
            r4 = r1
            goto L8d
        L77:
            r0 = move-exception
            r4 = r1
            goto L9b
        L7a:
            r2 = move-exception
            r4 = r1
            goto L8b
        L7d:
            r2 = move-exception
            r4 = r1
            goto L99
        L80:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
            throw r2     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L96
        L88:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L8b:
            r0 = r2
            r2 = 0
        L8d:
            if (r3 == 0) goto L92
            r3.disconnect()
        L92:
            r9.m28040b(r2, r1, r1, r4)
            throw r0
        L96:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L99:
            r0 = r2
            r2 = 0
        L9b:
            if (r3 == 0) goto La0
            r3.disconnect()
        La0:
            r9.m28040b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC4280l7.run():void");
    }
}
