package p425j.p434c.p435a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p425j.p434c.p435a.InterfaceC11187i;
import p425j.p434c.p435a.p436u.C11209a;
/* compiled from: RegistryImpl.java */
/* renamed from: j.c.a.p */
/* loaded from: classes3.dex */
class C11202p implements InterfaceC11187i.InterfaceC11188a {

    /* renamed from: a */
    private final List<InterfaceC11187i> f25293a;

    /* renamed from: b */
    private final List<InterfaceC11187i> f25294b;

    /* renamed from: c */
    private final Set<InterfaceC11187i> f25295c = new HashSet(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11202p(List<InterfaceC11187i> list) {
        this.f25293a = list;
        this.f25294b = new ArrayList(list.size());
    }

    /* renamed from: a */
    private void m11391a(InterfaceC11187i interfaceC11187i) {
        if (this.f25294b.contains(interfaceC11187i)) {
            return;
        }
        if (!this.f25295c.contains(interfaceC11187i)) {
            this.f25295c.add(interfaceC11187i);
            interfaceC11187i.mo11422c(this);
            this.f25295c.remove(interfaceC11187i);
            if (this.f25294b.contains(interfaceC11187i)) {
                return;
            }
            if (C11209a.class.isAssignableFrom(interfaceC11187i.getClass())) {
                this.f25294b.add(0, interfaceC11187i);
                return;
            } else {
                this.f25294b.add(interfaceC11187i);
                return;
            }
        }
        throw new IllegalStateException("Cyclic dependency chain found: " + this.f25295c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<InterfaceC11187i> m11390b() {
        for (InterfaceC11187i interfaceC11187i : this.f25293a) {
            m11391a(interfaceC11187i);
        }
        return this.f25294b;
    }
}
