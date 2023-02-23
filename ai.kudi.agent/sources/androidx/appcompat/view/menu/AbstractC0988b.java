package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import java.util.ArrayList;
/* compiled from: BaseMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0988b implements InterfaceC1014m {

    /* renamed from: A */
    private int f2795A;

    /* renamed from: c */
    protected Context f2796c;

    /* renamed from: d */
    protected Context f2797d;

    /* renamed from: e */
    protected C0999g f2798e;

    /* renamed from: f */
    protected LayoutInflater f2799f;

    /* renamed from: w */
    private InterfaceC1014m.InterfaceC1015a f2800w;

    /* renamed from: x */
    private int f2801x;

    /* renamed from: y */
    private int f2802y;

    /* renamed from: z */
    protected InterfaceC1016n f2803z;

    public AbstractC0988b(Context context, int i, int i2) {
        this.f2796c = context;
        this.f2799f = LayoutInflater.from(context);
        this.f2801x = i;
        this.f2802y = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2800w;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, z);
        }
    }

    /* renamed from: b */
    protected void m37582b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2803z).addView(view, i);
    }

    /* renamed from: c */
    public abstract void mo37252c(C1003i c1003i, InterfaceC1016n.InterfaceC1017a interfaceC1017a);

    /* renamed from: d */
    public InterfaceC1016n.InterfaceC1017a m37581d(ViewGroup viewGroup) {
        return (InterfaceC1016n.InterfaceC1017a) this.f2799f.inflate(this.f2802y, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo37251e(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: f */
    public InterfaceC1014m.InterfaceC1015a m37580f() {
        return this.f2800w;
    }

    /* renamed from: g */
    public View mo37250g(C1003i c1003i, View view, ViewGroup viewGroup) {
        InterfaceC1016n.InterfaceC1017a m37581d;
        if (view instanceof InterfaceC1016n.InterfaceC1017a) {
            m37581d = (InterfaceC1016n.InterfaceC1017a) view;
        } else {
            m37581d = m37581d(viewGroup);
        }
        mo37252c(c1003i, m37581d);
        return (View) m37581d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: h */
    public int mo26759h() {
        return this.f2795A;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2803z;
        if (viewGroup == null) {
            return;
        }
        C0999g c0999g = this.f2798e;
        int i = 0;
        if (c0999g != null) {
            c0999g.m37512t();
            ArrayList<C1003i> m37550G = this.f2798e.m37550G();
            int size = m37550G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1003i c1003i = m37550G.get(i3);
                if (mo37248t(i2, c1003i)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C1003i itemData = childAt instanceof InterfaceC1016n.InterfaceC1017a ? ((InterfaceC1016n.InterfaceC1017a) childAt).getItemData() : null;
                    View mo37250g = mo37250g(c1003i, childAt, viewGroup);
                    if (c1003i != itemData) {
                        mo37250g.setPressed(false);
                        mo37250g.jumpDrawablesToCurrentState();
                    }
                    if (mo37250g != childAt) {
                        m37582b(mo37250g, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo37251e(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: k */
    public boolean mo26756k(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: l */
    public boolean mo26755l(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: m */
    public void mo26754m(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        this.f2800w = interfaceC1015a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
        this.f2797d = context;
        LayoutInflater.from(context);
        this.f2798e = c0999g;
    }

    /* renamed from: p */
    public InterfaceC1016n mo37249p(ViewGroup viewGroup) {
        if (this.f2803z == null) {
            InterfaceC1016n interfaceC1016n = (InterfaceC1016n) this.f2799f.inflate(this.f2801x, viewGroup, false);
            this.f2803z = interfaceC1016n;
            interfaceC1016n.mo26852b(this.f2798e);
            mo26758i(true);
        }
        return this.f2803z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2800w;
        SubMenuC1023r subMenuC1023r2 = subMenuC1023r;
        if (interfaceC1015a != null) {
            if (subMenuC1023r == null) {
                subMenuC1023r2 = this.f2798e;
            }
            return interfaceC1015a.mo37236b(subMenuC1023r2);
        }
        return false;
    }

    /* renamed from: s */
    public void m37579s(int i) {
        this.f2795A = i;
    }

    /* renamed from: t */
    public abstract boolean mo37248t(int i, C1003i c1003i);
}
