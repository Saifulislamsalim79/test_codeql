package ai.kudi.agent.users.domain.usecases;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Subscription implements Object {
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
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        FetchUserByUsername.m41440throwAppropriateException$lambda0($r2);
    }
}
