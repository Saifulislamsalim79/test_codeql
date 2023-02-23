package org.org.org.org.android.util;

import android.app.Activity;
import android.content.Context;
import org.org.org.org.android.util.function.Log;
/* loaded from: classes.dex */
public final class Frame extends Log {

    /* renamed from: b */
    public final /* synthetic */ C14559f f32107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Frame(C14559f c14559f, Activity activity, Context context) {
        super(context);
        this.f32107b = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // org.org.org.org.android.util.function.Log
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1236d(org.org.org.org.android.util.menu.EnumC14571f r18) {
        /*
            r17 = this;
            java.lang.String r1 = "orientation"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            org.org.org.org.android.util.f r2 = r0.f32107b
            java.lang.ref.WeakReference r3 = org.org.org.org.android.util.C14559f.m1239g(r2)
            if (r3 == 0) goto L20
            java.lang.Object r4 = r3.get()
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            r5 = r6
            if (r5 == 0) goto L20
            org.org.org.org.android.util.menu.f r18 = org.org.org.org.asm.util.Iterator.m1050a(r5)
            goto L22
        L20:
            r18 = 0
        L22:
            if (r18 == 0) goto L9a
            r0 = r17
            org.org.org.org.android.util.f r2 = r0.f32107b
            org.org.org.org.android.util.menu.f r7 = org.org.org.org.android.util.C14559f.m1256a(r2)
            r0 = r18
            if (r0 == r7) goto L9a
            org.org.org.org.asm.parser.System r8 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r9 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.ORIENTATION_CHANGES
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r10 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r12 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r11 = r8.get(r9, r12, r10)
            int r13 = r11.ordinal()
            if (r13 == 0) goto L42
            goto L91
        L42:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "onChanged() tracking automatically detected orientation change: "
            r15.append(r1)
            java.lang.String r1 = "activityOrientation = "
            r15.append(r1)
            r0 = r18
            r15.append(r0)
            java.lang.String r1 = ", "
            r15.append(r1)
            java.lang.String r1 = "lastTrackedOrientation = "
            r15.append(r1)
            r0 = r17
            org.org.org.org.android.util.f r2 = r0.f32107b
            org.org.org.org.android.util.menu.f r7 = org.org.org.org.android.util.C14559f.m1256a(r2)
            r15.append(r7)
            java.lang.String r16 = r15.toString()
            r0 = r16
            r14.append(r0)
            java.lang.String r1 = ", [logAspect: "
            r14.append(r1)
            r14.append(r9)
            r12 = 93
            r14.append(r12)
            java.lang.String r16 = r14.toString()
            java.lang.String r1 = "AutomaticEventDetectionHandler"
            r0 = r16
            r8.size(r9, r10, r1, r0)
        L91:
            r0 = r17
            org.org.org.org.android.util.f r2 = r0.f32107b
            r0 = r18
            r2.m1250a(r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.Frame.mo1236d(org.org.org.org.android.util.menu.f):void");
    }
}
