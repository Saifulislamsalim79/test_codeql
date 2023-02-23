package org.org.org.org.android.util.common;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.intercom.android.sdk.annotations.SeenState;
import java.lang.ref.WeakReference;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.asm.Type;
/* renamed from: org.org.org.org.android.util.common.i */
/* loaded from: classes.dex */
public final class C14555i {

    /* renamed from: a */
    public WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f32172a;

    /* renamed from: f */
    public boolean f32173f;

    /* renamed from: g */
    public C14544h f32174g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14544h m1279a(int i, Rect rect, boolean z) {
        if (!z) {
            C14544h $r2 = this.f32174g;
            return $r2 != null ? $r2 : new C14544h();
        }
        int $i0 = rect.left;
        int $i1 = rect.bottom;
        int $i3 = rect.right;
        int $i2 = i - $i1;
        this.f32174g = new C14544h($i0, $i1, $i3 - $i0, $i2);
        C14544h $r3 = this.f32174g;
        Log_OC.append($r3);
        return new C14544h($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final String m1272b(boolean z) {
        return z ? "show" : SeenState.HIDE;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private final ViewTreeObserver.OnGlobalLayoutListener m1271c(final InterfaceC14553d interfaceC14553d, final View view) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.org.org.org.android.util.common.IonicKeyboard$1
            public final Rect this$0;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                Rect $r4 = new Rect();
                this.this$0 = $r4;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View $r2 = view;
                Rect $r3 = this.this$0;
                $r2.getWindowVisibleDisplayFrame($r3);
                View $r22 = view;
                View $r23 = $r22.getRootView();
                Log_OC.loadImage($r23, "activityRoot.rootView");
                int $i0 = $r23.getHeight();
                Rect $r32 = this.this$0;
                int $i1 = $r32.height();
                double $d0 = $i0 - $i1;
                double $d1 = $i0;
                Double.isNaN($d1);
                boolean $z0 = $d0 > $d1 * 0.15d;
                C14555i $r1 = C14555i.this;
                boolean $z1 = $r1.f32173f;
                if ($z0 == $z1) {
                    return;
                }
                C14555i $r12 = C14555i.this;
                $r12.f32173f = $z0;
                InterfaceC14553d $r4 = interfaceC14553d;
                C14555i $r13 = C14555i.this;
                String $r5 = $r13.m1272b($z0);
                C14555i $r14 = C14555i.this;
                Rect $r33 = this.this$0;
                C14544h $r6 = $r14.m1279a($i0, $r33, $z0);
                $r4.mo1210d($r5, $r6);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final int m1277a(Activity activity, InterfaceC14553d interfaceC14553d) {
        Log_OC.getArray(interfaceC14553d, "listener");
        if (activity == null) {
            return 1;
        }
        Type $r3 = Type.f32312c;
        View $r4 = $r3.get(activity);
        if ($r4 != null) {
            ViewTreeObserver.OnGlobalLayoutListener $r5 = m1271c(interfaceC14553d, $r4);
            ViewTreeObserver $r6 = $r4.getViewTreeObserver();
            $r6.addOnGlobalLayoutListener($r5);
            WeakReference $r7 = new WeakReference($r5);
            this.f32172a = $r7;
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1278a(Activity activity) {
        ViewTreeObserver.OnGlobalLayoutListener $r5;
        ViewTreeObserver $r7;
        Log_OC.getArray(activity, "activity");
        WeakReference $r3 = this.f32172a;
        if ($r3 != null) {
            if ($r3 != null) {
                Object $r4 = $r3.get();
                $r5 = (ViewTreeObserver.OnGlobalLayoutListener) $r4;
            } else {
                $r5 = null;
            }
            Type $r1 = Type.f32312c;
            View $r6 = $r1.get(activity);
            if ($r6 != null && ($r7 = $r6.getViewTreeObserver()) != null) {
                $r7.removeOnGlobalLayoutListener($r5);
            }
            WeakReference $r32 = this.f32172a;
            Log_OC.append($r32);
            $r32.clear();
            this.f32172a = null;
        }
    }
}
