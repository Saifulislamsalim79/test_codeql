package org.org.org.org.android.util;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.Type;
import org.org.org.org.org.asm.commons.JSONObject;
import org.org.org.org.org.common.Logger;
/* renamed from: org.org.org.org.android.util.a */
/* loaded from: classes.dex */
public final class C14536a extends JSONObject {

    /* renamed from: a */
    public final /* synthetic */ C14559f f32113a;

    public C14536a(C14559f c14559f) {
        this.f32113a = c14559f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r11 == true) goto L7;
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo976a(android.app.Activity r14) {
        /*
            r13 = this;
            java.lang.String r0 = "activity"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            org.org.org.org.android.util.f r1 = r13.f32113a
            org.org.org.org.android.util.C14559f.m1255a(r1, r14)
            org.org.org.org.android.util.f r1 = r13.f32113a
            java.util.HashMap r2 = org.org.org.org.android.util.C14559f.m1243d(r1)
            org.org.org.org.asm.Type r3 = org.org.org.org.asm.Type.f32312c
            java.lang.String r4 = r3.getType(r14)
            java.lang.Object r5 = r2.get(r4)
            r7 = r5
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            r6 = r7
            org.org.org.org.android.util.f r1 = r13.f32113a
            r8 = 1
            if (r6 == 0) goto L35
            java.lang.Object r5 = r6.get()
            r10 = r5
            android.view.View r10 = (android.view.View) r10
            r9 = r10
            if (r9 == 0) goto L35
            boolean r11 = r9.hasFocus()
            r12 = 1
            if (r11 != r12) goto L35
            goto L36
        L35:
            r8 = 0
        L36:
            org.org.org.org.android.util.C14559f.m1241d(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.C14536a.mo976a(android.app.Activity):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void add(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
        C14559f $r4 = this.f32113a;
        Logger $r2 = $r4.f32202v;
        ViewState $r5 = ViewState.STOP;
        $r2.get(fragment, $r5, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close() {
        C14559f $r1 = this.f32113a;
        C14559f.m1254a($r1, null, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14559f $r3 = this.f32113a;
        WeakReference $r2 = new WeakReference(activity);
        $r3.f32200n = $r2;
        C14559f $r32 = this.f32113a;
        boolean $z0 = $r32.add();
        if ($z0) {
            C14559f $r33 = this.f32113a;
            $r33.onCreate(activity);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
        C14559f $r4 = this.f32113a;
        Logger $r2 = $r4.f32202v;
        ViewState $r5 = ViewState.START;
        $r2.get(fragment, $r5, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(Throwable th) {
        Log_OC.getArray(th, "cause");
        C14559f $r2 = this.f32113a;
        C14559f.m1254a($r2, null, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void get(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14559f $r2 = this.f32113a;
        $r2.m1260a(activity);
        C14559f $r22 = this.f32113a;
        HashMap $r3 = $r22.f32199m;
        Type $r4 = Type.f32312c;
        String $r5 = $r4.getType(activity);
        Object $r6 = $r3.get($r5);
        WeakReference $r7 = (WeakReference) $r6;
        if ($r7 != null) {
            Object $r62 = $r7.get();
            View $r8 = (View) $r62;
            if ($r8 != null) {
                C14559f $r23 = this.f32113a;
                $r23.f32192b = true;
                C14559f $r24 = this.f32113a;
                Log_OC.loadImage($r8, "it");
                $r24.m1249b($r8);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void read() {
        Activity $r5;
        AtomicBoolean $r2 = this.f32113a.f32198l;
        $r2.set(false);
        C14559f $r1 = this.f32113a;
        WeakReference $r3 = $r1.f32200n;
        if ($r3 != null) {
            Object $r4 = $r3.get();
            $r5 = (Activity) $r4;
        } else {
            $r5 = null;
        }
        $r1.clear($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14559f $r2 = this.f32113a;
        $r2.f32200n = new WeakReference(activity);
        C14559f $r22 = this.f32113a;
        boolean $z0 = $r22.add();
        if ($z0) {
            C14559f $r23 = this.f32113a;
            $r23.onCreate(activity);
        }
        C14559f $r24 = this.f32113a;
        AtomicBoolean $r4 = $r24.f32198l;
        boolean $z02 = $r4.get();
        if ($z02) {
            C14559f $r25 = this.f32113a;
            Logger $r5 = $r25.f32202v;
            ViewState $r6 = ViewState.START;
            $r5.execute(activity, $r6, false);
        }
        C14559f $r26 = this.f32113a;
        boolean $z03 = $r26.f32192b;
        if ($z03) {
            C14559f $r27 = this.f32113a;
            HashMap $r7 = $r27.f32199m;
            Type $r8 = Type.f32312c;
            String $r9 = $r8.getType(activity);
            Object $r10 = $r7.get($r9);
            WeakReference $r3 = (WeakReference) $r10;
            if ($r3 != null) {
                Object $r102 = $r3.get();
                View $r11 = (View) $r102;
                if ($r11 != null) {
                    C14559f $r28 = this.f32113a;
                    Log_OC.loadImage($r11, "it");
                    $r28.m1259a($r11);
                    C14559f $r29 = this.f32113a;
                    $r29.f32192b = false;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void run() {
        C14559f $r1 = this.f32113a;
        AtomicBoolean $r2 = $r1.f32198l;
        $r2.set(true);
        C14559f $r12 = this.f32113a;
        WeakReference $r3 = $r12.f32200n;
        if ($r3 != null) {
            Object $r4 = $r3.get();
            Activity $r5 = (Activity) $r4;
            if ($r5 != null) {
                C14559f $r13 = this.f32113a;
                boolean $z0 = $r13.add();
                if ($z0) {
                    C14559f $r14 = this.f32113a;
                    Log_OC.loadImage($r5, "activity");
                    $r14.onCreate($r5);
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void run(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14559f $r2 = this.f32113a;
        $r2.f32200n = null;
        C14559f $r22 = this.f32113a;
        AtomicBoolean $r3 = $r22.f32198l;
        boolean $z0 = $r3.get();
        if ($z0) {
            C14559f $r23 = this.f32113a;
            Logger $r4 = $r23.f32202v;
            ViewState $r5 = ViewState.STOP;
            $r4.execute(activity, $r5, false);
        }
        C14559f $r24 = this.f32113a;
        $r24.clear(activity);
    }
}
