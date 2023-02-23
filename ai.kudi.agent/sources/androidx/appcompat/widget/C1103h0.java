package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p202a.p205l.p206a.C7464a;
import p201g.p202a.p207m.C7481a;
import p201g.p218e.C7526d;
import p201g.p218e.C7527e;
import p201g.p218e.C7534g;
import p201g.p218e.C7535h;
import p201g.p267w.p268a.p269a.C8189c;
import p201g.p267w.p268a.p269a.C8199i;
/* compiled from: ResourceManagerInternal.java */
/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes2.dex */
public final class C1103h0 {

    /* renamed from: i */
    private static C1103h0 f3360i;

    /* renamed from: a */
    private WeakHashMap<Context, C7535h<ColorStateList>> f3362a;

    /* renamed from: b */
    private C7534g<String, InterfaceC1108e> f3363b;

    /* renamed from: c */
    private C7535h<String> f3364c;

    /* renamed from: d */
    private final WeakHashMap<Context, C7526d<WeakReference<Drawable.ConstantState>>> f3365d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f3366e;

    /* renamed from: f */
    private boolean f3367f;

    /* renamed from: g */
    private InterfaceC1109f f3368g;

    /* renamed from: h */
    private static final PorterDuff.Mode f3359h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C1106c f3361j = new C1106c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: classes2.dex */
    public static class C1104a implements InterfaceC1108e {
        C1104a() {
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1108e
        /* renamed from: a */
        public Drawable mo37136a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C7464a.m18685m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$b */
    /* loaded from: classes2.dex */
    public static class C1105b implements InterfaceC1108e {
        C1105b() {
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1108e
        /* renamed from: a */
        public Drawable mo37136a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C8189c.m16552a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$c */
    /* loaded from: classes2.dex */
    public static class C1106c extends C7527e<Integer, PorterDuffColorFilter> {
        public C1106c(int i) {
            super(i);
        }

        /* renamed from: j */
        private static int m37139j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: k */
        PorterDuffColorFilter m37138k(int i, PorterDuff.Mode mode) {
            return m18487c(Integer.valueOf(m37139j(i, mode)));
        }

        /* renamed from: l */
        PorterDuffColorFilter m37137l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m18486d(Integer.valueOf(m37139j(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$d */
    /* loaded from: classes2.dex */
    public static class C1107d implements InterfaceC1108e {
        C1107d() {
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1108e
        /* renamed from: a */
        public Drawable mo37136a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C1107d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC1108e {
        /* renamed from: a */
        Drawable mo37136a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC1109f {
        /* renamed from: a */
        boolean mo37126a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo37125b(int i);

        /* renamed from: c */
        Drawable mo37124c(C1103h0 c1103h0, Context context, int i);

        /* renamed from: d */
        ColorStateList mo37123d(Context context, int i);

        /* renamed from: e */
        boolean mo37122e(Context context, int i, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.h0$g */
    /* loaded from: classes2.dex */
    public static class C1110g implements InterfaceC1108e {
        C1110g() {
        }

        @Override // androidx.appcompat.widget.C1103h0.InterfaceC1108e
        /* renamed from: a */
        public Drawable mo37136a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C8199i.m16519c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m37163a(String str, InterfaceC1108e interfaceC1108e) {
        if (this.f3363b == null) {
            this.f3363b = new C7534g<>();
        }
        this.f3363b.put(str, interfaceC1108e);
    }

    /* renamed from: b */
    private synchronized boolean m37162b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C7526d<WeakReference<Drawable.ConstantState>> c7526d = this.f3365d.get(context);
            if (c7526d == null) {
                c7526d = new C7526d<>();
                this.f3365d.put(context, c7526d);
            }
            c7526d.m18494k(j, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m37161c(Context context, int i, ColorStateList colorStateList) {
        if (this.f3362a == null) {
            this.f3362a = new WeakHashMap<>();
        }
        C7535h<ColorStateList> c7535h = this.f3362a.get(context);
        if (c7535h == null) {
            c7535h = new C7535h<>();
            this.f3362a.put(context, c7535h);
        }
        c7535h.m18447a(i, colorStateList);
    }

    /* renamed from: d */
    private void m37160d(Context context) {
        if (this.f3367f) {
            return;
        }
        this.f3367f = true;
        Drawable m37154j = m37154j(context, C7481a.abc_vector_test);
        if (m37154j == null || !m37147q(m37154j)) {
            this.f3367f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    private static long m37159e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m37158f(Context context, int i) {
        if (this.f3366e == null) {
            this.f3366e = new TypedValue();
        }
        TypedValue typedValue = this.f3366e;
        context.getResources().getValue(i, typedValue, true);
        long m37159e = m37159e(typedValue);
        Drawable m37155i = m37155i(context, m37159e);
        if (m37155i != null) {
            return m37155i;
        }
        InterfaceC1109f interfaceC1109f = this.f3368g;
        Drawable mo37124c = interfaceC1109f == null ? null : interfaceC1109f.mo37124c(this, context, i);
        if (mo37124c != null) {
            mo37124c.setChangingConfigurations(typedValue.changingConfigurations);
            m37162b(context, m37159e, mo37124c);
        }
        return mo37124c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m37157g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m37152l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C1103h0 m37156h() {
        C1103h0 c1103h0;
        synchronized (C1103h0.class) {
            if (f3360i == null) {
                C1103h0 c1103h02 = new C1103h0();
                f3360i = c1103h02;
                m37148p(c1103h02);
            }
            c1103h0 = f3360i;
        }
        return c1103h0;
    }

    /* renamed from: i */
    private synchronized Drawable m37155i(Context context, long j) {
        C7526d<WeakReference<Drawable.ConstantState>> c7526d = this.f3365d.get(context);
        if (c7526d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m18499f = c7526d.m18499f(j);
        if (m18499f != null) {
            Drawable.ConstantState constantState = m18499f.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c7526d.m18493l(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m37152l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m37138k;
        synchronized (C1103h0.class) {
            m37138k = f3361j.m37138k(i, mode);
            if (m37138k == null) {
                m37138k = new PorterDuffColorFilter(i, mode);
                f3361j.m37137l(i, mode, m37138k);
            }
        }
        return m37138k;
    }

    /* renamed from: n */
    private ColorStateList m37150n(Context context, int i) {
        C7535h<ColorStateList> c7535h;
        WeakHashMap<Context, C7535h<ColorStateList>> weakHashMap = this.f3362a;
        if (weakHashMap == null || (c7535h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c7535h.m18443e(i);
    }

    /* renamed from: p */
    private static void m37148p(C1103h0 c1103h0) {
        if (Build.VERSION.SDK_INT < 24) {
            c1103h0.m37163a("vector", new C1110g());
            c1103h0.m37163a("animated-vector", new C1105b());
            c1103h0.m37163a("animated-selector", new C1104a());
            c1103h0.m37163a("drawable", new C1107d());
        }
    }

    /* renamed from: q */
    private static boolean m37147q(Drawable drawable) {
        return (drawable instanceof C8199i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: r */
    private Drawable m37146r(Context context, int i) {
        int next;
        C7534g<String, InterfaceC1108e> c7534g = this.f3363b;
        if (c7534g == null || c7534g.isEmpty()) {
            return null;
        }
        C7535h<String> c7535h = this.f3364c;
        if (c7535h != null) {
            String m18443e = c7535h.m18443e(i);
            if ("appcompat_skip_skip".equals(m18443e) || (m18443e != null && this.f3363b.get(m18443e) == null)) {
                return null;
            }
        } else {
            this.f3364c = new C7535h<>();
        }
        if (this.f3366e == null) {
            this.f3366e = new TypedValue();
        }
        TypedValue typedValue = this.f3366e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m37159e = m37159e(typedValue);
        Drawable m37155i = m37155i(context, m37159e);
        if (m37155i != null) {
            return m37155i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f3364c.m18447a(i, name);
                    InterfaceC1108e interfaceC1108e = this.f3363b.get(name);
                    if (interfaceC1108e != null) {
                        m37155i = interfaceC1108e.mo37136a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m37155i != null) {
                        m37155i.setChangingConfigurations(typedValue.changingConfigurations);
                        m37162b(context, m37159e, m37155i);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m37155i == null) {
            this.f3364c.m18447a(i, "appcompat_skip_skip");
        }
        return m37155i;
    }

    /* renamed from: v */
    private Drawable m37142v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m37151m = m37151m(context, i);
        if (m37151m != null) {
            if (C1068a0.m37285a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m36184r = C1365a.m36184r(drawable);
            C1365a.m36187o(m36184r, m37151m);
            PorterDuff.Mode m37149o = m37149o(i);
            if (m37149o != null) {
                C1365a.m36186p(m36184r, m37149o);
                return m36184r;
            }
            return m36184r;
        }
        InterfaceC1109f interfaceC1109f = this.f3368g;
        if ((interfaceC1109f == null || !interfaceC1109f.mo37122e(context, i, drawable)) && !m37140x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m37141w(Drawable drawable, C1132p0 c1132p0, int[] iArr) {
        if (C1068a0.m37285a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (!c1132p0.f3455d && !c1132p0.f3454c) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(m37157g(c1132p0.f3455d ? c1132p0.f3452a : null, c1132p0.f3454c ? c1132p0.f3453b : f3359h, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m37154j(Context context, int i) {
        return m37153k(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m37153k(Context context, int i, boolean z) {
        Drawable m37146r;
        m37160d(context);
        m37146r = m37146r(context, i);
        if (m37146r == null) {
            m37146r = m37158f(context, i);
        }
        if (m37146r == null) {
            m37146r = C1335a.m36322f(context, i);
        }
        if (m37146r != null) {
            m37146r = m37142v(context, i, z, m37146r);
        }
        if (m37146r != null) {
            C1068a0.m37284b(m37146r);
        }
        return m37146r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m37151m(Context context, int i) {
        ColorStateList m37150n;
        m37150n = m37150n(context, i);
        if (m37150n == null) {
            m37150n = this.f3368g == null ? null : this.f3368g.mo37123d(context, i);
            if (m37150n != null) {
                m37161c(context, i, m37150n);
            }
        }
        return m37150n;
    }

    /* renamed from: o */
    PorterDuff.Mode m37149o(int i) {
        InterfaceC1109f interfaceC1109f = this.f3368g;
        if (interfaceC1109f == null) {
            return null;
        }
        return interfaceC1109f.mo37125b(i);
    }

    /* renamed from: s */
    public synchronized void m37145s(Context context) {
        C7526d<WeakReference<Drawable.ConstantState>> c7526d = this.f3365d.get(context);
        if (c7526d != null) {
            c7526d.m18503b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m37144t(Context context, C1168w0 c1168w0, int i) {
        Drawable m37146r = m37146r(context, i);
        if (m37146r == null) {
            m37146r = c1168w0.m36905d(i);
        }
        if (m37146r != null) {
            return m37142v(context, i, false, m37146r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m37143u(InterfaceC1109f interfaceC1109f) {
        this.f3368g = interfaceC1109f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m37140x(Context context, int i, Drawable drawable) {
        InterfaceC1109f interfaceC1109f = this.f3368g;
        return interfaceC1109f != null && interfaceC1109f.mo37126a(context, i, drawable);
    }
}
