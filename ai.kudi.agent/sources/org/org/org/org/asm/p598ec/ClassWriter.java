package org.org.org.org.asm.p598ec;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.menu.EnumC14570c;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.org.core.session.EnumC14680c;
/* renamed from: org.org.org.org.asm.ec.ClassWriter */
/* loaded from: classes.dex */
public final class ClassWriter implements ECFieldElement {

    /* renamed from: a */
    public static Float f32348a;

    /* renamed from: b */
    public static final ClassWriter f32349b;

    /* renamed from: x */
    public static Float f32350x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f32349b = $r0;
    }

    private ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public EnumC14570c m1113a() {
        Resources $r1 = Resources.getSystem();
        Log_OC.loadImage($r1, "Resources.getSystem()");
        Configuration $r2 = $r1.getConfiguration();
        int $i0 = $r2.orientation;
        if ($i0 == 1) {
            EnumC14570c r3 = EnumC14570c.f32268a;
            return r3;
        } else if ($i0 != 2) {
            return null;
        } else {
            EnumC14570c r32 = EnumC14570c.f32270f;
            return r32;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Method m1112a(EnumC14680c enumC14680c) {
        float $f0 = init(enumC14680c);
        int $i0 = (int) $f0;
        float $f02 = m1110b(enumC14680c);
        int $i1 = (int) $f02;
        Method $r1 = new Method($i0, $i1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public float m1111b() {
        float $f0 = get();
        float $f1 = newUTF8();
        return Math.max($f0, $f1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r0 != null) goto L4;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float m1110b(org.org.org.org.org.core.session.EnumC14680c r13) {
        /*
            r12 = this;
            if (r13 == 0) goto La
            org.org.org.org.android.util.menu.c r0 = org.org.org.org.asm.p598ec.C14597d.m1108c(r13)
            r1 = r0
            if (r0 == 0) goto La
            goto Le
        La:
            org.org.org.org.android.util.menu.c r1 = r12.m1113a()
        Le:
            if (r1 == 0) goto L11
            goto L13
        L11:
            org.org.org.org.android.util.menu.c r1 = org.org.org.org.android.util.menu.EnumC14570c.f32268a
        L13:
            int r2 = r1.ordinal()
            if (r2 == 0) goto L3f
            r3 = 1
            if (r2 != r3) goto L35
            java.lang.Float r4 = org.org.org.org.asm.p598ec.ClassWriter.f32348a
            if (r4 == 0) goto L25
            float r5 = r4.floatValue()
            return r5
        L25:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "Resources.getSystem()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r7)
            android.util.DisplayMetrics r8 = r6.getDisplayMetrics()
            int r2 = r8.heightPixels
            goto L57
        L35:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            r11 = r9
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r10 = r11
            throw r10
        L3f:
            java.lang.Float r4 = org.org.org.org.asm.p598ec.ClassWriter.f32350x
            if (r4 == 0) goto L48
            float r5 = r4.floatValue()
            return r5
        L48:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "Resources.getSystem()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r7)
            android.util.DisplayMetrics r8 = r6.getDisplayMetrics()
            int r2 = r8.heightPixels
        L57:
            float r5 = (float) r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.p598ec.ClassWriter.m1110b(org.org.org.org.org.core.session.c):float");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public float dpToPx(float f) {
        Resources $r1 = Resources.getSystem();
        Log_OC.loadImage($r1, "Resources.getSystem()");
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        float $f0 = TypedValue.applyDimension(1, f, $r2);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.p598ec.ECFieldElement
    public float get() {
        float $f0 = init((EnumC14680c) null);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.p598ec.ECFieldElement
    public float init() {
        Resources $r1 = Resources.getSystem();
        Log_OC.loadImage($r1, "Resources.getSystem()");
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        float f0 = $r2.density;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public float init(float f) {
        Resources $r1 = Resources.getSystem();
        Log_OC.loadImage($r1, "Resources.getSystem()");
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        float $f0 = TypedValue.applyDimension(5, f, $r2);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r0 != null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float init(org.org.org.org.org.core.session.EnumC14680c r13) {
        /*
            r12 = this;
            if (r13 == 0) goto La
            org.org.org.org.android.util.menu.c r0 = org.org.org.org.asm.p598ec.C14597d.m1108c(r13)
            r1 = r0
            if (r0 == 0) goto La
            goto Le
        La:
            org.org.org.org.android.util.menu.c r1 = r12.m1113a()
        Le:
            if (r1 == 0) goto L11
            goto L13
        L11:
            org.org.org.org.android.util.menu.c r1 = org.org.org.org.android.util.menu.EnumC14570c.f32268a
        L13:
            int r2 = r1.ordinal()
            if (r2 == 0) goto L3f
            r3 = 1
            if (r2 != r3) goto L35
            java.lang.Float r4 = org.org.org.org.asm.p598ec.ClassWriter.f32350x
            if (r4 == 0) goto L25
            float r5 = r4.floatValue()
            return r5
        L25:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "Resources.getSystem()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r7)
            android.util.DisplayMetrics r8 = r6.getDisplayMetrics()
            int r2 = r8.widthPixels
            goto L57
        L35:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            r11 = r9
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r10 = r11
            throw r10
        L3f:
            java.lang.Float r4 = org.org.org.org.asm.p598ec.ClassWriter.f32348a
            if (r4 == 0) goto L48
            float r5 = r4.floatValue()
            return r5
        L48:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "Resources.getSystem()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r7)
            android.util.DisplayMetrics r8 = r6.getDisplayMetrics()
            int r2 = r8.widthPixels
        L57:
            float r5 = (float) r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.p598ec.ClassWriter.init(org.org.org.org.org.core.session.c):float");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void init(Activity activity) {
        Log_OC.getArray(activity, "activity");
        if (Build.VERSION.SDK_INT >= 17) {
            Float $r2 = f32348a;
            if ($r2 != null) {
                Float $r22 = f32350x;
                if ($r22 != null) {
                    return;
                }
            }
            Point $r3 = new Point();
            WindowManager $r4 = activity.getWindowManager();
            Log_OC.loadImage($r4, "activity.windowManager");
            Display $r5 = $r4.getDefaultDisplay();
            WindowManager $r42 = activity.getWindowManager();
            Log_OC.loadImage($r42, "activity.windowManager");
            Display $r6 = $r42.getDefaultDisplay();
            $r6.getRealSize($r3);
            Log_OC.loadImage($r5, "defaultDisplay");
            int $i0 = $r5.getRotation();
            if ($i0 != 0) {
                if ($i0 != 1) {
                    if ($i0 != 2) {
                        if ($i0 != 3) {
                            return;
                        }
                    }
                }
                float $f0 = $r3.y;
                Float $r23 = Float.valueOf($f0);
                f32348a = $r23;
                float $f02 = $r3.x;
                Float $r24 = Float.valueOf($f02);
                f32350x = $r24;
                return;
            }
            float $f03 = $r3.x;
            Float $r25 = Float.valueOf($f03);
            f32348a = $r25;
            float $f04 = $r3.y;
            Float $r26 = Float.valueOf($f04);
            f32350x = $r26;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.p598ec.ECFieldElement
    public float newUTF8() {
        float $f0 = m1110b(null);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public float put() {
        float $f0 = get();
        float $f1 = newUTF8();
        double $d0 = $f0;
        double $d1 = $f1;
        float $f02 = (float) Math.hypot($d0, $d1);
        return $f02;
    }
}
