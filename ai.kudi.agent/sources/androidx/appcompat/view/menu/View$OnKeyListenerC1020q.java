package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.widget.C1100g0;
import p201g.p202a.C7455d;
import p201g.p202a.C7458g;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes2.dex */
public final class View$OnKeyListenerC1020q extends AbstractC1011k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC1014m, View.OnKeyListener {

    /* renamed from: N */
    private static final int f2950N = C7458g.abc_popup_menu_item_layout;

    /* renamed from: A */
    final C1100g0 f2951A;

    /* renamed from: D */
    private PopupWindow.OnDismissListener f2954D;

    /* renamed from: E */
    private View f2955E;

    /* renamed from: F */
    View f2956F;

    /* renamed from: G */
    private InterfaceC1014m.InterfaceC1015a f2957G;

    /* renamed from: H */
    ViewTreeObserver f2958H;

    /* renamed from: I */
    private boolean f2959I;

    /* renamed from: J */
    private boolean f2960J;

    /* renamed from: K */
    private int f2961K;

    /* renamed from: M */
    private boolean f2963M;

    /* renamed from: d */
    private final Context f2964d;

    /* renamed from: e */
    private final C0999g f2965e;

    /* renamed from: f */
    private final C0998f f2966f;

    /* renamed from: w */
    private final boolean f2967w;

    /* renamed from: x */
    private final int f2968x;

    /* renamed from: y */
    private final int f2969y;

    /* renamed from: z */
    private final int f2970z;

    /* renamed from: B */
    final ViewTreeObserver.OnGlobalLayoutListener f2952B = new ViewTreeObserver$OnGlobalLayoutListenerC1021a();

    /* renamed from: C */
    private final View.OnAttachStateChangeListener f2953C = new View$OnAttachStateChangeListenerC1022b();

    /* renamed from: L */
    private int f2962L = 0;

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC1021a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC1021a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC1020q.this.mo37195b() || View$OnKeyListenerC1020q.this.f2951A.m37212B()) {
                return;
            }
            View view = View$OnKeyListenerC1020q.this.f2956F;
            if (view != null && view.isShown()) {
                View$OnKeyListenerC1020q.this.f2951A.mo37194c();
            } else {
                View$OnKeyListenerC1020q.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* loaded from: classes2.dex */
    class View$OnAttachStateChangeListenerC1022b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC1022b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC1020q.this.f2958H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC1020q.this.f2958H = view.getViewTreeObserver();
                }
                View$OnKeyListenerC1020q view$OnKeyListenerC1020q = View$OnKeyListenerC1020q.this;
                view$OnKeyListenerC1020q.f2958H.removeGlobalOnLayoutListener(view$OnKeyListenerC1020q.f2952B);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC1020q(Context context, C0999g c0999g, View view, int i, int i2, boolean z) {
        this.f2964d = context;
        this.f2965e = c0999g;
        this.f2967w = z;
        this.f2966f = new C0998f(c0999g, LayoutInflater.from(context), this.f2967w, f2950N);
        this.f2969y = i;
        this.f2970z = i2;
        Resources resources = context.getResources();
        this.f2968x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7455d.abc_config_prefDialogWidth));
        this.f2955E = view;
        this.f2951A = new C1100g0(this.f2964d, null, this.f2969y, this.f2970z);
        c0999g.m37532c(this, context);
    }

    /* renamed from: C */
    private boolean m37457C() {
        View view;
        if (mo37195b()) {
            return true;
        }
        if (this.f2959I || (view = this.f2955E) == null) {
            return false;
        }
        this.f2956F = view;
        this.f2951A.m37203K(this);
        this.f2951A.m37202L(this);
        this.f2951A.m37204J(true);
        View view2 = this.f2956F;
        boolean z = this.f2958H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2958H = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2952B);
        }
        view2.addOnAttachStateChangeListener(this.f2953C);
        this.f2951A.m37210D(view2);
        this.f2951A.m37207G(this.f2962L);
        if (!this.f2960J) {
            this.f2961K = AbstractC1011k.m37472g(this.f2966f, null, this.f2964d, this.f2968x);
            this.f2960J = true;
        }
        this.f2951A.m37208F(this.f2961K);
        this.f2951A.m37205I(2);
        this.f2951A.m37206H(m37473f());
        this.f2951A.mo37194c();
        ListView mo37188p = this.f2951A.mo37188p();
        mo37188p.setOnKeyListener(this);
        if (this.f2963M && this.f2965e.m37507z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2964d).inflate(C7458g.abc_popup_menu_header_item_layout, (ViewGroup) mo37188p, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2965e.m37507z());
            }
            frameLayout.setEnabled(false);
            mo37188p.addHeaderView(frameLayout, null, false);
        }
        this.f2951A.mo36987o(this.f2966f);
        this.f2951A.mo37194c();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        if (c0999g != this.f2965e) {
            return;
        }
        dismiss();
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2957G;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: b */
    public boolean mo37195b() {
        return !this.f2959I && this.f2951A.mo37195b();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: c */
    public void mo37194c() {
        if (!m37457C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: d */
    public void mo37456d(C0999g c0999g) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    public void dismiss() {
        if (mo37195b()) {
            this.f2951A.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        this.f2960J = false;
        C0998f c0998f = this.f2966f;
        if (c0998f != null) {
            c0998f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: j */
    public boolean mo26757j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: m */
    public void mo26754m(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        this.f2957G = interfaceC1015a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2959I = true;
        this.f2965e.close();
        ViewTreeObserver viewTreeObserver = this.f2958H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2958H = this.f2956F.getViewTreeObserver();
            }
            this.f2958H.removeGlobalOnLayoutListener(this.f2952B);
            this.f2958H = null;
        }
        this.f2956F.removeOnAttachStateChangeListener(this.f2953C);
        PopupWindow.OnDismissListener onDismissListener = this.f2954D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: p */
    public ListView mo37188p() {
        return this.f2951A.mo37188p();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        if (subMenuC1023r.hasVisibleItems()) {
            C1012l c1012l = new C1012l(this.f2964d, subMenuC1023r, this.f2956F, this.f2967w, this.f2969y, this.f2970z);
            c1012l.m37462j(this.f2957G);
            c1012l.m37465g(AbstractC1011k.m37476A(subMenuC1023r));
            c1012l.m37463i(this.f2954D);
            this.f2954D = null;
            this.f2965e.m37528e(false);
            int m37193d = this.f2951A.m37193d();
            int m37189n = this.f2951A.m37189n();
            if ((Gravity.getAbsoluteGravity(this.f2962L, C7759x.m17563C(this.f2955E)) & 7) == 5) {
                m37193d += this.f2955E.getWidth();
            }
            if (c1012l.m37458n(m37193d, m37189n)) {
                InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2957G;
                if (interfaceC1015a != null) {
                    interfaceC1015a.mo37236b(subMenuC1023r);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: r */
    public Parcelable mo26749r() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: s */
    public void mo37455s(View view) {
        this.f2955E = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: u */
    public void mo37454u(boolean z) {
        this.f2966f.m37556d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: v */
    public void mo37453v(int i) {
        this.f2962L = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: w */
    public void mo37452w(int i) {
        this.f2951A.m37192f(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: x */
    public void mo37451x(PopupWindow.OnDismissListener onDismissListener) {
        this.f2954D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: y */
    public void mo37450y(boolean z) {
        this.f2963M = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: z */
    public void mo37449z(int i) {
        this.f2951A.m37190k(i);
    }
}
