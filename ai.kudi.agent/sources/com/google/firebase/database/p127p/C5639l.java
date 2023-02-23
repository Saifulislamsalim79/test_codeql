package com.google.firebase.database.p127p;

import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import com.google.firebase.database.p131s.InterfaceC5892y;
import com.google.firebase.p163j.AbstractC6465a;
import com.google.firebase.p163j.p164b.InterfaceC6466a;
import com.google.firebase.p163j.p164b.InterfaceC6467b;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AndroidAppCheckTokenProvider.java */
/* renamed from: com.google.firebase.database.p.l */
/* loaded from: classes2.dex */
public class C5639l implements InterfaceC5892y {

    /* renamed from: a */
    private final InterfaceC6558a<InterfaceC6467b> f13870a;

    /* renamed from: b */
    private final AtomicReference<InterfaceC6467b> f13871b = new AtomicReference<>();

    public C5639l(InterfaceC6558a<InterfaceC6467b> interfaceC6558a) {
        this.f13870a = interfaceC6558a;
        interfaceC6558a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.database.p.d
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                C5639l.this.m24290f(interfaceC6560b);
            }
        });
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5892y
    /* renamed from: a */
    public void mo23383a(boolean z, final InterfaceC5892y.InterfaceC5893a interfaceC5893a) {
        InterfaceC6467b interfaceC6467b = this.f13871b.get();
        if (interfaceC6467b != null) {
            j<AbstractC6465a> m21939a = interfaceC6467b.m21939a(z);
            m21939a.f(new InterfaceC4458g() { // from class: com.google.firebase.database.p.c
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    InterfaceC5892y.InterfaceC5893a.this.mo23381a(((AbstractC6465a) obj).m21940a());
                }
            });
            m21939a.d(new InterfaceC4456f() { // from class: com.google.firebase.database.p.a
                @Override // com.google.android.gms.tasks.InterfaceC4456f
                /* renamed from: b */
                public final void mo15657b(Exception exc) {
                    InterfaceC5892y.InterfaceC5893a.this.onError(exc.getMessage());
                }
            });
            return;
        }
        interfaceC5893a.mo23381a(null);
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5892y
    /* renamed from: b */
    public void mo23382b(final ExecutorService executorService, final InterfaceC5892y.InterfaceC5894b interfaceC5894b) {
        this.f13870a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.database.p.b
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                ((InterfaceC6467b) interfaceC6560b.get()).m21938b(new InterfaceC6466a() { // from class: com.google.firebase.database.p.e
                });
            }
        });
    }

    /* renamed from: f */
    public /* synthetic */ void m24290f(InterfaceC6560b interfaceC6560b) {
        this.f13871b.set((InterfaceC6467b) interfaceC6560b.get());
    }
}
