package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p201g.p218e.C7521a;
/* loaded from: classes2.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C7521a<String, Method> f5752a;

    /* renamed from: b */
    protected final C7521a<String, Method> f5753b;

    /* renamed from: c */
    protected final C7521a<String, Class> f5754c;

    /* loaded from: classes2.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C7521a<String, Method> c7521a, C7521a<String, Method> c7521a2, C7521a<String, Class> c7521a3) {
        this.f5752a = c7521a;
        this.f5753b = c7521a2;
        this.f5754c = c7521a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m34314N(InterfaceC1888b interfaceC1888b) {
        try {
            mo34294I(m34313c(interfaceC1888b.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC1888b.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m34313c(Class<? extends InterfaceC1888b> cls) throws ClassNotFoundException {
        Class cls2 = this.f5754c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f5754c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m34312d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5752a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f5752a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    private Method m34311e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5753b.get(cls.getName());
        if (method == null) {
            Class m34313c = m34313c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m34313c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f5753b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo34298A(byte[] bArr);

    /* renamed from: B */
    public void m34322B(byte[] bArr, int i) {
        mo34284w(i);
        mo34298A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo34297C(CharSequence charSequence);

    /* renamed from: D */
    public void m34321D(CharSequence charSequence, int i) {
        mo34284w(i);
        mo34297C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo34296E(int i);

    /* renamed from: F */
    public void m34320F(int i, int i2) {
        mo34284w(i2);
        mo34296E(i);
    }

    /* renamed from: G */
    protected abstract void mo34295G(Parcelable parcelable);

    /* renamed from: H */
    public void m34319H(Parcelable parcelable, int i) {
        mo34284w(i);
        mo34295G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo34294I(String str);

    /* renamed from: J */
    public void m34318J(String str, int i) {
        mo34284w(i);
        mo34294I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC1888b> void m34317K(T t, VersionedParcel versionedParcel) {
        try {
            m34311e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m34316L(InterfaceC1888b interfaceC1888b) {
        if (interfaceC1888b == null) {
            mo34294I(null);
            return;
        }
        m34314N(interfaceC1888b);
        VersionedParcel mo34292b = mo34292b();
        m34317K(interfaceC1888b, mo34292b);
        mo34292b.mo34293a();
    }

    /* renamed from: M */
    public void m34315M(InterfaceC1888b interfaceC1888b, int i) {
        mo34284w(i);
        m34316L(interfaceC1888b);
    }

    /* renamed from: a */
    protected abstract void mo34293a();

    /* renamed from: b */
    protected abstract VersionedParcel mo34292b();

    /* renamed from: f */
    public boolean m34310f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo34291g();

    /* renamed from: h */
    public boolean m34309h(boolean z, int i) {
        return !mo34288m(i) ? z : mo34291g();
    }

    /* renamed from: i */
    protected abstract byte[] mo34290i();

    /* renamed from: j */
    public byte[] m34308j(byte[] bArr, int i) {
        return !mo34288m(i) ? bArr : mo34290i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo34289k();

    /* renamed from: l */
    public CharSequence m34307l(CharSequence charSequence, int i) {
        return !mo34288m(i) ? charSequence : mo34289k();
    }

    /* renamed from: m */
    protected abstract boolean mo34288m(int i);

    /* renamed from: n */
    protected <T extends InterfaceC1888b> T m34306n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m34312d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    protected abstract int mo34287o();

    /* renamed from: p */
    public int m34305p(int i, int i2) {
        return !mo34288m(i2) ? i : mo34287o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo34286q();

    /* renamed from: r */
    public <T extends Parcelable> T m34304r(T t, int i) {
        return !mo34288m(i) ? t : (T) mo34286q();
    }

    /* renamed from: s */
    protected abstract String mo34285s();

    /* renamed from: t */
    public String m34303t(String str, int i) {
        return !mo34288m(i) ? str : mo34285s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends InterfaceC1888b> T m34302u() {
        String mo34285s = mo34285s();
        if (mo34285s == null) {
            return null;
        }
        return (T) m34306n(mo34285s, mo34292b());
    }

    /* renamed from: v */
    public <T extends InterfaceC1888b> T m34301v(T t, int i) {
        return !mo34288m(i) ? t : (T) m34302u();
    }

    /* renamed from: w */
    protected abstract void mo34284w(int i);

    /* renamed from: x */
    public void m34300x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo34283y(boolean z);

    /* renamed from: z */
    public void m34299z(boolean z, int i) {
        mo34284w(i);
        mo34283y(z);
    }
}
