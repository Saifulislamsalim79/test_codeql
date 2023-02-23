package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.settings.domain.package_4.RequestPinResetOtpResponse;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
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
        RequestPinResetOtpResponse $r1 = (RequestPinResetOtpResponse) obj;
        return Log_OC.getArray($r1, "it");
    }
}
