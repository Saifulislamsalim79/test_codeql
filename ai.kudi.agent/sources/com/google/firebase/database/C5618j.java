package com.google.firebase.database;

import com.google.firebase.database.p131s.C5726a0;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5864s;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: MutableData.java */
/* renamed from: com.google.firebase.database.j */
/* loaded from: classes2.dex */
public class C5618j {

    /* renamed from: a */
    private final C5864s f13841a;

    /* renamed from: b */
    private final C5830l f13842b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5618j(InterfaceC5945n interfaceC5945n) {
        this(new C5864s(interfaceC5945n), new C5830l(""));
    }

    /* renamed from: a */
    InterfaceC5945n m24310a() {
        return this.f13841a.m23480a(this.f13842b);
    }

    /* renamed from: b */
    public Object m24309b() {
        return m24310a().getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5618j) {
            C5618j c5618j = (C5618j) obj;
            if (this.f13841a.equals(c5618j.f13841a) && this.f13842b.equals(c5618j.f13842b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        C5921b m23587Z = this.f13842b.m23587Z();
        StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        sb.append(m23587Z != null ? m23587Z.m23298b() : "<none>");
        sb.append(", value = ");
        sb.append(this.f13841a.m23479b().mo23215W(true));
        sb.append(" }");
        return sb.toString();
    }

    private C5618j(C5864s c5864s, C5830l c5830l) {
        this.f13841a = c5864s;
        this.f13842b = c5830l;
        C5726a0.m23998g(c5830l, m24309b());
    }
}
