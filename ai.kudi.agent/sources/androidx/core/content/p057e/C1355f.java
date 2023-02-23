package androidx.core.content.p057e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p237k.C7675h;
/* compiled from: ResourcesCompat.java */
/* renamed from: androidx.core.content.e.f */
/* loaded from: classes2.dex */
public final class C1355f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4203a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C1357b, SparseArray<C1356a>> f4204b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f4205c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.e.f$a */
    /* loaded from: classes2.dex */
    public static class C1356a {

        /* renamed from: a */
        final ColorStateList f4206a;

        /* renamed from: b */
        final Configuration f4207b;

        C1356a(ColorStateList colorStateList, Configuration configuration) {
            this.f4206a = colorStateList;
            this.f4207b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.e.f$b */
    /* loaded from: classes2.dex */
    public static final class C1357b {

        /* renamed from: a */
        final Resources f4208a;

        /* renamed from: b */
        final Resources.Theme f4209b;

        C1357b(Resources resources, Resources.Theme theme) {
            this.f4208a = resources;
            this.f4209b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1357b.class != obj.getClass()) {
                return false;
            }
            C1357b c1357b = (C1357b) obj;
            return this.f4208a.equals(c1357b.f4208a) && C7670c.m17875a(this.f4209b, c1357b.f4209b);
        }

        public int hashCode() {
            return C7670c.m17874b(this.f4208a, this.f4209b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.e.f$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1358c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.e.f$c$a */
        /* loaded from: classes2.dex */
        public class RunnableC1359a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Typeface f4210c;

            RunnableC1359a(Typeface typeface) {
                this.f4210c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC1358c.this.mo15032e(this.f4210c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.e.f$c$b */
        /* loaded from: classes2.dex */
        public class RunnableC1360b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f4212c;

            RunnableC1360b(int i) {
                this.f4212c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC1358c.this.mo15033d(this.f4212c);
            }
        }

        /* renamed from: c */
        public static Handler m36235c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void m36237a(int i, Handler handler) {
            m36235c(handler).post(new RunnableC1360b(i));
        }

        /* renamed from: b */
        public final void m36236b(Typeface typeface, Handler handler) {
            m36235c(handler).post(new RunnableC1359a(typeface));
        }

        /* renamed from: d */
        public abstract void mo15033d(int i);

        /* renamed from: e */
        public abstract void mo15032e(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.e.f$d */
    /* loaded from: classes2.dex */
    public static final class C1361d {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.e.f$d$a */
        /* loaded from: classes2.dex */
        static class C1362a {

            /* renamed from: a */
            private static final Object f4214a = new Object();

            /* renamed from: b */
            private static Method f4215b;

            /* renamed from: c */
            private static boolean f4216c;

            /* renamed from: a */
            static void m36233a(Resources.Theme theme) {
                synchronized (f4214a) {
                    if (!f4216c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f4215b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f4216c = true;
                    }
                    if (f4215b != null) {
                        try {
                            f4215b.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f4215b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.e.f$d$b */
        /* loaded from: classes2.dex */
        static class C1363b {
            /* renamed from: a */
            static void m36232a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m36234a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C1363b.m36232a(theme);
            } else if (i >= 23) {
                C1362a.m36233a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m36249a(C1357b c1357b, int i, ColorStateList colorStateList) {
        synchronized (f4205c) {
            SparseArray<C1356a> sparseArray = f4204b.get(c1357b);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f4204b.put(c1357b, sparseArray);
            }
            sparseArray.append(i, new C1356a(colorStateList, c1357b.f4208a.getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m36248b(C1357b c1357b, int i) {
        C1356a c1356a;
        synchronized (f4205c) {
            SparseArray<C1356a> sparseArray = f4204b.get(c1357b);
            if (sparseArray != null && sparseArray.size() > 0 && (c1356a = sparseArray.get(i)) != null) {
                if (c1356a.f4207b.equals(c1357b.f4208a.getConfiguration())) {
                    return c1356a.f4206a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m36247c(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        C1357b c1357b = new C1357b(resources, theme);
        ColorStateList m36248b = m36248b(c1357b, i);
        if (m36248b != null) {
            return m36248b;
        }
        ColorStateList m36241i = m36241i(resources, i, theme);
        if (m36241i != null) {
            m36249a(c1357b, i, m36241i);
            return m36241i;
        }
        return resources.getColorStateList(i);
    }

    /* renamed from: d */
    public static Drawable m36246d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: e */
    public static Typeface m36245e(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m36239k(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m36244f(Context context, int i, TypedValue typedValue, int i2, AbstractC1358c abstractC1358c) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m36239k(context, i, typedValue, i2, abstractC1358c, null, true, false);
    }

    /* renamed from: g */
    public static void m36243g(Context context, int i, AbstractC1358c abstractC1358c, Handler handler) throws Resources.NotFoundException {
        C7675h.m17866f(abstractC1358c);
        if (context.isRestricted()) {
            abstractC1358c.m36237a(-4, handler);
        } else {
            m36239k(context, i, new TypedValue(), 0, abstractC1358c, handler, false, false);
        }
    }

    /* renamed from: h */
    private static TypedValue m36242h() {
        TypedValue typedValue = f4203a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f4203a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: i */
    private static ColorStateList m36241i(Resources resources, int i, Resources.Theme theme) {
        if (m36240j(resources, i)) {
            return null;
        }
        try {
            return C1345a.m36295a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m36240j(Resources resources, int i) {
        TypedValue m36242h = m36242h();
        resources.getValue(i, m36242h, true);
        int i2 = m36242h.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: k */
    private static Typeface m36239k(Context context, int i, TypedValue typedValue, int i2, AbstractC1358c abstractC1358c, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m36238l = m36238l(context, resources, typedValue, i, i2, abstractC1358c, handler, z, z2);
        if (m36238l == null && abstractC1358c == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m36238l;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m36238l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p057e.C1355f.AbstractC1358c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.m36237a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = p201g.p227h.p228e.C7608d.m18040f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.m36236b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            androidx.core.content.e.c$a r2 = androidx.core.content.p057e.C1347c.m36274b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.m36237a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p201g.p227h.p228e.C7608d.m18043c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = p201g.p227h.p228e.C7608d.m18042d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.m36236b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.m36237a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.m36237a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p057e.C1355f.m36238l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.e.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
