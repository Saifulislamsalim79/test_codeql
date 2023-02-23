package ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.package_3.CollectionTransactionPaymentResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.sources.remoteSources.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0705c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0705c f1931d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0705c $r0 = new C0705c();
        f1931d = $r0;
    }

    private /* synthetic */ C0705c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        CollectionTransactionPaymentResponse $r1 = CollectionTransactionRemoteSource.m41577transactCollection$lambda0($r3);
        return $r1;
    }
}
