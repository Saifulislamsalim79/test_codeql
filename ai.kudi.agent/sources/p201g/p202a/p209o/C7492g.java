package p201g.p202a.p209o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.MenuItemC1005j;
import androidx.appcompat.widget.C1068a0;
import androidx.appcompat.widget.C1138r0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p202a.C7461j;
import p201g.p227h.p231g.p232a.InterfaceMenuC7625a;
import p201g.p227h.p238l.AbstractC7681b;
import p201g.p227h.p238l.C7734i;
/* compiled from: SupportMenuInflater.java */
/* renamed from: g.a.o.g */
/* loaded from: classes2.dex */
public class C7492g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f17779e;

    /* renamed from: f */
    static final Class<?>[] f17780f;

    /* renamed from: a */
    final Object[] f17781a;

    /* renamed from: b */
    final Object[] f17782b;

    /* renamed from: c */
    Context f17783c;

    /* renamed from: d */
    private Object f17784d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* renamed from: g.a.o.g$a */
    /* loaded from: classes2.dex */
    public static class MenuItem$OnMenuItemClickListenerC7493a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f17785c = {MenuItem.class};

        /* renamed from: a */
        private Object f17786a;

        /* renamed from: b */
        private Method f17787b;

        public MenuItem$OnMenuItemClickListenerC7493a(Object obj, String str) {
            this.f17786a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17787b = cls.getMethod(str, f17785c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17787b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17787b.invoke(this.f17786a, menuItem)).booleanValue();
                }
                this.f17787b.invoke(this.f17786a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* renamed from: g.a.o.g$b */
    /* loaded from: classes2.dex */
    public class C7494b {

        /* renamed from: A */
        AbstractC7681b f17788A;

        /* renamed from: B */
        private CharSequence f17789B;

        /* renamed from: C */
        private CharSequence f17790C;

        /* renamed from: D */
        private ColorStateList f17791D = null;

        /* renamed from: E */
        private PorterDuff.Mode f17792E = null;

        /* renamed from: a */
        private Menu f17794a;

        /* renamed from: b */
        private int f17795b;

        /* renamed from: c */
        private int f17796c;

        /* renamed from: d */
        private int f17797d;

        /* renamed from: e */
        private int f17798e;

        /* renamed from: f */
        private boolean f17799f;

        /* renamed from: g */
        private boolean f17800g;

        /* renamed from: h */
        private boolean f17801h;

        /* renamed from: i */
        private int f17802i;

        /* renamed from: j */
        private int f17803j;

        /* renamed from: k */
        private CharSequence f17804k;

        /* renamed from: l */
        private CharSequence f17805l;

        /* renamed from: m */
        private int f17806m;

        /* renamed from: n */
        private char f17807n;

        /* renamed from: o */
        private int f17808o;

        /* renamed from: p */
        private char f17809p;

        /* renamed from: q */
        private int f17810q;

        /* renamed from: r */
        private int f17811r;

        /* renamed from: s */
        private boolean f17812s;

        /* renamed from: t */
        private boolean f17813t;

        /* renamed from: u */
        private boolean f17814u;

        /* renamed from: v */
        private int f17815v;

        /* renamed from: w */
        private int f17816w;

        /* renamed from: x */
        private String f17817x;

        /* renamed from: y */
        private String f17818y;

        /* renamed from: z */
        private String f17819z;

        public C7494b(Menu menu) {
            this.f17794a = menu;
            m18560h();
        }

        /* renamed from: c */
        private char m18565c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m18563e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C7492g.this.f17783c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m18559i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f17812s).setVisible(this.f17813t).setEnabled(this.f17814u).setCheckable(this.f17811r >= 1).setTitleCondensed(this.f17805l).setIcon(this.f17806m);
            int i = this.f17815v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f17819z != null) {
                if (!C7492g.this.f17783c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC7493a(C7492g.this.m18569b(), this.f17819z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f17811r >= 2) {
                if (menuItem instanceof C1003i) {
                    ((C1003i) menuItem).m37485t(true);
                } else if (menuItem instanceof MenuItemC1005j) {
                    ((MenuItemC1005j) menuItem).m37478h(true);
                }
            }
            String str = this.f17817x;
            if (str != null) {
                menuItem.setActionView((View) m18563e(str, C7492g.f17779e, C7492g.this.f17781a));
                z = true;
            }
            int i2 = this.f17816w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC7681b abstractC7681b = this.f17788A;
            if (abstractC7681b != null) {
                C7734i.m17627a(menuItem, abstractC7681b);
            }
            C7734i.m17625c(menuItem, this.f17789B);
            C7734i.m17621g(menuItem, this.f17790C);
            C7734i.m17626b(menuItem, this.f17807n, this.f17808o);
            C7734i.m17622f(menuItem, this.f17809p, this.f17810q);
            PorterDuff.Mode mode = this.f17792E;
            if (mode != null) {
                C7734i.m17623e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f17791D;
            if (colorStateList != null) {
                C7734i.m17624d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m18567a() {
            this.f17801h = true;
            m18559i(this.f17794a.add(this.f17795b, this.f17802i, this.f17803j, this.f17804k));
        }

        /* renamed from: b */
        public SubMenu m18566b() {
            this.f17801h = true;
            SubMenu addSubMenu = this.f17794a.addSubMenu(this.f17795b, this.f17802i, this.f17803j, this.f17804k);
            m18559i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m18564d() {
            return this.f17801h;
        }

        /* renamed from: f */
        public void m18562f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C7492g.this.f17783c.obtainStyledAttributes(attributeSet, C7461j.MenuGroup);
            this.f17795b = obtainStyledAttributes.getResourceId(C7461j.MenuGroup_android_id, 0);
            this.f17796c = obtainStyledAttributes.getInt(C7461j.MenuGroup_android_menuCategory, 0);
            this.f17797d = obtainStyledAttributes.getInt(C7461j.MenuGroup_android_orderInCategory, 0);
            this.f17798e = obtainStyledAttributes.getInt(C7461j.MenuGroup_android_checkableBehavior, 0);
            this.f17799f = obtainStyledAttributes.getBoolean(C7461j.MenuGroup_android_visible, true);
            this.f17800g = obtainStyledAttributes.getBoolean(C7461j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m18561g(AttributeSet attributeSet) {
            C1138r0 m37027u = C1138r0.m37027u(C7492g.this.f17783c, attributeSet, C7461j.MenuItem);
            this.f17802i = m37027u.m37034n(C7461j.MenuItem_android_id, 0);
            this.f17803j = (m37027u.m37037k(C7461j.MenuItem_android_menuCategory, this.f17796c) & (-65536)) | (m37027u.m37037k(C7461j.MenuItem_android_orderInCategory, this.f17797d) & 65535);
            this.f17804k = m37027u.m37032p(C7461j.MenuItem_android_title);
            this.f17805l = m37027u.m37032p(C7461j.MenuItem_android_titleCondensed);
            this.f17806m = m37027u.m37034n(C7461j.MenuItem_android_icon, 0);
            this.f17807n = m18565c(m37027u.m37033o(C7461j.MenuItem_android_alphabeticShortcut));
            this.f17808o = m37027u.m37037k(C7461j.MenuItem_alphabeticModifiers, 4096);
            this.f17809p = m18565c(m37027u.m37033o(C7461j.MenuItem_android_numericShortcut));
            this.f17810q = m37027u.m37037k(C7461j.MenuItem_numericModifiers, 4096);
            if (m37027u.m37029s(C7461j.MenuItem_android_checkable)) {
                this.f17811r = m37027u.m37047a(C7461j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f17811r = this.f17798e;
            }
            this.f17812s = m37027u.m37047a(C7461j.MenuItem_android_checked, false);
            this.f17813t = m37027u.m37047a(C7461j.MenuItem_android_visible, this.f17799f);
            this.f17814u = m37027u.m37047a(C7461j.MenuItem_android_enabled, this.f17800g);
            this.f17815v = m37027u.m37037k(C7461j.MenuItem_showAsAction, -1);
            this.f17819z = m37027u.m37033o(C7461j.MenuItem_android_onClick);
            this.f17816w = m37027u.m37034n(C7461j.MenuItem_actionLayout, 0);
            this.f17817x = m37027u.m37033o(C7461j.MenuItem_actionViewClass);
            String m37033o = m37027u.m37033o(C7461j.MenuItem_actionProviderClass);
            this.f17818y = m37033o;
            boolean z = m37033o != null;
            if (z && this.f17816w == 0 && this.f17817x == null) {
                this.f17788A = (AbstractC7681b) m18563e(this.f17818y, C7492g.f17780f, C7492g.this.f17782b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f17788A = null;
            }
            this.f17789B = m37027u.m37032p(C7461j.MenuItem_contentDescription);
            this.f17790C = m37027u.m37032p(C7461j.MenuItem_tooltipText);
            if (m37027u.m37029s(C7461j.MenuItem_iconTintMode)) {
                this.f17792E = C1068a0.m37281e(m37027u.m37037k(C7461j.MenuItem_iconTintMode, -1), this.f17792E);
            } else {
                this.f17792E = null;
            }
            if (m37027u.m37029s(C7461j.MenuItem_iconTint)) {
                this.f17791D = m37027u.m37045c(C7461j.MenuItem_iconTint);
            } else {
                this.f17791D = null;
            }
            m37027u.m37025w();
            this.f17801h = false;
        }

        /* renamed from: h */
        public void m18560h() {
            this.f17795b = 0;
            this.f17796c = 0;
            this.f17797d = 0;
            this.f17798e = 0;
            this.f17799f = true;
            this.f17800g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f17779e = clsArr;
        f17780f = clsArr;
    }

    public C7492g(Context context) {
        super(context);
        this.f17783c = context;
        Object[] objArr = {context};
        this.f17781a = objArr;
        this.f17782b = objArr;
    }

    /* renamed from: a */
    private Object m18570a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m18570a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m18560h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m18564d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f17788A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo17850a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m18566b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m18567a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m18562f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m18561g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m18568c(r13, r14, r0.m18566b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18568c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            g.a.o.g$b r0 = new g.a.o.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m18560h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m18564d()
            if (r15 != 0) goto Lb9
            g.h.l.b r15 = r0.f17788A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo17850a()
            if (r15 == 0) goto L82
            r0.m18566b()
            goto Lb9
        L82:
            r0.m18567a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m18562f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m18561g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m18566b()
            r12.m18568c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p202a.p209o.C7492g.m18568c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m18569b() {
        if (this.f17784d == null) {
            this.f17784d = m18570a(this.f17783c);
        }
        return this.f17784d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC7625a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f17783c.getResources().getLayout(i);
                    m18568c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
