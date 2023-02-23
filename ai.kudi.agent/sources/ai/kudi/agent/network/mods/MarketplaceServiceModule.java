package ai.kudi.agent.network.mods;

import ai.kudi.mediaservice.marketplaceCollection.API;
import ai.kudi.mediaservice.marketplaceCollection.FileStorageClient;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
/* compiled from: MarketplaceServiceModule.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/network/di/MarketplaceServiceModule;", "", "()V", "authInterceptor", "Lokhttp3/Interceptor;", "loggingterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesMediaService", "Lai/kudi/mediaservice/marketplaceCollection/FileStorageClient;", "versionInterceptor", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MarketplaceServiceModule {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authInterceptor$lambda-2  reason: not valid java name */
    public static final C14131c0 m39825authInterceptor$lambda2(InterfaceC14233u.InterfaceC14234a interfaceC14234a) {
        C14116a0 $r1 = interfaceC14234a.request();
        C14116a0.C14117a $r2 = $r1.m2914h();
        $r2.m2912a("X-Source", "Android");
        C14116a0 $r12 = $r2.m2911b();
        C14131c0 $r3 = interfaceC14234a.mo2478a($r12);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: versionInterceptor$lambda-0  reason: not valid java name */
    public static final C14131c0 m39826versionInterceptor$lambda0(InterfaceC14233u.InterfaceC14234a interfaceC14234a) {
        C14116a0 $r1 = interfaceC14234a.request();
        C14116a0.C14117a $r2 = $r1.m2914h();
        $r2.m2912a("X-Version-Name", "3.2.163");
        $r2.m2912a("X-Version-Code", "6733");
        C14116a0 $r12 = $r2.m2911b();
        C14131c0 $r3 = interfaceC14234a.mo2478a($r12);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC14233u authInterceptor() {
        Permission r1 = Permission.DELETE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14207a loggingterceptor() {
        C14207a $r1 = new C14207a();
        C14207a.EnumC14208a $r2 = C14207a.EnumC14208a.NONE;
        $r1.m2627c($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FileStorageClient providesMediaService() {
        FileStorageClient $r1 = new FileStorageClient((API) null, 1, (DBUtils$1) null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC14233u versionInterceptor() {
        C0329b r1 = C0329b.f683e;
        return r1;
    }
}
