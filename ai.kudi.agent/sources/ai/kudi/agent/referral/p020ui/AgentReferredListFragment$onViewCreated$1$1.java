package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.referral.AgentReferralStatus;
import ai.kudi.agent.referral.presenters.AgentReferralListPresenter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferredListFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "referralId", "", "phoneNumber", TransactionField.STATUS}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment$onViewCreated$1$1 */
/* loaded from: classes.dex */
final class AgentReferredListFragment$onViewCreated$1$1 extends AbstractC11802m implements InterfaceC11772q<String, String, String, C13666w> {
    final /* synthetic */ AgentReferredListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentReferredListFragment$onViewCreated$1$1(AgentReferredListFragment agentReferredListFragment) {
        super(3);
        this.this$0 = agentReferredListFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(String str, String str2, String str3) {
        String $r4 = str;
        String $r5 = str2;
        String $r6 = str3;
        invoke2($r4, $r5, $r6);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        boolean $z0;
        Log_OC.getArray(str, "referralId");
        Log_OC.getArray(str2, "phoneNumber");
        Log_OC.getArray(str3, TransactionField.STATUS);
        AgentReferralStatus $r4 = AgentReferralStatus.REGISTERED;
        String $r5 = $r4.name();
        boolean $z02 = Log_OC.append(str3, $r5);
        boolean $z1 = true;
        if ($z02) {
            $z0 = true;
        } else {
            AgentReferralStatus $r42 = AgentReferralStatus.ACTIVE;
            String $r52 = $r42.name();
            $z0 = Log_OC.append(str3, $r52);
        }
        if ($z0) {
            AgentReferredListFragment $r6 = this.this$0;
            InterfaceC9413d $r7 = ((AbstractC9412c) $r6).presenter;
            AgentReferralListPresenter $r8 = (AgentReferralListPresenter) $r7;
            $r8.openAgentSummary(str, str2);
            return;
        }
        AgentReferralStatus $r43 = AgentReferralStatus.INACTIVE;
        String $r53 = $r43.name();
        boolean $z03 = Log_OC.append(str3, $r53);
        if (!$z03) {
            AgentReferralStatus $r44 = AgentReferralStatus.PENDING;
            String $r54 = $r44.name();
            $z1 = Log_OC.append(str3, $r54);
        }
        if ($z1) {
            AgentReferredListFragment $r62 = this.this$0;
            InterfaceC9413d $r72 = ((AbstractC9412c) $r62).presenter;
            AgentReferralListPresenter $r82 = (AgentReferralListPresenter) $r72;
            $r82.buzzReferredAgent(str, str2);
        }
    }
}
