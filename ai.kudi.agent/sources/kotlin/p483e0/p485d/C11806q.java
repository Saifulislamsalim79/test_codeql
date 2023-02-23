package kotlin.p483e0.p485d;
/* compiled from: PackageReference.kt */
/* renamed from: kotlin.e0.d.q */
/* loaded from: classes3.dex */
public final class C11806q implements InterfaceC11786d {

    /* renamed from: c */
    private final Class<?> f26496c;

    public C11806q(Class<?> cls, String str) {
        l.f(cls, "jClass");
        l.f(str, "moduleName");
        this.f26496c = cls;
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11786d
    /* renamed from: a */
    public Class<?> mo9979a() {
        return this.f26496c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11806q) && l.b(mo9979a(), ((C11806q) obj).mo9979a());
    }

    public int hashCode() {
        return mo9979a().hashCode();
    }

    public String toString() {
        return mo9979a().toString() + " (Kotlin reflection is not available)";
    }
}
