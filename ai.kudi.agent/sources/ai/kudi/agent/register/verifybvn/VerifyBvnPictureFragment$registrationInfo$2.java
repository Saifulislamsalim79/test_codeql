package ai.kudi.agent.register.verifybvn;

import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: VerifyBvnPictureFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class VerifyBvnPictureFragment$registrationInfo$2 extends AbstractC11802m implements InterfaceC11756a<RegistrationInfo> {
    final /* synthetic */ VerifyBvnPictureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyBvnPictureFragment$registrationInfo$2(VerifyBvnPictureFragment verifyBvnPictureFragment) {
        super(0);
        this.this$0 = verifyBvnPictureFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final RegistrationInfo invoke() {
        VerifyBvnPictureFragment $r1 = this.this$0;
        Bundle $r2 = $r1.getArguments();
        RegistrationInfo registrationInfo = $r2 == null ? null : (ai.kudi.agent.register.domain.wiki.RegistrationInfo) $r2.getParcelable("ARGS_REG_INFO");
        boolean $z0 = registrationInfo instanceof ai.kudi.agent.register.domain.wiki.RegistrationInfo;
        if ($z0) {
            return registrationInfo;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ RegistrationInfo invoke2() {
        ai.kudi.agent.register.domain.wiki.RegistrationInfo $r1 = invoke();
        return $r1;
    }
}
