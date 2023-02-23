package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.util.Pref;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class CacheModule_ProvideCacheImplFactory implements InterfaceC9468d<Pref> {
    private final CacheModule module;

    public CacheModule_ProvideCacheImplFactory(CacheModule cacheModule) {
        this.module = cacheModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CacheModule_ProvideCacheImplFactory create(CacheModule cacheModule) {
        CacheModule_ProvideCacheImplFactory $r1 = new CacheModule_ProvideCacheImplFactory(cacheModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Pref provideCacheImpl(CacheModule cacheModule) {
        Pref $r0 = cacheModule.provideCacheImpl();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Pref cbrt() {
        CacheModule $r2 = this.module;
        Pref $r1 = provideCacheImpl($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39145cbrt() {
        Pref $r1 = cbrt();
        return $r1;
    }
}
