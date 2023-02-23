package org.org.org.org.asm;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* loaded from: classes.dex */
public final class Attribute {

    /* renamed from: a */
    public static final Attribute f32301a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Attribute $r0 = new Attribute();
        f32301a = $r0;
    }

    private Attribute() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    private final Object m1166f(Object obj) throws NoSuchFieldException, IllegalAccessException {
        ClassWriter $r1 = ClassWriter.f32305c;
        Object $r2 = $r1.get("mRoots", obj);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Object put(Object obj) throws NoSuchFieldException, IllegalAccessException {
        ClassWriter $r1 = ClassWriter.f32305c;
        Object $r2 = $r1.get("mParams", obj);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Window m1168a(View view) {
        List $r3;
        List $r4;
        Log_OC.getArray(view, "rootView");
        String[] $r2 = {null, "com.android.internal.policy.PhoneWindow$DecorView", "com.android.internal.policy.impl.PhoneWindow$DecorView"};
        $r3 = C13726r.m3888h($r2);
        String[] $r22 = {"mWindow", "this$0", "this$0"};
        $r4 = C13726r.m3888h($r22);
        ClassWriter $r5 = ClassWriter.f32305c;
        Object $r6 = $r5.get(view, $r3, $r4, Window.class);
        Window $r7 = (Window) $r6;
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] m1167a(java.lang.Object r11) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        /*
            r10 = this;
            java.lang.String r0 = "globalWindowManager"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.org.org.org.asm.Attribute r10 = org.org.org.org.asm.Attribute.f32301a
            java.lang.Object r11 = r10.m1166f(r11)
            if (r11 == 0) goto L44
            r3 = r11
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2 = r3
            java.util.Iterator r4 = r2.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r11 = r4.next()
            if (r11 == 0) goto L2a
            r1.add(r11)
            goto L1a
        L2a:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            r6.<init>(r0)
            throw r6
        L32:
            r8 = 0
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object[] r7 = r1.toArray(r7)
            if (r7 == 0) goto L3c
            return r7
        L3c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r0)
            throw r6
        L44:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Attribute.m1167a(java.lang.Object):java.lang.Object[]");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View get(Object obj) throws NoSuchFieldException, IllegalAccessException {
        Log_OC.getArray(obj, "root");
        ClassWriter $r2 = ClassWriter.f32305c;
        Object $r1 = $r2.get("mView", obj);
        if ($r1 != null) {
            View $r3 = (View) $r1;
            return $r3;
        }
        NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type android.view.View");
        throw $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PopupWindow get(View view) {
        List $r4;
        List $r5;
        Log_OC.getArray(view, "rootView");
        String[] $r3 = {"android.widget.PopupWindow$PopupDecorView", "android.widget.PopupWindow$PopupViewContainer"};
        $r4 = C13726r.m3888h($r3);
        String[] $r32 = {"this$0", "this$0"};
        $r5 = C13726r.m3888h($r32);
        ClassWriter $r1 = ClassWriter.f32305c;
        Object $r6 = $r1.get(view, $r4, $r5, PopupWindow.class);
        PopupWindow $r7 = (PopupWindow) $r6;
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object get(Activity activity) throws NoSuchFieldException, IllegalAccessException {
        Log_OC.getArray(activity, "activity");
        ClassWriter $r2 = ClassWriter.f32305c;
        int $i0 = Build.VERSION.SDK_INT;
        String $r3 = $i0 <= 16 ? "mWindowManager" : "mGlobal";
        WindowManager $r4 = activity.getWindowManager();
        Log_OC.loadImage($r4, "activity.windowManager");
        Object $r5 = $r2.get($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowManager.LayoutParams[] read(java.lang.Object r15) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        /*
            r14 = this;
            java.lang.String r0 = "globalWindowManager"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.org.org.org.asm.Attribute r14 = org.org.org.org.asm.Attribute.f32301a
            java.lang.Object r15 = r14.put(r15)
            if (r15 == 0) goto L4c
            r3 = r15
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2 = r3
            java.util.Iterator r4 = r2.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r15 = r4.next()
            if (r15 == 0) goto L2e
            r7 = r15
            android.view.WindowManager$LayoutParams r7 = (android.view.WindowManager.LayoutParams) r7
            r6 = r7
            r1.add(r6)
            goto L1a
        L2e:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager.LayoutParams"
            r8.<init>(r0)
            throw r8
        L36:
            r10 = 0
            android.view.WindowManager$LayoutParams[] r9 = new android.view.WindowManager.LayoutParams[r10]
            java.lang.Object[] r11 = r1.toArray(r9)
            if (r11 == 0) goto L44
            r12 = r11
            android.view.WindowManager$LayoutParams[] r12 = (android.view.WindowManager.LayoutParams[]) r12
            r9 = r12
            return r9
        L44:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r0)
            throw r8
        L4c:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Attribute.read(java.lang.Object):android.view.WindowManager$LayoutParams[]");
    }
}
