package p201g.p266v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p201g.p227h.p238l.C7759x;
/* compiled from: ChangeBounds.java */
/* renamed from: g.v.c */
/* loaded from: classes2.dex */
public class C8118c extends AbstractC8160m {

    /* renamed from: e0 */
    private static final String[] f19480e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: f0 */
    private static final Property<Drawable, PointF> f19481f0 = new C8120b(PointF.class, "boundsOrigin");

    /* renamed from: g0 */
    private static final Property<C8129k, PointF> f19482g0 = new C8121c(PointF.class, "topLeft");

    /* renamed from: h0 */
    private static final Property<C8129k, PointF> f19483h0 = new C8122d(PointF.class, "bottomRight");

    /* renamed from: i0 */
    private static final Property<View, PointF> f19484i0 = new C8123e(PointF.class, "bottomRight");

    /* renamed from: j0 */
    private static final Property<View, PointF> f19485j0 = new C8124f(PointF.class, "topLeft");

    /* renamed from: k0 */
    private static final Property<View, PointF> f19486k0 = new C8125g(PointF.class, "position");

    /* renamed from: l0 */
    private static C8156k f19487l0 = new C8156k();

    /* renamed from: b0 */
    private int[] f19488b0 = new int[2];

    /* renamed from: c0 */
    private boolean f19489c0 = false;

    /* renamed from: d0 */
    private boolean f19490d0 = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$a */
    /* loaded from: classes2.dex */
    class C8119a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f19491c;

        /* renamed from: d */
        final /* synthetic */ BitmapDrawable f19492d;

        /* renamed from: e */
        final /* synthetic */ View f19493e;

        /* renamed from: f */
        final /* synthetic */ float f19494f;

        C8119a(C8118c c8118c, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f19491c = viewGroup;
            this.f19492d = bitmapDrawable;
            this.f19493e = view;
            this.f19494f = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8130c0.m16712b(this.f19491c).mo16563b(this.f19492d);
            C8130c0.m16707g(this.f19493e, this.f19494f);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$b */
    /* loaded from: classes2.dex */
    static class C8120b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f19495a;

        C8120b(Class cls, String str) {
            super(cls, str);
            this.f19495a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f19495a);
            Rect rect = this.f19495a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f19495a);
            this.f19495a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f19495a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$c */
    /* loaded from: classes2.dex */
    static class C8121c extends Property<C8129k, PointF> {
        C8121c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C8129k c8129k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C8129k c8129k, PointF pointF) {
            c8129k.m16714c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$d */
    /* loaded from: classes2.dex */
    static class C8122d extends Property<C8129k, PointF> {
        C8122d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C8129k c8129k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C8129k c8129k, PointF pointF) {
            c8129k.m16716a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$e */
    /* loaded from: classes2.dex */
    static class C8123e extends Property<View, PointF> {
        C8123e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C8130c0.m16708f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$f */
    /* loaded from: classes2.dex */
    static class C8124f extends Property<View, PointF> {
        C8124f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C8130c0.m16708f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$g */
    /* loaded from: classes2.dex */
    static class C8125g extends Property<View, PointF> {
        C8125g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C8130c0.m16708f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$h */
    /* loaded from: classes2.dex */
    class C8126h extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ C8129k f19496c;
        private C8129k mViewBounds;

        C8126h(C8118c c8118c, C8129k c8129k) {
            this.f19496c = c8129k;
            this.mViewBounds = this.f19496c;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$i */
    /* loaded from: classes2.dex */
    class C8127i extends AnimatorListenerAdapter {

        /* renamed from: c */
        private boolean f19497c;

        /* renamed from: d */
        final /* synthetic */ View f19498d;

        /* renamed from: e */
        final /* synthetic */ Rect f19499e;

        /* renamed from: f */
        final /* synthetic */ int f19500f;

        /* renamed from: w */
        final /* synthetic */ int f19501w;

        /* renamed from: x */
        final /* synthetic */ int f19502x;

        /* renamed from: y */
        final /* synthetic */ int f19503y;

        C8127i(C8118c c8118c, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f19498d = view;
            this.f19499e = rect;
            this.f19500f = i;
            this.f19501w = i2;
            this.f19502x = i3;
            this.f19503y = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19497c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f19497c) {
                return;
            }
            C7759x.m17486v0(this.f19498d, this.f19499e);
            C8130c0.m16708f(this.f19498d, this.f19500f, this.f19501w, this.f19502x, this.f19503y);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$j */
    /* loaded from: classes2.dex */
    class C8128j extends C8168n {

        /* renamed from: c */
        boolean f19504c = false;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f19505d;

        C8128j(C8118c c8118c, ViewGroup viewGroup) {
            this.f19505d = viewGroup;
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: b */
        public void mo16620b(AbstractC8160m abstractC8160m) {
            C8182x.m16567c(this.f19505d, false);
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            if (!this.f19504c) {
                C8182x.m16567c(this.f19505d, false);
            }
            abstractC8160m.mo16608Q(this);
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: d */
        public void mo16619d(AbstractC8160m abstractC8160m) {
            C8182x.m16567c(this.f19505d, false);
            this.f19504c = true;
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: e */
        public void mo16618e(AbstractC8160m abstractC8160m) {
            C8182x.m16567c(this.f19505d, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* renamed from: g.v.c$k */
    /* loaded from: classes2.dex */
    public static class C8129k {

        /* renamed from: a */
        private int f19506a;

        /* renamed from: b */
        private int f19507b;

        /* renamed from: c */
        private int f19508c;

        /* renamed from: d */
        private int f19509d;

        /* renamed from: e */
        private View f19510e;

        /* renamed from: f */
        private int f19511f;

        /* renamed from: g */
        private int f19512g;

        C8129k(View view) {
            this.f19510e = view;
        }

        /* renamed from: b */
        private void m16715b() {
            C8130c0.m16708f(this.f19510e, this.f19506a, this.f19507b, this.f19508c, this.f19509d);
            this.f19511f = 0;
            this.f19512g = 0;
        }

        /* renamed from: a */
        void m16716a(PointF pointF) {
            this.f19508c = Math.round(pointF.x);
            this.f19509d = Math.round(pointF.y);
            int i = this.f19512g + 1;
            this.f19512g = i;
            if (this.f19511f == i) {
                m16715b();
            }
        }

        /* renamed from: c */
        void m16714c(PointF pointF) {
            this.f19506a = Math.round(pointF.x);
            this.f19507b = Math.round(pointF.y);
            int i = this.f19511f + 1;
            this.f19511f = i;
            if (i == this.f19512g) {
                m16715b();
            }
        }
    }

    /* renamed from: f0 */
    private void m16730f0(C8177s c8177s) {
        View view = c8177s.f19628b;
        if (!C7759x.m17535U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c8177s.f19627a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c8177s.f19627a.put("android:changeBounds:parent", c8177s.f19628b.getParent());
        if (this.f19490d0) {
            c8177s.f19628b.getLocationInWindow(this.f19488b0);
            c8177s.f19627a.put("android:changeBounds:windowX", Integer.valueOf(this.f19488b0[0]));
            c8177s.f19627a.put("android:changeBounds:windowY", Integer.valueOf(this.f19488b0[1]));
        }
        if (this.f19489c0) {
            c8177s.f19627a.put("android:changeBounds:clip", C7759x.m17489u(view));
        }
    }

    /* renamed from: h0 */
    private boolean m16729h0(View view, View view2) {
        if (this.f19490d0) {
            C8177s m16628t = m16628t(view, true);
            if (m16628t == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == m16628t.f19628b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: D */
    public String[] mo16652D() {
        return f19480e0;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: f */
    public void mo16595f(C8177s c8177s) {
        m16730f0(c8177s);
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: i */
    public void mo16591i(C8177s c8177s) {
        m16730f0(c8177s);
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: n */
    public Animator mo16633n(ViewGroup viewGroup, C8177s c8177s, C8177s c8177s2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m16573c;
        if (c8177s == null || c8177s2 == null) {
            return null;
        }
        Map<String, Object> map = c8177s.f19627a;
        Map<String, Object> map2 = c8177s2.f19627a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c8177s2.f19628b;
        if (m16729h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) c8177s.f19627a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) c8177s2.f19627a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) c8177s.f19627a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) c8177s2.f19627a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                if (!this.f19489c0) {
                    view = view2;
                    C8130c0.m16708f(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            m16573c = C8143f.m16681a(view, f19486k0, m16626v().mo16621a(i3, i5, i4, i6));
                        } else {
                            C8129k c8129k = new C8129k(view);
                            ObjectAnimator m16681a = C8143f.m16681a(c8129k, f19482g0, m16626v().mo16621a(i3, i5, i4, i6));
                            ObjectAnimator m16681a2 = C8143f.m16681a(c8129k, f19483h0, m16626v().mo16621a(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(m16681a, m16681a2);
                            animatorSet.addListener(new C8126h(this, c8129k));
                            m16573c = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        m16573c = C8143f.m16681a(view, f19484i0, m16626v().mo16621a(i7, i9, i8, i10));
                    } else {
                        m16573c = C8143f.m16681a(view, f19485j0, m16626v().mo16621a(i3, i5, i4, i6));
                    }
                } else {
                    view = view2;
                    C8130c0.m16708f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    ObjectAnimator m16681a3 = (i3 == i4 && i5 == i6) ? null : C8143f.m16681a(view, f19486k0, m16626v().mo16621a(i3, i5, i4, i6));
                    if (rect4 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        C7759x.m17486v0(view, rect);
                        C8156k c8156k = f19487l0;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c8156k, objArr);
                        ofObject.addListener(new C8127i(this, view, rect5, i4, i6, i8, i10));
                        objectAnimator = ofObject;
                    }
                    m16573c = C8176r.m16573c(m16681a3, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C8182x.m16567c(viewGroup4, true);
                    mo16601a(new C8128j(this, viewGroup4));
                }
                return m16573c;
            }
            return null;
        }
        int intValue = ((Integer) c8177s.f19627a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) c8177s.f19627a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) c8177s2.f19627a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) c8177s2.f19627a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f19488b0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m16711c = C8130c0.m16711c(view2);
        C8130c0.m16707g(view2, 0.0f);
        C8130c0.m16712b(viewGroup).mo16564a(bitmapDrawable);
        AbstractC8145g m16626v = m16626v();
        int[] iArr = this.f19488b0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C8149i.m16678a(f19481f0, m16626v.mo16621a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new C8119a(this, viewGroup, bitmapDrawable, view2, m16711c));
        return ofPropertyValuesHolder;
    }
}
