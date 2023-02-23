package p201g.p266v;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewGroupUtilsApi14.java */
/* renamed from: g.v.y */
/* loaded from: classes2.dex */
class C8183y {

    /* renamed from: a */
    private static LayoutTransition f19636a;

    /* renamed from: b */
    private static Field f19637b;

    /* renamed from: c */
    private static boolean f19638c;

    /* renamed from: d */
    private static Method f19639d;

    /* renamed from: e */
    private static boolean f19640e;

    /* compiled from: ViewGroupUtilsApi14.java */
    /* renamed from: g.v.y$a */
    /* loaded from: classes2.dex */
    static class C8184a extends LayoutTransition {
        C8184a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m16566a(LayoutTransition layoutTransition) {
        if (!f19640e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f19639d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f19640e = true;
        }
        Method method = f19639d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16565b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            g.v.y$a r0 = new g.v.y$a
            r0.<init>()
            p201g.p266v.C8183y.f19636a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            m16566a(r6)
        L39:
            android.animation.LayoutTransition r0 = p201g.p266v.C8183y.f19636a
            if (r6 == r0) goto L42
            int r0 = p201g.p266v.C8151j.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = p201g.p266v.C8183y.f19636a
            r5.setLayoutTransition(r6)
            goto L96
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = p201g.p266v.C8183y.f19638c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            p201g.p266v.C8183y.f19637b = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            p201g.p266v.C8183y.f19638c = r1
        L66:
            java.lang.reflect.Field r6 = p201g.p266v.C8183y.f19637b
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = p201g.p266v.C8183y.f19637b     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = p201g.p266v.C8151j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L96
            int r0 = p201g.p266v.C8151j.transition_layout_save
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p266v.C8183y.m16565b(android.view.ViewGroup, boolean):void");
    }
}
