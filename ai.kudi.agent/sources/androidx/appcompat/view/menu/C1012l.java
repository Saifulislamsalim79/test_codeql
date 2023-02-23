package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC1014m;
import p201g.p202a.C7455d;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7759x;
/* compiled from: MenuPopupHelper.java */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes2.dex */
public class C1012l {

    /* renamed from: a */
    private final Context f2936a;

    /* renamed from: b */
    private final C0999g f2937b;

    /* renamed from: c */
    private final boolean f2938c;

    /* renamed from: d */
    private final int f2939d;

    /* renamed from: e */
    private final int f2940e;

    /* renamed from: f */
    private View f2941f;

    /* renamed from: g */
    private int f2942g;

    /* renamed from: h */
    private boolean f2943h;

    /* renamed from: i */
    private InterfaceC1014m.InterfaceC1015a f2944i;

    /* renamed from: j */
    private AbstractC1011k f2945j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f2946k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f2947l;

    /* compiled from: MenuPopupHelper.java */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes2.dex */
    class C1013a implements PopupWindow.OnDismissListener {
        C1013a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1012l.this.mo37238e();
        }
    }

    public C1012l(Context context, C0999g c0999g, View view, boolean z, int i) {
        this(context, c0999g, view, z, i, 0);
    }

    /* renamed from: a */
    private AbstractC1011k m37470a() {
        AbstractC1011k view$OnKeyListenerC1020q;
        Display defaultDisplay = ((WindowManager) this.f2936a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f2936a.getResources().getDimensionPixelSize(C7455d.abc_cascading_menus_min_smallest_width)) {
            view$OnKeyListenerC1020q = new View$OnKeyListenerC0990d(this.f2936a, this.f2941f, this.f2939d, this.f2940e, this.f2938c);
        } else {
            view$OnKeyListenerC1020q = new View$OnKeyListenerC1020q(this.f2936a, this.f2937b, this.f2941f, this.f2939d, this.f2940e, this.f2938c);
        }
        view$OnKeyListenerC1020q.mo37456d(this.f2937b);
        view$OnKeyListenerC1020q.mo37451x(this.f2947l);
        view$OnKeyListenerC1020q.mo37455s(this.f2941f);
        view$OnKeyListenerC1020q.mo26754m(this.f2944i);
        view$OnKeyListenerC1020q.mo37454u(this.f2943h);
        view$OnKeyListenerC1020q.mo37453v(this.f2942g);
        return view$OnKeyListenerC1020q;
    }

    /* renamed from: l */
    private void m37460l(int i, int i2, boolean z, boolean z2) {
        AbstractC1011k m37468c = m37468c();
        m37468c.mo37450y(z2);
        if (z) {
            if ((C7693e.m17805b(this.f2942g, C7759x.m17563C(this.f2941f)) & 7) == 5) {
                i -= this.f2941f.getWidth();
            }
            m37468c.mo37452w(i);
            m37468c.mo37449z(i2);
            int i3 = (int) ((this.f2936a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m37468c.m37471t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m37468c.mo37194c();
    }

    /* renamed from: b */
    public void m37469b() {
        if (m37467d()) {
            this.f2945j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC1011k m37468c() {
        if (this.f2945j == null) {
            this.f2945j = m37470a();
        }
        return this.f2945j;
    }

    /* renamed from: d */
    public boolean m37467d() {
        AbstractC1011k abstractC1011k = this.f2945j;
        return abstractC1011k != null && abstractC1011k.mo37195b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37238e() {
        this.f2945j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2946k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m37466f(View view) {
        this.f2941f = view;
    }

    /* renamed from: g */
    public void m37465g(boolean z) {
        this.f2943h = z;
        AbstractC1011k abstractC1011k = this.f2945j;
        if (abstractC1011k != null) {
            abstractC1011k.mo37454u(z);
        }
    }

    /* renamed from: h */
    public void m37464h(int i) {
        this.f2942g = i;
    }

    /* renamed from: i */
    public void m37463i(PopupWindow.OnDismissListener onDismissListener) {
        this.f2946k = onDismissListener;
    }

    /* renamed from: j */
    public void m37462j(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        this.f2944i = interfaceC1015a;
        AbstractC1011k abstractC1011k = this.f2945j;
        if (abstractC1011k != null) {
            abstractC1011k.mo26754m(interfaceC1015a);
        }
    }

    /* renamed from: k */
    public void m37461k() {
        if (!m37459m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m37459m() {
        if (m37467d()) {
            return true;
        }
        if (this.f2941f == null) {
            return false;
        }
        m37460l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m37458n(int i, int i2) {
        if (m37467d()) {
            return true;
        }
        if (this.f2941f == null) {
            return false;
        }
        m37460l(i, i2, true, true);
        return true;
    }

    public C1012l(Context context, C0999g c0999g, View view, boolean z, int i, int i2) {
        this.f2942g = 8388611;
        this.f2947l = new C1013a();
        this.f2936a = context;
        this.f2937b = c0999g;
        this.f2941f = view;
        this.f2938c = z;
        this.f2939d = i;
        this.f2940e = i2;
    }
}
