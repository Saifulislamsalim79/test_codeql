package com.google.firebase.inappmessaging.display.internal;

import ai.kudi.agent.login.domain.LoginParams;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.display.internal.View$OnTouchListenerC6071p;
import com.google.firebase.inappmessaging.display.internal.p148q.AbstractC6079c;
/* compiled from: FiamWindowManager.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.g */
/* loaded from: classes2.dex */
public class C6048g {

    /* renamed from: a */
    private AbstractC6079c f14759a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiamWindowManager.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.g$a */
    /* loaded from: classes2.dex */
    public class C6049a implements View$OnTouchListenerC6071p.InterfaceC6076e {

        /* renamed from: a */
        final /* synthetic */ AbstractC6079c f14760a;

        C6049a(C6048g c6048g, AbstractC6079c abstractC6079c) {
            this.f14760a = abstractC6079c;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.View$OnTouchListenerC6071p.InterfaceC6076e
        /* renamed from: a */
        public boolean mo22797a(Object obj) {
            return true;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.View$OnTouchListenerC6071p.InterfaceC6076e
        /* renamed from: b */
        public void mo22796b(View view, Object obj) {
            if (this.f14760a.mo22783d() != null) {
                this.f14760a.mo22783d().onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiamWindowManager.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.g$b */
    /* loaded from: classes2.dex */
    public class C6050b extends View$OnTouchListenerC6071p {

        /* renamed from: G */
        final /* synthetic */ WindowManager.LayoutParams f14761G;

        /* renamed from: H */
        final /* synthetic */ WindowManager f14762H;

        /* renamed from: I */
        final /* synthetic */ AbstractC6079c f14763I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6050b(C6048g c6048g, View view, Object obj, View$OnTouchListenerC6071p.InterfaceC6076e interfaceC6076e, WindowManager.LayoutParams layoutParams, WindowManager windowManager, AbstractC6079c abstractC6079c) {
            super(view, obj, interfaceC6076e);
            this.f14761G = layoutParams;
            this.f14762H = windowManager;
            this.f14763I = abstractC6079c;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.View$OnTouchListenerC6071p
        /* renamed from: f */
        protected float mo22803f() {
            return this.f14761G.x;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.View$OnTouchListenerC6071p
        /* renamed from: i */
        protected void mo22800i(float f) {
            this.f14761G.x = (int) f;
            this.f14762H.updateViewLayout(this.f14763I.mo22767f(), this.f14761G);
        }
    }

    /* renamed from: b */
    private Point m22909b(Activity activity) {
        Point point = new Point();
        Display defaultDisplay = m22904g(activity).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        return point;
    }

    /* renamed from: c */
    private Rect m22908c(Activity activity) {
        Rect rect = new Rect();
        Rect m22905f = m22905f(activity);
        Point m22909b = m22909b(activity);
        rect.top = m22905f.top;
        rect.left = m22905f.left;
        rect.right = m22909b.x - m22905f.right;
        rect.bottom = m22909b.y - m22905f.bottom;
        return rect;
    }

    /* renamed from: d */
    private WindowManager.LayoutParams m22907d(C6057l c6057l, Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(c6057l.m22891A().intValue(), c6057l.m22865z().intValue(), LoginParams.PERMISSION_REQUEST_CODE, c6057l.m22866y().intValue(), -3);
        Rect m22908c = m22908c(activity);
        if ((c6057l.m22867x().intValue() & 48) == 48) {
            layoutParams.y = m22908c.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = c6057l.m22867x().intValue();
        layoutParams.windowAnimations = 0;
        return layoutParams;
    }

    /* renamed from: e */
    private View$OnTouchListenerC6071p m22906e(C6057l c6057l, AbstractC6079c abstractC6079c, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        C6049a c6049a = new C6049a(this, abstractC6079c);
        if (c6057l.m22891A().intValue() == -1) {
            return new View$OnTouchListenerC6071p(abstractC6079c.mo22769c(), null, c6049a);
        }
        return new C6050b(this, abstractC6079c.mo22769c(), null, c6049a, layoutParams, windowManager, abstractC6079c);
    }

    /* renamed from: f */
    private Rect m22905f(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: g */
    private WindowManager m22904g(Activity activity) {
        return (WindowManager) activity.getSystemService("window");
    }

    /* renamed from: a */
    public void m22910a(Activity activity) {
        if (m22903h()) {
            m22904g(activity).removeViewImmediate(this.f14759a.mo22767f());
            this.f14759a = null;
        }
    }

    /* renamed from: h */
    public boolean m22903h() {
        AbstractC6079c abstractC6079c = this.f14759a;
        if (abstractC6079c == null) {
            return false;
        }
        return abstractC6079c.mo22767f().isShown();
    }

    /* renamed from: i */
    public void m22902i(AbstractC6079c abstractC6079c, Activity activity) {
        if (m22903h()) {
            C6065m.m22817e("Fiam already active. Cannot show new Fiam.");
        } else if (activity.isFinishing()) {
            C6065m.m22817e("Activity is finishing or does not have valid window token. Cannot show FIAM.");
        } else {
            C6057l mo22770b = abstractC6079c.mo22770b();
            WindowManager.LayoutParams m22907d = m22907d(mo22770b, activity);
            WindowManager m22904g = m22904g(activity);
            m22904g.addView(abstractC6079c.mo22767f(), m22907d);
            Rect m22908c = m22908c(activity);
            C6065m.m22818d("Inset (top, bottom)", m22908c.top, m22908c.bottom);
            C6065m.m22818d("Inset (left, right)", m22908c.left, m22908c.right);
            if (abstractC6079c.mo22788a()) {
                abstractC6079c.mo22769c().setOnTouchListener(m22906e(mo22770b, abstractC6079c, m22904g, m22907d));
            }
            this.f14759a = abstractC6079c;
        }
    }
}
