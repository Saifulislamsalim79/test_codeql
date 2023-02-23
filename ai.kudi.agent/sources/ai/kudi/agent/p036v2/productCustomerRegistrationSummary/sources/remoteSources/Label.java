package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.package_3.VerificationResponseBody;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.Label */
/* loaded from: classes.dex */
public final /* synthetic */ class Label implements InterfaceC11291f {

    /* renamed from: k */
    public static final /* synthetic */ Label f1944k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Label $r0 = new Label();
        f1944k = $r0;
    }

    private /* synthetic */ Label() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        VerificationResponseBody $r1 = VerifyCustomerRemoteSource.m41605verifyCustomer$lambda0($r3);
        return $r1;
    }
}
