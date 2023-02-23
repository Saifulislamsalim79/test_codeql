package com.google.firebase.database.p127p;

import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.C5207h;
import com.google.firebase.auth.internal.InterfaceC5211a;
import com.google.firebase.auth.internal.InterfaceC5213b;
import com.google.firebase.database.p131s.InterfaceC5892y;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p171p.C6562b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AndroidAuthTokenProvider.java */
/* renamed from: com.google.firebase.database.p.m */
/* loaded from: classes2.dex */
public class C5640m implements InterfaceC5892y {

    /* renamed from: a */
    private final InterfaceC6558a<InterfaceC5213b> f13872a;

    /* renamed from: b */
    private final AtomicReference<InterfaceC5213b> f13873b = new AtomicReference<>();

    public C5640m(InterfaceC6558a<InterfaceC5213b> interfaceC6558a) {
        this.f13872a = interfaceC6558a;
        interfaceC6558a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.database.p.i
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                C5640m.this.m24283i(interfaceC6560b);
            }
        });
    }

    /* renamed from: c */
    private static boolean m24289c(Exception exc) {
        return (exc instanceof FirebaseApiNotAvailableException) || (exc instanceof FirebaseNoSignedInUserException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ void m24284h(InterfaceC5892y.InterfaceC5893a interfaceC5893a, Exception exc) {
        if (m24289c(exc)) {
            interfaceC5893a.mo23381a(null);
        } else {
            interfaceC5893a.onError(exc.getMessage());
        }
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5892y
    /* renamed from: a */
    public void mo23383a(boolean z, final InterfaceC5892y.InterfaceC5893a interfaceC5893a) {
        InterfaceC5213b interfaceC5213b = this.f13873b.get();
        if (interfaceC5213b != null) {
            j<C5207h> mo25342b = interfaceC5213b.mo25342b(z);
            mo25342b.f(new InterfaceC4458g() { // from class: com.google.firebase.database.p.j
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    InterfaceC5892y.InterfaceC5893a.this.mo23381a(((C5207h) obj).m25359c());
                }
            });
            mo25342b.d(new InterfaceC4456f() { // from class: com.google.firebase.database.p.k
                @Override // com.google.android.gms.tasks.InterfaceC4456f
                /* renamed from: b */
                public final void mo15657b(Exception exc) {
                    C5640m.m24284h(InterfaceC5892y.InterfaceC5893a.this, exc);
                }
            });
            return;
        }
        interfaceC5893a.mo23381a(null);
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5892y
    /* renamed from: b */
    public void mo23382b(final ExecutorService executorService, final InterfaceC5892y.InterfaceC5894b interfaceC5894b) {
        this.f13872a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.database.p.g
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                ((InterfaceC5213b) interfaceC6560b.get()).mo25343a(new InterfaceC5211a() { // from class: com.google.firebase.database.p.h
                    @Override // com.google.firebase.auth.internal.InterfaceC5211a
                    /* renamed from: a */
                    public final void mo24294a(C6562b c6562b) {
                        r1.execute(new Runnable() { // from class: com.google.firebase.database.p.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC5892y.InterfaceC5894b.this.mo23380a(c6562b.m21633a());
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: i */
    public /* synthetic */ void m24283i(InterfaceC6560b interfaceC6560b) {
        this.f13873b.set((InterfaceC5213b) interfaceC6560b.get());
    }
}
