package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.databinding.FragmentFilterCommissionsBinding;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment$setupFilter$2$1 */
/* loaded from: classes.dex */
public final class FilterCommissionsFragment$setupFilter$2$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ FilterCommissionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FilterCommissionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "type", "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment$setupFilter$2$1$1 */
    /* loaded from: classes.dex */
    public static final class C05701 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ FilterCommissionsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05701(FilterCommissionsFragment filterCommissionsFragment) {
            super(2);
            this.this$0 = filterCommissionsFragment;
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
            Log_OC.getArray(str, "type");
            FilterCommissionsFragment $r3 = this.this$0;
            InterfaceC8209a $r1 = $r3.requireBinding();
            FragmentFilterCommissionsBinding $r4 = (FragmentFilterCommissionsBinding) $r1;
            TextView $r5 = $r4.typeFilterView;
            TextView r6 = $r5;
            r6.setText(str);
            FilterCommissionsFragment $r32 = this.this$0;
            $r32.onFilter();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterCommissionsFragment$setupFilter$2$1(FilterCommissionsFragment filterCommissionsFragment) {
        super(1);
        this.this$0 = filterCommissionsFragment;
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
        List $r5;
        Log_OC.getArray(c0757a, "$this$$receiver");
        FilterCommissionsFragment $r2 = this.this$0;
        Map $r3 = $r2.getCommissionTypes();
        Set $r4 = $r3.keySet();
        $r5 = C13742z.m3823D0($r4);
        c0757a.m38049e($r5);
        FilterCommissionsFragment $r22 = this.this$0;
        InterfaceC8209a $r6 = $r22.requireBinding();
        FragmentFilterCommissionsBinding $r7 = (FragmentFilterCommissionsBinding) $r6;
        AppCompatTextView $r8 = $r7.typeFilterView;
        CharSequence $r9 = $r8.getText();
        String $r10 = $r9.toString();
        c0757a.m38048f($r10);
        FilterCommissionsFragment $r23 = this.this$0;
        C05701 $r11 = new C05701($r23);
        c0757a.m38046h($r11);
    }
}
