package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.ReferredAgentsListBinding;
import ai.kudi.agent.referral.AgentReferralStatus;
import ai.kudi.agent.referral.presenters.AgentReferralListPresenter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import kotlin.p557z.C13726r;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AgentReferredListFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment$initBottomSheet$1 */
/* loaded from: classes.dex */
public final class AgentReferredListFragment$initBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ AgentReferredListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentReferredListFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment$initBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C04191 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ AgentReferredListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04191(AgentReferredListFragment agentReferredListFragment) {
            super(2);
            this.this$0 = agentReferredListFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            String $r3 = str;
            Integer $r4 = num;
            int $i0 = $r4.intValue();
            invoke($r3, $i0);
            C13666w r5 = C13666w.f30112a;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(String str, int i) {
            String $r7;
            Log_OC.getArray(str, TransactionField.STATUS);
            AgentReferredListFragment $r2 = this.this$0;
            ReferredAgentsListBinding $r3 = $r2.requireBinding();
            TextView $r4 = $r3.filterAction;
            Locale $r5 = Locale.ROOT;
            Log_OC.loadImage($r5, "ROOT");
            String $r6 = str.toLowerCase($r5);
            String $r72 = $r6;
            Log_OC.loadImage($r6, "(this as java.lang.String).toLowerCase(locale)");
            int $i0 = $r6.length();
            boolean $z0 = $i0 > 0;
            if ($z0) {
                StringBuilder r12 = new StringBuilder();
                char $c1 = $r6.charAt(0);
                boolean $z02 = Character.isLowerCase($c1);
                if ($z02) {
                    Locale $r52 = Locale.ROOT;
                    Log_OC.loadImage($r52, "ROOT");
                    $r7 = C13252b.m5546d($c1, $r52);
                } else {
                    $r7 = String.valueOf($c1);
                }
                r12.append($r7.toString());
                if ($r6 == null) {
                    NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw r13;
                }
                String $r62 = $r6.substring(1);
                Log_OC.loadImage($r62, "(this as java.lang.String).substring(startIndex)");
                r12.append($r62);
                $r72 = r12.toString();
            }
            TextView r14 = $r4;
            r14.setText($r72);
            AgentReferredListFragment $r22 = this.this$0;
            InterfaceC9413d $r10 = ((AbstractC9412c) $r22).presenter;
            AgentReferralListPresenter $r11 = (AgentReferralListPresenter) $r10;
            $r11.start(str);
            AgentReferredListFragment $r23 = this.this$0;
            $r23.lastSelectedStatus = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentReferredListFragment$initBottomSheet$1(AgentReferredListFragment agentReferredListFragment) {
        super(1);
        this.this$0 = agentReferredListFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C0757a c0757a) {
        C0757a $r2 = c0757a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C0757a c0757a) {
        String $r4;
        List $r8;
        Log_OC.getArray(c0757a, "$this$$receiver");
        String[] $r2 = new String[5];
        AgentReferredListFragment $r3 = this.this$0;
        String $r42 = $r3.type;
        if ($r42 == null) {
            Log_OC.LogError("type");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        boolean $z0 = Log_OC.append($r42, "AGENT");
        if ($z0) {
            Fragment $r32 = this.this$0;
            Fragment r12 = $r32;
            String $r43 = r12.getString(C0001R.string.all_agents);
            Log_OC.loadImage($r43, "getString(R.string.all_agents)");
            Locale $r5 = Locale.ROOT;
            Log_OC.loadImage($r5, "ROOT");
            String $r6 = $r43.toUpperCase($r5);
            $r4 = $r6;
            Log_OC.loadImage($r6, "(this as java.lang.String).toUpperCase(locale)");
        } else {
            Fragment $r33 = this.this$0;
            Fragment r122 = $r33;
            String $r44 = r122.getString(C0001R.string.all_customers);
            Log_OC.loadImage($r44, "getString(R.string.all_customers)");
            Locale $r52 = Locale.ROOT;
            Log_OC.loadImage($r52, "ROOT");
            String $r62 = $r44.toUpperCase($r52);
            $r4 = $r62;
            Log_OC.loadImage($r62, "(this as java.lang.String).toUpperCase(locale)");
        }
        $r2[0] = $r4;
        AgentReferralStatus $r7 = AgentReferralStatus.ACTIVE;
        $r2[1] = $r7.name();
        AgentReferralStatus $r72 = AgentReferralStatus.REGISTERED;
        $r2[2] = $r72.name();
        AgentReferralStatus $r73 = AgentReferralStatus.PENDING;
        $r2[3] = $r73.name();
        AgentReferralStatus $r74 = AgentReferralStatus.INACTIVE;
        $r2[4] = $r74.name();
        $r8 = C13726r.m3885k($r2);
        c0757a.m38049e($r8);
        AgentReferredListFragment $r34 = this.this$0;
        c0757a.m38048f($r34.lastSelectedStatus);
        AgentReferredListFragment $r35 = this.this$0;
        C04191 r11 = new C04191($r35);
        c0757a.m38046h(r11);
    }
}
