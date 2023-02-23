package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.C1515c;
import androidx.lifecycle.AbstractC1565i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: FragmentTransaction.java */
/* renamed from: androidx.fragment.app.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1449b0 {

    /* renamed from: b */
    int f4461b;

    /* renamed from: c */
    int f4462c;

    /* renamed from: d */
    int f4463d;

    /* renamed from: e */
    int f4464e;

    /* renamed from: f */
    int f4465f;

    /* renamed from: g */
    boolean f4466g;

    /* renamed from: i */
    String f4468i;

    /* renamed from: j */
    int f4469j;

    /* renamed from: k */
    CharSequence f4470k;

    /* renamed from: l */
    int f4471l;

    /* renamed from: m */
    CharSequence f4472m;

    /* renamed from: n */
    ArrayList<String> f4473n;

    /* renamed from: o */
    ArrayList<String> f4474o;

    /* renamed from: q */
    ArrayList<Runnable> f4476q;

    /* renamed from: a */
    ArrayList<C1450a> f4460a = new ArrayList<>();

    /* renamed from: h */
    boolean f4467h = true;

    /* renamed from: p */
    boolean f4475p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* renamed from: androidx.fragment.app.b0$a */
    /* loaded from: classes2.dex */
    public static final class C1450a {

        /* renamed from: a */
        int f4477a;

        /* renamed from: b */
        Fragment f4478b;

        /* renamed from: c */
        boolean f4479c;

        /* renamed from: d */
        int f4480d;

        /* renamed from: e */
        int f4481e;

        /* renamed from: f */
        int f4482f;

        /* renamed from: g */
        int f4483g;

        /* renamed from: h */
        AbstractC1565i.c f4484h;

        /* renamed from: i */
        AbstractC1565i.c f4485i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1450a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1450a(int i, Fragment fragment) {
            this.f4477a = i;
            this.f4478b = fragment;
            this.f4479c = false;
            AbstractC1565i.c cVar = AbstractC1565i.c.w;
            this.f4484h = cVar;
            this.f4485i = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1450a(int i, Fragment fragment, boolean z) {
            this.f4477a = i;
            this.f4478b = fragment;
            this.f4479c = z;
            AbstractC1565i.c cVar = AbstractC1565i.c.w;
            this.f4484h = cVar;
            this.f4485i = cVar;
        }

        C1450a(int i, Fragment fragment, AbstractC1565i.c cVar) {
            this.f4477a = i;
            this.f4478b = fragment;
            this.f4479c = false;
            this.f4484h = fragment.mMaxState;
            this.f4485i = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1449b0(C1504n c1504n, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public AbstractC1449b0 m35829b(int i, Fragment fragment) {
        mo35800o(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC1449b0 m35828c(int i, Fragment fragment, String str) {
        mo35800o(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC1449b0 m35827d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        m35828c(viewGroup.getId(), fragment, str);
        return this;
    }

    /* renamed from: e */
    public AbstractC1449b0 m35826e(Fragment fragment, String str) {
        mo35800o(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35825f(C1450a c1450a) {
        this.f4460a.add(c1450a);
        c1450a.f4480d = this.f4461b;
        c1450a.f4481e = this.f4462c;
        c1450a.f4482f = this.f4463d;
        c1450a.f4483g = this.f4464e;
    }

    /* renamed from: g */
    public AbstractC1449b0 m35824g(String str) {
        if (this.f4467h) {
            this.f4466g = true;
            this.f4468i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public AbstractC1449b0 m35823h(Fragment fragment) {
        m35825f(new C1450a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo35805i();

    /* renamed from: j */
    public abstract int mo35804j();

    /* renamed from: k */
    public abstract void mo35803k();

    /* renamed from: l */
    public abstract void mo35802l();

    /* renamed from: m */
    public AbstractC1449b0 mo35801m(Fragment fragment) {
        m35825f(new C1450a(6, fragment));
        return this;
    }

    /* renamed from: n */
    public AbstractC1449b0 m35822n() {
        if (!this.f4466g) {
            this.f4467h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo35800o(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C1515c.m35641h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m35825f(new C1450a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: p */
    public abstract boolean mo35799p();

    /* renamed from: q */
    public AbstractC1449b0 mo35798q(Fragment fragment) {
        m35825f(new C1450a(3, fragment));
        return this;
    }

    /* renamed from: r */
    public AbstractC1449b0 m35821r(int i, Fragment fragment) {
        m35820s(i, fragment, null);
        return this;
    }

    /* renamed from: s */
    public AbstractC1449b0 m35820s(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo35800o(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: t */
    public AbstractC1449b0 m35819t(int i, int i2, int i3, int i4) {
        this.f4461b = i;
        this.f4462c = i2;
        this.f4463d = i3;
        this.f4464e = i4;
        return this;
    }

    /* renamed from: u */
    public AbstractC1449b0 mo35797u(Fragment fragment, AbstractC1565i.c cVar) {
        m35825f(new C1450a(10, fragment, cVar));
        return this;
    }

    /* renamed from: v */
    public AbstractC1449b0 m35818v(boolean z) {
        this.f4475p = z;
        return this;
    }
}
