package ai.kudi.agent.filter.p005ui;

import ai.kudi.agent.core.databinding.FragmentFilterBinding;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import android.widget.TextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateFilterFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", AttributeType.DATE, "Ljava/util/Date;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.filter.ui.DateFilterFragment$onActivityCreated$1$1 */
/* loaded from: classes.dex */
public final class DateFilterFragment$onActivityCreated$1$1 extends AbstractC11802m implements InterfaceC11767l<Date, C13666w> {
    final /* synthetic */ FragmentFilterBinding $binding;
    final /* synthetic */ DateFilterFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateFilterFragment$onActivityCreated$1$1(DateFilterFragment dateFilterFragment, FragmentFilterBinding fragmentFilterBinding) {
        super(1);
        this.this$0 = dateFilterFragment;
        this.$binding = fragmentFilterBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Date date) {
        Date $r2 = date;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Date date) {
        Log_OC.getArray(date, AttributeType.DATE);
        DateFilterFragment $r2 = this.this$0;
        FragmentFilterBinding $r3 = this.$binding;
        TextView $r4 = $r3.dateCheckerTextView;
        Log_OC.loadImage($r4, "binding.dateCheckerTextView");
        $r2.toggleTextViewFill($r4);
        FragmentFilterBinding $r32 = this.$binding;
        TextView $r42 = $r32.toDateTextView;
        String $r5 = DateExtKt.convertDateToGivenFormat(date, DateFilterFragment.WEEK_DAY_DAY_MONTH_YEAR_FORMAT);
        $r42.setText($r5);
        FragmentFilterBinding $r33 = this.$binding;
        CharSequence $r6 = $r33.fromDateTextView.getText();
        String $r52 = $r6.toString();
        Date $r7 = DateExtKt.getDateFromDateConstructor$default($r52, null, 2, null);
        FragmentFilterBinding $r34 = this.$binding;
        CharSequence $r62 = $r34.toDateTextView.getText();
        String $r53 = $r62.toString();
        Date $r8 = DateExtKt.getDateFromDateConstructor$default($r53, null, 2, null);
        FragmentFilterBinding $r35 = this.$binding;
        TextView $r9 = $r35.chooseDateTextView;
        CharSequence $r54 = DateExtKt.getDateDiff$default($r7, $r8, 0, null, 8, null);
        $r9.setText($r54);
        DateFilterFragment $r22 = this.this$0;
        FilteredDate $r10 = $r22.filteredDate;
        $r10.setTo(date);
    }
}
