package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.model.LookUpUserRequest;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Frame implements InterfaceC11291f {

    /* renamed from: h */
    public static final /* synthetic */ Frame f1859h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Frame $r0 = new Frame();
        f1859h = $r0;
    }

    private /* synthetic */ Frame() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        LookUpUserRequest $r1 = HandleOrPhoneLookUp.m41443execute$lambda0($r3);
        return $r1;
    }
}
