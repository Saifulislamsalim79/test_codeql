package ai.kudi.agent.network.mods;

import ai.kudi.mediaservice.DrakeClient;
import ai.kudi.mediaservice.MediaAPI;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
/* compiled from: NetworkModule.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/network/di/NetworkModule;", "", "()V", "providesAuthInterceptor", "Lokhttp3/Interceptor;", "providesLoginInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesMediaService", "Lai/kudi/mediaservice/DrakeClient;", "providesVersionInterceptor", "Companion", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkModule {
    public static final Companion Companion;
    public static final int VERSION_CODE = 6733;
    public static final String VERSION_NAME = "3.2.163";

    /* compiled from: NetworkModule.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/network/di/NetworkModule$Companion;", "", "()V", "VERSION_CODE", "", "VERSION_NAME", "", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: providesAuthInterceptor$lambda-0  reason: not valid java name */
    public static final C14131c0 m39831providesAuthInterceptor$lambda0(InterfaceC14233u.InterfaceC14234a interfaceC14234a) {
        C14116a0 $r1 = interfaceC14234a.request();
        C14116a0.C14117a $r2 = $r1.m2914h();
        $r2.m2912a("X-source", "android_app");
        C14116a0 $r12 = $r2.m2911b();
        C14131c0 $r3 = interfaceC14234a.mo2478a($r12);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: providesVersionInterceptor$lambda-1  reason: not valid java name */
    public static final C14131c0 m39832providesVersionInterceptor$lambda1(InterfaceC14233u.InterfaceC14234a interfaceC14234a) {
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
    public final InterfaceC14233u providesAuthInterceptor() {
        C0330c r1 = C0330c.f684c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14207a providesLoginInterceptor() {
        C14207a.EnumC14208a $r1 = C14207a.EnumC14208a.NONE;
        C14207a $r2 = new C14207a();
        $r2.m2627c($r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DrakeClient providesMediaService() {
        DrakeClient $r1 = new DrakeClient((MediaAPI) null, 1, (DBUtils$1) null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC14233u providesVersionInterceptor() {
        ClassWriter r1 = ClassWriter.f682b;
        return r1;
    }
}
