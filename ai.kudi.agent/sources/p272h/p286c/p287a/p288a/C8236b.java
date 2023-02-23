package p272h.p286c.p287a.p288a;
/* compiled from: Encoding.java */
/* renamed from: h.c.a.a.b */
/* loaded from: classes2.dex */
public final class C8236b {

    /* renamed from: a */
    private final String f19806a;

    private C8236b(String str) {
        if (str != null) {
            this.f19806a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C8236b m16444b(String str) {
        return new C8236b(str);
    }

    /* renamed from: a */
    public String m16445a() {
        return this.f19806a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8236b) {
            return this.f19806a.equals(((C8236b) obj).f19806a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19806a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f19806a + "\"}";
    }
}
