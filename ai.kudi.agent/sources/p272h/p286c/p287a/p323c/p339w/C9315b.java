package p272h.p286c.p287a.p323c.p339w;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: ExpandableWidgetHelper.java */
/* renamed from: h.c.a.c.w.b */
/* loaded from: classes2.dex */
public final class C9315b {

    /* renamed from: a */
    private final View f21894a;

    /* renamed from: b */
    private boolean f21895b = false;

    /* renamed from: c */
    private int f21896c = 0;

    public C9315b(InterfaceC9314a interfaceC9314a) {
        this.f21894a = (View) interfaceC9314a;
    }

    /* renamed from: a */
    private void m15070a() {
        ViewParent parent = this.f21894a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m36543f(this.f21894a);
        }
    }

    /* renamed from: b */
    public int m15069b() {
        return this.f21896c;
    }

    /* renamed from: c */
    public boolean m15068c() {
        return this.f21895b;
    }

    /* renamed from: d */
    public void m15067d(Bundle bundle) {
        this.f21895b = bundle.getBoolean("expanded", false);
        this.f21896c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f21895b) {
            m15070a();
        }
    }

    /* renamed from: e */
    public Bundle m15066e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f21895b);
        bundle.putInt("expandedComponentIdHint", this.f21896c);
        return bundle;
    }

    /* renamed from: f */
    public void m15065f(int i) {
        this.f21896c = i;
    }
}
