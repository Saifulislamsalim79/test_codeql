package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.transactions.data.repositories.dto.TransactionModel;
import ai.kudi.agent.transactions.domain.dto.TransactionKt;
import java.util.HashMap;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Position implements InterfaceC11291f {
    public static final /* synthetic */ Position TOP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Position $r0 = new Position();
        TOP = $r0;
    }

    private /* synthetic */ Position() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        TransactionModel $r3 = (TransactionModel) obj;
        HashMap $r1 = TransactionKt.toTransaction($r3);
        return $r1;
    }
}
