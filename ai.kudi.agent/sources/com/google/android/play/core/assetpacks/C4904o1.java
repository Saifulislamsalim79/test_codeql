package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.o1 */
/* loaded from: classes2.dex */
public final class C4904o1 {

    /* renamed from: d */
    private static final C4957a f12418d = new C4957a("ExtractorTaskFinder");

    /* renamed from: a */
    private final C4891l1 f12419a;

    /* renamed from: b */
    private final C4840b0 f12420b;

    /* renamed from: c */
    private final C4875i0 f12421c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4904o1(C4891l1 c4891l1, C4840b0 c4840b0, C4875i0 c4875i0) {
        this.f12419a = c4891l1;
        this.f12420b = c4840b0;
        this.f12421c = c4875i0;
    }

    /* renamed from: b */
    private final boolean m26053b(C4876i1 c4876i1, C4881j1 c4881j1) {
        C4840b0 c4840b0 = this.f12420b;
        C4871h1 c4871h1 = c4876i1.f12354c;
        return c4840b0.m26138w(c4871h1.f12334a, c4876i1.f12353b, c4871h1.f12335b, c4881j1.f12366a).exists();
    }

    /* renamed from: c */
    private static boolean m26052c(C4881j1 c4881j1) {
        int i = c4881j1.f12371f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x040f, code lost:
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0218, code lost:
        r0 = com.google.android.play.core.assetpacks.C4904o1.f12418d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f12352a);
        r4[1] = r6.f12354c.f12334a;
        r4[2] = r10.f12366a;
        r0.m25957c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0235, code lost:
        r11 = r34.f12420b;
        r4 = r6.f12354c;
        r0 = new java.io.FileInputStream(r11.m26138w(r4.f12334a, r6.f12353b, r4.f12335b, r10.f12366a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024c, code lost:
        r9 = r6.f12352a;
        r11 = r6.f12354c;
        r4 = new com.google.android.play.core.assetpacks.C4911q0(r9, r11.f12334a, r6.f12353b, r11.f12335b, r10.f12366a, 0, 0, 1, r11.f12337d, r11.f12336c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x027b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a1, code lost:
        throw new com.google.android.play.core.assetpacks.C4923t0(java.lang.String.format("Error finding patch, session %s packName %s sliceId %s", java.lang.Integer.valueOf(r6.f12352a), r6.f12354c.f12334a, r10.f12366a), r0, r6.f12352a);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.C4900n1 m26054a() {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4904o1.m26054a():com.google.android.play.core.assetpacks.n1");
    }
}
