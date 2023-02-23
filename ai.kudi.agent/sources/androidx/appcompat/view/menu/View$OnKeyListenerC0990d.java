package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.widget.C1100g0;
import androidx.appcompat.widget.InterfaceC1098f0;
import java.util.ArrayList;
import java.util.List;
import p201g.p202a.C7455d;
import p201g.p202a.C7458g;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes2.dex */
public final class View$OnKeyListenerC0990d extends AbstractC1011k implements InterfaceC1014m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: T */
    private static final int f2807T = C7458g.abc_cascading_menu_item_layout;

    /* renamed from: G */
    private View f2814G;

    /* renamed from: H */
    View f2815H;

    /* renamed from: J */
    private boolean f2817J;

    /* renamed from: K */
    private boolean f2818K;

    /* renamed from: L */
    private int f2819L;

    /* renamed from: M */
    private int f2820M;

    /* renamed from: O */
    private boolean f2822O;

    /* renamed from: P */
    private InterfaceC1014m.InterfaceC1015a f2823P;

    /* renamed from: Q */
    ViewTreeObserver f2824Q;

    /* renamed from: R */
    private PopupWindow.OnDismissListener f2825R;

    /* renamed from: S */
    boolean f2826S;

    /* renamed from: d */
    private final Context f2827d;

    /* renamed from: e */
    private final int f2828e;

    /* renamed from: f */
    private final int f2829f;

    /* renamed from: w */
    private final int f2830w;

    /* renamed from: x */
    private final boolean f2831x;

    /* renamed from: y */
    final Handler f2832y;

    /* renamed from: z */
    private final List<C0999g> f2833z = new ArrayList();

    /* renamed from: A */
    final List<C0995d> f2808A = new ArrayList();

    /* renamed from: B */
    final ViewTreeObserver.OnGlobalLayoutListener f2809B = new ViewTreeObserver$OnGlobalLayoutListenerC0991a();

    /* renamed from: C */
    private final View.OnAttachStateChangeListener f2810C = new View$OnAttachStateChangeListenerC0992b();

    /* renamed from: D */
    private final InterfaceC1098f0 f2811D = new C0993c();

    /* renamed from: E */
    private int f2812E = 0;

    /* renamed from: F */
    private int f2813F = 0;

    /* renamed from: N */
    private boolean f2821N = false;

    /* renamed from: I */
    private int f2816I = m37569G();

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0991a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0991a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0990d.this.mo37195b() || View$OnKeyListenerC0990d.this.f2808A.size() <= 0 || View$OnKeyListenerC0990d.this.f2808A.get(0).f2841a.m37212B()) {
                return;
            }
            View view = View$OnKeyListenerC0990d.this.f2815H;
            if (view != null && view.isShown()) {
                for (C0995d c0995d : View$OnKeyListenerC0990d.this.f2808A) {
                    c0995d.f2841a.mo37194c();
                }
                return;
            }
            View$OnKeyListenerC0990d.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* loaded from: classes2.dex */
    class View$OnAttachStateChangeListenerC0992b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0992b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0990d.this.f2824Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0990d.this.f2824Q = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0990d view$OnKeyListenerC0990d = View$OnKeyListenerC0990d.this;
                view$OnKeyListenerC0990d.f2824Q.removeGlobalOnLayoutListener(view$OnKeyListenerC0990d.f2809B);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* loaded from: classes2.dex */
    class C0993c implements InterfaceC1098f0 {

        /* compiled from: CascadingMenuPopup.java */
        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* loaded from: classes2.dex */
        class RunnableC0994a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C0995d f2837c;

            /* renamed from: d */
            final /* synthetic */ MenuItem f2838d;

            /* renamed from: e */
            final /* synthetic */ C0999g f2839e;

            RunnableC0994a(C0995d c0995d, MenuItem menuItem, C0999g c0999g) {
                this.f2837c = c0995d;
                this.f2838d = menuItem;
                this.f2839e = c0999g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0995d c0995d = this.f2837c;
                if (c0995d != null) {
                    View$OnKeyListenerC0990d.this.f2826S = true;
                    c0995d.f2842b.m37528e(false);
                    View$OnKeyListenerC0990d.this.f2826S = false;
                }
                if (this.f2838d.isEnabled() && this.f2838d.hasSubMenu()) {
                    this.f2839e.m37547N(this.f2838d, 4);
                }
            }
        }

        C0993c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC1098f0
        /* renamed from: e */
        public void mo37174e(C0999g c0999g, MenuItem menuItem) {
            View$OnKeyListenerC0990d.this.f2832y.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0990d.this.f2808A.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0999g == View$OnKeyListenerC0990d.this.f2808A.get(i).f2842b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            View$OnKeyListenerC0990d.this.f2832y.postAtTime(new RunnableC0994a(i2 < View$OnKeyListenerC0990d.this.f2808A.size() ? View$OnKeyListenerC0990d.this.f2808A.get(i2) : null, menuItem, c0999g), c0999g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC1098f0
        /* renamed from: h */
        public void mo37173h(C0999g c0999g, MenuItem menuItem) {
            View$OnKeyListenerC0990d.this.f2832y.removeCallbacksAndMessages(c0999g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes2.dex */
    public static class C0995d {

        /* renamed from: a */
        public final C1100g0 f2841a;

        /* renamed from: b */
        public final C0999g f2842b;

        /* renamed from: c */
        public final int f2843c;

        public C0995d(C1100g0 c1100g0, C0999g c0999g, int i) {
            this.f2841a = c1100g0;
            this.f2842b = c0999g;
            this.f2843c = i;
        }

        /* renamed from: a */
        public ListView m37566a() {
            return this.f2841a.mo37188p();
        }
    }

    public View$OnKeyListenerC0990d(Context context, View view, int i, int i2, boolean z) {
        this.f2827d = context;
        this.f2814G = view;
        this.f2829f = i;
        this.f2830w = i2;
        this.f2831x = z;
        Resources resources = context.getResources();
        this.f2828e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7455d.abc_config_prefDialogWidth));
        this.f2832y = new Handler();
    }

    /* renamed from: C */
    private C1100g0 m37573C() {
        C1100g0 c1100g0 = new C1100g0(this.f2827d, null, this.f2829f, this.f2830w);
        c1100g0.m37176T(this.f2811D);
        c1100g0.m37202L(this);
        c1100g0.m37203K(this);
        c1100g0.m37210D(this.f2814G);
        c1100g0.m37207G(this.f2813F);
        c1100g0.m37204J(true);
        c1100g0.m37205I(2);
        return c1100g0;
    }

    /* renamed from: D */
    private int m37572D(C0999g c0999g) {
        int size = this.f2808A.size();
        for (int i = 0; i < size; i++) {
            if (c0999g == this.f2808A.get(i).f2842b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m37571E(C0999g c0999g, C0999g c0999g2) {
        int size = c0999g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0999g.getItem(i);
            if (item.hasSubMenu() && c0999g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m37570F(C0995d c0995d, C0999g c0999g) {
        C0998f c0998f;
        int i;
        int firstVisiblePosition;
        MenuItem m37571E = m37571E(c0995d.f2842b, c0999g);
        if (m37571E == null) {
            return null;
        }
        ListView m37566a = c0995d.m37566a();
        ListAdapter adapter = m37566a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0998f = (C0998f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0998f = (C0998f) adapter;
            i = 0;
        }
        int count = c0998f.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (m37571E == c0998f.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m37566a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m37566a.getChildCount()) {
            return m37566a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    private int m37569G() {
        return C7759x.m17563C(this.f2814G) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    private int m37568H(int i) {
        List<C0995d> list = this.f2808A;
        ListView m37566a = list.get(list.size() - 1).m37566a();
        int[] iArr = new int[2];
        m37566a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2815H.getWindowVisibleDisplayFrame(rect);
        return this.f2816I == 1 ? (iArr[0] + m37566a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: I */
    private void m37567I(C0999g c0999g) {
        C0995d c0995d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f2827d);
        C0998f c0998f = new C0998f(c0999g, from, this.f2831x, f2807T);
        if (!mo37195b() && this.f2821N) {
            c0998f.m37556d(true);
        } else if (mo37195b()) {
            c0998f.m37556d(AbstractC1011k.m37476A(c0999g));
        }
        int m37472g = AbstractC1011k.m37472g(c0998f, null, this.f2827d, this.f2828e);
        C1100g0 m37573C = m37573C();
        m37573C.mo36987o(c0998f);
        m37573C.m37208F(m37472g);
        m37573C.m37207G(this.f2813F);
        if (this.f2808A.size() > 0) {
            List<C0995d> list = this.f2808A;
            c0995d = list.get(list.size() - 1);
            view = m37570F(c0995d, c0999g);
        } else {
            c0995d = null;
            view = null;
        }
        if (view != null) {
            m37573C.m37175U(false);
            m37573C.m37178R(null);
            int m37568H = m37568H(m37472g);
            boolean z = m37568H == 1;
            this.f2816I = m37568H;
            if (Build.VERSION.SDK_INT >= 26) {
                m37573C.m37210D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2814G.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2813F & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2814G.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2813F & 5) == 5) {
                if (!z) {
                    m37472g = view.getWidth();
                    i3 = i - m37472g;
                }
                i3 = i + m37472g;
            } else {
                if (z) {
                    m37472g = view.getWidth();
                    i3 = i + m37472g;
                }
                i3 = i - m37472g;
            }
            m37573C.m37192f(i3);
            m37573C.m37201M(true);
            m37573C.m37190k(i2);
        } else {
            if (this.f2817J) {
                m37573C.m37192f(this.f2819L);
            }
            if (this.f2818K) {
                m37573C.m37190k(this.f2820M);
            }
            m37573C.m37206H(m37473f());
        }
        this.f2808A.add(new C0995d(m37573C, c0999g, this.f2816I));
        m37573C.mo37194c();
        ListView mo37188p = m37573C.mo37188p();
        mo37188p.setOnKeyListener(this);
        if (c0995d == null && this.f2822O && c0999g.m37507z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C7458g.abc_popup_menu_header_item_layout, (ViewGroup) mo37188p, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0999g.m37507z());
            mo37188p.addHeaderView(frameLayout, null, false);
            m37573C.mo37194c();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        int m37572D = m37572D(c0999g);
        if (m37572D < 0) {
            return;
        }
        int i = m37572D + 1;
        if (i < this.f2808A.size()) {
            this.f2808A.get(i).f2842b.m37528e(false);
        }
        C0995d remove = this.f2808A.remove(m37572D);
        remove.f2842b.m37544Q(this);
        if (this.f2826S) {
            remove.f2841a.m37177S(null);
            remove.f2841a.m37209E(0);
        }
        remove.f2841a.dismiss();
        int size = this.f2808A.size();
        if (size > 0) {
            this.f2816I = this.f2808A.get(size - 1).f2843c;
        } else {
            this.f2816I = m37569G();
        }
        if (size != 0) {
            if (z) {
                this.f2808A.get(0).f2842b.m37528e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2823P;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2824Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2824Q.removeGlobalOnLayoutListener(this.f2809B);
            }
            this.f2824Q = null;
        }
        this.f2815H.removeOnAttachStateChangeListener(this.f2810C);
        this.f2825R.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: b */
    public boolean mo37195b() {
        return this.f2808A.size() > 0 && this.f2808A.get(0).f2841a.mo37195b();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: c */
    public void mo37194c() {
        if (mo37195b()) {
            return;
        }
        for (C0999g c0999g : this.f2833z) {
            m37567I(c0999g);
        }
        this.f2833z.clear();
        View view = this.f2814G;
        this.f2815H = view;
        if (view != null) {
            boolean z = this.f2824Q == null;
            ViewTreeObserver viewTreeObserver = this.f2815H.getViewTreeObserver();
            this.f2824Q = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2809B);
            }
            this.f2815H.addOnAttachStateChangeListener(this.f2810C);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: d */
    public void mo37456d(C0999g c0999g) {
        c0999g.m37532c(this, this.f2827d);
        if (mo37195b()) {
            m37567I(c0999g);
        } else {
            this.f2833z.add(c0999g);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    public void dismiss() {
        int size = this.f2808A.size();
        if (size > 0) {
            C0995d[] c0995dArr = (C0995d[]) this.f2808A.toArray(new C0995d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0995d c0995d = c0995dArr[i];
                if (c0995d.f2841a.mo37195b()) {
                    c0995d.f2841a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: e */
    protected boolean mo37474e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        for (C0995d c0995d : this.f2808A) {
            AbstractC1011k.m37475B(c0995d.m37566a().getAdapter()).notifyDataSetChanged();
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
        this.f2823P = interfaceC1015a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0995d c0995d;
        int size = this.f2808A.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0995d = null;
                break;
            }
            c0995d = this.f2808A.get(i);
            if (!c0995d.f2841a.mo37195b()) {
                break;
            }
            i++;
        }
        if (c0995d != null) {
            c0995d.f2842b.m37528e(false);
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
        if (this.f2808A.isEmpty()) {
            return null;
        }
        List<C0995d> list = this.f2808A;
        return list.get(list.size() - 1).m37566a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        for (C0995d c0995d : this.f2808A) {
            if (subMenuC1023r == c0995d.f2842b) {
                c0995d.m37566a().requestFocus();
                return true;
            }
        }
        if (subMenuC1023r.hasVisibleItems()) {
            mo37456d(subMenuC1023r);
            InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2823P;
            if (interfaceC1015a != null) {
                interfaceC1015a.mo37236b(subMenuC1023r);
            }
            return true;
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
        if (this.f2814G != view) {
            this.f2814G = view;
            this.f2813F = C7693e.m17805b(this.f2812E, C7759x.m17563C(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: u */
    public void mo37454u(boolean z) {
        this.f2821N = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: v */
    public void mo37453v(int i) {
        if (this.f2812E != i) {
            this.f2812E = i;
            this.f2813F = C7693e.m17805b(i, C7759x.m17563C(this.f2814G));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: w */
    public void mo37452w(int i) {
        this.f2817J = true;
        this.f2819L = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: x */
    public void mo37451x(PopupWindow.OnDismissListener onDismissListener) {
        this.f2825R = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: y */
    public void mo37450y(boolean z) {
        this.f2822O = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1011k
    /* renamed from: z */
    public void mo37449z(int i) {
        this.f2818K = true;
        this.f2820M = i;
    }
}
