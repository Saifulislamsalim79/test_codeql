package ai.kudi.agent.core.fcm;

import ai.kudi.agent.users.domain.package_1.User;
import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Chunk implements Object {
    public static final /* synthetic */ Chunk NEWLINE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Chunk $r0 = new Chunk();
        NEWLINE = $r0;
    }

    private /* synthetic */ Chunk() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        User $r2 = (User) obj;
        FCMListenerService.m39136onNewToken$lambda2$lambda0($r2);
    }
}
