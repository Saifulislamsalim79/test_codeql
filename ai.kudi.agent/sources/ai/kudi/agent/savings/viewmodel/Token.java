package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.users.domain.package_1.User;
import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements Object {
    public static final /* synthetic */ Token BOOL;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        BOOL = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        User $r2 = (User) obj;
        CreateSavingPinViewModel.m40611updateSavingCategory$lambda13($r2);
    }
}
