package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.streaming.CustomerOnboardingResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.ClassWriter */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ ClassWriter f1942b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f1942b = $r0;
    }

    private /* synthetic */ ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        CustomerOnboardingResponse $r1 = RegisterCustomerRemoteSource.m41601registerCustomer$lambda0($r3);
        return $r1;
    }
}
