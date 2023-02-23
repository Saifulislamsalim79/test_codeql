package ai.kudi.agent.users.domain.usecases;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class HttpStatus implements Object {
    public static final /* synthetic */ HttpStatus CONFLICT;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        HttpStatus $r0 = new HttpStatus();
        CONFLICT = $r0;
    }

    private /* synthetic */ HttpStatus() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        FetchUserByEmail.m41436throwAppropriateException$lambda0($r2);
    }
}
