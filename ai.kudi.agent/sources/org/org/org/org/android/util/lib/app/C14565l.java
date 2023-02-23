package org.org.org.org.android.util.lib.app;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.http.C14562i;
import org.org.org.org.android.util.http.ClassWriter;
import org.org.org.org.android.util.lib.Config;
import org.org.org.org.android.util.lib.InterfaceC14567f;
import org.org.org.org.android.util.lib.InterfaceC14568i;
import org.org.org.org.android.util.lib.Type;
/* renamed from: org.org.org.org.android.util.lib.app.l */
/* loaded from: classes.dex */
public final class C14565l extends Type {

    /* renamed from: b */
    public final Window f32264b;

    /* renamed from: g */
    public final View f32265g;

    public C14565l(Window window, View view) {
        Log_OC.getArray(window, "window");
        this.f32264b = window;
        this.f32265g = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.lib.Type
    /* renamed from: a */
    public int mo1202a(final InterfaceC14567f interfaceC14567f, final InterfaceC14568i interfaceC14568i, final Config config) {
        WeakReference $r10;
        Log_OC.getArray(interfaceC14567f, "multitouchCallback");
        Log_OC.getArray(interfaceC14568i, "gestureCallback");
        Log_OC.getArray(config, "attachmentCallback");
        Window $r7 = this.f32264b;
        final Window.Callback $r5 = $r7.getCallback();
        boolean $z0 = $r5 instanceof ActionBarActivityDelegateICS$WindowCallbackWrapper;
        if ($z0) {
            return 1;
        }
        Window $r72 = this.f32264b;
        Log_OC.loadImage($r5, "localCallback");
        Window $r8 = this.f32264b;
        final WeakReference $r3 = new WeakReference($r8);
        View $r9 = this.f32265g;
        if ($r9 == null) {
            $r10 = null;
        } else {
            View $r92 = this.f32265g;
            $r10 = new WeakReference($r92);
        }
        final WeakReference weakReference = $r10;
        $r72.setCallback(new FragmentActivity($r5, interfaceC14567f, interfaceC14568i, config, $r3, weakReference) { // from class: org.org.org.org.android.util.lib.app.ActionBarActivityDelegateICS$WindowCallbackWrapper
            public final ClassWriter renderer;
            public final Config this$0;
            public final WeakReference<Window> view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                super($r5);
                Log_OC.getArray($r5, "callback");
                Log_OC.getArray(interfaceC14567f, "multitouchCallback");
                Log_OC.getArray(interfaceC14568i, "gestureCallback");
                Log_OC.getArray(config, "attachmentCallback");
                Log_OC.getArray($r3, "weakWindow");
                this.this$0 = config;
                this.view = $r3;
                C14562i $r82 = new C14562i(weakReference, interfaceC14567f, interfaceC14568i);
                ClassWriter $r73 = new ClassWriter($r82);
                this.renderer = $r73;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.android.util.lib.app.FragmentActivity, android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                Log_OC.getArray(motionEvent, "event");
                ClassWriter $r32 = this.renderer;
                try {
                    $r32.onTouchEvent(motionEvent);
                } catch (Exception e) {
                }
                boolean $z02 = super.dispatchTouchEvent(motionEvent);
                return $z02;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.android.util.lib.app.FragmentActivity, android.view.Window.Callback
            public void onAttachedToWindow() {
                WeakReference $r32 = this.view;
                Object $r2 = $r32.get();
                Window $r4 = (Window) $r2;
                if ($r4 != null) {
                    Config $r1 = this.this$0;
                    Log_OC.loadImage($r4, "it");
                    $r1.update($r4);
                }
                super.onAttachedToWindow();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.android.util.lib.app.FragmentActivity, android.view.Window.Callback
            public void onDetachedFromWindow() {
                ClassWriter $r32 = this.renderer;
                $r32.visitInnerClass();
                WeakReference $r4 = this.view;
                Object $r2 = $r4.get();
                Window $r52 = (Window) $r2;
                if ($r52 != null) {
                    Config $r1 = this.this$0;
                    Log_OC.loadImage($r52, "it");
                    $r1.clear($r52);
                }
                super.onDetachedFromWindow();
            }
        });
        return 0;
    }
}
