package ai.kudi.agent.kshock.labs;

import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class KShockModule_ProvidesKShockApiFactory implements InterfaceC9468d<KshockApi> {
    private final KShockModule module;
    private final InterfaceC11700a<C14841m> retrofitProvider;

    public KShockModule_ProvidesKShockApiFactory(KShockModule kShockModule, InterfaceC11700a interfaceC11700a) {
        this.module = kShockModule;
        this.retrofitProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KShockModule_ProvidesKShockApiFactory create(KShockModule kShockModule, InterfaceC11700a interfaceC11700a) {
        KShockModule_ProvidesKShockApiFactory $r2 = new KShockModule_ProvidesKShockApiFactory(kShockModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ai.kudi.agent.kshock.data.domain.attention.KshockApi providesKShockApi(KShockModule kShockModule, C14841m c14841m) {
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r1 = kShockModule.providesKShockApi(c14841m);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public ai.kudi.agent.kshock.data.domain.attention.KshockApi m38813b() {
        KShockModule $r1 = this.module;
        InterfaceC11700a $r2 = this.retrofitProvider;
        Object $r3 = $r2.get();
        C14841m $r4 = (C14841m) $r3;
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r5 = providesKShockApi($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m38812b() {
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r1 = m38813b();
        return $r1;
    }
}
