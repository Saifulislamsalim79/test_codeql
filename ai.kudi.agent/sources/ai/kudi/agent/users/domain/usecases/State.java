package ai.kudi.agent.users.domain.usecases;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class State implements Object {
    public static final /* synthetic */ State Failed;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        State $r0 = new State();
        Failed = $r0;
    }

    private /* synthetic */ State() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        FetchUserByPhone.m41438throwAppropriateException$lambda0($r2);
    }
}
