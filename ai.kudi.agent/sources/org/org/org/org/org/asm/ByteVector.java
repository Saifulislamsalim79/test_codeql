package org.org.org.org.org.asm;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.c.i.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* loaded from: classes.dex */
public final class ByteVector {

    /* renamed from: a */
    public final List<d.b> f32481a;

    /* renamed from: b */
    public final /* synthetic */ C14635f f32482b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ByteVector(C14635f c14635f) {
        this.f32482b = c14635f;
        ArrayList $r2 = new ArrayList();
        this.f32481a = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x004e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m985a() {
        /*
            r23 = this;
            org.org.org.org.asm.parser.System r1 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r2 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.LIFECYCLE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r3 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r5 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r4 = r1.get(r2, r5, r3)
            int r6 = r4.ordinal()
            if (r6 == 0) goto L12
            goto L33
        L12:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = r7
            r7.<init>()
            java.lang.String r9 = "disablePreviousFragmentCallbacks() called"
            r8.append(r9)
            java.lang.String r9 = ", [logAspect: "
            r8.append(r9)
            r8.append(r2)
            r5 = 93
            r8.append(r5)
            java.lang.String r10 = r8.toString()
            java.lang.String r9 = "SDKLifecycleHandler"
            r1.size(r2, r3, r9, r10)
        L33:
            r0 = r23
            java.util.List<e.a.a.a.c.i.d$b> r11 = r0.f32481a
            int r6 = r11.size()
            r5 = 1
            int r6 = r6 - r5
            r5 = 0
            kotlin.i0.e r12 = kotlin.p491i0.C11839f.m10272j(r5, r6)
            r14 = r12
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r13 = r14
            java.util.Iterator r15 = r13.iterator()
        L4a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L77
            r18 = r15
            kotlin.z.l0 r18 = (kotlin.p557z.AbstractC13711l0) r18
            r17 = r18
            r0 = r17
            int r6 = r0.mo4069b()
            r0 = r23
            java.util.List<e.a.a.a.c.i.d$b> r11 = r0.f32481a
            java.lang.Object r19 = r11.get(r6)
            r21 = r19
            org.org.org.org.org.asm.Handle r21 = (org.org.org.org.org.asm.Handle) r21
            r20 = r21
            r0 = r20
            org.org.org.org.org.asm.d r22 = r0.m983a()
            r5 = 1
            r0 = r22
            r0.m975b(r5)
            goto L4a
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.ByteVector.m985a():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AppCompatActivity invoke(Activity activity) {
        if (activity != null) {
            AppCompatActivity $r3 = (AppCompatActivity) activity;
            return $r3;
        }
        try {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r4;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (r15 != false) goto L8;
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x006a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m984a(android.app.Activity r27) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.ByteVector.m984a(android.app.Activity):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.LIFECYCLE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        int $i0 = 0;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i1 = $r5.ordinal();
        if ($i1 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("unregisterFragmentCallback() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "SDKLifecycleHandler", $r83);
        }
        AppCompatActivity $r9 = invoke(activity);
        if ($r9 != null) {
            List $r10 = this.f32481a;
            Iterator $r11 = $r10.iterator();
            while (true) {
                boolean $z0 = $r11.hasNext();
                if (!$z0) {
                    $i0 = -1;
                    break;
                }
                Object $r12 = $r11.next();
                Handle $r13 = (Handle) $r12;
                String $r84 = $r13.getName();
                Class $r14 = activity.getClass();
                String $r15 = $r14.getSimpleName();
                boolean $z02 = Log_OC.append($r84, $r15);
                if ($z02) {
                    break;
                }
                $i0++;
            }
            if ($i0 != -1) {
                FragmentManager $r16 = $r9.getSupportFragmentManager();
                List $r102 = this.f32481a;
                Object $r122 = $r102.get($i0);
                Handle $r132 = (Handle) $r122;
                C14633d $r17 = $r132.m983a();
                $r16.m35889w1($r17);
                List $r103 = this.f32481a;
                $r103.remove($i0);
            }
        }
    }
}
