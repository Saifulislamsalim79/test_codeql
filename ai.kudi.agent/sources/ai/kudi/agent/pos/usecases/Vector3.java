package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.pos.data.TrackPosResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Vector3 implements InterfaceC11291f {
    public static final /* synthetic */ Vector3 Zero;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Vector3 $r0 = new Vector3();
        Zero = $r0;
    }

    private /* synthetic */ Vector3() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        TrackPosResponse $r1 = PosOrderRequest.m40130trackPos$lambda3($r3);
        return $r1;
    }
}
