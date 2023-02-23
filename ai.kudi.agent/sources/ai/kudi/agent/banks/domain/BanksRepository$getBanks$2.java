package ai.kudi.agent.banks.domain;

import com.google.firebase.database.C5611c;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BanksRepository.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lcom/google/firebase/database/DatabaseError;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class BanksRepository$getBanks$2 extends AbstractC11802m implements InterfaceC11767l<C5611c, C13666w> {
    public static final BanksRepository$getBanks$2 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        BanksRepository$getBanks$2 $r0 = new BanksRepository$getBanks$2();
        INSTANCE = $r0;
    }

    BanksRepository$getBanks$2() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C5611c c5611c) {
        C5611c $r2 = c5611c;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C5611c c5611c) {
        Log_OC.getArray(c5611c, "it");
        RuntimeException $r1 = c5611c.m24328i();
        RuntimeException r3 = $r1;
        r3.printStackTrace();
    }
}
