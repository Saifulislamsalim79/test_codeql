package com.google.firebase.database;

import com.google.firebase.C5988g;
import com.google.firebase.auth.internal.InterfaceC5213b;
import com.google.firebase.database.p127p.C5639l;
import com.google.firebase.database.p127p.C5640m;
import com.google.firebase.database.p131s.C5753h;
import com.google.firebase.database.p131s.C5859o;
import com.google.firebase.database.p131s.InterfaceC5892y;
import com.google.firebase.p163j.p164b.InterfaceC6467b;
import com.google.firebase.p170o.InterfaceC6558a;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseDatabaseComponent.java */
/* renamed from: com.google.firebase.database.g */
/* loaded from: classes2.dex */
public class C5616g {

    /* renamed from: a */
    private final Map<C5859o, C5615f> f13837a = new HashMap();

    /* renamed from: b */
    private final C5988g f13838b;

    /* renamed from: c */
    private final InterfaceC5892y f13839c;

    /* renamed from: d */
    private final InterfaceC5892y f13840d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5616g(C5988g c5988g, InterfaceC6558a<InterfaceC5213b> interfaceC6558a, InterfaceC6558a<InterfaceC6467b> interfaceC6558a2) {
        this.f13838b = c5988g;
        this.f13839c = new C5640m(interfaceC6558a);
        this.f13840d = new C5639l(interfaceC6558a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C5615f m24314a(C5859o c5859o) {
        C5615f c5615f;
        c5615f = this.f13837a.get(c5859o);
        if (c5615f == null) {
            C5753h c5753h = new C5753h();
            if (!this.f13838b.m23082t()) {
                c5753h.m23895K(this.f13838b.m23090l());
            }
            c5753h.m23896J(this.f13838b);
            c5753h.m23897I(this.f13839c);
            c5753h.m23898H(this.f13840d);
            C5615f c5615f2 = new C5615f(this.f13838b, c5859o, c5753h);
            this.f13837a.put(c5859o, c5615f2);
            c5615f = c5615f2;
        }
        return c5615f;
    }
}
