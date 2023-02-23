package androidx.core.p058os;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListPlatformWrapper.java */
/* renamed from: androidx.core.os.i */
/* loaded from: classes2.dex */
final class C1381i implements InterfaceC1380h {

    /* renamed from: a */
    private final LocaleList f4252a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1381i(LocaleList localeList) {
        this.f4252a = localeList;
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    /* renamed from: a */
    public Object mo36161a() {
        return this.f4252a;
    }

    public boolean equals(Object obj) {
        return this.f4252a.equals(((InterfaceC1380h) obj).mo36161a());
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    public Locale get(int i) {
        return this.f4252a.get(i);
    }

    public int hashCode() {
        return this.f4252a.hashCode();
    }

    @Override // androidx.core.p058os.InterfaceC1380h
    public int size() {
        return this.f4252a.size();
    }

    public String toString() {
        return this.f4252a.toString();
    }
}
