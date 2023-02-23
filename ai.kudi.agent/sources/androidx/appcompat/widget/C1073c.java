package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0988b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.C1012l;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.view.menu.InterfaceC1019p;
import androidx.appcompat.view.menu.SubMenuC1023r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C1365a;
import java.util.ArrayList;
import p201g.p202a.C7452a;
import p201g.p202a.C7458g;
import p201g.p202a.p209o.C7484a;
import p201g.p227h.p238l.AbstractC7681b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes2.dex */
public class C1073c extends AbstractC0988b implements AbstractC7681b.InterfaceC7682a {

    /* renamed from: B */
    C1077d f3253B;

    /* renamed from: C */
    private Drawable f3254C;

    /* renamed from: D */
    private boolean f3255D;

    /* renamed from: E */
    private boolean f3256E;

    /* renamed from: F */
    private boolean f3257F;

    /* renamed from: G */
    private int f3258G;

    /* renamed from: H */
    private int f3259H;

    /* renamed from: I */
    private int f3260I;

    /* renamed from: J */
    private boolean f3261J;

    /* renamed from: K */
    private boolean f3262K;

    /* renamed from: L */
    private boolean f3263L;

    /* renamed from: M */
    private boolean f3264M;

    /* renamed from: N */
    private int f3265N;

    /* renamed from: O */
    private final SparseBooleanArray f3266O;

    /* renamed from: P */
    C1079e f3267P;

    /* renamed from: Q */
    C1074a f3268Q;

    /* renamed from: R */
    RunnableC1076c f3269R;

    /* renamed from: S */
    private C1075b f3270S;

    /* renamed from: T */
    final C1080f f3271T;

    /* renamed from: U */
    int f3272U;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes2.dex */
    public class C1074a extends C1012l {
        public C1074a(Context context, SubMenuC1023r subMenuC1023r, View view) {
            super(context, subMenuC1023r, view, false, C7452a.actionOverflowMenuStyle);
            if (!((C1003i) subMenuC1023r.getItem()).m37493l()) {
                View view2 = C1073c.this.f3253B;
                m37466f(view2 == null ? (View) ((AbstractC0988b) C1073c.this).f2803z : view2);
            }
            m37462j(C1073c.this.f3271T);
        }

        @Override // androidx.appcompat.view.menu.C1012l
        /* renamed from: e */
        protected void mo37238e() {
            C1073c c1073c = C1073c.this;
            c1073c.f3268Q = null;
            c1073c.f3272U = 0;
            super.mo37238e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes2.dex */
    private class C1075b extends ActionMenuItemView.AbstractC0986b {
        C1075b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0986b
        /* renamed from: a */
        public InterfaceC1019p mo37241a() {
            C1074a c1074a = C1073c.this.f3268Q;
            if (c1074a != null) {
                return c1074a.m37468c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes2.dex */
    public class RunnableC1076c implements Runnable {

        /* renamed from: c */
        private C1079e f3275c;

        public RunnableC1076c(C1079e c1079e) {
            this.f3275c = c1079e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0988b) C1073c.this).f2798e != null) {
                ((AbstractC0988b) C1073c.this).f2798e.m37530d();
            }
            View view = (View) ((AbstractC0988b) C1073c.this).f2803z;
            if (view != null && view.getWindowToken() != null && this.f3275c.m37459m()) {
                C1073c.this.f3267P = this.f3275c;
            }
            C1073c.this.f3269R = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes2.dex */
    public class C1077d extends AppCompatImageView implements ActionMenuView.InterfaceC1031a {

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes2.dex */
        class C1078a extends AbstractView$OnTouchListenerC1086d0 {
            C1078a(View view, C1073c c1073c) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
            /* renamed from: b */
            public InterfaceC1019p mo37006b() {
                C1079e c1079e = C1073c.this.f3267P;
                if (c1079e == null) {
                    return null;
                }
                return c1079e.m37468c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
            /* renamed from: c */
            public boolean mo37005c() {
                C1073c.this.m37253N();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
            /* renamed from: d */
            public boolean mo37231d() {
                C1073c c1073c = C1073c.this;
                if (c1073c.f3269R != null) {
                    return false;
                }
                c1073c.m37262E();
                return true;
            }
        }

        public C1077d(Context context) {
            super(context, null, C7452a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1155t0.m36986a(this, getContentDescription());
            setOnTouchListener(new C1078a(this, C1073c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1031a
        /* renamed from: a */
        public boolean mo37240a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1031a
        /* renamed from: b */
        public boolean mo37239b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1073c.this.m37253N();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1365a.m36190l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes2.dex */
    public class C1079e extends C1012l {
        public C1079e(Context context, C0999g c0999g, View view, boolean z) {
            super(context, c0999g, view, z, C7452a.actionOverflowMenuStyle);
            m37464h(8388613);
            m37462j(C1073c.this.f3271T);
        }

        @Override // androidx.appcompat.view.menu.C1012l
        /* renamed from: e */
        protected void mo37238e() {
            if (((AbstractC0988b) C1073c.this).f2798e != null) {
                ((AbstractC0988b) C1073c.this).f2798e.close();
            }
            C1073c.this.f3267P = null;
            super.mo37238e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes2.dex */
    private class C1080f implements InterfaceC1014m.InterfaceC1015a {
        C1080f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: a */
        public void mo37237a(C0999g c0999g, boolean z) {
            if (c0999g instanceof SubMenuC1023r) {
                c0999g.mo37448F().m37528e(false);
            }
            InterfaceC1014m.InterfaceC1015a m37580f = C1073c.this.m37580f();
            if (m37580f != null) {
                m37580f.mo37237a(c0999g, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: b */
        public boolean mo37236b(C0999g c0999g) {
            if (c0999g == ((AbstractC0988b) C1073c.this).f2798e) {
                return false;
            }
            C1073c.this.f3272U = ((SubMenuC1023r) c0999g).getItem().getItemId();
            InterfaceC1014m.InterfaceC1015a m37580f = C1073c.this.m37580f();
            if (m37580f != null) {
                return m37580f.mo37236b(c0999g);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$g */
    /* loaded from: classes2.dex */
    public static class C1081g implements Parcelable {
        public static final Parcelable.Creator<C1081g> CREATOR = new C1082a();

        /* renamed from: c */
        public int f3281c;

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.c$g$a */
        /* loaded from: classes2.dex */
        class C1082a implements Parcelable.Creator<C1081g> {
            C1082a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1081g createFromParcel(Parcel parcel) {
                return new C1081g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1081g[] newArray(int i) {
                return new C1081g[i];
            }
        }

        C1081g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3281c);
        }

        C1081g(Parcel parcel) {
            this.f3281c = parcel.readInt();
        }
    }

    public C1073c(Context context) {
        super(context, C7458g.abc_action_menu_layout, C7458g.abc_action_menu_item_layout);
        this.f3266O = new SparseBooleanArray();
        this.f3271T = new C1080f();
    }

    /* renamed from: C */
    private View m37264C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2803z;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC1016n.InterfaceC1017a) && ((InterfaceC1016n.InterfaceC1017a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public boolean m37265B() {
        return m37262E() | m37261F();
    }

    /* renamed from: D */
    public Drawable m37263D() {
        C1077d c1077d = this.f3253B;
        if (c1077d != null) {
            return c1077d.getDrawable();
        }
        if (this.f3255D) {
            return this.f3254C;
        }
        return null;
    }

    /* renamed from: E */
    public boolean m37262E() {
        InterfaceC1016n interfaceC1016n;
        RunnableC1076c runnableC1076c = this.f3269R;
        if (runnableC1076c != null && (interfaceC1016n = this.f2803z) != null) {
            ((View) interfaceC1016n).removeCallbacks(runnableC1076c);
            this.f3269R = null;
            return true;
        }
        C1079e c1079e = this.f3267P;
        if (c1079e != null) {
            c1079e.m37469b();
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m37261F() {
        C1074a c1074a = this.f3268Q;
        if (c1074a != null) {
            c1074a.m37469b();
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m37260G() {
        return this.f3269R != null || m37259H();
    }

    /* renamed from: H */
    public boolean m37259H() {
        C1079e c1079e = this.f3267P;
        return c1079e != null && c1079e.m37467d();
    }

    /* renamed from: I */
    public void m37258I(Configuration configuration) {
        if (!this.f3261J) {
            this.f3260I = C7484a.m18609b(this.f2797d).m18607d();
        }
        C0999g c0999g = this.f2798e;
        if (c0999g != null) {
            c0999g.mo26725M(true);
        }
    }

    /* renamed from: J */
    public void m37257J(boolean z) {
        this.f3264M = z;
    }

    /* renamed from: K */
    public void m37256K(ActionMenuView actionMenuView) {
        this.f2803z = actionMenuView;
        actionMenuView.mo26852b(this.f2798e);
    }

    /* renamed from: L */
    public void m37255L(Drawable drawable) {
        C1077d c1077d = this.f3253B;
        if (c1077d != null) {
            c1077d.setImageDrawable(drawable);
            return;
        }
        this.f3255D = true;
        this.f3254C = drawable;
    }

    /* renamed from: M */
    public void m37254M(boolean z) {
        this.f3256E = z;
        this.f3257F = true;
    }

    /* renamed from: N */
    public boolean m37253N() {
        C0999g c0999g;
        if (!this.f3256E || m37259H() || (c0999g = this.f2798e) == null || this.f2803z == null || this.f3269R != null || c0999g.m37554B().isEmpty()) {
            return false;
        }
        RunnableC1076c runnableC1076c = new RunnableC1076c(new C1079e(this.f2797d, this.f2798e, this.f3253B, true));
        this.f3269R = runnableC1076c;
        ((View) this.f2803z).post(runnableC1076c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b, androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        m37265B();
        super.mo26766a(c0999g, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b
    /* renamed from: c */
    public void mo37252c(C1003i c1003i, InterfaceC1016n.InterfaceC1017a interfaceC1017a) {
        interfaceC1017a.mo26853e(c1003i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC1017a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2803z);
        if (this.f3270S == null) {
            this.f3270S = new C1075b();
        }
        actionMenuItemView.setPopupCallback(this.f3270S);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b
    /* renamed from: e */
    public boolean mo37251e(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f3253B) {
            return false;
        }
        return super.mo37251e(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b
    /* renamed from: g */
    public View mo37250g(C1003i c1003i, View view, ViewGroup viewGroup) {
        View actionView = c1003i.getActionView();
        if (actionView == null || c1003i.m37495j()) {
            actionView = super.mo37250g(c1003i, view, viewGroup);
        }
        actionView.setVisibility(c1003i.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo37377o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b, androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        super.mo26758i(z);
        ((View) this.f2803z).requestLayout();
        C0999g c0999g = this.f2798e;
        boolean z2 = false;
        if (c0999g != null) {
            ArrayList<C1003i> m37511u = c0999g.m37511u();
            int size = m37511u.size();
            for (int i = 0; i < size; i++) {
                AbstractC7681b mo17973b = m37511u.get(i).mo17973b();
                if (mo17973b != null) {
                    mo17973b.m17842i(this);
                }
            }
        }
        C0999g c0999g2 = this.f2798e;
        ArrayList<C1003i> m37554B = c0999g2 != null ? c0999g2.m37554B() : null;
        if (this.f3256E && m37554B != null) {
            int size2 = m37554B.size();
            if (size2 == 1) {
                z2 = !m37554B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3253B == null) {
                this.f3253B = new C1077d(this.f2796c);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3253B.getParent();
            if (viewGroup != this.f2803z) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3253B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2803z;
                actionMenuView.addView(this.f3253B, actionMenuView.m37407F());
            }
        } else {
            C1077d c1077d = this.f3253B;
            if (c1077d != null) {
                ViewParent parent = c1077d.getParent();
                InterfaceC1016n interfaceC1016n = this.f2803z;
                if (parent == interfaceC1016n) {
                    ((ViewGroup) interfaceC1016n).removeView(this.f3253B);
                }
            }
        }
        ((ActionMenuView) this.f2803z).setOverflowReserved(this.f3256E);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: j */
    public boolean mo26757j() {
        ArrayList<C1003i> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        C1073c c1073c = this;
        C0999g c0999g = c1073c.f2798e;
        View view = null;
        int i5 = 0;
        if (c0999g != null) {
            arrayList = c0999g.m37550G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c1073c.f3260I;
        int i7 = c1073c.f3259H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1073c.f2803z;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C1003i c1003i = arrayList.get(i10);
            if (c1003i.m37490o()) {
                i8++;
            } else if (c1003i.m37491n()) {
                i9++;
            } else {
                z = true;
            }
            if (c1073c.f3264M && c1003i.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (c1073c.f3256E && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = c1073c.f3266O;
        sparseBooleanArray.clear();
        if (c1073c.f3262K) {
            int i12 = c1073c.f3265N;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C1003i c1003i2 = arrayList.get(i13);
            if (c1003i2.m37490o()) {
                View mo37250g = c1073c.mo37250g(c1003i2, view, viewGroup);
                if (c1073c.f3262K) {
                    i3 -= ActionMenuView.m37401L(mo37250g, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo37250g.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo37250g.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = c1003i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c1003i2.m37484u(true);
                i4 = i;
            } else if (c1003i2.m37491n()) {
                int groupId2 = c1003i2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!c1073c.f3262K || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View mo37250g2 = c1073c.mo37250g(c1003i2, null, viewGroup);
                    if (c1073c.f3262K) {
                        int m37401L = ActionMenuView.m37401L(mo37250g2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m37401L;
                        if (m37401L == 0) {
                            z4 = false;
                        }
                    } else {
                        mo37250g2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = mo37250g2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!c1073c.f3262K ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C1003i c1003i3 = arrayList.get(i15);
                        if (c1003i3.getGroupId() == groupId2) {
                            if (c1003i3.m37493l()) {
                                i11++;
                            }
                            c1003i3.m37484u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                c1003i2.m37484u(z3);
            } else {
                i4 = i;
                c1003i2.m37484u(false);
                i13++;
                view = null;
                c1073c = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            c1073c = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b, androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
        super.mo26753n(context, c0999g);
        Resources resources = context.getResources();
        C7484a m18609b = C7484a.m18609b(context);
        if (!this.f3257F) {
            this.f3256E = m18609b.m18603h();
        }
        if (!this.f3263L) {
            this.f3258G = m18609b.m18608c();
        }
        if (!this.f3261J) {
            this.f3260I = m18609b.m18607d();
        }
        int i = this.f3258G;
        if (this.f3256E) {
            if (this.f3253B == null) {
                C1077d c1077d = new C1077d(this.f2796c);
                this.f3253B = c1077d;
                if (this.f3255D) {
                    c1077d.setImageDrawable(this.f3254C);
                    this.f3254C = null;
                    this.f3255D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3253B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f3253B.getMeasuredWidth();
        } else {
            this.f3253B = null;
        }
        this.f3259H = i;
        this.f3265N = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C1081g) && (i = ((C1081g) parcelable).f3281c) > 0 && (findItem = this.f2798e.findItem(i)) != null) {
            mo26750q((SubMenuC1023r) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b
    /* renamed from: p */
    public InterfaceC1016n mo37249p(ViewGroup viewGroup) {
        InterfaceC1016n interfaceC1016n = this.f2803z;
        InterfaceC1016n mo37249p = super.mo37249p(viewGroup);
        if (interfaceC1016n != mo37249p) {
            ((ActionMenuView) mo37249p).setPresenter(this);
        }
        return mo37249p;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b, androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        boolean z = false;
        if (subMenuC1023r.hasVisibleItems()) {
            SubMenuC1023r subMenuC1023r2 = subMenuC1023r;
            while (subMenuC1023r2.m37441i0() != this.f2798e) {
                subMenuC1023r2 = (SubMenuC1023r) subMenuC1023r2.m37441i0();
            }
            View m37264C = m37264C(subMenuC1023r2.getItem());
            if (m37264C == null) {
                return false;
            }
            this.f3272U = subMenuC1023r.getItem().getItemId();
            int size = subMenuC1023r.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC1023r.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C1074a c1074a = new C1074a(this.f2797d, subMenuC1023r, m37264C);
            this.f3268Q = c1074a;
            c1074a.m37465g(z);
            this.f3268Q.m37461k();
            super.mo26750q(subMenuC1023r);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: r */
    public Parcelable mo26749r() {
        C1081g c1081g = new C1081g();
        c1081g.f3281c = this.f3272U;
        return c1081g;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0988b
    /* renamed from: t */
    public boolean mo37248t(int i, C1003i c1003i) {
        return c1003i.m37493l();
    }
}
