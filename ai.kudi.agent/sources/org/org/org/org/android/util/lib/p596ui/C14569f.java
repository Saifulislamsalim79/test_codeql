package org.org.org.org.android.util.lib.p596ui;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.http.C14562i;
import org.org.org.org.android.util.lib.Config;
import org.org.org.org.android.util.lib.InterfaceC14567f;
import org.org.org.org.android.util.lib.InterfaceC14568i;
import org.org.org.org.android.util.lib.Type;
import org.org.org.org.asm.ClassWriter;
/* renamed from: org.org.org.org.android.util.lib.ui.f */
/* loaded from: classes.dex */
public final class C14569f extends Type {

    /* renamed from: a */
    public final PopupWindow f32266a;

    /* renamed from: h */
    public final View f32267h;

    public C14569f(PopupWindow popupWindow, View view) {
        Log_OC.getArray(popupWindow, "popupWindow");
        this.f32266a = popupWindow;
        this.f32267h = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private final View.OnTouchListener m1201c() throws NoSuchFieldException, IllegalAccessException {
        ClassWriter $r2 = ClassWriter.f32305c;
        PopupWindow $r3 = this.f32266a;
        Object $r1 = $r2.get("mTouchInterceptor", $r3);
        if ($r1 != null) {
            View.OnTouchListener $r4 = (View.OnTouchListener) $r1;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(View.OnTouchListener onTouchListener) {
        PopupWindow $r2 = this.f32266a;
        $r2.setTouchInterceptor(onTouchListener);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.Type
    /* renamed from: a */
    public int mo1202a(final InterfaceC14567f interfaceC14567f, final InterfaceC14568i interfaceC14568i, Config config) {
        final WeakReference $r8;
        Log_OC.getArray(interfaceC14567f, "multitouchCallback");
        Log_OC.getArray(interfaceC14568i, "gestureCallback");
        Log_OC.getArray(config, "attachmentCallback");
        try {
            final View.OnTouchListener $r3 = m1201c();
            boolean $z0 = $r3 instanceof MainActivity$4;
            if ($z0) {
                return 1;
            }
            View $r2 = this.f32267h;
            if ($r2 == null) {
                $r8 = null;
            } else {
                View $r22 = this.f32267h;
                $r8 = new WeakReference($r22);
            }
            close(new View.OnTouchListener($r3, interfaceC14567f, interfaceC14568i, $r8) { // from class: org.org.org.org.android.util.lib.ui.MainActivity$4
                public final org.org.org.org.android.util.http.ClassWriter val$context;
                public final View.OnTouchListener val$id;

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                {
                    Log_OC.getArray(interfaceC14567f, "multitouchCallback");
                    Log_OC.getArray(interfaceC14568i, "gestureCallback");
                    this.val$id = $r3;
                    C14562i $r6 = new C14562i($r8, interfaceC14567f, interfaceC14568i);
                    org.org.org.org.android.util.http.ClassWriter $r5 = new org.org.org.org.android.util.http.ClassWriter($r6);
                    this.val$context = $r5;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Log_OC.getArray(view, "v");
                    Log_OC.getArray(motionEvent, "event");
                    org.org.org.org.android.util.http.ClassWriter $r32 = this.val$context;
                    $r32.onTouchEvent(motionEvent);
                    View.OnTouchListener $r4 = this.val$id;
                    if ($r4 != null) {
                        boolean $z02 = $r4.onTouch(view, motionEvent);
                        return $z02;
                    }
                    return false;
                }
            });
            return 0;
        } catch (Exception e) {
            return 2;
        }
    }
}
