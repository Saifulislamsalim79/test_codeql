package org.org.org.org.asm.util;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import java.util.List;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* loaded from: classes.dex */
public final class Frame {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
        if (r17 != false) goto L14;
     */
    /* JADX WARN: Incorrect condition in loop: B:18:0x009b */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0050 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m1055a(android.view.ViewGroup r36) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Frame.m1055a(android.view.ViewGroup):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final List m1054a(ViewGroup viewGroup, boolean z) {
        List $r1;
        List $r12;
        Log_OC.getArray(viewGroup, "$this$childrenSortedByZIndex");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 21) {
            List $r13 = m1053b(viewGroup);
            if (z) {
                $r12 = C13742z.m3777u0($r13, new Comparator<T>() { // from class: org.org.org.org.asm.util.AbstractXPathCompiled$NamespaceComparator
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int $i02;
                        View $r3 = (View) obj;
                        Log_OC.loadImage($r3, "it");
                        float $f0 = $r3.getZ();
                        Float $r4 = Float.valueOf($f0);
                        View $r32 = (View) obj2;
                        Log_OC.loadImage($r32, "it");
                        float $f02 = $r32.getZ();
                        Float $r5 = Float.valueOf($f02);
                        $i02 = C11703b.m10416a($r4, $r5);
                        return $i02;
                    }
                });
                return $r12;
            }
            $r1 = C13742z.m3777u0($r13, new Comparator<T>() { // from class: org.org.org.org.asm.util.BeanSerializer$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int $i02;
                    View $r3 = (View) obj2;
                    Log_OC.loadImage($r3, "it");
                    float $f0 = $r3.getZ();
                    Float $r4 = Float.valueOf($f0);
                    View $r32 = (View) obj;
                    Log_OC.loadImage($r32, "it");
                    float $f02 = $r32.getZ();
                    Float $r5 = Float.valueOf($f02);
                    $i02 = C11703b.m10416a($r4, $r5);
                    return $i02;
                }
            });
            return $r1;
        }
        return m1053b(viewGroup);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002a */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m1053b(android.view.ViewGroup r14) {
        /*
            java.lang.String r0 = "$this$children"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            int r1 = r14.getChildCount()
            r3 = 0
            kotlin.i0.e r2 = kotlin.p491i0.C11839f.m10272j(r3, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r4
            r7 = r2
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r6 = r7
            r3 = 10
            int r1 = kotlin.p557z.C13722p.m3921o(r6, r3)
            r4.<init>(r1)
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r6 = r8
            java.util.Iterator r9 = r6.iterator()
        L26:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L3c
            r12 = r9
            kotlin.z.l0 r12 = (kotlin.p557z.AbstractC13711l0) r12
            r11 = r12
            int r1 = r11.mo4069b()
            android.view.View r13 = r14.getChildAt(r1)
            r5.add(r13)
            goto L26
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.Frame.m1053b(android.view.ViewGroup):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static final boolean m1052c(ViewGroup viewGroup) {
        Log_OC.getArray(viewGroup, "$this$clipChildrenCompat");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 18) {
            boolean $z0 = viewGroup.getClipChildren();
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static /* synthetic */ List m1051d(ViewGroup viewGroup, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        List $r0 = m1054a(viewGroup, $z0);
        return $r0;
    }
}
