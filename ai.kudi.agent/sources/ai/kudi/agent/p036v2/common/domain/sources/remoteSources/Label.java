package ai.kudi.agent.p036v2.common.domain.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.common.domain.sources.remoteSources.Label */
/* loaded from: classes.dex */
public final /* synthetic */ class Label implements InterfaceC11291f {

    /* renamed from: i */
    public static final /* synthetic */ Label f1906i;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Label $r0 = new Label();
        f1906i = $r0;
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
        MarketplaceProductResponse $r1 = MarketplaceTopPickRemoteSource.m41519fetchMarketplaceTopPick$lambda0($r3);
        return $r1;
    }
}
