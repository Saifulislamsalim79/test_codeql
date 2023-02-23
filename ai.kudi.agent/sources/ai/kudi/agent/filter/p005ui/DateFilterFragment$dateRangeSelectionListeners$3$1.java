package ai.kudi.agent.filter.p005ui;

import ai.kudi.agent.filter.domain.FilteredDate;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateFilterFragment.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "first", "Ljava/util/Date;", "last"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.filter.ui.DateFilterFragment$dateRangeSelectionListeners$3$1 */
/* loaded from: classes.dex */
public final class DateFilterFragment$dateRangeSelectionListeners$3$1 extends AbstractC11802m implements InterfaceC11771p<Date, Date, C13666w> {
    final /* synthetic */ DateFilterFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateFilterFragment$dateRangeSelectionListeners$3$1(DateFilterFragment dateFilterFragment) {
        super(2);
        this.this$0 = dateFilterFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(Date date, Date date2) {
        Date $r3 = date;
        Date $r4 = date2;
        invoke2($r3, $r4);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Date date, Date date2) {
        Log_OC.getArray(date, "first");
        Log_OC.getArray(date2, "last");
        DateFilterFragment $r4 = this.this$0;
        FilteredDate $r3 = new FilteredDate(date, date2);
        $r4.filteredDate = $r3;
    }
}
