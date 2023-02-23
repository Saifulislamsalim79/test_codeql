package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.transactions.domain.dto.RequestStatementResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Unit implements InterfaceC11291f {
    public static final /* synthetic */ Unit PERCENT;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Unit $r0 = new Unit();
        PERCENT = $r0;
    }

    private /* synthetic */ Unit() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        RequestStatementResponse $r1 = RequestStatement.m41114excecute$lambda0($r3);
        return $r1;
    }
}
