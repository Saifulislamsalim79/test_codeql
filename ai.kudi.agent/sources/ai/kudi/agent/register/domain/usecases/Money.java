package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Money implements InterfaceC11291f {
    public static final /* synthetic */ Money ZERO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Money $r0 = new Money();
        ZERO = $r0;
    }

    private /* synthetic */ Money() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        PersonalInfo $r1 = (PersonalInfo) obj;
        return Log_OC.getArray($r1, "it");
    }
}
