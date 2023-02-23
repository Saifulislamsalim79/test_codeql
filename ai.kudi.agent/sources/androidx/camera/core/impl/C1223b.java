package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1227f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_Config_Option.java */
/* renamed from: androidx.camera.core.impl.b */
/* loaded from: classes2.dex */
public final class C1223b<T> extends InterfaceC1227f.AbstractC1228a<T> {

    /* renamed from: a */
    private final String f3696a;

    /* renamed from: b */
    private final Class<T> f3697b;

    /* renamed from: c */
    private final Object f3698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1223b(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f3696a = str;
            if (cls != null) {
                this.f3697b = cls;
                this.f3698c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f.AbstractC1228a
    /* renamed from: c */
    public String mo36723c() {
        return this.f3696a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f.AbstractC1228a
    /* renamed from: d */
    public Object mo36722d() {
        return this.f3698c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f.AbstractC1228a
    /* renamed from: e */
    public Class<T> mo36721e() {
        return this.f3697b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1227f.AbstractC1228a) {
            InterfaceC1227f.AbstractC1228a abstractC1228a = (InterfaceC1227f.AbstractC1228a) obj;
            if (this.f3696a.equals(abstractC1228a.mo36723c()) && this.f3697b.equals(abstractC1228a.mo36721e())) {
                Object obj2 = this.f3698c;
                if (obj2 == null) {
                    if (abstractC1228a.mo36722d() == null) {
                        return true;
                    }
                } else if (obj2.equals(abstractC1228a.mo36722d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f3696a.hashCode() ^ 1000003) * 1000003) ^ this.f3697b.hashCode()) * 1000003;
        Object obj = this.f3698c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f3696a + ", valueClass=" + this.f3697b + ", token=" + this.f3698c + "}";
    }
}
