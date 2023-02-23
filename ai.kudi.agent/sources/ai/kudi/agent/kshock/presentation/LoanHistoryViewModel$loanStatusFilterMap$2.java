package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.kshock.data.model.LoanStatusType;
import android.app.Application;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13727r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoanHistoryViewModel.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanHistoryViewModel$loanStatusFilterMap$2 extends AbstractC11802m implements InterfaceC11756a<Map<String, ? extends String>> {
    final /* synthetic */ LoanHistoryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryViewModel$loanStatusFilterMap$2(LoanHistoryViewModel loanHistoryViewModel) {
        super(0);
        this.this$0 = loanHistoryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Map<String, ? extends String> invoke() {
        Map $r1 = invoke2();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Map<String, ? extends String> invoke2() {
        Map $r6;
        LoanHistoryViewModel $r2 = this.this$0;
        Application $r3 = $r2.mContext;
        int $i0 = C0220R.string.all_loans;
        String $r4 = $r3.getString($i0);
        C13287o $r5 = C13664u.m4227a($r4, "");
        LoanHistoryViewModel $r22 = this.this$0;
        Application $r32 = $r22.mContext;
        int $i02 = C0220R.string.pending_payback;
        String $r42 = $r32.getString($i02);
        C13287o $r52 = C13664u.m4227a($r42, LoanStatusType.PENDING_PAYBACK);
        LoanHistoryViewModel $r23 = this.this$0;
        Application $r33 = $r23.mContext;
        int $i03 = C0220R.string.cancelled;
        String $r43 = $r33.getString($i03);
        C13287o $r53 = C13664u.m4227a($r43, LoanStatusType.CANCELLED);
        LoanHistoryViewModel $r24 = this.this$0;
        Application $r34 = $r24.mContext;
        int $i04 = C0220R.string.declined;
        String $r44 = $r34.getString($i04);
        C13287o $r54 = C13664u.m4227a($r44, LoanStatusType.DECLINED);
        LoanHistoryViewModel $r25 = this.this$0;
        Application $r35 = $r25.mContext;
        int $i05 = C0220R.string.pending_approval;
        String $r45 = $r35.getString($i05);
        C13287o $r55 = C13664u.m4227a($r45, LoanStatusType.PENDING_APPROVAL);
        LoanHistoryViewModel $r26 = this.this$0;
        Application $r36 = $r26.mContext;
        int $i06 = C0220R.string.settled;
        String $r46 = $r36.getString($i06);
        C13287o $r56 = C13664u.m4227a($r46, LoanStatusType.SETTLED);
        C13287o[] $r1 = {$r5, $r52, $r53, $r54, $r55, $r56};
        $r6 = C13727r0.m3878n($r1);
        return $r6;
    }
}
