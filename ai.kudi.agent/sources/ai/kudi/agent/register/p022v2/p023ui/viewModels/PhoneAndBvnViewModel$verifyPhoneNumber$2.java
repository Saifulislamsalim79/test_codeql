package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.HttpException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PhoneAndBvnViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel$verifyPhoneNumber$2 */
/* loaded from: classes.dex */
public final class PhoneAndBvnViewModel$verifyPhoneNumber$2 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ PhoneAndBvnViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneAndBvnViewModel$verifyPhoneNumber$2(PhoneAndBvnViewModel phoneAndBvnViewModel) {
        super(1);
        this.this$0 = phoneAndBvnViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        Throwable $r2 = th;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Log_OC.getArray(th, "it");
        boolean $z0 = th instanceof HttpException;
        if (!$z0) {
            PhoneAndBvnViewModel $r3 = this.this$0;
            PhoneAndBvnViewData $r4 = PhoneAndBvnViewModel.access$getState($r3);
            InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default("An error occurred, please check details and try again", null, 2, null);
            Object $r7 = $r6.invoke(th);
            String $r8 = (String) $r7;
            PhoneAndBvnViewData.Error $r5 = new PhoneAndBvnViewData.Error(null, $r8, null, 5, null);
            $r3.publish(PhoneAndBvnViewData.copy$default($r4, false, false, false, false, null, $r5, 23, null));
            return;
        }
        HttpException $r2 = (HttpException) th;
        int $i0 = $r2.m352a();
        if ($i0 == 503) {
            PhoneAndBvnViewModel $r32 = this.this$0;
            PhoneAndBvnViewData $r42 = PhoneAndBvnViewModel.access$getState($r32);
            PhoneAndBvnViewData.Error $r52 = new PhoneAndBvnViewData.Error(null, "This phone number already exists on Kudi.", null, 5, null);
            $r32.publish(PhoneAndBvnViewData.copy$default($r42, false, false, false, false, null, $r52, 23, null));
            return;
        }
        PhoneAndBvnViewModel $r33 = this.this$0;
        PhoneAndBvnViewData $r43 = PhoneAndBvnViewModel.access$getState($r33);
        InterfaceC11767l $r62 = KudiErrorParserKt.parseHttpError2$default("An error occured, please check details and try again", null, 2, null);
        Object $r72 = $r62.invoke(th);
        String $r82 = (String) $r72;
        PhoneAndBvnViewData.Error $r53 = new PhoneAndBvnViewData.Error(null, $r82, null, 5, null);
        $r33.publish(PhoneAndBvnViewData.copy$default($r43, false, false, false, false, null, $r53, 23, null));
    }
}
