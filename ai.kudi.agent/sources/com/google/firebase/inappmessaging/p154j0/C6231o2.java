package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.C5987f;
import com.google.firebase.C5988g;
import com.google.firebase.p167m.C6470a;
import com.google.firebase.p167m.InterfaceC6471b;
import com.google.firebase.p167m.InterfaceC6473d;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: DataCollectionHelper.java */
/* renamed from: com.google.firebase.inappmessaging.j0.o2 */
/* loaded from: classes2.dex */
public class C6231o2 {

    /* renamed from: a */
    private C6248q3 f15127a;

    /* renamed from: b */
    private AtomicBoolean f15128b;

    public C6231o2(C5988g c5988g, C6248q3 c6248q3, InterfaceC6473d interfaceC6473d) {
        this.f15127a = c6248q3;
        this.f15128b = new AtomicBoolean(c5988g.m23083s());
        interfaceC6473d.mo21934a(C5987f.class, new InterfaceC6471b() { // from class: com.google.firebase.inappmessaging.j0.g
            @Override // com.google.firebase.p167m.InterfaceC6471b
            /* renamed from: a */
            public final void mo21677a(C6470a c6470a) {
                C6231o2.this.m22507d(c6470a);
            }
        });
    }

    /* renamed from: b */
    private boolean m22509b() {
        return this.f15127a.m22483d("firebase_inapp_messaging_auto_data_collection_enabled");
    }

    /* renamed from: c */
    private boolean m22508c() {
        return this.f15127a.m22482e("auto_init");
    }

    /* renamed from: a */
    public boolean m22510a() {
        if (m22508c()) {
            return this.f15127a.m22484c("auto_init", true);
        }
        if (m22509b()) {
            return this.f15127a.m22485b("firebase_inapp_messaging_auto_data_collection_enabled", true);
        }
        return this.f15128b.get();
    }

    /* renamed from: d */
    public /* synthetic */ void m22507d(C6470a c6470a) {
        this.f15128b.set(((C5987f) c6470a.m21936a()).f14656a);
    }
}
