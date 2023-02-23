package org.org.org.org.android.util;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class MimeType implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C14559f f32108a;

    public MimeType(C14559f c14559f) {
        this.f32108a = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalFocusChanged(android.view.View r16, android.view.View r17) {
        /*
            r15 = this;
            org.org.org.org.android.util.f r1 = r15.f32108a
            boolean r2 = org.org.org.org.android.util.C14559f.m1247c(r1)
            if (r2 != 0) goto L9c
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.lang.ref.WeakReference r3 = org.org.org.org.android.util.C14559f.m1239g(r1)
            if (r3 == 0) goto L9b
            java.lang.Object r4 = r3.get()
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            r5 = r6
            if (r5 == 0) goto La2
            java.lang.String r7 = "weakActivity?.get() ?: r…GlobalFocusChangeListener"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r7)
            org.org.org.org.asm.Type r8 = org.org.org.org.asm.Type.f32312c
            java.lang.String r9 = r8.getType(r5)
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.util.HashMap r10 = org.org.org.org.android.util.C14559f.m1243d(r1)
            java.lang.Object r4 = r10.get(r9)
            r11 = r4
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            r3 = r11
            r0 = r16
            boolean r2 = r8.call(r0)
            if (r2 == 0) goto L4b
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.lang.String r7 = "oldFocus"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            r0 = r16
            org.org.org.org.android.util.C14559f.m1246c(r1, r0)
        L49:
            r3 = 0
            goto L67
        L4b:
            if (r3 == 0) goto L67
            java.lang.Object r4 = r3.get()
            r12 = r4
            android.view.View r12 = (android.view.View) r12
            r16 = r12
            if (r16 == 0) goto L67
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.lang.String r7 = "it"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            r0 = r16
            org.org.org.org.android.util.C14559f.m1246c(r1, r0)
            goto L49
        L67:
            r0 = r17
            boolean r2 = r8.call(r0)
            if (r2 == 0) goto L7e
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.lang.String r7 = "newFocus"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            r0 = r17
            org.org.org.org.android.util.C14559f.m1253a(r1, r0)
            return
        L7e:
            if (r17 == 0) goto La2
            if (r3 == 0) goto La2
            java.lang.Object r4 = r3.get()
            r13 = r4
            android.view.View r13 = (android.view.View) r13
            r16 = r13
            if (r16 == 0) goto La2
            org.org.org.org.android.util.f r1 = r15.f32108a
            java.lang.String r7 = "it"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r7)
            r0 = r16
            org.org.org.org.android.util.C14559f.m1246c(r1, r0)
        L9b:
            return
        L9c:
            org.org.org.org.android.util.f r1 = r15.f32108a
            r14 = 0
            org.org.org.org.android.util.C14559f.m1241d(r1, r14)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.MimeType.onGlobalFocusChanged(android.view.View, android.view.View):void");
    }
}
