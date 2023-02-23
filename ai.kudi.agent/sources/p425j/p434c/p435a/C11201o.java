package p425j.p434c.p435a;
/* compiled from: Prop.java */
/* renamed from: j.c.a.o */
/* loaded from: classes3.dex */
public class C11201o<T> {

    /* renamed from: a */
    private final String f25292a;

    C11201o(String str) {
        this.f25292a = str;
    }

    /* renamed from: b */
    public static <T> C11201o<T> m11394b(String str) {
        return new C11201o<>(str);
    }

    /* renamed from: a */
    public T m11395a(InterfaceC11203q interfaceC11203q) {
        return (T) interfaceC11203q.mo11388b(this);
    }

    /* renamed from: c */
    public T m11393c(InterfaceC11203q interfaceC11203q) {
        T m11395a = m11395a(interfaceC11203q);
        if (m11395a != null) {
            return m11395a;
        }
        throw new NullPointerException(this.f25292a);
    }

    /* renamed from: d */
    public void m11392d(InterfaceC11203q interfaceC11203q, T t) {
        interfaceC11203q.mo11389a(this, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11201o.class != obj.getClass()) {
            return false;
        }
        return this.f25292a.equals(((C11201o) obj).f25292a);
    }

    public int hashCode() {
        return this.f25292a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f25292a + "'}";
    }
}
