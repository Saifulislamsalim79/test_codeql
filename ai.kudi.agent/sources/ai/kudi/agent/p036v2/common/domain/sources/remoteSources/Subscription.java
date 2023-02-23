package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.Subscription */
/* loaded from: classes.dex */
public final /* synthetic */ class Subscription implements InterfaceC11291f {
    public static final /* synthetic */ Subscription subscribed;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Subscription $r0 = new Subscription();
        subscribed = $r0;
    }

    private /* synthetic */ Subscription() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        ProductFieldResponse $r1 = ProductFieldsRemoteSource.m41523fetchProductFields$lambda0($r3);
        return $r1;
    }
}
