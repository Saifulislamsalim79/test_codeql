package ai.kudi.agent.core.fcm;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Function implements Object {
    public static final /* synthetic */ Function LOG;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Function $r0 = new Function();
        LOG = $r0;
    }

    private /* synthetic */ Function() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        FCMListenerService.m39138onNewToken$lambda3($r2);
    }
}
