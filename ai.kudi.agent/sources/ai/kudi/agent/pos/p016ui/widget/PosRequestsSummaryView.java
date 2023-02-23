package ai.kudi.agent.pos.p016ui.widget;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.pos.p016ui.data.PosSummaryUiData;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: PosRequestsSummaryView.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onSummaryItemClicked", "Lkotlin/Function1;", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "", "getOnSummaryItemClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSummaryItemClicked", "(Lkotlin/jvm/functions/Function1;)V", "progressBar", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getProgressBar", "()Landroid/view/View;", "progressBar$delegate", "Lkotlin/Lazy;", "summaryRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getSummaryRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "summaryRecyclerView$delegate", "bindData", "viewState", "Lai/kudi/agent/pos/ui/widget/PosRequestsSummaryViewState;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.widget.PosRequestsSummaryView */
/* loaded from: classes.dex */
public final class PosRequestsSummaryView extends ConstraintLayout {
    private InterfaceC11767l<? super PosFilterType, C13666w> onSummaryItemClicked;
    private final InterfaceC11824h progressBar$delegate;
    private final InterfaceC11824h summaryRecyclerView$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PosRequestsSummaryView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PosRequestsSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosRequestsSummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC11824h $r4;
        InterfaceC11824h $r42;
        Log_OC.getArray(context, "context");
        PosRequestsSummaryView$summaryRecyclerView$2 r7 = new PosRequestsSummaryView$summaryRecyclerView$2(this);
        $r4 = C13218k.m5625b(r7);
        this.summaryRecyclerView$delegate = $r4;
        PosRequestsSummaryView$progressBar$2 r8 = new PosRequestsSummaryView$progressBar$2(this);
        $r42 = C13218k.m5625b(r8);
        this.progressBar$delegate = $r42;
        PosRequestsSummaryView$onSummaryItemClicked$1 $r6 = PosRequestsSummaryView$onSummaryItemClicked$1.INSTANCE;
        this.onSummaryItemClicked = $r6;
        PosRequestsSummaryView r9 = this;
        View.inflate(context, C0001R.C0004layout.view_pos_requests_summary, r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PosRequestsSummaryView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.widget.PosRequestsSummaryView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getProgressBar() {
        InterfaceC11824h $r2 = this.progressBar$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final RecyclerView getSummaryRecyclerView() {
        InterfaceC11824h $r2 = this.summaryRecyclerView$delegate;
        Object $r1 = $r2.getValue();
        RecyclerView $r3 = (RecyclerView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bindData(PosRequestsSummaryViewState posRequestsSummaryViewState) {
        List $r8;
        Log_OC.getArray(posRequestsSummaryViewState, "viewState");
        boolean $z0 = posRequestsSummaryViewState.isLoading();
        if ($z0) {
            View $r2 = getProgressBar();
            Log_OC.loadImage($r2, "progressBar");
            ViewExtKt.show($r2);
        } else {
            View $r22 = getProgressBar();
            Log_OC.loadImage($r22, "progressBar");
            ViewExtKt.hide$default($r22, false, 1, null);
        }
        PosRequestsSummaryView r17 = this;
        Context $r5 = r17.getContext();
        String $r6 = $r5.getString(C0001R.string.total_no_of_terminal);
        Log_OC.loadImage($r6, "context.getString(R.string.total_no_of_terminal)");
        int $i0 = posRequestsSummaryViewState.getTotalTerminalsCount();
        String $r7 = String.valueOf($i0);
        PosSummaryUiData r13 = new PosSummaryUiData(C0001R.C0002drawable.ic_pos_overview_all_terminals, $r6, $r7);
        PosRequestsSummaryView r172 = this;
        Context $r52 = r172.getContext();
        String $r62 = $r52.getString(C0001R.string.assigned_terminals);
        Log_OC.loadImage($r62, "context.getString(R.string.assigned_terminals)");
        int $i02 = posRequestsSummaryViewState.getAssignedTerminalsCount();
        String $r72 = String.valueOf($i02);
        PosSummaryUiData r132 = new PosSummaryUiData(C0001R.C0002drawable.ic_pos_overview_assigned_terminals, $r62, $r72);
        PosRequestsSummaryView r173 = this;
        Context $r53 = r173.getContext();
        String $r63 = $r53.getString(C0001R.string.unassigned_terminals);
        Log_OC.loadImage($r63, "context.getString(R.string.unassigned_terminals)");
        int $i03 = posRequestsSummaryViewState.getUnAssignedTerminalsCount();
        String $r73 = String.valueOf($i03);
        PosSummaryUiData r133 = new PosSummaryUiData(C0001R.C0002drawable.ic_pos_overview_unassigned_terminals, $r63, $r73);
        PosSummaryUiData[] $r3 = {r13, r132, r133};
        $r8 = C13726r.m3888h($r3);
        PosSummaryAdapter r14 = new PosSummaryAdapter($r8);
        PosRequestsSummaryView$bindData$1 r15 = new PosRequestsSummaryView$bindData$1(this);
        r14.setOnSummaryItemClicked(r15);
        RecyclerView $r11 = getSummaryRecyclerView();
        $r11.setHasFixedSize(true);
        RecyclerView $r112 = getSummaryRecyclerView();
        PosRequestsSummaryView r174 = this;
        Context $r54 = r174.getContext();
        GridLayoutManager r16 = new GridLayoutManager($r54, 3);
        $r112.setLayoutManager(r16);
        RecyclerView $r113 = getSummaryRecyclerView();
        $r113.setAdapter(r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnSummaryItemClicked() {
        InterfaceC11767l r1 = this.onSummaryItemClicked;
        return r1;
    }

    public final void setOnSummaryItemClicked(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onSummaryItemClicked = interfaceC11767l;
    }
}
